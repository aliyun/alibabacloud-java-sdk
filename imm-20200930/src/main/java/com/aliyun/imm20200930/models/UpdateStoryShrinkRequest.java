// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateStoryShrinkRequest extends TeaModel {
    @NameInMap("Cover")
    public String coverShrink;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("CustomLabels")
    public String customLabelsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("StoryName")
    public String storyName;

    public static UpdateStoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoryShrinkRequest self = new UpdateStoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStoryShrinkRequest setCoverShrink(String coverShrink) {
        this.coverShrink = coverShrink;
        return this;
    }
    public String getCoverShrink() {
        return this.coverShrink;
    }

    public UpdateStoryShrinkRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public UpdateStoryShrinkRequest setCustomLabelsShrink(String customLabelsShrink) {
        this.customLabelsShrink = customLabelsShrink;
        return this;
    }
    public String getCustomLabelsShrink() {
        return this.customLabelsShrink;
    }

    public UpdateStoryShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateStoryShrinkRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public UpdateStoryShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateStoryShrinkRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

}
