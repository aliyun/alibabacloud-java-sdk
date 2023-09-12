// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageSplicingTaskShrinkRequest extends TeaModel {
    @NameInMap("Align")
    public Long align;

    @NameInMap("BackgroundColor")
    public String backgroundColor;

    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("ImageFormat")
    public String imageFormat;

    @NameInMap("Margin")
    public Long margin;

    @NameInMap("Notification")
    public String notificationShrink;

    @NameInMap("Padding")
    public Long padding;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Quality")
    public Long quality;

    @NameInMap("ScaleType")
    public String scaleType;

    @NameInMap("Sources")
    public String sourcesShrink;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("TargetURI")
    public String targetURI;

    @NameInMap("UserData")
    public String userData;

    public static CreateImageSplicingTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageSplicingTaskShrinkRequest self = new CreateImageSplicingTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageSplicingTaskShrinkRequest setAlign(Long align) {
        this.align = align;
        return this;
    }
    public Long getAlign() {
        return this.align;
    }

    public CreateImageSplicingTaskShrinkRequest setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public CreateImageSplicingTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateImageSplicingTaskShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreateImageSplicingTaskShrinkRequest setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public CreateImageSplicingTaskShrinkRequest setMargin(Long margin) {
        this.margin = margin;
        return this;
    }
    public Long getMargin() {
        return this.margin;
    }

    public CreateImageSplicingTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateImageSplicingTaskShrinkRequest setPadding(Long padding) {
        this.padding = padding;
        return this;
    }
    public Long getPadding() {
        return this.padding;
    }

    public CreateImageSplicingTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageSplicingTaskShrinkRequest setQuality(Long quality) {
        this.quality = quality;
        return this;
    }
    public Long getQuality() {
        return this.quality;
    }

    public CreateImageSplicingTaskShrinkRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public CreateImageSplicingTaskShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public CreateImageSplicingTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateImageSplicingTaskShrinkRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateImageSplicingTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
