// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateBatchShrinkRequest extends TeaModel {
    /**
     * <p>The processing templates.</p>
     */
    @NameInMap("Actions")
    public String actionsShrink;

    /**
     * <p>The ID of the batch processing task. You can obtain the ID of the batch processing task from the response of the <a href="https://help.aliyun.com/document_detail/606694.html">CreateBatch</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>batch-4eb9223f-3e88-42d3-a578-3f2852******</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The input data source.</p>
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
