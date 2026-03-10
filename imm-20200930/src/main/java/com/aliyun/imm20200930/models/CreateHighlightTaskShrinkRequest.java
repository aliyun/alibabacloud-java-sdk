// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateHighlightTaskShrinkRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("Edit")
    public String editShrink;

    @NameInMap("Highlight")
    public String highlightShrink;

    /**
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public String sourcesShrink;

    /**
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Retrieval</p>
     */
    @NameInMap("Type")
    public String type;

    /**
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
