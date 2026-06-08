// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSecurityStrategyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0bc5df3a17****903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityStrategy")
    public GetSecurityStrategyResponseBodySecurityStrategy securityStrategy;

    public static GetSecurityStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityStrategyResponseBody self = new GetSecurityStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityStrategyResponseBody setSecurityStrategy(GetSecurityStrategyResponseBodySecurityStrategy securityStrategy) {
        this.securityStrategy = securityStrategy;
        return this;
    }
    public GetSecurityStrategyResponseBodySecurityStrategy getSecurityStrategy() {
        return this.securityStrategy;
    }

    public static class GetSecurityStrategyResponseBodySecurityStrategyContentControllers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("BasicEditionDefaultValue")
        public Object basicEditionDefaultValue;

        @NameInMap("BasicEditionIntervalValue")
        public java.util.List<Integer> basicEditionIntervalValue;

        /**
         * <strong>example:</strong>
         * <p>viewCount</p>
         */
        @NameInMap("Controller")
        public String controller;

        /**
         * <strong>example:</strong>
         * <p>Integer</p>
         */
        @NameInMap("ControllerValueType")
        public String controllerValueType;

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>Query Results - Single Display Record Limit</p>
         */
        @NameInMap("DisplayNameEn")
        public String displayNameEn;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("EnterpriseEditionDefaultValue")
        public Object enterpriseEditionDefaultValue;

        @NameInMap("EnterpriseEditionIntervalValue")
        public java.util.List<Integer> enterpriseEditionIntervalValue;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProfessionalEditionDefaultValue")
        public Object professionalEditionDefaultValue;

        @NameInMap("ProfessionalEditionIntervalValue")
        public java.util.List<Integer> professionalEditionIntervalValue;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("StandardEditionDefaultValue")
        public Object standardEditionDefaultValue;

        @NameInMap("StandardEditionIntervalValue")
        public java.util.List<Integer> standardEditionIntervalValue;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UserConfigValue")
        public Object userConfigValue;

        public static GetSecurityStrategyResponseBodySecurityStrategyContentControllers build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityStrategyResponseBodySecurityStrategyContentControllers self = new GetSecurityStrategyResponseBodySecurityStrategyContentControllers();
            return TeaModel.build(map, self);
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setBasicEditionDefaultValue(Object basicEditionDefaultValue) {
            this.basicEditionDefaultValue = basicEditionDefaultValue;
            return this;
        }
        public Object getBasicEditionDefaultValue() {
            return this.basicEditionDefaultValue;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setBasicEditionIntervalValue(java.util.List<Integer> basicEditionIntervalValue) {
            this.basicEditionIntervalValue = basicEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getBasicEditionIntervalValue() {
            return this.basicEditionIntervalValue;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setController(String controller) {
            this.controller = controller;
            return this;
        }
        public String getController() {
            return this.controller;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setControllerValueType(String controllerValueType) {
            this.controllerValueType = controllerValueType;
            return this;
        }
        public String getControllerValueType() {
            return this.controllerValueType;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setDisplayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setEnterpriseEditionDefaultValue(Object enterpriseEditionDefaultValue) {
            this.enterpriseEditionDefaultValue = enterpriseEditionDefaultValue;
            return this;
        }
        public Object getEnterpriseEditionDefaultValue() {
            return this.enterpriseEditionDefaultValue;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setEnterpriseEditionIntervalValue(java.util.List<Integer> enterpriseEditionIntervalValue) {
            this.enterpriseEditionIntervalValue = enterpriseEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getEnterpriseEditionIntervalValue() {
            return this.enterpriseEditionIntervalValue;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setProfessionalEditionDefaultValue(Object professionalEditionDefaultValue) {
            this.professionalEditionDefaultValue = professionalEditionDefaultValue;
            return this;
        }
        public Object getProfessionalEditionDefaultValue() {
            return this.professionalEditionDefaultValue;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setProfessionalEditionIntervalValue(java.util.List<Integer> professionalEditionIntervalValue) {
            this.professionalEditionIntervalValue = professionalEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getProfessionalEditionIntervalValue() {
            return this.professionalEditionIntervalValue;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setStandardEditionDefaultValue(Object standardEditionDefaultValue) {
            this.standardEditionDefaultValue = standardEditionDefaultValue;
            return this;
        }
        public Object getStandardEditionDefaultValue() {
            return this.standardEditionDefaultValue;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setStandardEditionIntervalValue(java.util.List<Integer> standardEditionIntervalValue) {
            this.standardEditionIntervalValue = standardEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getStandardEditionIntervalValue() {
            return this.standardEditionIntervalValue;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContentControllers setUserConfigValue(Object userConfigValue) {
            this.userConfigValue = userConfigValue;
            return this;
        }
        public Object getUserConfigValue() {
            return this.userConfigValue;
        }

    }

    public static class GetSecurityStrategyResponseBodySecurityStrategyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Tenant</p>
         */
        @NameInMap("ControlDwScope")
        public String controlDwScope;

        /**
         * <strong>example:</strong>
         * <p>DataQuery</p>
         */
        @NameInMap("ControlModule")
        public String controlModule;

        /**
         * <strong>example:</strong>
         * <p>MyCatalog</p>
         */
        @NameInMap("ControlSubModule")
        public String controlSubModule;

        @NameInMap("Controllers")
        public java.util.List<GetSecurityStrategyResponseBodySecurityStrategyContentControllers> controllers;

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>Data Query</p>
         */
        @NameInMap("DisplayNameEn")
        public String displayNameEn;

        /**
         * <strong>example:</strong>
         * <p>DataQuerySecurityStrategySchema</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Default system generate data query policy</p>
         */
        @NameInMap("SystemPolicyDisplayName")
        public String systemPolicyDisplayName;

        /**
         * <strong>example:</strong>
         * <p>SYSTEM_GENERATE_DEFAULT_DATA_QUERY</p>
         */
        @NameInMap("SystemPolicyName")
        public String systemPolicyName;

        public static GetSecurityStrategyResponseBodySecurityStrategyContent build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityStrategyResponseBodySecurityStrategyContent self = new GetSecurityStrategyResponseBodySecurityStrategyContent();
            return TeaModel.build(map, self);
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContent setControlDwScope(String controlDwScope) {
            this.controlDwScope = controlDwScope;
            return this;
        }
        public String getControlDwScope() {
            return this.controlDwScope;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContent setControlModule(String controlModule) {
            this.controlModule = controlModule;
            return this;
        }
        public String getControlModule() {
            return this.controlModule;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContent setControlSubModule(String controlSubModule) {
            this.controlSubModule = controlSubModule;
            return this;
        }
        public String getControlSubModule() {
            return this.controlSubModule;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContent setControllers(java.util.List<GetSecurityStrategyResponseBodySecurityStrategyContentControllers> controllers) {
            this.controllers = controllers;
            return this;
        }
        public java.util.List<GetSecurityStrategyResponseBodySecurityStrategyContentControllers> getControllers() {
            return this.controllers;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContent setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContent setDisplayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContent setSystemPolicyDisplayName(String systemPolicyDisplayName) {
            this.systemPolicyDisplayName = systemPolicyDisplayName;
            return this;
        }
        public String getSystemPolicyDisplayName() {
            return this.systemPolicyDisplayName;
        }

        public GetSecurityStrategyResponseBodySecurityStrategyContent setSystemPolicyName(String systemPolicyName) {
            this.systemPolicyName = systemPolicyName;
            return this;
        }
        public String getSystemPolicyName() {
            return this.systemPolicyName;
        }

    }

    public static class GetSecurityStrategyResponseBodySecurityStrategy extends TeaModel {
        @NameInMap("Content")
        public GetSecurityStrategyResponseBodySecurityStrategyContent content;

        /**
         * <strong>example:</strong>
         * <p>Tenant</p>
         */
        @NameInMap("ControlDwScope")
        public String controlDwScope;

        /**
         * <strong>example:</strong>
         * <p>DataQuery</p>
         */
        @NameInMap("ControlModule")
        public String controlModule;

        /**
         * <strong>example:</strong>
         * <p>MyCatalog</p>
         */
        @NameInMap("ControlSubModule")
        public String controlSubModule;

        /**
         * <strong>example:</strong>
         * <p>2026-05-25T20:46:19</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>203322746501002787</p>
         */
        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("OriginPolicyId")
        public Long originPolicyId;

        /**
         * <strong>example:</strong>
         * <p>DataQuerySecurityStrategySchema</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <strong>example:</strong>
         * <p>2026-05-25T20:46:19</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>203322746501002787</p>
         */
        @NameInMap("Updater")
        public String updater;

        @NameInMap("Workspaces")
        public java.util.List<Long> workspaces;

        public static GetSecurityStrategyResponseBodySecurityStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityStrategyResponseBodySecurityStrategy self = new GetSecurityStrategyResponseBodySecurityStrategy();
            return TeaModel.build(map, self);
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setContent(GetSecurityStrategyResponseBodySecurityStrategyContent content) {
            this.content = content;
            return this;
        }
        public GetSecurityStrategyResponseBodySecurityStrategyContent getContent() {
            return this.content;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setControlDwScope(String controlDwScope) {
            this.controlDwScope = controlDwScope;
            return this;
        }
        public String getControlDwScope() {
            return this.controlDwScope;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setControlModule(String controlModule) {
            this.controlModule = controlModule;
            return this;
        }
        public String getControlModule() {
            return this.controlModule;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setControlSubModule(String controlSubModule) {
            this.controlSubModule = controlSubModule;
            return this;
        }
        public String getControlSubModule() {
            return this.controlSubModule;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setOriginPolicyId(Long originPolicyId) {
            this.originPolicyId = originPolicyId;
            return this;
        }
        public Long getOriginPolicyId() {
            return this.originPolicyId;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

        public GetSecurityStrategyResponseBodySecurityStrategy setWorkspaces(java.util.List<Long> workspaces) {
            this.workspaces = workspaces;
            return this;
        }
        public java.util.List<Long> getWorkspaces() {
            return this.workspaces;
        }

    }

}
