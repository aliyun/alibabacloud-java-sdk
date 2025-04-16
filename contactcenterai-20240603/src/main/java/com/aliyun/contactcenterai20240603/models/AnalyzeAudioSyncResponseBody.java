// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class AnalyzeAudioSyncResponseBody extends TeaModel {
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
     * <p>968A8634-FA2C-5381-9B3E-*******F</p>
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

    public static AnalyzeAudioSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeAudioSyncResponseBody self = new AnalyzeAudioSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public AnalyzeAudioSyncResponseBody setFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    public String getFinishReason() {
        return this.finishReason;
    }

    public AnalyzeAudioSyncResponseBody setInputTokens(String inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public String getInputTokens() {
        return this.inputTokens;
    }

    public AnalyzeAudioSyncResponseBody setOutputTokens(String outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public String getOutputTokens() {
        return this.outputTokens;
    }

    public AnalyzeAudioSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AnalyzeAudioSyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AnalyzeAudioSyncResponseBody setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public AnalyzeAudioSyncResponseBody setTotalTokens(String totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public String getTotalTokens() {
        return this.totalTokens;
    }

}
