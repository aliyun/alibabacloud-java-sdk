// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCustomizedStoryShrinkRequest extends TeaModel {
    @NameInMap("Cover")
    public String coverShrink;

    @NameInMap("CustomLabels")
    public String customLabelsShrink;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Files")
    public String filesShrink;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("StoryName")
    public String storyName;

    @NameInMap("StorySubType")
    public String storySubType;

    @NameInMap("StoryType")
    public String storyType;

    public static CreateCustomizedStoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedStoryShrinkRequest self = new CreateCustomizedStoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedStoryShrinkRequest setCoverShrink(String coverShrink) {
        this.coverShrink = coverShrink;
        return this;
    }
    public String getCoverShrink() {
        return this.coverShrink;
    }

    public CreateCustomizedStoryShrinkRequest setCustomLabelsShrink(String customLabelsShrink) {
        this.customLabelsShrink = customLabelsShrink;
        return this;
    }
    public String getCustomLabelsShrink() {
        return this.customLabelsShrink;
    }

    public CreateCustomizedStoryShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateCustomizedStoryShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public CreateCustomizedStoryShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateCustomizedStoryShrinkRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public CreateCustomizedStoryShrinkRequest setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public CreateCustomizedStoryShrinkRequest setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

}
