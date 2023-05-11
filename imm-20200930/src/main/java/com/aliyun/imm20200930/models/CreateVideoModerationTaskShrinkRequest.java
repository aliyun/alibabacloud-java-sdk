// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateVideoModerationTaskShrinkRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("MaxFrames")
    public Long maxFrames;

    /**
     * <p>消息通知配置，支持使用MNS、RocketMQ接收异步消息通知。</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

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

    public static CreateVideoModerationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoModerationTaskShrinkRequest self = new CreateVideoModerationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoModerationTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateVideoModerationTaskShrinkRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public CreateVideoModerationTaskShrinkRequest setMaxFrames(Long maxFrames) {
        this.maxFrames = maxFrames;
        return this;
    }
    public Long getMaxFrames() {
        return this.maxFrames;
    }

    public CreateVideoModerationTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateVideoModerationTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateVideoModerationTaskShrinkRequest setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

    public CreateVideoModerationTaskShrinkRequest setScenesShrink(String scenesShrink) {
        this.scenesShrink = scenesShrink;
        return this;
    }
    public String getScenesShrink() {
        return this.scenesShrink;
    }

    public CreateVideoModerationTaskShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateVideoModerationTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateVideoModerationTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
