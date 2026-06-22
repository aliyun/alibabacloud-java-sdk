// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateArchiveFileInspectionTaskShrinkRequest extends TeaModel {
    /**
     * <p><strong>Leave this parameter empty if you do not have special requirements.</strong></p>
     * <p>The configuration for chained authorization. This parameter is not required. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The notification configuration. For more information, see Notification. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     * <blockquote>
     * <p>Currently, API callbacks in IMM do not support custom webhook addresses. Use MNS instead.</p>
     * </blockquote>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The password of the compressed file. If the file is encrypted, provide the password to inspect its contents.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The project name. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The location of the compressed file.</p>
     * <p>The Object Storage Service (OSS) URI must be in the oss\://${Bucket}/${Object} format. In this format, <code>${Bucket}</code> is the name of the OSS bucket that is in the same region as the current project, and <code>${Object}</code> is the full path of the file, including the file name extension.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/test-object.zip</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>Custom information that is returned in the asynchronous notification message. You can use this information to associate the notification message with your services. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test-data</p>
     */
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
