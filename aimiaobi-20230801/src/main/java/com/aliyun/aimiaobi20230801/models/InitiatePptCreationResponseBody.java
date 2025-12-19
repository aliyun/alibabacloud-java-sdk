// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InitiatePptCreationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InitiatePptCreationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11AC01F1-88FB-5C4D-B6F5-E8BB136CD5A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InitiatePptCreationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitiatePptCreationResponseBody self = new InitiatePptCreationResponseBody();
        return TeaModel.build(map, self);
    }

    public InitiatePptCreationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitiatePptCreationResponseBody setData(InitiatePptCreationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitiatePptCreationResponseBodyData getData() {
        return this.data;
    }

    public InitiatePptCreationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public InitiatePptCreationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitiatePptCreationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitiatePptCreationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InitiatePptCreationResponseBodyData extends TeaModel {
        /**
         * <p>AppKey</p>
         * 
         * <strong>example:</strong>
         * <p>S1X5ecouBztZelaQ</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>Code</p>
         * 
         * <strong>example:</strong>
         * <p>7dhqd2</p>
         */
        @NameInMap("Code")
        public String code;

        public static InitiatePptCreationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitiatePptCreationResponseBodyData self = new InitiatePptCreationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitiatePptCreationResponseBodyData setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public InitiatePptCreationResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

}
