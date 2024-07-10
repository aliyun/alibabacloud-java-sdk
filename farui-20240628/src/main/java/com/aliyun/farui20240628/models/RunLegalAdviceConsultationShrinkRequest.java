// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunLegalAdviceConsultationShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("assistant")
    public String assistantShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("thread")
    public String threadShrink;

    public static RunLegalAdviceConsultationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunLegalAdviceConsultationShrinkRequest self = new RunLegalAdviceConsultationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunLegalAdviceConsultationShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunLegalAdviceConsultationShrinkRequest setAssistantShrink(String assistantShrink) {
        this.assistantShrink = assistantShrink;
        return this;
    }
    public String getAssistantShrink() {
        return this.assistantShrink;
    }

    public RunLegalAdviceConsultationShrinkRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public RunLegalAdviceConsultationShrinkRequest setThreadShrink(String threadShrink) {
        this.threadShrink = threadShrink;
        return this;
    }
    public String getThreadShrink() {
        return this.threadShrink;
    }

}
