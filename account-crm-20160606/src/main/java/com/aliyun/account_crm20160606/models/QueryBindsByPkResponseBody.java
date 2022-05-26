// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryBindsByPkResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryBindsByPkResponseBodyData> data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBindsByPkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBindsByPkResponseBody self = new QueryBindsByPkResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBindsByPkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBindsByPkResponseBody setData(java.util.List<QueryBindsByPkResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryBindsByPkResponseBodyData> getData() {
        return this.data;
    }

    public QueryBindsByPkResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public QueryBindsByPkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBindsByPkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBindsByPkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBindsByPkResponseBodyData extends TeaModel {
        @NameInMap("BindData")
        public java.util.Map<String, ?> bindData;

        @NameInMap("MinorOuterId")
        public String minorOuterId;

        @NameInMap("OuterId")
        public String outerId;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        public static QueryBindsByPkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBindsByPkResponseBodyData self = new QueryBindsByPkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBindsByPkResponseBodyData setBindData(java.util.Map<String, ?> bindData) {
            this.bindData = bindData;
            return this;
        }
        public java.util.Map<String, ?> getBindData() {
            return this.bindData;
        }

        public QueryBindsByPkResponseBodyData setMinorOuterId(String minorOuterId) {
            this.minorOuterId = minorOuterId;
            return this;
        }
        public String getMinorOuterId() {
            return this.minorOuterId;
        }

        public QueryBindsByPkResponseBodyData setOuterId(String outerId) {
            this.outerId = outerId;
            return this;
        }
        public String getOuterId() {
            return this.outerId;
        }

        public QueryBindsByPkResponseBodyData setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public QueryBindsByPkResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryBindsByPkResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
