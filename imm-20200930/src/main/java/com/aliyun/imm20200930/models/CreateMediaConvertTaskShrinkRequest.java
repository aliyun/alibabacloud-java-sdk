// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateMediaConvertTaskShrinkRequest extends TeaModel {
    /**
     * <p>When concatenating media files, this specifies the index of the primary file in the Sources list. The default transcoding parameters (such as resolution and frame rate from the <code>Video</code> and <code>Audio</code> objects) are taken from this primary file. The default index is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AlignmentIndex")
    public Integer alignmentIndex;

    /**
     * <p><strong>You can leave this parameter empty if you do not have special requirements.</strong></p>
     * <p>The chained authorization configuration. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The message notification settings. For more information, click Notification. For information about the format of asynchronous notifications, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification format</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The name of the project. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>A list of media files. If you provide more than one file, they are concatenated in the order of their URIs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public String sourcesShrink;

    /**
     * <p>Custom tags for searching and filtering asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>A list of media packaging tasks to convert and package the input media into HLS outputs. Each TargetGroup corresponds to one HLS master playlist.</p>
     */
    @NameInMap("TargetGroups")
    public String targetGroupsShrink;

    /**
     * <p>A list of media processing tasks.</p>
     */
    @NameInMap("Targets")
    public String targetsShrink;

    /**
     * <p>The custom user data. This data is returned in the asynchronous notification, allowing you to associate the notification with your internal system. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateMediaConvertTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaConvertTaskShrinkRequest self = new CreateMediaConvertTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaConvertTaskShrinkRequest setAlignmentIndex(Integer alignmentIndex) {
        this.alignmentIndex = alignmentIndex;
        return this;
    }
    public Integer getAlignmentIndex() {
        return this.alignmentIndex;
    }

    public CreateMediaConvertTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateMediaConvertTaskShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setTargetGroupsShrink(String targetGroupsShrink) {
        this.targetGroupsShrink = targetGroupsShrink;
        return this;
    }
    public String getTargetGroupsShrink() {
        return this.targetGroupsShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setTargetsShrink(String targetsShrink) {
        this.targetsShrink = targetsShrink;
        return this;
    }
    public String getTargetsShrink() {
        return this.targetsShrink;
    }

    public CreateMediaConvertTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
