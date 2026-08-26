// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    /**
     * <p>The visibility of the image. Valid values:</p>
     * <ul>
     * <li>PUBLIC: All members in the current workspace can access the image.</li>
     * <li>PRIVATE: Only the creator can access the image.</li>
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
     * <p>The image ID. If this parameter is not specified, the system automatically generates one. The format is image- followed by 18 uppercase or lowercase letters or digits.</p>
     * 
     * <strong>example:</strong>
     * <p>image-k83*****cv</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image URI, which can be duplicated. For information about how to view the image URI, see <a href="https://help.aliyun.com/document_detail/449118.html">ListImage</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/pai-compression/nlp:gpu</p>
     */
    @NameInMap("ImageUri")
    public String imageUri;

    /**
     * <p>The image labels. This is an array in which each item contains a key field and a value field.
     * Official images have the following label: system.official=true
     * The following keys are supported:</p>
     * <ul>
     * <li>system.chipType</li>
     * <li>system.dsw.cudaVersion</li>
     * <li>system.dsw.fromImageId</li>
     * <li>system.dsw.fromInstanceId</li>
     * <li>system.dsw.id</li>
     * <li>system.dsw.os</li>
     * <li>system.dsw.osVersion</li>
     * <li>system.dsw.resourceType</li>
     * <li>system.dsw.rootImageId</li>
     * <li>system.dsw.stage</li>
     * <li>system.dsw.tag</li>
     * <li>system.dsw.type</li>
     * <li>system.framework</li>
     * <li>system.origin</li>
     * <li>system.pythonVersion</li>
     * <li>system.source</li>
     * <li>system.supported.dlc</li>
     * <li>system.supported.dsw</li>
     * </ul>
     */
    @NameInMap("Labels")
    public java.util.List<AddImageRequestLabels> labels;

    /**
     * <p>The image name. Naming rules:</p>
     * <ul>
     * <li>The name must be 1 to 50 characters in length.</li>
     * <li>The name can contain lowercase letters, digits, and hyphens (-), and must start with a letter.</li>
     * <li>The name must be unique within the same workspace.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nlp-compression</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The image size, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>The image source ID. When the image source type is Build, the source ID corresponds to the image build ID.</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The image source type. Valid values:</p>
     * <ul>
     * <li>Import: import.</li>
     * <li>Build: generate.</li>
     * </ul>
     */
    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The ID of the workspace to which the image belongs. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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

    public AddImageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
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
