// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateVideoModerationTaskShrinkRequest extends TeaModel {
    /**
     * <p>The chained authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The interval for video snapshots, in seconds. The value can be an integer from 1 to 600. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The maximum number of frames that can be captured for this detection task. The value can be an integer from 5 to 3,600. The default value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxFrames")
    public Long maxFrames;

    /**
     * <p>The notification configuration. For the format of asynchronous notification messages, see the metadata index section in <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The name of the project. For more information about how to get the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The video detection scenarios.</p>
     */
    @NameInMap("Scenes")
    public String scenesShrink;

    /**
     * <p>The OSS URI of the video.</p>
     * <p>The OSS URI must follow the format oss\://${Bucket}/${Object}. <code>${Bucket}</code> is the name of the OSS bucket in the same region as the project. <code>${Object}</code> is the full path of the file, including the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>Custom tags used to search for tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;: &quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>Custom information that is returned in the asynchronous notification message. Use this information to associate the notification message with your internal system. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateVideoModerationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoModerationTaskShrinkRequest self = new CreateVideoModerationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoModerationTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateVideoModerationTaskShrinkRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public CreateVideoModerationTaskShrinkRequest setMaxFrames(Long maxFrames) {
        this.maxFrames = maxFrames;
        return this;
    }
    public Long getMaxFrames() {
        return this.maxFrames;
    }

    public CreateVideoModerationTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateVideoModerationTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateVideoModerationTaskShrinkRequest setScenesShrink(String scenesShrink) {
        this.scenesShrink = scenesShrink;
        return this;
    }
    public String getScenesShrink() {
        return this.scenesShrink;
    }

    public CreateVideoModerationTaskShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateVideoModerationTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateVideoModerationTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
