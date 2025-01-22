// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunAgentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d6zxykawk9</p>
     */
    @NameInMap("botId")
    public String botId;

    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <strong>example:</strong>
     * <p>4vlag5ken3</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("useDraft")
    public Boolean useDraft;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userContent")
    public String userContent;

    /**
     * <strong>example:</strong>
     * <p>w4paqoezm2</p>
     */
    @NameInMap("versionId")
    public String versionId;

    public static RunAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        RunAgentRequest self = new RunAgentRequest();
        return TeaModel.build(map, self);
    }

    public RunAgentRequest setBotId(String botId) {
        this.botId = botId;
        return this;
    }
    public String getBotId() {
        return this.botId;
    }

    public RunAgentRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunAgentRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public RunAgentRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public RunAgentRequest setUseDraft(Boolean useDraft) {
        this.useDraft = useDraft;
        return this;
    }
    public Boolean getUseDraft() {
        return this.useDraft;
    }

    public RunAgentRequest setUserContent(String userContent) {
        this.userContent = userContent;
        return this;
    }
    public String getUserContent() {
        return this.userContent;
    }

    public RunAgentRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
