// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageModerationTaskRequest extends TeaModel {
    /**
     * <p>The chained authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The frame capture frequency. This parameter is used for GIF and long image detection. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The maximum number of frames to capture. This parameter is used for GIF and long image detection. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxFrames")
    public Long maxFrames;

    /**
     * <p>The notification configuration. For more information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The project name. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The image detection scenarios.</p>
     */
    @NameInMap("Scenes")
    public java.util.List<String> scenes;

    /**
     * <p>The OSS URI of the image.</p>
     * <p>The URI must follow the <code>oss://&lt;Bucket&gt;/&lt;Object&gt;</code> format. <code>&lt;Bucket&gt;</code> is the name of the OSS bucket that is in the same region as the project. <code>&lt;Object&gt;</code> is the full path of the file, including the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The custom tags. You can use tags to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;User&quot;: &quot;Jane&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The custom information. This information is returned in the asynchronous notification message to help you associate the message with your system. The value can be up to 2,048 bytes long.</p>
     * 
     * <strong>example:</strong>
     * <p>test-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateImageModerationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageModerationTaskRequest self = new CreateImageModerationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageModerationTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateImageModerationTaskRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public CreateImageModerationTaskRequest setMaxFrames(Long maxFrames) {
        this.maxFrames = maxFrames;
        return this;
    }
    public Long getMaxFrames() {
        return this.maxFrames;
    }

    public CreateImageModerationTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateImageModerationTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageModerationTaskRequest setScenes(java.util.List<String> scenes) {
        this.scenes = scenes;
        return this;
    }
    public java.util.List<String> getScenes() {
        return this.scenes;
    }

    public CreateImageModerationTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateImageModerationTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateImageModerationTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
