// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResourceRequest extends TeaModel {
    /**
     * <p>The operation to perform. Valid values:</p>
     * <ul>
     * <li>CreateAndAttach: creates resources and associates the resources with a workspace.</li>
     * <li>Attach: associates resources with a workspace.</li>
     * </ul>
     * <blockquote>
     * <p> MaxCompute supports only the Attach operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CreateAndAttach</p>
     */
    @NameInMap("Option")
    public String option;

    /**
     * <p>The resources.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resources")
    public java.util.List<CreateWorkspaceResourceRequestResources> resources;

    public static CreateWorkspaceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResourceRequest self = new CreateWorkspaceResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResourceRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public CreateWorkspaceResourceRequest setResources(java.util.List<CreateWorkspaceResourceRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<CreateWorkspaceResourceRequestResources> getResources() {
        return this.resources;
    }

    public static class CreateWorkspaceResourceRequestResourcesLabels extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>system.support.eas</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateWorkspaceResourceRequestResourcesLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResourceRequestResourcesLabels self = new CreateWorkspaceResourceRequestResourcesLabels();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResourceRequestResourcesLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateWorkspaceResourceRequestResourcesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateWorkspaceResourceRequestResourcesQuotas extends TeaModel {
        /**
         * <p>The quota ID. You can call <a href="https://help.aliyun.com/document_detail/449144.html">ListQuotas</a> to obtain the quota ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>232892******92912</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateWorkspaceResourceRequestResourcesQuotas build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResourceRequestResourcesQuotas self = new CreateWorkspaceResourceRequestResourcesQuotas();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResourceRequestResourcesQuotas setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CreateWorkspaceResourceRequestResources extends TeaModel {
        /**
         * <p>The environment type. Valid values:</p>
         * <ul>
         * <li>dev: development environment</li>
         * <li>prod: production environment</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The name of the resource group, which is unique within your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>groupName</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Specifies whether the resource is the default resource. Each type of resources has a default resource. Valid values:</p>
         * <ul>
         * <li>false (default)</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The tags added to the resource.</p>
         */
        @NameInMap("Labels")
        public java.util.List<CreateWorkspaceResourceRequestResourcesLabels> labels;

        /**
         * <p>The resource name. Format:</p>
         * <ul>
         * <li>The name must be 3 to 28 characters in length, and can contain only letters, digits, and underscores (_). The name must start with a letter.</li>
         * <li>The name is unique in the region.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>**This field is no longer used and will be removed. Use the ResourceType field instead.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The list of quotas. Only MaxCompute quotas are available.</p>
         */
        @NameInMap("Quotas")
        public java.util.List<CreateWorkspaceResourceRequestResourcesQuotas> quotas;

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
         * <p>The resource specifications in the JSON format.</p>
         */
        @NameInMap("Spec")
        public java.util.Map<String, ?> spec;

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static CreateWorkspaceResourceRequestResources build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResourceRequestResources self = new CreateWorkspaceResourceRequestResources();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResourceRequestResources setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public CreateWorkspaceResourceRequestResources setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateWorkspaceResourceRequestResources setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public CreateWorkspaceResourceRequestResources setLabels(java.util.List<CreateWorkspaceResourceRequestResourcesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreateWorkspaceResourceRequestResourcesLabels> getLabels() {
            return this.labels;
        }

        public CreateWorkspaceResourceRequestResources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkspaceResourceRequestResources setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public CreateWorkspaceResourceRequestResources setQuotas(java.util.List<CreateWorkspaceResourceRequestResourcesQuotas> quotas) {
            this.quotas = quotas;
            return this;
        }
        public java.util.List<CreateWorkspaceResourceRequestResourcesQuotas> getQuotas() {
            return this.quotas;
        }

        public CreateWorkspaceResourceRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public CreateWorkspaceResourceRequestResources setSpec(java.util.Map<String, ?> spec) {
            this.spec = spec;
            return this;
        }
        public java.util.Map<String, ?> getSpec() {
            return this.spec;
        }

        public CreateWorkspaceResourceRequestResources setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
