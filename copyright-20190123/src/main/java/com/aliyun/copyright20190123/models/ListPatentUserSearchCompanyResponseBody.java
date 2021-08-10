// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListPatentUserSearchCompanyResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListPatentUserSearchCompanyResponseBodyData> data;

    public static ListPatentUserSearchCompanyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPatentUserSearchCompanyResponseBody self = new ListPatentUserSearchCompanyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPatentUserSearchCompanyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPatentUserSearchCompanyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPatentUserSearchCompanyResponseBody setData(java.util.List<ListPatentUserSearchCompanyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPatentUserSearchCompanyResponseBodyData> getData() {
        return this.data;
    }

    public static class ListPatentUserSearchCompanyResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("EnterpriseName")
        public String enterpriseName;

        @NameInMap("Id")
        public Long id;

        public static ListPatentUserSearchCompanyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPatentUserSearchCompanyResponseBodyData self = new ListPatentUserSearchCompanyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPatentUserSearchCompanyResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListPatentUserSearchCompanyResponseBodyData setEnterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
            return this;
        }
        public String getEnterpriseName() {
            return this.enterpriseName;
        }

        public ListPatentUserSearchCompanyResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
