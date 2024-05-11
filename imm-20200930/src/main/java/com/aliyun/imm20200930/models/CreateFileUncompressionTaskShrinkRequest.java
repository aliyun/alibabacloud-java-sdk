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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SelectedFiles")
    public String selectedFilesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("TargetURI")
    public String targetURI;

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

    public CreateFileUncompressionTaskShrinkRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateFileUncompressionTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
