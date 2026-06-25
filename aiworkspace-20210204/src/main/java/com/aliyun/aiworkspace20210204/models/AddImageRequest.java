// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    /**
     * <p>The visibility of the image. Valid values:</p>
     * <ul>
     * <li><p>PUBLIC: All members of the workspace can perform operations on the image.</p>
     * </li>
     * <li><p>PRIVATE: Only the creator can perform operations on the image.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The description of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>NLP model compression training image</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the image. If you leave this parameter empty, the system automatically generates an ID.
     * The format is \<code>image-\\</code> followed by 18 uppercase letters, lowercase letters, or digits.</p>
     * 
     * <strong>example:</strong>
     * <p>image-k83*****cv</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The URI of the image. The URI can be reused. For more information, see <a href="https://help.aliyun.com/document_detail/449118.html">ListImage</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/pai-compression/nlp:gpu</p>
     */
    @NameInMap("ImageUri")
    public String imageUri;

    /**
     * <p>The labels of the image. This is an array where each item contains a key and a value.
     * Official images have the following label: system.official=true
     * The following keys are supported:</p>
     * <ul>
     * <li><p>system.chipType</p>
     * </li>
     * <li><p>system.dsw\.cudaVersion</p>
     * </li>
     * <li><p>system.dsw\.fromImageId</p>
     * </li>
     * <li><p>system.dsw\.fromInstanceId</p>
     * </li>
     * <li><p>system.dsw\.id</p>
     * </li>
     * <li><p>system.dsw\.os</p>
     * </li>
     * <li><p>system.dsw\.osVersion</p>
     * </li>
     * <li><p>system.dsw\.resourceType</p>
     * </li>
     * <li><p>system.dsw\.rootImageId</p>
     * </li>
     * <li><p>system.dsw\.stage</p>
     * </li>
     * <li><p>system.dsw\.tag</p>
     * </li>
     * <li><p>system.dsw\.type</p>
     * </li>
     * <li><p>system.framework</p>
     * </li>
     * <li><p>system.origin</p>
     * </li>
     * <li><p>system.pythonVersion</p>
     * </li>
     * <li><p>system.source</p>
     * </li>
     * <li><p>system.supported.dlc</p>
     * </li>
     * <li><p>system.supported.dsw</p>
     * </li>
     * </ul>
     */
    @NameInMap("Labels")
    public java.util.List<AddImageRequestLabels> labels;

    /**
     * <p>The image name. The naming convention is as follows:</p>
     * <ul>
     * <li><p>The name must be 1 to 50 characters long.</p>
     * </li>
     * <li><p>The name can contain lowercase letters, digits, and hyphens (-). It must start with a letter.</p>
     * </li>
     * <li><p>The name must be unique within the workspace.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nlp-compression</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The size of the image, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>The source ID of the image. If the source type is Build, this ID corresponds to the image build ID.</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type of the image. Valid values:
     * Import
     * Build</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the workspace to which the image belongs. For more information, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>15******45</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddImageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageRequest self = new AddImageRequest();
        return TeaModel.build(map, self);
    }

    public AddImageRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public AddImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddImageRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public AddImageRequest setLabels(java.util.List<AddImageRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<AddImageRequestLabels> getLabels() {
        return this.labels;
    }

    public AddImageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddImageRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public AddImageRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public AddImageRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public AddImageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AddImageRequestLabels extends TeaModel {
        /**
         * <p>The key of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>system.chipType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>GPU</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddImageRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            AddImageRequestLabels self = new AddImageRequestLabels();
            return TeaModel.build(map, self);
        }

        public AddImageRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddImageRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
