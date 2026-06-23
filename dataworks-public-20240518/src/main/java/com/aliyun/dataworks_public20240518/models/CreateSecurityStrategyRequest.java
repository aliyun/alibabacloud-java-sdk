// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSecurityStrategyRequest extends TeaModel {
    /**
     * <p>A client-generated token that ensures request idempotency, preventing duplicate operations if you retry the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The content of the strategy. This value is constrained by the <code>SecurityStrategySchema</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public CreateSecurityStrategyRequestContent content;

    /**
     * <p><strong>The control scope. Valid values: Workspace and Tenant.</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tenant</p>
     */
    @NameInMap("ControlDwScope")
    public String controlDwScope;

    /**
     * <p><strong>Control module</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataQuery</p>
     */
    @NameInMap("ControlModule")
    public String controlModule;

    /**
     * <p><strong>Control submodule</strong></p>
     * 
     * <strong>example:</strong>
     * <p>MyCatalog</p>
     */
    @NameInMap("ControlSubModule")
    public String controlSubModule;

    /**
     * <p><strong>Strategy description</strong></p>
     * 
     * <strong>example:</strong>
     * <p>控制数据分析模块的查询结果安全行为</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p><strong>Strategy name</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>默认数据分析策略</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p><strong>Schema template name</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataQuerySecurityStrategySchema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>A list of associated workspace IDs.</p>
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
         * <p>The valid value interval for Basic Edition, in the format <code>[min, max]</code>.</p>
         */
        @NameInMap("BasicEditionIntervalValue")
        public java.util.List<Integer> basicEditionIntervalValue;

        /**
         * <p>The controller identifier. For valid values, see the list of controllers for each schema.</p>
         * 
         * <strong>example:</strong>
         * <p>viewCount</p>
         */
        @NameInMap("Controller")
        public String controller;

        /**
         * <p>The value type. Valid values: <code>Boolean</code>, <code>Integer</code>, <code>Long</code>, and <code>String</code>.</p>
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
         * <p>查询结果-单次展示记录值上限</p>
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
         * <p>Specifies whether to enable this controller.</p>
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
         * <p>The valid value interval for Enterprise Edition, in the format <code>[min, max]</code>.</p>
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
         * <p>The valid value interval for Professional Edition, in the format <code>[min, max]</code>.</p>
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
         * <p>The valid value interval for Standard Edition, in the format <code>[min, max]</code>.</p>
         */
        @NameInMap("StandardEditionIntervalValue")
        public java.util.List<Integer> standardEditionIntervalValue;

        /**
         * <p>The user-configured value. The type of this value depends on the <code>ControllerValueType</code> parameter.</p>
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
         * <p>The control scope. This corresponds to the <code>controlDwScope</code> property of the <code>SecurityStrategySchema</code> associated with the current strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>Tenant</p>
         */
        @NameInMap("ControlDwScope")
        public String controlDwScope;

        /**
         * <p>The control module. This corresponds to the <code>controlModule</code> property of the <code>SecurityStrategySchema</code> associated with the current strategy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DataStudio</p>
         */
        @NameInMap("ControlModule")
        public String controlModule;

        /**
         * <p>The control submodule. This corresponds to the <code>controlSubModule</code> property of the <code>SecurityStrategySchema</code> associated with the current strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>MyCatalog</p>
         */
        @NameInMap("ControlSubModule")
        public String controlSubModule;

        /**
         * <p>A list of controllers.</p>
         * <p><strong>Note:</strong> Valid controllers depend on the selected schema. For more information, see the controller definitions and the list of controllers for each schema.</p>
         */
        @NameInMap("Controllers")
        public java.util.List<CreateSecurityStrategyRequestContentControllers> controllers;

        /**
         * <p>The <code>displayName</code> property of the <code>SecurityStrategySchema</code> associated with the current strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>数据分析</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The <code>displayNameEn</code> property of the <code>SecurityStrategySchema</code> associated with the current strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Analysis</p>
         */
        @NameInMap("DisplayNameEn")
        public String displayNameEn;

        /**
         * <p>The <code>name</code> property of the <code>SecurityStrategySchema</code> associated with the current strategy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DataQuerySecurityStrategySchema</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The <code>systemPolicyDisplayName</code> property of the <code>SecurityStrategySchema</code> associated with the current strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>Default system generate data query policy</p>
         */
        @NameInMap("SystemPolicyDisplayName")
        public String systemPolicyDisplayName;

        /**
         * <p>The <code>systemPolicyName</code> property of the <code>SecurityStrategySchema</code> associated with the current strategy.</p>
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
