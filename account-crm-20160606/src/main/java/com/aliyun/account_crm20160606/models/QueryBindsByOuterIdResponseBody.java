// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryBindsByOuterIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryBindsByOuterIdResponseBodyData> data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBindsByOuterIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBindsByOuterIdResponseBody self = new QueryBindsByOuterIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBindsByOuterIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBindsByOuterIdResponseBody setData(java.util.List<QueryBindsByOuterIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryBindsByOuterIdResponseBodyData> getData() {
        return this.data;
    }

    public QueryBindsByOuterIdResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public QueryBindsByOuterIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBindsByOuterIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBindsByOuterIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBindsByOuterIdResponseBodyData extends TeaModel {
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

        public static QueryBindsByOuterIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBindsByOuterIdResponseBodyData self = new QueryBindsByOuterIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBindsByOuterIdResponseBodyData setBindData(java.util.Map<String, ?> bindData) {
            this.bindData = bindData;
            return this;
        }
        public java.util.Map<String, ?> getBindData() {
            return this.bindData;
        }

        public QueryBindsByOuterIdResponseBodyData setMinorOuterId(String minorOuterId) {
            this.minorOuterId = minorOuterId;
            return this;
        }
        public String getMinorOuterId() {
            return this.minorOuterId;
        }

        public QueryBindsByOuterIdResponseBodyData setOuterId(String outerId) {
            this.outerId = outerId;
            return this;
        }
        public String getOuterId() {
            return this.outerId;
        }

        public QueryBindsByOuterIdResponseBodyData setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public QueryBindsByOuterIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryBindsByOuterIdResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
