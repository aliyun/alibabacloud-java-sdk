// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunLegalAdviceConsultationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Request.Signature.Error</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>744419D0-671A-5997-9840-E8AE48356194</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseMarkdown")
    public String responseMarkdown;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Round")
    public Integer round;

    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Usage")
    public RunLegalAdviceConsultationResponseBodyUsage usage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    public static RunLegalAdviceConsultationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunLegalAdviceConsultationResponseBody self = new RunLegalAdviceConsultationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunLegalAdviceConsultationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunLegalAdviceConsultationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunLegalAdviceConsultationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunLegalAdviceConsultationResponseBody setResponseMarkdown(String responseMarkdown) {
        this.responseMarkdown = responseMarkdown;
        return this;
    }
    public String getResponseMarkdown() {
        return this.responseMarkdown;
    }

    public RunLegalAdviceConsultationResponseBody setRound(Integer round) {
        this.round = round;
        return this;
    }
    public Integer getRound() {
        return this.round;
    }

    public RunLegalAdviceConsultationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RunLegalAdviceConsultationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RunLegalAdviceConsultationResponseBody setUsage(RunLegalAdviceConsultationResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public RunLegalAdviceConsultationResponseBodyUsage getUsage() {
        return this.usage;
    }

    public RunLegalAdviceConsultationResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public static class RunLegalAdviceConsultationResponseBodyUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("InputTokens")
        public Integer inputTokens;

        /**
         * <strong>example:</strong>
         * <p>700</p>
         */
        @NameInMap("OutputTokens")
        public Integer outputTokens;

        /**
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("TotalTokens")
        public Integer totalTokens;

        public static RunLegalAdviceConsultationResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            RunLegalAdviceConsultationResponseBodyUsage self = new RunLegalAdviceConsultationResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public RunLegalAdviceConsultationResponseBodyUsage setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public RunLegalAdviceConsultationResponseBodyUsage setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public RunLegalAdviceConsultationResponseBodyUsage setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

    }

}
