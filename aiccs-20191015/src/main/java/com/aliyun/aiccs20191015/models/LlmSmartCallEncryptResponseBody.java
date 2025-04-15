// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallEncryptResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public LlmSmartCallEncryptResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F92F9749-105E-518F-8B08-CF16EF36A0E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static LlmSmartCallEncryptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallEncryptResponseBody self = new LlmSmartCallEncryptResponseBody();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallEncryptResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public LlmSmartCallEncryptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LlmSmartCallEncryptResponseBody setData(LlmSmartCallEncryptResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LlmSmartCallEncryptResponseBodyData getData() {
        return this.data;
    }

    public LlmSmartCallEncryptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LlmSmartCallEncryptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LlmSmartCallEncryptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LlmSmartCallEncryptResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>149922088206^136666368206</p>
         */
        @NameInMap("CallId")
        public String callId;

        public static LlmSmartCallEncryptResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LlmSmartCallEncryptResponseBodyData self = new LlmSmartCallEncryptResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LlmSmartCallEncryptResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

    }

}
