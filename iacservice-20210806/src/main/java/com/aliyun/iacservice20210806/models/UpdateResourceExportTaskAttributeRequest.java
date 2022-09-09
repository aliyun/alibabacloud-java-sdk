// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateResourceExportTaskAttributeRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("description")
    public String description;

    @NameInMap("excludeRules")
    public java.util.List<UpdateResourceExportTaskAttributeRequestExcludeRules> excludeRules;

    @NameInMap("exportToModule")
    public UpdateResourceExportTaskAttributeRequestExportToModule exportToModule;

    @NameInMap("includeRules")
    public java.util.List<UpdateResourceExportTaskAttributeRequestIncludeRules> includeRules;

    @NameInMap("name")
    public String name;

    @NameInMap("ramRole")
    public String ramRole;

    @NameInMap("terraformVersion")
    public String terraformVersion;

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

    public UpdateResourceExportTaskAttributeRequest setExcludeRules(java.util.List<UpdateResourceExportTaskAttributeRequestExcludeRules> excludeRules) {
        this.excludeRules = excludeRules;
        return this;
    }
    public java.util.List<UpdateResourceExportTaskAttributeRequestExcludeRules> getExcludeRules() {
        return this.excludeRules;
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

    public static class UpdateResourceExportTaskAttributeRequestExcludeRules extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("values")
        public java.util.List<String> values;

        public static UpdateResourceExportTaskAttributeRequestExcludeRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceExportTaskAttributeRequestExcludeRules self = new UpdateResourceExportTaskAttributeRequestExcludeRules();
            return TeaModel.build(map, self);
        }

        public UpdateResourceExportTaskAttributeRequestExcludeRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateResourceExportTaskAttributeRequestExcludeRules setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateResourceExportTaskAttributeRequestExportToModule extends TeaModel {
        @NameInMap("source")
        public String source;

        @NameInMap("sourcePath")
        public String sourcePath;

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
