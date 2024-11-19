// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryClientIdsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ClientIDs returned if the call is successful. For more information, see <strong>DynamicRegClientIds</strong>.</p>
     */
    @NameInMap("Data")
    public QueryClientIdsResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>89F22330-BAEE-<strong><strong>-</strong></strong>-41BA46D6E267</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>9rSzYt4js92********f000112</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The time when the ClientID was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1636514022424</p>
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
         * 
         * <strong>example:</strong>
         * <p>y4u2weAI********HMle1234</p>
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
