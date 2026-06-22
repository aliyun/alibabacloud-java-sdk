// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageToPDFTaskShrinkRequest extends TeaModel {
    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The chained authorization configuration. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The message notification configuration. For more information, click Notification. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

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
     * <p>A list of input images. The images are converted in the order of their URIs in this list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public String sourcesShrink;

    /**
     * <p>Custom tags used to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;User&quot;: &quot;Jane&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The OSS address where the output PDF file is stored.</p>
     * <p>The address must be in the \<code>oss\\://${bucketname}/${objectname}\\</code> format. \<code>${bucketname}\\</code> must be an OSS bucket in the same region as the project. \<code>${objectname}\\</code> must be the path of the file, including the file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/outputDocument.pdf</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>Custom user information that is returned in the asynchronous notification message. This helps you associate the notification message with your system. The maximum length is 2048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateImageToPDFTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageToPDFTaskShrinkRequest self = new CreateImageToPDFTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageToPDFTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateImageToPDFTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateImageToPDFTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageToPDFTaskShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public CreateImageToPDFTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateImageToPDFTaskShrinkRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateImageToPDFTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
