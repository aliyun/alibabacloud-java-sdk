// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateVideoLabelClassificationTaskRequest extends TeaModel {
    /**
     * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
     * <p>The chained authorization configuration. This parameter is not required. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The message notification configuration. For more information, click Notification. For more information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The project name. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The Object Storage Service (OSS) URI of the video.</p>
     * <p>The OSS URI must follow the format oss\://${Bucket}/${Object}. ${Bucket} is the name of the OSS bucket that is in the same region as the current project. ${Object} is the full path of the file, including the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket1/object.mp4</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>Custom tags that you can use to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>Custom information. This information is returned in the asynchronous notification message. You can use this information to associate the notification message with your services. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;ID&quot;: &quot;testuid&quot;,
     *       &quot;Name&quot;: &quot;test-user&quot;,
     *       &quot;Avatar&quot;: &quot;<a href="http://test.com/testuid">http://test.com/testuid</a>&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateVideoLabelClassificationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoLabelClassificationTaskRequest self = new CreateVideoLabelClassificationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoLabelClassificationTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateVideoLabelClassificationTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateVideoLabelClassificationTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateVideoLabelClassificationTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateVideoLabelClassificationTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateVideoLabelClassificationTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
