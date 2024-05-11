// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateMediaConvertTaskShrinkRequest extends TeaModel {
    @NameInMap("AlignmentIndex")
    public Integer alignmentIndex;

    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>消息通知配置，支持使用MNS、RocketMQ接收异步消息通知。</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public String sourcesShrink;

    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public String targetsShrink;

    @NameInMap("UserData")
    public String userData;

    public static CreateMediaConvertTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaConvertTaskShrinkRequest self = new CreateMediaConvertTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaConvertTaskShrinkRequest setAlignmentIndex(Integer alignmentIndex) {
        this.alignmentIndex = alignmentIndex;
        return this;
    }
    public Integer getAlignmentIndex() {
        return this.alignmentIndex;
    }

    public CreateMediaConvertTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateMediaConvertTaskShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setTargetsShrink(String targetsShrink) {
        this.targetsShrink = targetsShrink;
        return this;
    }
    public String getTargetsShrink() {
        return this.targetsShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
