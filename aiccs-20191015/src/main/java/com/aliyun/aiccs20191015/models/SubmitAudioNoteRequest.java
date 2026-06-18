// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SubmitAudioNoteRequest extends TeaModel {
    /**
     * <p>The ID of the notes agent. Specify the ID of a published recording notes agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The custom task ID defined by the business side. This ID is used to associate external business records during callbacks or troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>biz-001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The storage path of the recording file in OSS. Use the FilePath returned by the upload address retrieval operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>audio-note/100/uuid/test.wav</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The ID of the LLM model used for notes inference. If this parameter is not specified, the default model configuration of the agent is used.</p>
     * 
     * <strong>example:</strong>
     * <p>88</p>
     */
    @NameInMap("LlmModelId")
    public Long llmModelId;

    public static SubmitAudioNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioNoteRequest self = new SubmitAudioNoteRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAudioNoteRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public SubmitAudioNoteRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SubmitAudioNoteRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public SubmitAudioNoteRequest setLlmModelId(Long llmModelId) {
        this.llmModelId = llmModelId;
        return this;
    }
    public Long getLlmModelId() {
        return this.llmModelId;
    }

}
