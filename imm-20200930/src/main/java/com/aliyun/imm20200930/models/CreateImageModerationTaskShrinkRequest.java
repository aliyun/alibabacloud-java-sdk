// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageModerationTaskShrinkRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("MaxFrames")
    public Long maxFrames;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Reviewer")
    public String reviewer;

    @NameInMap("Scenes")
    public String scenesShrink;

    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("UserData")
    public String userData;

    public static CreateImageModerationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageModerationTaskShrinkRequest self = new CreateImageModerationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageModerationTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateImageModerationTaskShrinkRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public CreateImageModerationTaskShrinkRequest setMaxFrames(Long maxFrames) {
        this.maxFrames = maxFrames;
        return this;
    }
    public Long getMaxFrames() {
        return this.maxFrames;
    }

    public CreateImageModerationTaskShrinkRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateImageModerationTaskShrinkRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateImageModerationTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageModerationTaskShrinkRequest setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

    public CreateImageModerationTaskShrinkRequest setScenesShrink(String scenesShrink) {
        this.scenesShrink = scenesShrink;
        return this;
    }
    public String getScenesShrink() {
        return this.scenesShrink;
    }

    public CreateImageModerationTaskShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateImageModerationTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateImageModerationTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
