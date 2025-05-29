// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMTTSChatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public HalfLLMTTSChatResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A9CE316B-B616-5A97-8FFC-5D0D664CA7AF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static HalfLLMTTSChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMTTSChatResponseBody self = new HalfLLMTTSChatResponseBody();
        return TeaModel.build(map, self);
    }

    public HalfLLMTTSChatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HalfLLMTTSChatResponseBody setData(HalfLLMTTSChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HalfLLMTTSChatResponseBodyData getData() {
        return this.data;
    }

    public HalfLLMTTSChatResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public HalfLLMTTSChatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HalfLLMTTSChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HalfLLMTTSChatResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class HalfLLMTTSChatResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("data")
        public byte[] data;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>sDwqZnFGwsv9x7yjVwQVKTV4</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>0sIRZDNncmCfBagzy534x2PH</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        @NameInMap("text")
        public String text;

        public static HalfLLMTTSChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMTTSChatResponseBodyData self = new HalfLLMTTSChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HalfLLMTTSChatResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public HalfLLMTTSChatResponseBodyData setData(byte[] data) {
            this.data = data;
            return this;
        }
        public byte[] getData() {
            return this.data;
        }

        public HalfLLMTTSChatResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public HalfLLMTTSChatResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public HalfLLMTTSChatResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public HalfLLMTTSChatResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
