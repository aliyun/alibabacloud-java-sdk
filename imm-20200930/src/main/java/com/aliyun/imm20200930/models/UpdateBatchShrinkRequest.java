// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateBatchShrinkRequest extends TeaModel {
    @NameInMap("Actions")
    public String actionsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Tags")
    public String tagsShrink;

    public static UpdateBatchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchShrinkRequest self = new UpdateBatchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBatchShrinkRequest setActionsShrink(String actionsShrink) {
        this.actionsShrink = actionsShrink;
        return this;
    }
    public String getActionsShrink() {
        return this.actionsShrink;
    }

    public UpdateBatchShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateBatchShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public UpdateBatchShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateBatchShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
