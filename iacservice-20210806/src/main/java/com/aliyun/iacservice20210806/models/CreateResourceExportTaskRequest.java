// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateResourceExportTaskRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("description")
    public String description;

    @NameInMap("excludeRules")
    public java.util.List<CreateResourceExportTaskRequestExcludeRules> excludeRules;

    @NameInMap("exportToModule")
    public CreateResourceExportTaskRequestExportToModule exportToModule;

    @NameInMap("includeRules")
    public java.util.List<CreateResourceExportTaskRequestIncludeRules> includeRules;

    @NameInMap("name")
    public String name;

    @NameInMap("ramRole")
    public String ramRole;

    @NameInMap("terraformVersion")
    public String terraformVersion;

    @NameInMap("triggerStrategy")
    public String triggerStrategy;

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

    public CreateResourceExportTaskRequest setExcludeRules(java.util.List<CreateResourceExportTaskRequestExcludeRules> excludeRules) {
        this.excludeRules = excludeRules;
        return this;
    }
    public java.util.List<CreateResourceExportTaskRequestExcludeRules> getExcludeRules() {
        return this.excludeRules;
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

    public static class CreateResourceExportTaskRequestExcludeRules extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("values")
        public java.util.List<String> values;

        public static CreateResourceExportTaskRequestExcludeRules build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceExportTaskRequestExcludeRules self = new CreateResourceExportTaskRequestExcludeRules();
            return TeaModel.build(map, self);
        }

        public CreateResourceExportTaskRequestExcludeRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateResourceExportTaskRequestExcludeRules setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateResourceExportTaskRequestExportToModule extends TeaModel {
        @NameInMap("source")
        public String source;

        @NameInMap("sourcePath")
        public String sourcePath;

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
        @NameInMap("key")
        public String key;

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
        @NameInMap("properties")
        public java.util.List<String> properties;

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
