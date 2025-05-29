// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMChatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public HalfLLMChatResponseBodyData data;

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
     * <p>5DD2E24F-93A2-551D-B192-8DBBEEFE9129</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static HalfLLMChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMChatResponseBody self = new HalfLLMChatResponseBody();
        return TeaModel.build(map, self);
    }

    public HalfLLMChatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HalfLLMChatResponseBody setData(HalfLLMChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HalfLLMChatResponseBodyData getData() {
        return this.data;
    }

    public HalfLLMChatResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public HalfLLMChatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HalfLLMChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HalfLLMChatResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class HalfLLMChatResponseBodyDataOutputChoicesMessage extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        @NameInMap("role")
        public String role;

        public static HalfLLMChatResponseBodyDataOutputChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMChatResponseBodyDataOutputChoicesMessage self = new HalfLLMChatResponseBodyDataOutputChoicesMessage();
            return TeaModel.build(map, self);
        }

        public HalfLLMChatResponseBodyDataOutputChoicesMessage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public HalfLLMChatResponseBodyDataOutputChoicesMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class HalfLLMChatResponseBodyDataOutputChoices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        @NameInMap("message")
        public HalfLLMChatResponseBodyDataOutputChoicesMessage message;

        public static HalfLLMChatResponseBodyDataOutputChoices build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMChatResponseBodyDataOutputChoices self = new HalfLLMChatResponseBodyDataOutputChoices();
            return TeaModel.build(map, self);
        }

        public HalfLLMChatResponseBodyDataOutputChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public HalfLLMChatResponseBodyDataOutputChoices setMessage(HalfLLMChatResponseBodyDataOutputChoicesMessage message) {
            this.message = message;
            return this;
        }
        public HalfLLMChatResponseBodyDataOutputChoicesMessage getMessage() {
            return this.message;
        }

    }

    public static class HalfLLMChatResponseBodyDataOutput extends TeaModel {
        @NameInMap("choices")
        public java.util.List<HalfLLMChatResponseBodyDataOutputChoices> choices;

        public static HalfLLMChatResponseBodyDataOutput build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMChatResponseBodyDataOutput self = new HalfLLMChatResponseBodyDataOutput();
            return TeaModel.build(map, self);
        }

        public HalfLLMChatResponseBodyDataOutput setChoices(java.util.List<HalfLLMChatResponseBodyDataOutputChoices> choices) {
            this.choices = choices;
            return this;
        }
        public java.util.List<HalfLLMChatResponseBodyDataOutputChoices> getChoices() {
            return this.choices;
        }

    }

    public static class HalfLLMChatResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("message")
        public String message;

        @NameInMap("output")
        public HalfLLMChatResponseBodyDataOutput output;

        /**
         * <strong>example:</strong>
         * <p>4Oy0zoqcjcclBgREcZvXF12y</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>0sIRZDNncmCfBagzy534x2PH</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static HalfLLMChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMChatResponseBodyData self = new HalfLLMChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HalfLLMChatResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public HalfLLMChatResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public HalfLLMChatResponseBodyData setOutput(HalfLLMChatResponseBodyDataOutput output) {
            this.output = output;
            return this;
        }
        public HalfLLMChatResponseBodyDataOutput getOutput() {
            return this.output;
        }

        public HalfLLMChatResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public HalfLLMChatResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
