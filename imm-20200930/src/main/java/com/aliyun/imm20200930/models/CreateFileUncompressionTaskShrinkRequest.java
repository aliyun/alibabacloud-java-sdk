// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileUncompressionTaskShrinkRequest extends TeaModel {
    /**
     * <p><strong>Leave this parameter empty unless you have specific requirements.</strong></p>
     * <p>The chained authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access other entity resources</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The message notification configuration. For details, click Notification. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     * <blockquote>
     * <p>Intelligent Media Management API callbacks do not support custom webhook addresses. Use MNS instead.</p>
     * </blockquote>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The password for the encrypted compressed package.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The list of files to decompress. If this parameter is empty, the entire compressed package is decompressed. The default value is empty.</p>
     */
    @NameInMap("SelectedFiles")
    public String selectedFilesShrink;

    /**
     * <p>The Object Storage Service (OSS) address where the compressed file is stored.</p>
     * <p>The OSS address must be in the \<code>oss\\://${Bucket}/${Object}\\</code> format. \<code>${Bucket}\\</code> is the name of the OSS bucket in the same region as the current project. \<code>${Object}\\</code> is the full path of the file, including the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.zip</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The destination OSS address for the decompressed files. The selected files or the entire compressed package are decompressed to this address.</p>
     * <p>The OSS address must be in the \<code>oss\\://${Bucket}/${Object}\\</code> format. \<code>${Bucket}\\</code> is the name of the OSS bucket in the same region as the current project. \<code>${Object}\\</code> is the full path of the file, including the file name extension.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-dir/</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>Custom user information. It is returned in the asynchronous notification message to help you associate the notification with your system. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test-data</p>
     */
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
