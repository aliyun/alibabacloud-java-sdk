// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateResourceExportTaskRequest extends TeaModel {
    /**
     * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. A UUID is recommended.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description of the resource export task.</p>
     * 
     * <strong>example:</strong>
     * <p>this is description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The configuration for saving the exported template as a module. If this parameter is not specified, the template is automatically saved in the registry.</p>
     */
    @NameInMap("exportToModule")
    public CreateResourceExportTaskRequestExportToModule exportToModule;

    /**
     * <p>The list of inclusion rules used when exporting resources.</p>
     */
    @NameInMap("includeRules")
    public java.util.List<CreateResourceExportTaskRequestIncludeRules> includeRules;

    /**
     * <p>The name of the resource export task. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 3 to 63 characters in length.</li>
     * <li>The name can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). It cannot start or end with a hyphen, underscore, or period.</li>
     * <li>The name must be unique among the resource export tasks within the current account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The Resource Access Management (RAM) role. The role name must be 1 to 128 characters in length. The system assumes this role to execute the template when a new job is triggered. This parameter is required when the job is not triggered manually.</p>
     * 
     * <strong>example:</strong>
     * <p>role-name</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    /**
     * <p>The Terraform provider version. You can call the <strong>ListTerraformProviderVersions</strong> operation to query the supported versions. Default value: the latest version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.247.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    /**
     * <p>The Terraform version. You can call the <strong>ListAvailableTerraformVersions</strong> operation to query the supported versions. Default value: 1.5.7.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5.7</p>
     */
    @NameInMap("terraformVersion")
    public String terraformVersion;

    /**
     * <p>The trigger strategy. Valid values:</p>
     * <ul>
     * <li>Auto: automatically triggers the task when a rule is modified or the trigger strategy is changed to Auto.</li>
     * <li>Manual: manually triggers the task.</li>
     * </ul>
     * <p>Default value: Manual.</p>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("triggerStrategy")
    public String triggerStrategy;

    /**
     * <p>The list of variables. The parameters of the exported resources are set as variables.</p>
     */
    @NameInMap("variables")
    public java.util.List<CreateResourceExportTaskRequestVariables> variables;

    public static CreateResourceExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceExportTaskRequest self = new CreateResourceExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceExportTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateResourceExportTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateResourceExportTaskRequest setExportToModule(CreateResourceExportTaskRequestExportToModule exportToModule) {
        this.exportToModule = exportToModule;
        return this;
    }
    public CreateResourceExportTaskRequestExportToModule getExportToModule() {
        return this.exportToModule;
    }

    public CreateResourceExportTaskRequest setIncludeRules(java.util.List<CreateResourceExportTaskRequestIncludeRules> includeRules) {
        this.includeRules = includeRules;
        return this;
    }
    public java.util.List<CreateResourceExportTaskRequestIncludeRules> getIncludeRules() {
        return this.includeRules;
    }

    public CreateResourceExportTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceExportTaskRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public CreateResourceExportTaskRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public CreateResourceExportTaskRequest setTerraformVersion(String terraformVersion) {
        this.terraformVersion = terraformVersion;
        return this;
    }
    public String getTerraformVersion() {
        return this.terraformVersion;
    }

    public CreateResourceExportTaskRequest setTriggerStrategy(String triggerStrategy) {
        this.triggerStrategy = triggerStrategy;
        return this;
    }
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    public CreateResourceExportTaskRequest setVariables(java.util.List<CreateResourceExportTaskRequestVariables> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.List<CreateResourceExportTaskRequestVariables> getVariables() {
        return this.variables;
    }

    public static class CreateResourceExportTaskRequestExportToModule extends TeaModel {
        /**
         * <p>The module type for saving the exported template. Valid values:</p>
         * <ul>
         * <li>OSS: OSS.</li>
         * <li>Registry: Terraform Registry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Registry</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The path for saving the template content. This parameter is required when source is set to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://iac-daily.oss-ap-southeast-1.aliyuncs.com/iacservice/vpc.zip">https://iac-daily.oss-ap-southeast-1.aliyuncs.com/iacservice/vpc.zip</a></p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <p>The path for saving the state file of the template. This parameter is required when source is set to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://iac-daily.oss-ap-southeast-1.aliyuncs.com/default/terraform.tfstate">https://iac-daily.oss-ap-southeast-1.aliyuncs.com/default/terraform.tfstate</a></p>
         */
        @NameInMap("statePath")
        public String statePath;

        public static CreateResourceExportTaskRequestExportToModule build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceExportTaskRequestExportToModule self = new CreateResourceExportTaskRequestExportToModule();
            return TeaModel.build(map, self);
        }

        public CreateResourceExportTaskRequestExportToModule setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateResourceExportTaskRequestExportToModule setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public CreateResourceExportTaskRequestExportToModule setStatePath(String statePath) {
            this.statePath = statePath;
            return this;
        }
        public String getStatePath() {
            return this.statePath;
        }

    }

    public static class CreateResourceExportTaskRequestIncludeRules extends TeaModel {
        /**
         * <p>The name of the inclusion rule used when exporting resources. Valid values:</p>
         * <ul>
         * <li>ResourceType: required. The resource type. You can call the <strong>ListResourceTypes</strong> operation to query the supported resources. Example: ALIYUN::VPC::VPC.</li>
         * <li>RegionId: required. The region to which the resource belongs. Only one region is supported. Example: cn-chengdu.</li>
         * <li>\<ResourceType>:Id: the resource ID. Example: ALIYUN::VPC::VPC:Id.</li>
         * <li>ResourceGroupId: the resource group ID. Example: rg-1234.</li>
         * <li>ZoneId: the zone to which the resource belongs. Only one zone is supported. Example: cn-hangzhou-h.</li>
         * </ul>
         * <p>By default, multiple filter conditions are connected by the AND operator. A resource matches the filter conditions only when it meets all the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The list of values for an inclusion rule used when exporting a group of resources.</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static CreateResourceExportTaskRequestIncludeRules build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceExportTaskRequestIncludeRules self = new CreateResourceExportTaskRequestIncludeRules();
            return TeaModel.build(map, self);
        }

        public CreateResourceExportTaskRequestIncludeRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateResourceExportTaskRequestIncludeRules setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateResourceExportTaskRequestVariables extends TeaModel {
        /**
         * <p>The list of properties for the Terraform resource that corresponds to the resource type.</p>
         */
        @NameInMap("properties")
        public java.util.List<String> properties;

        /**
         * <p>The resource type. You can call the <strong>ListResourceTypes</strong> operation to query the supported resources.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::VPC::VSwitch</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static CreateResourceExportTaskRequestVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceExportTaskRequestVariables self = new CreateResourceExportTaskRequestVariables();
            return TeaModel.build(map, self);
        }

        public CreateResourceExportTaskRequestVariables setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<String> getProperties() {
            return this.properties;
        }

        public CreateResourceExportTaskRequestVariables setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
