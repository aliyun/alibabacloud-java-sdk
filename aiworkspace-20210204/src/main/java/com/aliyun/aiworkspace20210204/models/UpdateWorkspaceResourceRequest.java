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
     * <p>Specifies whether to set the resource as the default resource for the workspace. Currently, only <code>true</code> is a valid value.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>An array of tags. The update affects only resources that have all of the specified tags.</p>
     */
    @NameInMap("Labels")
    public java.util.List<UpdateWorkspaceResourceRequestLabels> labels;

    /**
     * <p><strong>This parameter is deprecated. Use <code>ResourceType</code> instead.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>An array of resource IDs.</p>
     * <p>You cannot leave both <code>GroupName</code> and <code>ResourceIds</code> empty. If you specify both parameters, the group name must be the same for all specified resource IDs.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The resource type. Valid values are:</p>
     * <ul>
     * <li><p>MaxCompute: MaxCompute resources.</p>
     * </li>
     * <li><p>ECS: General-purpose computing resources.</p>
     * </li>
     * <li><p>Lingjun: Lingjun intelligent computing resources.</p>
     * </li>
     * <li><p>ACS: ACS computing resources.</p>
     * </li>
     * <li><p>Flink: Flink resources.</p>
     * </li>
     * <li><p>SelfManagedAckPro: Resources for self-managed ACK Pro clusters.</p>
     * </li>
     * <li><p>SelfManagedAckLingjun: Resources for self-managed ACK Lingjun clusters.</p>
     * </li>
     * <li><p>SelfManagedASI: Resources for self-managed clusters on third-party clouds.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The specifications of the resource.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>system.******</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
