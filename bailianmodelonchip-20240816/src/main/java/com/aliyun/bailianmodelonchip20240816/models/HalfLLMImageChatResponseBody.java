// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMImageChatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public HalfLLMImageChatResponseBodyData data;

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
     * <p>84656A01-32F0-5D12-8C72-E3AFAA0C8A29</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static HalfLLMImageChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMImageChatResponseBody self = new HalfLLMImageChatResponseBody();
        return TeaModel.build(map, self);
    }

    public HalfLLMImageChatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HalfLLMImageChatResponseBody setData(HalfLLMImageChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HalfLLMImageChatResponseBodyData getData() {
        return this.data;
    }

    public HalfLLMImageChatResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public HalfLLMImageChatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HalfLLMImageChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HalfLLMImageChatResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class HalfLLMImageChatResponseBodyDataOutputChoicesMessage extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        @NameInMap("role")
        public String role;

        public static HalfLLMImageChatResponseBodyDataOutputChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageChatResponseBodyDataOutputChoicesMessage self = new HalfLLMImageChatResponseBodyDataOutputChoicesMessage();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageChatResponseBodyDataOutputChoicesMessage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public HalfLLMImageChatResponseBodyDataOutputChoicesMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class HalfLLMImageChatResponseBodyDataOutputChoices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        @NameInMap("message")
        public HalfLLMImageChatResponseBodyDataOutputChoicesMessage message;

        public static HalfLLMImageChatResponseBodyDataOutputChoices build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageChatResponseBodyDataOutputChoices self = new HalfLLMImageChatResponseBodyDataOutputChoices();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageChatResponseBodyDataOutputChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public HalfLLMImageChatResponseBodyDataOutputChoices setMessage(HalfLLMImageChatResponseBodyDataOutputChoicesMessage message) {
            this.message = message;
            return this;
        }
        public HalfLLMImageChatResponseBodyDataOutputChoicesMessage getMessage() {
            return this.message;
        }

    }

    public static class HalfLLMImageChatResponseBodyDataOutput extends TeaModel {
        @NameInMap("choices")
        public java.util.List<HalfLLMImageChatResponseBodyDataOutputChoices> choices;

        public static HalfLLMImageChatResponseBodyDataOutput build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageChatResponseBodyDataOutput self = new HalfLLMImageChatResponseBodyDataOutput();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageChatResponseBodyDataOutput setChoices(java.util.List<HalfLLMImageChatResponseBodyDataOutputChoices> choices) {
            this.choices = choices;
            return this;
        }
        public java.util.List<HalfLLMImageChatResponseBodyDataOutputChoices> getChoices() {
            return this.choices;
        }

    }

    public static class HalfLLMImageChatResponseBodyDataRt extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1563</p>
         */
        @NameInMap("firstRt")
        public Long firstRt;

        /**
         * <strong>example:</strong>
         * <p>8235</p>
         */
        @NameInMap("totalRt")
        public Long totalRt;

        public static HalfLLMImageChatResponseBodyDataRt build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageChatResponseBodyDataRt self = new HalfLLMImageChatResponseBodyDataRt();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageChatResponseBodyDataRt setFirstRt(Long firstRt) {
            this.firstRt = firstRt;
            return this;
        }
        public Long getFirstRt() {
            return this.firstRt;
        }

        public HalfLLMImageChatResponseBodyDataRt setTotalRt(Long totalRt) {
            this.totalRt = totalRt;
            return this;
        }
        public Long getTotalRt() {
            return this.totalRt;
        }

    }

    public static class HalfLLMImageChatResponseBodyDataUsages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>136</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>589</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        public static HalfLLMImageChatResponseBodyDataUsages build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageChatResponseBodyDataUsages self = new HalfLLMImageChatResponseBodyDataUsages();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageChatResponseBodyDataUsages setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public HalfLLMImageChatResponseBodyDataUsages setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

    }

    public static class HalfLLMImageChatResponseBodyData extends TeaModel {
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
        public HalfLLMImageChatResponseBodyDataOutput output;

        /**
         * <strong>example:</strong>
         * <p>4Oy0zoqcjcclBgREcZvXF12y</p>
         */
        @NameInMap("requestId")
        public String requestId;

        @NameInMap("rt")
        public HalfLLMImageChatResponseBodyDataRt rt;

        /**
         * <strong>example:</strong>
         * <p>0sIRZDNncmCfBagzy534x2PH</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        @NameInMap("usages")
        public HalfLLMImageChatResponseBodyDataUsages usages;

        public static HalfLLMImageChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageChatResponseBodyData self = new HalfLLMImageChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageChatResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public HalfLLMImageChatResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public HalfLLMImageChatResponseBodyData setOutput(HalfLLMImageChatResponseBodyDataOutput output) {
            this.output = output;
            return this;
        }
        public HalfLLMImageChatResponseBodyDataOutput getOutput() {
            return this.output;
        }

        public HalfLLMImageChatResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public HalfLLMImageChatResponseBodyData setRt(HalfLLMImageChatResponseBodyDataRt rt) {
            this.rt = rt;
            return this;
        }
        public HalfLLMImageChatResponseBodyDataRt getRt() {
            return this.rt;
        }

        public HalfLLMImageChatResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public HalfLLMImageChatResponseBodyData setUsages(HalfLLMImageChatResponseBodyDataUsages usages) {
            this.usages = usages;
            return this;
        }
        public HalfLLMImageChatResponseBodyDataUsages getUsages() {
            return this.usages;
        }

    }

}
