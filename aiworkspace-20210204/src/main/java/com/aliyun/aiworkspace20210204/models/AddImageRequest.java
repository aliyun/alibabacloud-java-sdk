// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    /**
     * <p>The accessibility of the image. Valid values:</p>
     * <ul>
     * <li>PUBLIC: The image is accessible to all members in the workspace.</li>
     * <li>PRIVATE: The image is accessible only to the image creator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The image description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The image ID. If you do not specify this parameter, the system automatically generates an image ID. The image ID must start with image- followed by 18 characters in letters or digits.</p>
     * 
     * <strong>example:</strong>
     * <p>image-k83*****cv</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The URL of the image, which can be repeated. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImage</a> to view the image URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/pai-compression/nlp:gpu</p>
     */
    @NameInMap("ImageUri")
    public String imageUri;

    /**
     * <p>The image tag, which is an array. Each element in the array contains a key-value pair. Alibaba Cloud images have the system.official=true tag. You can add the following keys to an image:</p>
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
     * <p>The image name. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 1 to 50 characters in length.</li>
     * <li>The name can contain lowercase letters, digits, and hyphens (-). The name must start with a lowercase letter.</li>
     * <li>The name must be unique in a workspace.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nlp-compression</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The size of the image. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Size")
    public Integer size;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
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

    public AddImageRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>system.chipType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
