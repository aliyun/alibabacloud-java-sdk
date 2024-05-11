// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageSplicingTaskRequest extends TeaModel {
    @NameInMap("Align")
    public Long align;

    @NameInMap("BackgroundColor")
    public String backgroundColor;

    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("ImageFormat")
    public String imageFormat;

    @NameInMap("Margin")
    public Long margin;

    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("Padding")
    public Long padding;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Quality")
    public Long quality;

    @NameInMap("ScaleType")
    public String scaleType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateImageSplicingTaskRequestSources> sources;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    @NameInMap("UserData")
    public String userData;

    public static CreateImageSplicingTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageSplicingTaskRequest self = new CreateImageSplicingTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageSplicingTaskRequest setAlign(Long align) {
        this.align = align;
        return this;
    }
    public Long getAlign() {
        return this.align;
    }

    public CreateImageSplicingTaskRequest setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public CreateImageSplicingTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateImageSplicingTaskRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreateImageSplicingTaskRequest setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public CreateImageSplicingTaskRequest setMargin(Long margin) {
        this.margin = margin;
        return this;
    }
    public Long getMargin() {
        return this.margin;
    }

    public CreateImageSplicingTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateImageSplicingTaskRequest setPadding(Long padding) {
        this.padding = padding;
        return this;
    }
    public Long getPadding() {
        return this.padding;
    }

    public CreateImageSplicingTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageSplicingTaskRequest setQuality(Long quality) {
        this.quality = quality;
        return this;
    }
    public Long getQuality() {
        return this.quality;
    }

    public CreateImageSplicingTaskRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public CreateImageSplicingTaskRequest setSources(java.util.List<CreateImageSplicingTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateImageSplicingTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateImageSplicingTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateImageSplicingTaskRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateImageSplicingTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateImageSplicingTaskRequestSources extends TeaModel {
        @NameInMap("Rotate")
        public Long rotate;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateImageSplicingTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateImageSplicingTaskRequestSources self = new CreateImageSplicingTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateImageSplicingTaskRequestSources setRotate(Long rotate) {
            this.rotate = rotate;
            return this;
        }
        public Long getRotate() {
            return this.rotate;
        }

        public CreateImageSplicingTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
