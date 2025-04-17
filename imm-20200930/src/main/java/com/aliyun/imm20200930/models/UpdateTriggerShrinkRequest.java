// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateTriggerShrinkRequest extends TeaModel {
    /**
     * <p>The processing templates.</p>
     */
    @NameInMap("Actions")
    public String actionsShrink;

    /**
     * <p>The ID of the trigger. You can obtain the ID of the trigger from the response of the <a href="https://help.aliyun.com/document_detail/479912.html">CreateTrigger</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger-9f72636a-0f0c-4baf-ae78-38b27b******</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The data source configurations.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;: &quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static UpdateTriggerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerShrinkRequest self = new UpdateTriggerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerShrinkRequest setActionsShrink(String actionsShrink) {
        this.actionsShrink = actionsShrink;
        return this;
    }
    public String getActionsShrink() {
        return this.actionsShrink;
    }

    public UpdateTriggerShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateTriggerShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public UpdateTriggerShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateTriggerShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
