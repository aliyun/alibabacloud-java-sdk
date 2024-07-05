// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateTriggerShrinkRequest extends TeaModel {
    @NameInMap("Actions")
    public String actionsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger-9f72636a-0f0c-4baf-ae78-38b27b******</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
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
