// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDetectVideoLabelsTaskShrinkRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

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
    public String tagsShrink;

    // UserData
    @NameInMap("UserData")
    public String userData;

    public static CreateDetectVideoLabelsTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectVideoLabelsTaskShrinkRequest self = new CreateDetectVideoLabelsTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDetectVideoLabelsTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateDetectVideoLabelsTaskShrinkRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateDetectVideoLabelsTaskShrinkRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateDetectVideoLabelsTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateDetectVideoLabelsTaskShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateDetectVideoLabelsTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateDetectVideoLabelsTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
