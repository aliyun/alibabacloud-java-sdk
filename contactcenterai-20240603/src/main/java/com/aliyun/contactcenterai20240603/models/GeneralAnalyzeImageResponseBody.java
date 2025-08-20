// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class GeneralAnalyzeImageResponseBody extends TeaModel {
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
    public Integer inputTokens;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("outputTokens")
    public Integer outputTokens;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D718325-92F9-5588-803B-C4A69A5F0AE1</p>
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
    public Integer totalTokens;

    public static GeneralAnalyzeImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GeneralAnalyzeImageResponseBody self = new GeneralAnalyzeImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GeneralAnalyzeImageResponseBody setFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    public String getFinishReason() {
        return this.finishReason;
    }

    public GeneralAnalyzeImageResponseBody setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public Integer getInputTokens() {
        return this.inputTokens;
    }

    public GeneralAnalyzeImageResponseBody setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public Integer getOutputTokens() {
        return this.outputTokens;
    }

    public GeneralAnalyzeImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GeneralAnalyzeImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GeneralAnalyzeImageResponseBody setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public GeneralAnalyzeImageResponseBody setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Integer getTotalTokens() {
        return this.totalTokens;
    }

}
