// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class FindBestMatchSecurityStrategyResponseBody extends TeaModel {
    @NameInMap("Data")
    public FindBestMatchSecurityStrategyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0bc5df3a17***903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FindBestMatchSecurityStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindBestMatchSecurityStrategyResponseBody self = new FindBestMatchSecurityStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public FindBestMatchSecurityStrategyResponseBody setData(FindBestMatchSecurityStrategyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindBestMatchSecurityStrategyResponseBodyData getData() {
        return this.data;
    }

    public FindBestMatchSecurityStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>500000</p>
         */
        @NameInMap("EnterpriseEditionDefaultValue")
        public Object enterpriseEditionDefaultValue;

        @NameInMap("EnterpriseEditionIntervalValue")
        public java.util.List<Integer> enterpriseEditionIntervalValue;

        /**
         * <strong>example:</strong>
         * <p>200000</p>
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
         * <p>20</p>
         */
        @NameInMap("UserConfigValue")
        public Object userConfigValue;

        public static FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers build(java.util.Map<String, ?> map) throws Exception {
            FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers self = new FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers();
            return TeaModel.build(map, self);
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setBasicEditionDefaultValue(Object basicEditionDefaultValue) {
            this.basicEditionDefaultValue = basicEditionDefaultValue;
            return this;
        }
        public Object getBasicEditionDefaultValue() {
            return this.basicEditionDefaultValue;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setBasicEditionIntervalValue(java.util.List<Integer> basicEditionIntervalValue) {
            this.basicEditionIntervalValue = basicEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getBasicEditionIntervalValue() {
            return this.basicEditionIntervalValue;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setController(String controller) {
            this.controller = controller;
            return this;
        }
        public String getController() {
            return this.controller;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setControllerValueType(String controllerValueType) {
            this.controllerValueType = controllerValueType;
            return this;
        }
        public String getControllerValueType() {
            return this.controllerValueType;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setDisplayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setEnterpriseEditionDefaultValue(Object enterpriseEditionDefaultValue) {
            this.enterpriseEditionDefaultValue = enterpriseEditionDefaultValue;
            return this;
        }
        public Object getEnterpriseEditionDefaultValue() {
            return this.enterpriseEditionDefaultValue;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setEnterpriseEditionIntervalValue(java.util.List<Integer> enterpriseEditionIntervalValue) {
            this.enterpriseEditionIntervalValue = enterpriseEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getEnterpriseEditionIntervalValue() {
            return this.enterpriseEditionIntervalValue;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setProfessionalEditionDefaultValue(Object professionalEditionDefaultValue) {
            this.professionalEditionDefaultValue = professionalEditionDefaultValue;
            return this;
        }
        public Object getProfessionalEditionDefaultValue() {
            return this.professionalEditionDefaultValue;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setProfessionalEditionIntervalValue(java.util.List<Integer> professionalEditionIntervalValue) {
            this.professionalEditionIntervalValue = professionalEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getProfessionalEditionIntervalValue() {
            return this.professionalEditionIntervalValue;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setStandardEditionDefaultValue(Object standardEditionDefaultValue) {
            this.standardEditionDefaultValue = standardEditionDefaultValue;
            return this;
        }
        public Object getStandardEditionDefaultValue() {
            return this.standardEditionDefaultValue;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setStandardEditionIntervalValue(java.util.List<Integer> standardEditionIntervalValue) {
            this.standardEditionIntervalValue = standardEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getStandardEditionIntervalValue() {
            return this.standardEditionIntervalValue;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers setUserConfigValue(Object userConfigValue) {
            this.userConfigValue = userConfigValue;
            return this;
        }
        public Object getUserConfigValue() {
            return this.userConfigValue;
        }

    }

    public static class FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent extends TeaModel {
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
        public java.util.List<FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers> controllers;

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

        public static FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent build(java.util.Map<String, ?> map) throws Exception {
            FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent self = new FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent();
            return TeaModel.build(map, self);
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent setControlDwScope(String controlDwScope) {
            this.controlDwScope = controlDwScope;
            return this;
        }
        public String getControlDwScope() {
            return this.controlDwScope;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent setControlModule(String controlModule) {
            this.controlModule = controlModule;
            return this;
        }
        public String getControlModule() {
            return this.controlModule;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent setControlSubModule(String controlSubModule) {
            this.controlSubModule = controlSubModule;
            return this;
        }
        public String getControlSubModule() {
            return this.controlSubModule;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent setControllers(java.util.List<FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers> controllers) {
            this.controllers = controllers;
            return this;
        }
        public java.util.List<FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContentControllers> getControllers() {
            return this.controllers;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent setDisplayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent setSystemPolicyDisplayName(String systemPolicyDisplayName) {
            this.systemPolicyDisplayName = systemPolicyDisplayName;
            return this;
        }
        public String getSystemPolicyDisplayName() {
            return this.systemPolicyDisplayName;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent setSystemPolicyName(String systemPolicyName) {
            this.systemPolicyName = systemPolicyName;
            return this;
        }
        public String getSystemPolicyName() {
            return this.systemPolicyName;
        }

    }

    public static class FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy extends TeaModel {
        @NameInMap("Content")
        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent content;

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
         * <p>16</p>
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
         * <p>207947397706614297</p>
         */
        @NameInMap("Updater")
        public String updater;

        @NameInMap("Workspaces")
        public java.util.List<Long> workspaces;

        public static FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy build(java.util.Map<String, ?> map) throws Exception {
            FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy self = new FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy();
            return TeaModel.build(map, self);
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setContent(FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent content) {
            this.content = content;
            return this;
        }
        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategyContent getContent() {
            return this.content;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setControlDwScope(String controlDwScope) {
            this.controlDwScope = controlDwScope;
            return this;
        }
        public String getControlDwScope() {
            return this.controlDwScope;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setControlModule(String controlModule) {
            this.controlModule = controlModule;
            return this;
        }
        public String getControlModule() {
            return this.controlModule;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setControlSubModule(String controlSubModule) {
            this.controlSubModule = controlSubModule;
            return this;
        }
        public String getControlSubModule() {
            return this.controlSubModule;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setOriginPolicyId(Long originPolicyId) {
            this.originPolicyId = originPolicyId;
            return this;
        }
        public Long getOriginPolicyId() {
            return this.originPolicyId;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy setWorkspaces(java.util.List<Long> workspaces) {
            this.workspaces = workspaces;
            return this;
        }
        public java.util.List<Long> getWorkspaces() {
            return this.workspaces;
        }

    }

    public static class FindBestMatchSecurityStrategyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("Edition")
        public String edition;

        @NameInMap("EditionDisplayName")
        public String editionDisplayName;

        @NameInMap("SecurityStrategy")
        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy securityStrategy;

        public static FindBestMatchSecurityStrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindBestMatchSecurityStrategyResponseBodyData self = new FindBestMatchSecurityStrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindBestMatchSecurityStrategyResponseBodyData setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
        }

        public FindBestMatchSecurityStrategyResponseBodyData setEditionDisplayName(String editionDisplayName) {
            this.editionDisplayName = editionDisplayName;
            return this;
        }
        public String getEditionDisplayName() {
            return this.editionDisplayName;
        }

        public FindBestMatchSecurityStrategyResponseBodyData setSecurityStrategy(FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy securityStrategy) {
            this.securityStrategy = securityStrategy;
            return this;
        }
        public FindBestMatchSecurityStrategyResponseBodyDataSecurityStrategy getSecurityStrategy() {
            return this.securityStrategy;
        }

    }

}
