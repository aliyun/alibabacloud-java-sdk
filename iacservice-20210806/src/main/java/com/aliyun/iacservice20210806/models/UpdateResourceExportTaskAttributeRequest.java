// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateResourceExportTaskAttributeRequest extends TeaModel {
    /**
     * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>this is description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Saves the exported template as a module. If this parameter is not set, the template is automatically saved in the registry.</p>
     */
    @NameInMap("exportToModule")
    public UpdateResourceExportTaskAttributeRequestExportToModule exportToModule;

    /**
     * <p>The list of include rules used when exporting resources.</p>
     */
    @NameInMap("includeRules")
    public java.util.List<UpdateResourceExportTaskAttributeRequestIncludeRules> includeRules;

    /**
     * <p>The name of the resource export task. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). The name cannot start or end with a hyphen, underscore, or period.</li>
     * <li>The name must be unique among resource export tasks within the current account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TaskName</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>ramName</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    /**
     * <p>The Terraform provider version. Call <strong>ListTerraformProviderVersions</strong> to view the supported versions. Default value: the latest version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.183.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    /**
     * <p>The Terraform version. Call <strong>ListAvailableTerraformVersions</strong> to view the supported versions. Default value: 1.5.7.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5.7</p>
     */
    @NameInMap("terraformVersion")
    public String terraformVersion;

    /**
     * <p>The trigger strategy. Valid values:</p>
     * <ul>
     * <li>Auto: triggered automatically when rules are modified or the trigger strategy is changed to Auto.</li>
     * <li>Manual: triggered manually.</li>
     * </ul>
     * <p>Default value: Manual.</p>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("triggerStrategy")
    public String triggerStrategy;

    /**
     * <p>The list of variables. Sets exported resource parameters as variables.</p>
     */
    @NameInMap("variables")
    public java.util.List<UpdateResourceExportTaskAttributeRequestVariables> variables;

    public static UpdateResourceExportTaskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceExportTaskAttributeRequest self = new UpdateResourceExportTaskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceExportTaskAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateResourceExportTaskAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateResourceExportTaskAttributeRequest setExportToModule(UpdateResourceExportTaskAttributeRequestExportToModule exportToModule) {
        this.exportToModule = exportToModule;
        return this;
    }
    public UpdateResourceExportTaskAttributeRequestExportToModule getExportToModule() {
        return this.exportToModule;
    }

    public UpdateResourceExportTaskAttributeRequest setIncludeRules(java.util.List<UpdateResourceExportTaskAttributeRequestIncludeRules> includeRules) {
        this.includeRules = includeRules;
        return this;
    }
    public java.util.List<UpdateResourceExportTaskAttributeRequestIncludeRules> getIncludeRules() {
        return this.includeRules;
    }

    public UpdateResourceExportTaskAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateResourceExportTaskAttributeRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public UpdateResourceExportTaskAttributeRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public UpdateResourceExportTaskAttributeRequest setTerraformVersion(String terraformVersion) {
        this.terraformVersion = terraformVersion;
        return this;
    }
    public String getTerraformVersion() {
        return this.terraformVersion;
    }

    public UpdateResourceExportTaskAttributeRequest setTriggerStrategy(String triggerStrategy) {
        this.triggerStrategy = triggerStrategy;
        return this;
    }
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    public UpdateResourceExportTaskAttributeRequest setVariables(java.util.List<UpdateResourceExportTaskAttributeRequestVariables> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.List<UpdateResourceExportTaskAttributeRequestVariables> getVariables() {
        return this.variables;
    }

    public static class UpdateResourceExportTaskAttributeRequestExportToModule extends TeaModel {
        /**
         * <p>The module type in which the exported template is saved. Valid values:</p>
         * <ul>
         * <li>OSS: OSS</li>
         * <li>Registry: Terraform Registry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Registry</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The path for saving the template content. Set this parameter when source is set to OSS. Format: oss::https://<bucket>.oss-<region>.aliyuncs.com/<path>.zip.</p>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://iac-daily.oss-ap-southeast-1.aliyuncs.com/iacservice/vpc.zip">https://iac-daily.oss-ap-southeast-1.aliyuncs.com/iacservice/vpc.zip</a></p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <p>The path for saving the template state file. Set this parameter when source is set to OSS. Format: oss::https://<bucket>.oss-<region>.aliyuncs.com/<path>/terraform.tfstate.</p>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://iac-daily.oss-ap-southeast-1.aliyuncs.com/default/terraform.tfstate">https://iac-daily.oss-ap-southeast-1.aliyuncs.com/default/terraform.tfstate</a></p>
         */
        @NameInMap("statePath")
        public String statePath;

        public static UpdateResourceExportTaskAttributeRequestExportToModule build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceExportTaskAttributeRequestExportToModule self = new UpdateResourceExportTaskAttributeRequestExportToModule();
            return TeaModel.build(map, self);
        }

        public UpdateResourceExportTaskAttributeRequestExportToModule setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateResourceExportTaskAttributeRequestExportToModule setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public UpdateResourceExportTaskAttributeRequestExportToModule setStatePath(String statePath) {
            this.statePath = statePath;
            return this;
        }
        public String getStatePath() {
            return this.statePath;
        }

    }

    public static class UpdateResourceExportTaskAttributeRequestIncludeRules extends TeaModel {
        /**
         * <p>The name of the include rule for resource export. Valid values:</p>
         * <ul>
         * <li>ResourceType: required. The resource type. Call <strong>ListResourceTypes</strong> to view the supported resources. Example: ALIYUN::VPC::VPC.</li>
         * <li>RegionId: required. The region to which the resource belongs. Only one region is supported. Example: cn-chengdu.</li>
         * <li><ResourceType>:Id: the resource ID. Example: ALIYUN::VPC::VPC:Id.</li>
         * <li>ResourceGroupId: the resource group ID. Example: rg-1234.</li>
         * <li>ZoneId: the zone to which the resource belongs. Only one zone is supported. Example: ap-southeast-1-h.</li>
         * </ul>
         * <p>Multiple filter conditions have an AND relationship by default. A resource must meet all filter conditions to be considered a match.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The values of an include rule for resource export.</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static UpdateResourceExportTaskAttributeRequestIncludeRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceExportTaskAttributeRequestIncludeRules self = new UpdateResourceExportTaskAttributeRequestIncludeRules();
            return TeaModel.build(map, self);
        }

        public UpdateResourceExportTaskAttributeRequestIncludeRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateResourceExportTaskAttributeRequestIncludeRules setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateResourceExportTaskAttributeRequestVariables extends TeaModel {
        /**
         * <p>The list of Terraform resource properties corresponding to the resource type.</p>
         */
        @NameInMap("properties")
        public java.util.List<String> properties;

        /**
         * <p>The resource type. Call <strong>ListResourceTypes</strong> to view the supported resources.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::VPC::VSwitch</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static UpdateResourceExportTaskAttributeRequestVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceExportTaskAttributeRequestVariables self = new UpdateResourceExportTaskAttributeRequestVariables();
            return TeaModel.build(map, self);
        }

        public UpdateResourceExportTaskAttributeRequestVariables setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<String> getProperties() {
            return this.properties;
        }

        public UpdateResourceExportTaskAttributeRequestVariables setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
