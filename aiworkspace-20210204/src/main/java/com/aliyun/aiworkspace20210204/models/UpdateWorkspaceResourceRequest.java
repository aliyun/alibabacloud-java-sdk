// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResourceRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("Labels")
    public java.util.List<UpdateWorkspaceResourceRequestLabels> labels;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Spec")
    public java.util.Map<String, ?> spec;

    public static UpdateWorkspaceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResourceRequest self = new UpdateWorkspaceResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResourceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateWorkspaceResourceRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public UpdateWorkspaceResourceRequest setLabels(java.util.List<UpdateWorkspaceResourceRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateWorkspaceResourceRequestLabels> getLabels() {
        return this.labels;
    }

    public UpdateWorkspaceResourceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public UpdateWorkspaceResourceRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public UpdateWorkspaceResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateWorkspaceResourceRequest setSpec(java.util.Map<String, ?> spec) {
        this.spec = spec;
        return this;
    }
    public java.util.Map<String, ?> getSpec() {
        return this.spec;
    }

    public static class UpdateWorkspaceResourceRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateWorkspaceResourceRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceResourceRequestLabels self = new UpdateWorkspaceResourceRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceResourceRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateWorkspaceResourceRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
