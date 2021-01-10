// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryClientIdsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryClientIdsResponseBodyData data;

    public static QueryClientIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClientIdsResponseBody self = new QueryClientIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClientIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClientIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryClientIdsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryClientIdsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryClientIdsResponseBody setData(QueryClientIdsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryClientIdsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryClientIdsResponseBodyDataDynamicRegClientIds extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("CreateTime")
        public Long createTime;

        public static QueryClientIdsResponseBodyDataDynamicRegClientIds build(java.util.Map<String, ?> map) throws Exception {
            QueryClientIdsResponseBodyDataDynamicRegClientIds self = new QueryClientIdsResponseBodyDataDynamicRegClientIds();
            return TeaModel.build(map, self);
        }

        public QueryClientIdsResponseBodyDataDynamicRegClientIds setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryClientIdsResponseBodyDataDynamicRegClientIds setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

    public static class QueryClientIdsResponseBodyData extends TeaModel {
        @NameInMap("IotId")
        public String iotId;

        @NameInMap("DynamicRegClientIds")
        public java.util.List<QueryClientIdsResponseBodyDataDynamicRegClientIds> dynamicRegClientIds;

        public static QueryClientIdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClientIdsResponseBodyData self = new QueryClientIdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClientIdsResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryClientIdsResponseBodyData setDynamicRegClientIds(java.util.List<QueryClientIdsResponseBodyDataDynamicRegClientIds> dynamicRegClientIds) {
            this.dynamicRegClientIds = dynamicRegClientIds;
            return this;
        }
        public java.util.List<QueryClientIdsResponseBodyDataDynamicRegClientIds> getDynamicRegClientIds() {
            return this.dynamicRegClientIds;
        }

    }

}
