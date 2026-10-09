// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSecurityStrategyRequest extends TeaModel {
    /**
     * <p>The idempotency parameter. This parameter is used to prevent duplicate operations caused by multiple calls.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The policy content. The content is constrained by SecurityStrategySchema.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public CreateSecurityStrategyRequestContent content;

    /**
     * <p>The control scope.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tenant</p>
     */
    @NameInMap("ControlDwScope")
    public String controlDwScope;

    /**
     * <p>The control module.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataQuery</p>
     */
    @NameInMap("ControlModule")
    public String controlModule;

    /**
     * <p>The control submodule.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCatalog</p>
     */
    @NameInMap("ControlSubModule")
    public String controlSubModule;

    /**
     * <p>The description of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Controls the security behavior of query results in the data analysis module</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The policy name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Default data analysis policy</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the schema template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataQuerySecurityStrategySchema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The list of associated workspace IDs.</p>
     */
    @NameInMap("Workspaces")
    public java.util.List<Long> workspaces;

    public static CreateSecurityStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityStrategyRequest self = new CreateSecurityStrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSecurityStrategyRequest setContent(CreateSecurityStrategyRequestContent content) {
        this.content = content;
        return this;
    }
    public CreateSecurityStrategyRequestContent getContent() {
        return this.content;
    }

    public CreateSecurityStrategyRequest setControlDwScope(String controlDwScope) {
        this.controlDwScope = controlDwScope;
        return this;
    }
    public String getControlDwScope() {
        return this.controlDwScope;
    }

    public CreateSecurityStrategyRequest setControlModule(String controlModule) {
        this.controlModule = controlModule;
        return this;
    }
    public String getControlModule() {
        return this.controlModule;
    }

    public CreateSecurityStrategyRequest setControlSubModule(String controlSubModule) {
        this.controlSubModule = controlSubModule;
        return this;
    }
    public String getControlSubModule() {
        return this.controlSubModule;
    }

    public CreateSecurityStrategyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecurityStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSecurityStrategyRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public CreateSecurityStrategyRequest setWorkspaces(java.util.List<Long> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<Long> getWorkspaces() {
        return this.workspaces;
    }

    public static class CreateSecurityStrategyRequestContentControllers extends TeaModel {
        /**
         * <p>The default value for Basic Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BasicEditionDefaultValue")
        public Object basicEditionDefaultValue;

        /**
         * <p>The valid value range for Basic Edition, in the format of [min, max].</p>
         */
        @NameInMap("BasicEditionIntervalValue")
        public java.util.List<Integer> basicEditionIntervalValue;

        /**
         * <p>The identifier of the control item. For valid values, refer to the control item list for each schema.</p>
         * 
         * <strong>example:</strong>
         * <p>viewCount</p>
         */
        @NameInMap("Controller")
        public String controller;

        /**
         * <p>The value type. Valid values: Boolean, Integer, Long, and String.</p>
         * 
         * <strong>example:</strong>
         * <p>Integer</p>
         */
        @NameInMap("ControllerValueType")
        public String controllerValueType;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Query results - Maximum number of records displayed per query</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The English display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Query Results - Single Display Record Limit</p>
         */
        @NameInMap("DisplayNameEn")
        public String displayNameEn;

        /**
         * <p>Specifies whether to enable the control item.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The default value for Enterprise Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>500000</p>
         */
        @NameInMap("EnterpriseEditionDefaultValue")
        public Object enterpriseEditionDefaultValue;

        /**
         * <p>The valid value range for Enterprise Edition, in the format of [min, max].</p>
         */
        @NameInMap("EnterpriseEditionIntervalValue")
        public java.util.List<Integer> enterpriseEditionIntervalValue;

        /**
         * <p>The default value for Professional Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>200000</p>
         */
        @NameInMap("ProfessionalEditionDefaultValue")
        public Object professionalEditionDefaultValue;

        /**
         * <p>The valid value range for Professional Edition, in the format of [min, max].</p>
         */
        @NameInMap("ProfessionalEditionIntervalValue")
        public java.util.List<Integer> professionalEditionIntervalValue;

        /**
         * <p>The default value for Standard Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("StandardEditionDefaultValue")
        public Object standardEditionDefaultValue;

        /**
         * <p>The valid value range for Standard Edition, in the format of [min, max].</p>
         */
        @NameInMap("StandardEditionIntervalValue")
        public java.util.List<Integer> standardEditionIntervalValue;

        /**
         * <p>The user-configured value. The type depends on <code>ControllerValueType</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UserConfigValue")
        public Object userConfigValue;

        public static CreateSecurityStrategyRequestContentControllers build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityStrategyRequestContentControllers self = new CreateSecurityStrategyRequestContentControllers();
            return TeaModel.build(map, self);
        }

        public CreateSecurityStrategyRequestContentControllers setBasicEditionDefaultValue(Object basicEditionDefaultValue) {
            this.basicEditionDefaultValue = basicEditionDefaultValue;
            return this;
        }
        public Object getBasicEditionDefaultValue() {
            return this.basicEditionDefaultValue;
        }

        public CreateSecurityStrategyRequestContentControllers setBasicEditionIntervalValue(java.util.List<Integer> basicEditionIntervalValue) {
            this.basicEditionIntervalValue = basicEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getBasicEditionIntervalValue() {
            return this.basicEditionIntervalValue;
        }

        public CreateSecurityStrategyRequestContentControllers setController(String controller) {
            this.controller = controller;
            return this;
        }
        public String getController() {
            return this.controller;
        }

        public CreateSecurityStrategyRequestContentControllers setControllerValueType(String controllerValueType) {
            this.controllerValueType = controllerValueType;
            return this;
        }
        public String getControllerValueType() {
            return this.controllerValueType;
        }

        public CreateSecurityStrategyRequestContentControllers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateSecurityStrategyRequestContentControllers setDisplayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        public CreateSecurityStrategyRequestContentControllers setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateSecurityStrategyRequestContentControllers setEnterpriseEditionDefaultValue(Object enterpriseEditionDefaultValue) {
            this.enterpriseEditionDefaultValue = enterpriseEditionDefaultValue;
            return this;
        }
        public Object getEnterpriseEditionDefaultValue() {
            return this.enterpriseEditionDefaultValue;
        }

        public CreateSecurityStrategyRequestContentControllers setEnterpriseEditionIntervalValue(java.util.List<Integer> enterpriseEditionIntervalValue) {
            this.enterpriseEditionIntervalValue = enterpriseEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getEnterpriseEditionIntervalValue() {
            return this.enterpriseEditionIntervalValue;
        }

        public CreateSecurityStrategyRequestContentControllers setProfessionalEditionDefaultValue(Object professionalEditionDefaultValue) {
            this.professionalEditionDefaultValue = professionalEditionDefaultValue;
            return this;
        }
        public Object getProfessionalEditionDefaultValue() {
            return this.professionalEditionDefaultValue;
        }

        public CreateSecurityStrategyRequestContentControllers setProfessionalEditionIntervalValue(java.util.List<Integer> professionalEditionIntervalValue) {
            this.professionalEditionIntervalValue = professionalEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getProfessionalEditionIntervalValue() {
            return this.professionalEditionIntervalValue;
        }

        public CreateSecurityStrategyRequestContentControllers setStandardEditionDefaultValue(Object standardEditionDefaultValue) {
            this.standardEditionDefaultValue = standardEditionDefaultValue;
            return this;
        }
        public Object getStandardEditionDefaultValue() {
            return this.standardEditionDefaultValue;
        }

        public CreateSecurityStrategyRequestContentControllers setStandardEditionIntervalValue(java.util.List<Integer> standardEditionIntervalValue) {
            this.standardEditionIntervalValue = standardEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getStandardEditionIntervalValue() {
            return this.standardEditionIntervalValue;
        }

        public CreateSecurityStrategyRequestContentControllers setUserConfigValue(Object userConfigValue) {
            this.userConfigValue = userConfigValue;
            return this;
        }
        public Object getUserConfigValue() {
            return this.userConfigValue;
        }

    }

    public static class CreateSecurityStrategyRequestContent extends TeaModel {
        /**
         * <p>The control scope. This is the name of the SecurityStrategySchema associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Tenant</p>
         */
        @NameInMap("ControlDwScope")
        public String controlDwScope;

        /**
         * <p>The control module. This is the controlModule of the SecurityStrategySchema associated with the current policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DataStudio</p>
         */
        @NameInMap("ControlModule")
        public String controlModule;

        /**
         * <p>The control submodule. This is the controlSubModule of the SecurityStrategySchema associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>MyCatalog</p>
         */
        @NameInMap("ControlSubModule")
        public String controlSubModule;

        /**
         * <p>The list of control items.</p>
         * <p>Note: Valid control items depend on the selected schema. Refer to the controller definitions and the control item list for each schema.</p>
         */
        @NameInMap("Controllers")
        public java.util.List<CreateSecurityStrategyRequestContentControllers> controllers;

        /**
         * <p>The display name of the SecurityStrategySchema associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Data analysis</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The English display name of the SecurityStrategySchema associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Analysis</p>
         */
        @NameInMap("DisplayNameEn")
        public String displayNameEn;

        /**
         * <p>The name of the SecurityStrategySchema associated with the current policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DataQuerySecurityStrategySchema</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the SecurityStrategySchema associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Default system generate data query policy</p>
         */
        @NameInMap("SystemPolicyDisplayName")
        public String systemPolicyDisplayName;

        /**
         * <p>The name of the SecurityStrategySchema associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_GENERATE_DEFAULT_DATA_QUERY</p>
         */
        @NameInMap("SystemPolicyName")
        public String systemPolicyName;

        public static CreateSecurityStrategyRequestContent build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityStrategyRequestContent self = new CreateSecurityStrategyRequestContent();
            return TeaModel.build(map, self);
        }

        public CreateSecurityStrategyRequestContent setControlDwScope(String controlDwScope) {
            this.controlDwScope = controlDwScope;
            return this;
        }
        public String getControlDwScope() {
            return this.controlDwScope;
        }

        public CreateSecurityStrategyRequestContent setControlModule(String controlModule) {
            this.controlModule = controlModule;
            return this;
        }
        public String getControlModule() {
            return this.controlModule;
        }

        public CreateSecurityStrategyRequestContent setControlSubModule(String controlSubModule) {
            this.controlSubModule = controlSubModule;
            return this;
        }
        public String getControlSubModule() {
            return this.controlSubModule;
        }

        public CreateSecurityStrategyRequestContent setControllers(java.util.List<CreateSecurityStrategyRequestContentControllers> controllers) {
            this.controllers = controllers;
            return this;
        }
        public java.util.List<CreateSecurityStrategyRequestContentControllers> getControllers() {
            return this.controllers;
        }

        public CreateSecurityStrategyRequestContent setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateSecurityStrategyRequestContent setDisplayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        public CreateSecurityStrategyRequestContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSecurityStrategyRequestContent setSystemPolicyDisplayName(String systemPolicyDisplayName) {
            this.systemPolicyDisplayName = systemPolicyDisplayName;
            return this;
        }
        public String getSystemPolicyDisplayName() {
            return this.systemPolicyDisplayName;
        }

        public CreateSecurityStrategyRequestContent setSystemPolicyName(String systemPolicyName) {
            this.systemPolicyName = systemPolicyName;
            return this;
        }
        public String getSystemPolicyName() {
            return this.systemPolicyName;
        }

    }

}
