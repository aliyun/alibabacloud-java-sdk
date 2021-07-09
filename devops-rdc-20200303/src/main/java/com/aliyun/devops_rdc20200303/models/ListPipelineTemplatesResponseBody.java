// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListPipelineTemplatesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListPipelineTemplatesResponseBodyData data;

    public static ListPipelineTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTemplatesResponseBody self = new ListPipelineTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineTemplatesResponseBody setData(ListPipelineTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPipelineTemplatesResponseBodyData getData() {
        return this.data;
    }

    public static class ListPipelineTemplatesResponseBodyDataDataList extends TeaModel {
        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Id")
        public Long id;

        public static ListPipelineTemplatesResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineTemplatesResponseBodyDataDataList self = new ListPipelineTemplatesResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public ListPipelineTemplatesResponseBodyDataDataList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListPipelineTemplatesResponseBodyDataDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListPipelineTemplatesResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Float total;

        @NameInMap("DataList")
        public java.util.List<ListPipelineTemplatesResponseBodyDataDataList> dataList;

        public static ListPipelineTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineTemplatesResponseBodyData self = new ListPipelineTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPipelineTemplatesResponseBodyData setTotal(Float total) {
            this.total = total;
            return this;
        }
        public Float getTotal() {
            return this.total;
        }

        public ListPipelineTemplatesResponseBodyData setDataList(java.util.List<ListPipelineTemplatesResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ListPipelineTemplatesResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

    }

}
