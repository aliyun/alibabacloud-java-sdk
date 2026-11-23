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
     * <p>Specifies whether the resource is the default resource. Currently, you can set this parameter only to true. The value false is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>The collection of resource tags. If multiple tags are specified, only resources that have all the specified tags are returned.</p>
     */
    @NameInMap("Labels")
    public java.util.List<UpdateWorkspaceResourceRequestLabels> labels;

    /**
     * <p><strong>[Deprecated]</strong> This field is deprecated and will be taken offline. Use the ResourceType field instead.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The collection of resource IDs. GroupName and ResourceIds cannot be both empty, but they can be both specified. If both are specified, the GroupName of each resource ID in the collection must be the same.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The list of resource types. Valid values:</p>
     * <ul>
     * <li>MaxCompute: MaxCompute big data compute EPS resources</li>
     * <li>ECS: general-purpose compute resources</li>
     * <li>Lingjun: Lingjun AI computing resources</li>
     * <li>ACS: ACS compute resources</li>
     * <li>FLINK: Flink resources</li>
     * <li>SelfManagedAckPro: ACK Pro unified management cluster resources</li>
     * <li>SelfManagedAckLingjun: ACK Lingjun unified management cluster resources</li>
     * <li>SelfManagedASI: ASI unified management cluster resources (third-party cloud)</li>
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
