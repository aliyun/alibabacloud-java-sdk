// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class RunCompletionResponseBody extends TeaModel {
    @NameInMap("FinishReason")
    public String finishReason;

    /**
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Text")
    public String text;

    @NameInMap("inputTokens")
    public String inputTokens;

    @NameInMap("outputTokens")
    public String outputTokens;

    @NameInMap("ragStatus")
    public String ragStatus;

    @NameInMap("totalTokens")
    public String totalTokens;

    @NameInMap("usage")
    public RunCompletionResponseBodyUsage usage;

    public static RunCompletionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCompletionResponseBody self = new RunCompletionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCompletionResponseBody setFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    public String getFinishReason() {
        return this.finishReason;
    }

    public RunCompletionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCompletionResponseBody setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public RunCompletionResponseBody setInputTokens(String inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public String getInputTokens() {
        return this.inputTokens;
    }

    public RunCompletionResponseBody setOutputTokens(String outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public String getOutputTokens() {
        return this.outputTokens;
    }

    public RunCompletionResponseBody setRagStatus(String ragStatus) {
        this.ragStatus = ragStatus;
        return this;
    }
    public String getRagStatus() {
        return this.ragStatus;
    }

    public RunCompletionResponseBody setTotalTokens(String totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public String getTotalTokens() {
        return this.totalTokens;
    }

    public RunCompletionResponseBody setUsage(RunCompletionResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public RunCompletionResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class RunCompletionResponseBodyUsageRagAdaptive extends TeaModel {
        @NameInMap("inputTokens")
        public Integer inputTokens;

        @NameInMap("invokeCount")
        public Integer invokeCount;

        @NameInMap("outputTokens")
        public Integer outputTokens;

        public static RunCompletionResponseBodyUsageRagAdaptive build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionResponseBodyUsageRagAdaptive self = new RunCompletionResponseBodyUsageRagAdaptive();
            return TeaModel.build(map, self);
        }

        public RunCompletionResponseBodyUsageRagAdaptive setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public RunCompletionResponseBodyUsageRagAdaptive setInvokeCount(Integer invokeCount) {
            this.invokeCount = invokeCount;
            return this;
        }
        public Integer getInvokeCount() {
            return this.invokeCount;
        }

        public RunCompletionResponseBodyUsageRagAdaptive setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

    }

    public static class RunCompletionResponseBodyUsageRagDialogSummary extends TeaModel {
        @NameInMap("inputTokens")
        public Integer inputTokens;

        @NameInMap("invokeCount")
        public Integer invokeCount;

        @NameInMap("outputTokens")
        public Integer outputTokens;

        public static RunCompletionResponseBodyUsageRagDialogSummary build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionResponseBodyUsageRagDialogSummary self = new RunCompletionResponseBodyUsageRagDialogSummary();
            return TeaModel.build(map, self);
        }

        public RunCompletionResponseBodyUsageRagDialogSummary setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public RunCompletionResponseBodyUsageRagDialogSummary setInvokeCount(Integer invokeCount) {
            this.invokeCount = invokeCount;
            return this;
        }
        public Integer getInvokeCount() {
            return this.invokeCount;
        }

        public RunCompletionResponseBodyUsageRagDialogSummary setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

    }

    public static class RunCompletionResponseBodyUsageRag extends TeaModel {
        @NameInMap("adaptive")
        public RunCompletionResponseBodyUsageRagAdaptive adaptive;

        @NameInMap("dialogSummary")
        public RunCompletionResponseBodyUsageRagDialogSummary dialogSummary;

        public static RunCompletionResponseBodyUsageRag build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionResponseBodyUsageRag self = new RunCompletionResponseBodyUsageRag();
            return TeaModel.build(map, self);
        }

        public RunCompletionResponseBodyUsageRag setAdaptive(RunCompletionResponseBodyUsageRagAdaptive adaptive) {
            this.adaptive = adaptive;
            return this;
        }
        public RunCompletionResponseBodyUsageRagAdaptive getAdaptive() {
            return this.adaptive;
        }

        public RunCompletionResponseBodyUsageRag setDialogSummary(RunCompletionResponseBodyUsageRagDialogSummary dialogSummary) {
            this.dialogSummary = dialogSummary;
            return this;
        }
        public RunCompletionResponseBodyUsageRagDialogSummary getDialogSummary() {
            return this.dialogSummary;
        }

    }

    public static class RunCompletionResponseBodyUsage extends TeaModel {
        @NameInMap("rag")
        public RunCompletionResponseBodyUsageRag rag;

        public static RunCompletionResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionResponseBodyUsage self = new RunCompletionResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public RunCompletionResponseBodyUsage setRag(RunCompletionResponseBodyUsageRag rag) {
            this.rag = rag;
            return this;
        }
        public RunCompletionResponseBodyUsageRag getRag() {
            return this.rag;
        }

    }

}
