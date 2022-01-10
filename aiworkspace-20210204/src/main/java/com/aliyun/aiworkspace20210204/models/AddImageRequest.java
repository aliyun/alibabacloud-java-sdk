// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    // 可见性 Public 公有 Private 私有
    @NameInMap("Accessibility")
    public String accessibility;

    // 镜像描述
    @NameInMap("Description")
    public String description;

    // 镜像地址
    @NameInMap("ImageUri")
    public String imageUri;

    // 镜像标签，是个数组
    @NameInMap("Labels")
    public java.util.List<AddImageRequestLabels> labels;

    // 镜像名称
    @NameInMap("Name")
    public String name;

    // 工作空间id
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

    public AddImageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AddImageRequestLabels extends TeaModel {
        // Key
        @NameInMap("Key")
        public String key;

        // Value
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
