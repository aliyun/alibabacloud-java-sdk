// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class AnalyzeImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>stop</p>
     */
    @NameInMap("finishReason")
    public String finishReason;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("inputTokens")
    public String inputTokens;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("outputTokens")
    public String outputTokens;

    /**
     * <strong>example:</strong>
     * <p>9*****-AE0D-5EE3-B1AF-48632CB0831C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    @NameInMap("text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("totalTokens")
    public String totalTokens;

    public static AnalyzeImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeImageResponseBody self = new AnalyzeImageResponseBody();
        return TeaModel.build(map, self);
    }

    public AnalyzeImageResponseBody setFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    public String getFinishReason() {
        return this.finishReason;
    }

    public AnalyzeImageResponseBody setInputTokens(String inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public String getInputTokens() {
        return this.inputTokens;
    }

    public AnalyzeImageResponseBody setOutputTokens(String outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public String getOutputTokens() {
        return this.outputTokens;
    }

    public AnalyzeImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AnalyzeImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AnalyzeImageResponseBody setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public AnalyzeImageResponseBody setTotalTokens(String totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public String getTotalTokens() {
        return this.totalTokens;
    }

}
