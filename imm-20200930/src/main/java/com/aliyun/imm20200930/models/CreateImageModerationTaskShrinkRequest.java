// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageModerationTaskShrinkRequest extends TeaModel {
    /**
     * <p>The chained authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

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
    public String notificationShrink;

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
    public String scenesShrink;

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
    public String tagsShrink;

    /**
     * <p>The custom information. This information is returned in the asynchronous notification message to help you associate the message with your system. The value can be up to 2,048 bytes long.</p>
     * 
     * <strong>example:</strong>
     * <p>test-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateImageModerationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageModerationTaskShrinkRequest self = new CreateImageModerationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageModerationTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateImageModerationTaskShrinkRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public CreateImageModerationTaskShrinkRequest setMaxFrames(Long maxFrames) {
        this.maxFrames = maxFrames;
        return this;
    }
    public Long getMaxFrames() {
        return this.maxFrames;
    }

    public CreateImageModerationTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateImageModerationTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageModerationTaskShrinkRequest setScenesShrink(String scenesShrink) {
        this.scenesShrink = scenesShrink;
        return this;
    }
    public String getScenesShrink() {
        return this.scenesShrink;
    }

    public CreateImageModerationTaskShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateImageModerationTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateImageModerationTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
