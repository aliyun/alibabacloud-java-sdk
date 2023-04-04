// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileUncompressionTaskShrinkRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("Notification")
    public String notificationShrink;

    @NameInMap("Password")
    public String password;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SelectedFiles")
    public String selectedFilesShrink;

    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("Target")
    public String targetShrink;

    @NameInMap("UserData")
    public String userData;

    public static CreateFileUncompressionTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileUncompressionTaskShrinkRequest self = new CreateFileUncompressionTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileUncompressionTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateFileUncompressionTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateFileUncompressionTaskShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateFileUncompressionTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFileUncompressionTaskShrinkRequest setSelectedFilesShrink(String selectedFilesShrink) {
        this.selectedFilesShrink = selectedFilesShrink;
        return this;
    }
    public String getSelectedFilesShrink() {
        return this.selectedFilesShrink;
    }

    public CreateFileUncompressionTaskShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateFileUncompressionTaskShrinkRequest setTargetShrink(String targetShrink) {
        this.targetShrink = targetShrink;
        return this;
    }
    public String getTargetShrink() {
        return this.targetShrink;
    }

    public CreateFileUncompressionTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
