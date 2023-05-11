// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryClientIdsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ClientIDs returned if the call is successful. For more information, see **DynamicRegClientIds**.</p>
     */
    @NameInMap("Data")
    public QueryClientIdsResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryClientIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClientIdsResponseBody self = new QueryClientIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClientIdsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryClientIdsResponseBody setData(QueryClientIdsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryClientIdsResponseBodyData getData() {
        return this.data;
    }

    public QueryClientIdsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class QueryClientIdsResponseBodyDataDynamicRegClientIds extends TeaModel {
        /**
         * <p>The ClientID of the device.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The time when the ClientID was created.</p>
         */
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
        /**
         * <p>The list of ClientIDs.</p>
         */
        @NameInMap("DynamicRegClientIds")
        public java.util.List<QueryClientIdsResponseBodyDataDynamicRegClientIds> dynamicRegClientIds;

        /**
         * <p>The ID of the device.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        public static QueryClientIdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClientIdsResponseBodyData self = new QueryClientIdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClientIdsResponseBodyData setDynamicRegClientIds(java.util.List<QueryClientIdsResponseBodyDataDynamicRegClientIds> dynamicRegClientIds) {
            this.dynamicRegClientIds = dynamicRegClientIds;
            return this;
        }
        public java.util.List<QueryClientIdsResponseBodyDataDynamicRegClientIds> getDynamicRegClientIds() {
            return this.dynamicRegClientIds;
        }

        public QueryClientIdsResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
