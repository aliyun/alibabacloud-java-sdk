// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResourceRequest extends TeaModel {
    /**
     * <p>The group name.</p>
     * 
     * <strong>example:</strong>
     * <p>group-kjds******sd</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Specifies whether the resource is the default resource. This parameter can only be set to true and cannot be set to false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>The resource tags. If you specify multiple tags, only resources that meet all the specified tag-based filter conditions are returned.</p>
     */
    @NameInMap("Labels")
    public java.util.List<UpdateWorkspaceResourceRequestLabels> labels;

    /**
     * <p>**This field is no longer used and will be removed. Use the ResourceType field.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The resource IDs.</p>
     * <p>You cannot leave both GroupName and ResourceIds empty. If you specify both the parameters, the value of GroupName of each resource ID in the dataset must be the same.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>MaxCompute</li>
     * <li>ECS</li>
     * <li>Lingjun</li>
     * <li>ACS</li>
     * <li>FLINK</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The specification of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;clusterType&quot;: &quot;share&quot;
     * }</p>
     */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>system.******</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
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
