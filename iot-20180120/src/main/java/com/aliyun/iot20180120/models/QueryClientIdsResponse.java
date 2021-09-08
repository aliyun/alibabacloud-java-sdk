// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryClientIdsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryClientIdsResponseData data;

    public static QueryClientIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClientIdsResponse self = new QueryClientIdsResponse();
        return TeaModel.build(map, self);
    }

    public QueryClientIdsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClientIdsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryClientIdsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryClientIdsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryClientIdsResponse setData(QueryClientIdsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryClientIdsResponseData getData() {
        return this.data;
    }

    public static class QueryClientIdsResponseDataDynamicRegClientIds extends TeaModel {
        @NameInMap("ClientId")
        @Validation(required = true)
        public String clientId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        public static QueryClientIdsResponseDataDynamicRegClientIds build(java.util.Map<String, ?> map) throws Exception {
            QueryClientIdsResponseDataDynamicRegClientIds self = new QueryClientIdsResponseDataDynamicRegClientIds();
            return TeaModel.build(map, self);
        }

        public QueryClientIdsResponseDataDynamicRegClientIds setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryClientIdsResponseDataDynamicRegClientIds setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

    public static class QueryClientIdsResponseData extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("DynamicRegClientIds")
        @Validation(required = true)
        public java.util.List<QueryClientIdsResponseDataDynamicRegClientIds> dynamicRegClientIds;

        public static QueryClientIdsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryClientIdsResponseData self = new QueryClientIdsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryClientIdsResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryClientIdsResponseData setDynamicRegClientIds(java.util.List<QueryClientIdsResponseDataDynamicRegClientIds> dynamicRegClientIds) {
            this.dynamicRegClientIds = dynamicRegClientIds;
            return this;
        }
        public java.util.List<QueryClientIdsResponseDataDynamicRegClientIds> getDynamicRegClientIds() {
            return this.dynamicRegClientIds;
        }

    }

}
