// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCustomizedStoryShrinkRequest extends TeaModel {
    /**
     * <p>The cover image of the story. You can specify an image as the cover image of the custom story.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Cover")
    public String coverShrink;

    /**
     * <p>The custom labels. You can specify labels to help you identify and retrieve the story.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
     */
    @NameInMap("CustomLabels")
    public String customLabelsShrink;

    /**
     * <p>The name of the dataset.<a href="~~478160~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset001</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The files of the story. You can specify up to 100 files in a custom story.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Files")
    public String filesShrink;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the story.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("StoryName")
    public String storyName;

    /**
     * <p>The subtype of the story. For information about valid subtypes, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Solo</p>
     */
    @NameInMap("StorySubType")
    public String storySubType;

    /**
     * <p>The type of the story. For information about valid types, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PeopleMemory</p>
     */
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
