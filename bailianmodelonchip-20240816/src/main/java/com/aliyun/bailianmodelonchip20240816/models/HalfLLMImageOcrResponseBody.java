// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMImageOcrResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public HalfLLMImageOcrResponseBodyData data;

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
     * <p>4Oy0zoqcjcclBgREcZvXF12y</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static HalfLLMImageOcrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMImageOcrResponseBody self = new HalfLLMImageOcrResponseBody();
        return TeaModel.build(map, self);
    }

    public HalfLLMImageOcrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HalfLLMImageOcrResponseBody setData(HalfLLMImageOcrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HalfLLMImageOcrResponseBodyData getData() {
        return this.data;
    }

    public HalfLLMImageOcrResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public HalfLLMImageOcrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HalfLLMImageOcrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HalfLLMImageOcrResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class HalfLLMImageOcrResponseBodyDataOutputChoicesMessage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        @NameInMap("role")
        public String role;

        public static HalfLLMImageOcrResponseBodyDataOutputChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageOcrResponseBodyDataOutputChoicesMessage self = new HalfLLMImageOcrResponseBodyDataOutputChoicesMessage();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageOcrResponseBodyDataOutputChoicesMessage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public HalfLLMImageOcrResponseBodyDataOutputChoicesMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class HalfLLMImageOcrResponseBodyDataOutputChoices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        @NameInMap("message")
        public HalfLLMImageOcrResponseBodyDataOutputChoicesMessage message;

        public static HalfLLMImageOcrResponseBodyDataOutputChoices build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageOcrResponseBodyDataOutputChoices self = new HalfLLMImageOcrResponseBodyDataOutputChoices();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageOcrResponseBodyDataOutputChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public HalfLLMImageOcrResponseBodyDataOutputChoices setMessage(HalfLLMImageOcrResponseBodyDataOutputChoicesMessage message) {
            this.message = message;
            return this;
        }
        public HalfLLMImageOcrResponseBodyDataOutputChoicesMessage getMessage() {
            return this.message;
        }

    }

    public static class HalfLLMImageOcrResponseBodyDataOutput extends TeaModel {
        @NameInMap("choices")
        public java.util.List<HalfLLMImageOcrResponseBodyDataOutputChoices> choices;

        public static HalfLLMImageOcrResponseBodyDataOutput build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageOcrResponseBodyDataOutput self = new HalfLLMImageOcrResponseBodyDataOutput();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageOcrResponseBodyDataOutput setChoices(java.util.List<HalfLLMImageOcrResponseBodyDataOutputChoices> choices) {
            this.choices = choices;
            return this;
        }
        public java.util.List<HalfLLMImageOcrResponseBodyDataOutputChoices> getChoices() {
            return this.choices;
        }

    }

    public static class HalfLLMImageOcrResponseBodyDataRt extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>635</p>
         */
        @NameInMap("firstRt")
        public Long firstRt;

        /**
         * <strong>example:</strong>
         * <p>8571</p>
         */
        @NameInMap("totalRt")
        public Long totalRt;

        public static HalfLLMImageOcrResponseBodyDataRt build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageOcrResponseBodyDataRt self = new HalfLLMImageOcrResponseBodyDataRt();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageOcrResponseBodyDataRt setFirstRt(Long firstRt) {
            this.firstRt = firstRt;
            return this;
        }
        public Long getFirstRt() {
            return this.firstRt;
        }

        public HalfLLMImageOcrResponseBodyDataRt setTotalRt(Long totalRt) {
            this.totalRt = totalRt;
            return this;
        }
        public Long getTotalRt() {
            return this.totalRt;
        }

    }

    public static class HalfLLMImageOcrResponseBodyDataUsages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>771</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>563</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        public static HalfLLMImageOcrResponseBodyDataUsages build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageOcrResponseBodyDataUsages self = new HalfLLMImageOcrResponseBodyDataUsages();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageOcrResponseBodyDataUsages setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public HalfLLMImageOcrResponseBodyDataUsages setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

    }

    public static class HalfLLMImageOcrResponseBodyData extends TeaModel {
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
        public HalfLLMImageOcrResponseBodyDataOutput output;

        /**
         * <strong>example:</strong>
         * <p>4Oy0zoqcjcclBgREcZvXF12y</p>
         */
        @NameInMap("requestId")
        public String requestId;

        @NameInMap("rt")
        public HalfLLMImageOcrResponseBodyDataRt rt;

        /**
         * <strong>example:</strong>
         * <p>0sIRZDNncmCfBagzy534x2PH</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        @NameInMap("usages")
        public HalfLLMImageOcrResponseBodyDataUsages usages;

        public static HalfLLMImageOcrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HalfLLMImageOcrResponseBodyData self = new HalfLLMImageOcrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HalfLLMImageOcrResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public HalfLLMImageOcrResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public HalfLLMImageOcrResponseBodyData setOutput(HalfLLMImageOcrResponseBodyDataOutput output) {
            this.output = output;
            return this;
        }
        public HalfLLMImageOcrResponseBodyDataOutput getOutput() {
            return this.output;
        }

        public HalfLLMImageOcrResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public HalfLLMImageOcrResponseBodyData setRt(HalfLLMImageOcrResponseBodyDataRt rt) {
            this.rt = rt;
            return this;
        }
        public HalfLLMImageOcrResponseBodyDataRt getRt() {
            return this.rt;
        }

        public HalfLLMImageOcrResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public HalfLLMImageOcrResponseBodyData setUsages(HalfLLMImageOcrResponseBodyDataUsages usages) {
            this.usages = usages;
            return this;
        }
        public HalfLLMImageOcrResponseBodyDataUsages getUsages() {
            return this.usages;
        }

    }

}
