// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserIdByCustomUserIdResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return value of the API operation.</p>
     */
    @NameInMap("Data")
    public QueryFaceUserIdByCustomUserIdResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A13279A-5640-45E7-87AA-83750541AD0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceUserIdByCustomUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserIdByCustomUserIdResponseBody self = new QueryFaceUserIdByCustomUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserIdByCustomUserIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserIdByCustomUserIdResponseBody setData(QueryFaceUserIdByCustomUserIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceUserIdByCustomUserIdResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceUserIdByCustomUserIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserIdByCustomUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserIdByCustomUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceUserIdByCustomUserIdResponseBodyData extends TeaModel {
        /**
         * <p>The user ID in the caller system.</p>
         * 
         * <strong>example:</strong>
         * <p>TestCustomUserId</p>
         */
        @NameInMap("CustomUserId")
        public String customUserId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>TestName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;age&quot;:28, &quot;sex&quot;:&quot;male&quot;}</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUserId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryFaceUserIdByCustomUserIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserIdByCustomUserIdResponseBodyData self = new QueryFaceUserIdByCustomUserIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserIdByCustomUserIdResponseBodyData setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public QueryFaceUserIdByCustomUserIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryFaceUserIdByCustomUserIdResponseBodyData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public QueryFaceUserIdByCustomUserIdResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
