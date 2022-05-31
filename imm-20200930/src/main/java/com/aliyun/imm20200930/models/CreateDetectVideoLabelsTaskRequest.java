// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDetectVideoLabelsTaskRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    // NotifyEndpoint
    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    // NotifyTopicName
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // SourceURI
    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    // UserData
    @NameInMap("UserData")
    public String userData;

    public static CreateDetectVideoLabelsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectVideoLabelsTaskRequest self = new CreateDetectVideoLabelsTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDetectVideoLabelsTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateDetectVideoLabelsTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateDetectVideoLabelsTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateDetectVideoLabelsTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateDetectVideoLabelsTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateDetectVideoLabelsTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateDetectVideoLabelsTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
