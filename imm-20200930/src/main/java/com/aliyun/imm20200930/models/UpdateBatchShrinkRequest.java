// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateBatchShrinkRequest extends TeaModel {
    /**
     * <p>A list of data processing templates.</p>
     */
    @NameInMap("Actions")
    public String actionsShrink;

    /**
     * <p>The ID of the batch processing task. For more information, see <a href="https://help.aliyun.com/document_detail/606694.html">Create a batch processing task</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>batch-4eb9223f-3e88-42d3-a578-3f2852******</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The data source configuration.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The project name. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Custom tags used to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;val&quot;}</p>
     */
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
