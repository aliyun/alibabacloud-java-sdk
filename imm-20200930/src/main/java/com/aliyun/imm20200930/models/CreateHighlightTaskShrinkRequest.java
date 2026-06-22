// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateHighlightTaskShrinkRequest extends TeaModel {
    /**
     * <p>The China authorization configuration. <strong>Leave this parameter empty unless you have specific requirements.</strong>.</p>
     */
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    /**
     * <p>The editing configuration.</p>
     */
    @NameInMap("Edit")
    public String editShrink;

    /**
     * <p>The highlight configuration.</p>
     */
    @NameInMap("Highlight")
    public String highlightShrink;

    /**
     * <p>The highlight recognition mode. Valid values:</p>
     * <ul>
     * <li><p>Scene: scene and frame recognition.</p>
     * </li>
     * <li><p>Average (default): average slice recognition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The message notification configuration. For more information, click Notification. For the format of asynchronous notification messages, see <a href="https://www.alibabacloud.com/help/en/imm/developer-reference/asynchronous-notification-message-examples">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The output configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <p>The project name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The list of media resources to process.
     * A maximum of 10 videos are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public String sourcesShrink;

    /**
     * <p>The custom tags used to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The processing type. Valid values:</p>
     * <ul>
     * <li><p>Retrieval: highlight extraction.</p>
     * </li>
     * <li><p>Concat: video composition.</p>
     * </li>
     * <li><p>Compose: one-click video creation.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Retrieval</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The custom user data, which is returned in asynchronous message notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateHighlightTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHighlightTaskShrinkRequest self = new CreateHighlightTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateHighlightTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateHighlightTaskShrinkRequest setEditShrink(String editShrink) {
        this.editShrink = editShrink;
        return this;
    }
    public String getEditShrink() {
        return this.editShrink;
    }

    public CreateHighlightTaskShrinkRequest setHighlightShrink(String highlightShrink) {
        this.highlightShrink = highlightShrink;
        return this;
    }
    public String getHighlightShrink() {
        return this.highlightShrink;
    }

    public CreateHighlightTaskShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateHighlightTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateHighlightTaskShrinkRequest setOutputShrink(String outputShrink) {
        this.outputShrink = outputShrink;
        return this;
    }
    public String getOutputShrink() {
        return this.outputShrink;
    }

    public CreateHighlightTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateHighlightTaskShrinkRequest setSourcesShrink(String sourcesShrink) {
        this.sourcesShrink = sourcesShrink;
        return this;
    }
    public String getSourcesShrink() {
        return this.sourcesShrink;
    }

    public CreateHighlightTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateHighlightTaskShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateHighlightTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
