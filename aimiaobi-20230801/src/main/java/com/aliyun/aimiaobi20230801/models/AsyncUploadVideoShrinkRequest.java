// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncUploadVideoShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AdaptiveThreshold")
    public Float adaptiveThreshold;

    /**
     * <strong>example:</strong>
     * <p>重点理解视频中的风景信息</p>
     */
    @NameInMap("AnlysisPrompt")
    public String anlysisPrompt;

    /**
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("FaceIdentitySimilarityMinScore")
    public Double faceIdentitySimilarityMinScore;

    @NameInMap("ReferenceVideo")
    public String referenceVideoShrink;

    @NameInMap("RemoveSubtitle")
    public Boolean removeSubtitle;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceVideos")
    public String sourceVideosShrink;

    /**
     * <strong>example:</strong>
     * <p>默认1</p>
     */
    @NameInMap("SplitInterval")
    public Integer splitInterval;

    /**
     * <strong>example:</strong>
     * <p>task001</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>type001</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("VideoRoles")
    public String videoRolesShrink;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("VideoShotFaceIdentityCount")
    public Integer videoShotFaceIdentityCount;

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

    public AsyncUploadVideoShrinkRequest setAdaptiveThreshold(Float adaptiveThreshold) {
        this.adaptiveThreshold = adaptiveThreshold;
        return this;
    }
    public Float getAdaptiveThreshold() {
        return this.adaptiveThreshold;
    }

    public AsyncUploadVideoShrinkRequest setAnlysisPrompt(String anlysisPrompt) {
        this.anlysisPrompt = anlysisPrompt;
        return this;
    }
    public String getAnlysisPrompt() {
        return this.anlysisPrompt;
    }

    public AsyncUploadVideoShrinkRequest setFaceIdentitySimilarityMinScore(Double faceIdentitySimilarityMinScore) {
        this.faceIdentitySimilarityMinScore = faceIdentitySimilarityMinScore;
        return this;
    }
    public Double getFaceIdentitySimilarityMinScore() {
        return this.faceIdentitySimilarityMinScore;
    }

    public AsyncUploadVideoShrinkRequest setReferenceVideoShrink(String referenceVideoShrink) {
        this.referenceVideoShrink = referenceVideoShrink;
        return this;
    }
    public String getReferenceVideoShrink() {
        return this.referenceVideoShrink;
    }

    public AsyncUploadVideoShrinkRequest setRemoveSubtitle(Boolean removeSubtitle) {
        this.removeSubtitle = removeSubtitle;
        return this;
    }
    public Boolean getRemoveSubtitle() {
        return this.removeSubtitle;
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

    public AsyncUploadVideoShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public AsyncUploadVideoShrinkRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public AsyncUploadVideoShrinkRequest setVideoRolesShrink(String videoRolesShrink) {
        this.videoRolesShrink = videoRolesShrink;
        return this;
    }
    public String getVideoRolesShrink() {
        return this.videoRolesShrink;
    }

    public AsyncUploadVideoShrinkRequest setVideoShotFaceIdentityCount(Integer videoShotFaceIdentityCount) {
        this.videoShotFaceIdentityCount = videoShotFaceIdentityCount;
        return this;
    }
    public Integer getVideoShotFaceIdentityCount() {
        return this.videoShotFaceIdentityCount;
    }

    public AsyncUploadVideoShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
