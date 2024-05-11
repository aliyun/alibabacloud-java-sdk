// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateArchiveFileInspectionTaskShrinkRequest extends TeaModel {
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

    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("UserData")
    public String userData;

    public static CreateArchiveFileInspectionTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateArchiveFileInspectionTaskShrinkRequest self = new CreateArchiveFileInspectionTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateArchiveFileInspectionTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateArchiveFileInspectionTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateArchiveFileInspectionTaskShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateArchiveFileInspectionTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateArchiveFileInspectionTaskShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateArchiveFileInspectionTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
