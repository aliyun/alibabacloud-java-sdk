// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateResourceExportTaskAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("exportToModule")
    public UpdateResourceExportTaskAttributeRequestExportToModule exportToModule;

    @NameInMap("includeRules")
    public java.util.List<UpdateResourceExportTaskAttributeRequestIncludeRules> includeRules;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>ramName</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    /**
     * <strong>example:</strong>
     * <p>1.183.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    /**
     * <strong>example:</strong>
     * <p>1.2.6</p>
     */
    @NameInMap("terraformVersion")
    public String terraformVersion;

    /**
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("triggerStrategy")
    public String triggerStrategy;

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
         * <strong>example:</strong>
         * <p>Registry</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>alibaba/security-group/alicloud</p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <strong>example:</strong>
         * <p>/</p>
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
         * <strong>example:</strong>
         * <p>ZoneId</p>
         */
        @NameInMap("key")
        public String key;

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
        @NameInMap("properties")
        public java.util.List<String> properties;

        /**
         * <strong>example:</strong>
         * <p>AliCloud::VPC::VPC</p>
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
