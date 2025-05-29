// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMAppCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public HalfLLMAppCallResponseBodyData data;

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
     * <p>D7FEF19A-8B65-5914-9FA3-F26E820294B4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static HalfLLMAppCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMAppCallResponseBody self = new HalfLLMAppCallResponseBody();
        return TeaModel.build(map, self);
    }

    public HalfLLMAppCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HalfLLMAppCallResponseBody setData(HalfLLMAppCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HalfLLMAppCallResponseBodyData getData() {
        return this.data;
    }

    public HalfLLMAppCallResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public HalfLLMAppCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HalfLLMAppCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HalfLLMAppCallResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class HalfLLMAppCallResponseBodyDataOutputChoicesMessage extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        @NameInMap("role")
        public String role;

        public static HalfLLMAppCallResponseBodyDataOutputChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMAppCallResponseBodyDataOutputChoicesMessage self = new HalfLLMAppCallResponseBodyDataOutputChoicesMessage();
            return TeaModel.build(map, self);
        }

        public HalfLLMAppCallResponseBodyDataOutputChoicesMessage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public HalfLLMAppCallResponseBodyDataOutputChoicesMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class HalfLLMAppCallResponseBodyDataOutputChoices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        @NameInMap("message")
        public HalfLLMAppCallResponseBodyDataOutputChoicesMessage message;

        public static HalfLLMAppCallResponseBodyDataOutputChoices build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMAppCallResponseBodyDataOutputChoices self = new HalfLLMAppCallResponseBodyDataOutputChoices();
            return TeaModel.build(map, self);
        }

        public HalfLLMAppCallResponseBodyDataOutputChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public HalfLLMAppCallResponseBodyDataOutputChoices setMessage(HalfLLMAppCallResponseBodyDataOutputChoicesMessage message) {
            this.message = message;
            return this;
        }
        public HalfLLMAppCallResponseBodyDataOutputChoicesMessage getMessage() {
            return this.message;
        }

    }

    public static class HalfLLMAppCallResponseBodyDataOutput extends TeaModel {
        @NameInMap("choices")
        public java.util.List<HalfLLMAppCallResponseBodyDataOutputChoices> choices;

        public static HalfLLMAppCallResponseBodyDataOutput build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMAppCallResponseBodyDataOutput self = new HalfLLMAppCallResponseBodyDataOutput();
            return TeaModel.build(map, self);
        }

        public HalfLLMAppCallResponseBodyDataOutput setChoices(java.util.List<HalfLLMAppCallResponseBodyDataOutputChoices> choices) {
            this.choices = choices;
            return this;
        }
        public java.util.List<HalfLLMAppCallResponseBodyDataOutputChoices> getChoices() {
            return this.choices;
        }

    }

    public static class HalfLLMAppCallResponseBodyDataRt extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("firstRt")
        public Long firstRt;

        /**
         * <strong>example:</strong>
         * <p>4432</p>
         */
        @NameInMap("totalRt")
        public Long totalRt;

        public static HalfLLMAppCallResponseBodyDataRt build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMAppCallResponseBodyDataRt self = new HalfLLMAppCallResponseBodyDataRt();
            return TeaModel.build(map, self);
        }

        public HalfLLMAppCallResponseBodyDataRt setFirstRt(Long firstRt) {
            this.firstRt = firstRt;
            return this;
        }
        public Long getFirstRt() {
            return this.firstRt;
        }

        public HalfLLMAppCallResponseBodyDataRt setTotalRt(Long totalRt) {
            this.totalRt = totalRt;
            return this;
        }
        public Long getTotalRt() {
            return this.totalRt;
        }

    }

    public static class HalfLLMAppCallResponseBodyDataUsages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>356</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>698</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        public static HalfLLMAppCallResponseBodyDataUsages build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMAppCallResponseBodyDataUsages self = new HalfLLMAppCallResponseBodyDataUsages();
            return TeaModel.build(map, self);
        }

        public HalfLLMAppCallResponseBodyDataUsages setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public HalfLLMAppCallResponseBodyDataUsages setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

    }

    public static class HalfLLMAppCallResponseBodyData extends TeaModel {
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
        public HalfLLMAppCallResponseBodyDataOutput output;

        /**
         * <strong>example:</strong>
         * <p>4Oy0zoqcjcclBgREcZvXF12y</p>
         */
        @NameInMap("requestId")
        public String requestId;

        @NameInMap("rt")
        public HalfLLMAppCallResponseBodyDataRt rt;

        /**
         * <strong>example:</strong>
         * <p>0sIRZDNncmCfBagzy534x2PH</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        @NameInMap("usages")
        public HalfLLMAppCallResponseBodyDataUsages usages;

        public static HalfLLMAppCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMAppCallResponseBodyData self = new HalfLLMAppCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HalfLLMAppCallResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public HalfLLMAppCallResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public HalfLLMAppCallResponseBodyData setOutput(HalfLLMAppCallResponseBodyDataOutput output) {
            this.output = output;
            return this;
        }
        public HalfLLMAppCallResponseBodyDataOutput getOutput() {
            return this.output;
        }

        public HalfLLMAppCallResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public HalfLLMAppCallResponseBodyData setRt(HalfLLMAppCallResponseBodyDataRt rt) {
            this.rt = rt;
            return this;
        }
        public HalfLLMAppCallResponseBodyDataRt getRt() {
            return this.rt;
        }

        public HalfLLMAppCallResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public HalfLLMAppCallResponseBodyData setUsages(HalfLLMAppCallResponseBodyDataUsages usages) {
            this.usages = usages;
            return this;
        }
        public HalfLLMAppCallResponseBodyDataUsages getUsages() {
            return this.usages;
        }

    }

}
