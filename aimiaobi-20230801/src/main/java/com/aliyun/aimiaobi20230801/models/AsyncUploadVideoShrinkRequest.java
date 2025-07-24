// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncUploadVideoShrinkRequest extends TeaModel {
    @NameInMap("AnlysisPrompt")
    public String anlysisPrompt;

    @NameInMap("ReferenceVideo")
    public String referenceVideoShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceVideos")
    public String sourceVideosShrink;

    @NameInMap("SplitInterval")
    public Integer splitInterval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AsyncUploadVideoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncUploadVideoShrinkRequest self = new AsyncUploadVideoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AsyncUploadVideoShrinkRequest setAnlysisPrompt(String anlysisPrompt) {
        this.anlysisPrompt = anlysisPrompt;
        return this;
    }
    public String getAnlysisPrompt() {
        return this.anlysisPrompt;
    }

    public AsyncUploadVideoShrinkRequest setReferenceVideoShrink(String referenceVideoShrink) {
        this.referenceVideoShrink = referenceVideoShrink;
        return this;
    }
    public String getReferenceVideoShrink() {
        return this.referenceVideoShrink;
    }

    public AsyncUploadVideoShrinkRequest setSourceVideosShrink(String sourceVideosShrink) {
        this.sourceVideosShrink = sourceVideosShrink;
        return this;
    }
    public String getSourceVideosShrink() {
        return this.sourceVideosShrink;
    }

    public AsyncUploadVideoShrinkRequest setSplitInterval(Integer splitInterval) {
        this.splitInterval = splitInterval;
        return this;
    }
    public Integer getSplitInterval() {
        return this.splitInterval;
    }

    public AsyncUploadVideoShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
