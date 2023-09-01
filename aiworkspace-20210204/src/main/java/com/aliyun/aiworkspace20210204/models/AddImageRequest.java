// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("Labels")
    public java.util.List<AddImageRequestLabels> labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("Size")
    public Integer size;

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

    public AddImageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AddImageRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

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
