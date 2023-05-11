// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageToPDFTaskRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>消息通知配置，支持使用MNS、RocketMQ接收异步消息通知。</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Sources")
    public java.util.List<CreateImageToPDFTaskRequestSources> sources;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("TargetURI")
    public String targetURI;

    @NameInMap("UserData")
    public String userData;

    public static CreateImageToPDFTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageToPDFTaskRequest self = new CreateImageToPDFTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageToPDFTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateImageToPDFTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateImageToPDFTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageToPDFTaskRequest setSources(java.util.List<CreateImageToPDFTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateImageToPDFTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateImageToPDFTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateImageToPDFTaskRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateImageToPDFTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateImageToPDFTaskRequestSources extends TeaModel {
        @NameInMap("Rotate")
        public Long rotate;

        @NameInMap("URI")
        public String URI;

        public static CreateImageToPDFTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateImageToPDFTaskRequestSources self = new CreateImageToPDFTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateImageToPDFTaskRequestSources setRotate(Long rotate) {
            this.rotate = rotate;
            return this;
        }
        public Long getRotate() {
            return this.rotate;
        }

        public CreateImageToPDFTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
