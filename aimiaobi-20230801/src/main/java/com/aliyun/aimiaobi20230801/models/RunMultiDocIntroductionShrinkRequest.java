// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunMultiDocIntroductionShrinkRequest extends TeaModel {
    /**
     * <p>Array of document IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DocIds")
    public String docIdsShrink;

    /**
     * <p>Custom prompt for key points.</p>
     * 
     * <strong>example:</strong>
     * <p>请简明扼要</p>
     */
    @NameInMap("KeyPointPrompt")
    public String keyPointPrompt;

    /**
     * <p>Name of the custom model to use.</p>
     * 
     * <strong>example:</strong>
     * <p>quanmiao-max、quanmiao-plus</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>Session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>75bf82fa-b71b-45d7-ae40-0b00e496cd9e</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Custom prompt for the summary.</p>
     * 
     * <strong>example:</strong>
     * <p>请简明扼要</p>
     */
    @NameInMap("SummaryPrompt")
    public String summaryPrompt;

    /**
     * <p>Unique identifier of the Alibaba Cloud Model Studio workspace. To get this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunMultiDocIntroductionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMultiDocIntroductionShrinkRequest self = new RunMultiDocIntroductionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunMultiDocIntroductionShrinkRequest setDocIdsShrink(String docIdsShrink) {
        this.docIdsShrink = docIdsShrink;
        return this;
    }
    public String getDocIdsShrink() {
        return this.docIdsShrink;
    }

    public RunMultiDocIntroductionShrinkRequest setKeyPointPrompt(String keyPointPrompt) {
        this.keyPointPrompt = keyPointPrompt;
        return this;
    }
    public String getKeyPointPrompt() {
        return this.keyPointPrompt;
    }

    public RunMultiDocIntroductionShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RunMultiDocIntroductionShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunMultiDocIntroductionShrinkRequest setSummaryPrompt(String summaryPrompt) {
        this.summaryPrompt = summaryPrompt;
        return this;
    }
    public String getSummaryPrompt() {
        return this.summaryPrompt;
    }

    public RunMultiDocIntroductionShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
