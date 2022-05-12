// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    @NameInMap("dataSources")
    public java.util.List<ListDataSourcesResponseBodyDataSources> dataSources;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponseBody self = new ListDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponseBody setDataSources(java.util.List<ListDataSourcesResponseBodyDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<ListDataSourcesResponseBodyDataSources> getDataSources() {
        return this.dataSources;
    }

    public ListDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataSourcesResponseBodyDataSources extends TeaModel {
        @NameInMap("dataSourceAttributes")
        public String dataSourceAttributes;

        @NameInMap("id")
        public String id;

        public static ListDataSourcesResponseBodyDataSources build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyDataSources self = new ListDataSourcesResponseBodyDataSources();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceAttributes(String dataSourceAttributes) {
            this.dataSourceAttributes = dataSourceAttributes;
            return this;
        }
        public String getDataSourceAttributes() {
            return this.dataSourceAttributes;
        }

        public ListDataSourcesResponseBodyDataSources setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
