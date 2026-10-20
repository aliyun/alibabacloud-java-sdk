// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSecurityStrategiesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListSecurityStrategiesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc5df3a17****903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSecurityStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityStrategiesResponseBody self = new ListSecurityStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityStrategiesResponseBody setPagingInfo(ListSecurityStrategiesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListSecurityStrategiesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListSecurityStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers extends TeaModel {
        /**
         * <p><strong>The default value for Basic Edition.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("BasicEditionDefaultValue")
        public Object basicEditionDefaultValue;

        /**
         * <p>The valid value range for Basic Edition [min, max].</p>
         */
        @NameInMap("BasicEditionIntervalValue")
        public java.util.List<Integer> basicEditionIntervalValue;

        /**
         * <p>The identifier of the control item. For valid values, see the control item list for each schema.</p>
         * 
         * <strong>example:</strong>
         * <p>viewCount</p>
         */
        @NameInMap("Controller")
        public String controller;

        /**
         * <p><strong>The value type (Boolean/Integer/Long/String).</strong></p>
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
         * <p>Query results - Maximum number of records displayed at a time</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p><strong>The English display name.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>Query Results - Single Display Record Limit</p>
         */
        @NameInMap("DisplayNameEn")
        public String displayNameEn;

        /**
         * <p><strong>Indicates whether the control item is enabled.</strong></p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The default value for Enterprise Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("EnterpriseEditionDefaultValue")
        public Object enterpriseEditionDefaultValue;

        /**
         * <p>The valid value range for Enterprise Edition [min, max].</p>
         */
        @NameInMap("EnterpriseEditionIntervalValue")
        public java.util.List<Integer> enterpriseEditionIntervalValue;

        /**
         * <p>The default value for Professional Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProfessionalEditionDefaultValue")
        public Object professionalEditionDefaultValue;

        /**
         * <p>The valid value range for Professional Edition [min, max].</p>
         */
        @NameInMap("ProfessionalEditionIntervalValue")
        public java.util.List<Integer> professionalEditionIntervalValue;

        /**
         * <p><strong>The default value for Standard Edition.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("StandardEditionDefaultValue")
        public Object standardEditionDefaultValue;

        /**
         * <p>The valid value range for Standard Edition [min, max].</p>
         */
        @NameInMap("StandardEditionIntervalValue")
        public java.util.List<Integer> standardEditionIntervalValue;

        /**
         * <p><strong>The user-configured value. The type depends on ControllerValueType.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("UserConfigValue")
        public Object userConfigValue;

        public static ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers self = new ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers();
            return TeaModel.build(map, self);
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setBasicEditionDefaultValue(Object basicEditionDefaultValue) {
            this.basicEditionDefaultValue = basicEditionDefaultValue;
            return this;
        }
        public Object getBasicEditionDefaultValue() {
            return this.basicEditionDefaultValue;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setBasicEditionIntervalValue(java.util.List<Integer> basicEditionIntervalValue) {
            this.basicEditionIntervalValue = basicEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getBasicEditionIntervalValue() {
            return this.basicEditionIntervalValue;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setController(String controller) {
            this.controller = controller;
            return this;
        }
        public String getController() {
            return this.controller;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setControllerValueType(String controllerValueType) {
            this.controllerValueType = controllerValueType;
            return this;
        }
        public String getControllerValueType() {
            return this.controllerValueType;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setDisplayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setEnterpriseEditionDefaultValue(Object enterpriseEditionDefaultValue) {
            this.enterpriseEditionDefaultValue = enterpriseEditionDefaultValue;
            return this;
        }
        public Object getEnterpriseEditionDefaultValue() {
            return this.enterpriseEditionDefaultValue;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setEnterpriseEditionIntervalValue(java.util.List<Integer> enterpriseEditionIntervalValue) {
            this.enterpriseEditionIntervalValue = enterpriseEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getEnterpriseEditionIntervalValue() {
            return this.enterpriseEditionIntervalValue;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setProfessionalEditionDefaultValue(Object professionalEditionDefaultValue) {
            this.professionalEditionDefaultValue = professionalEditionDefaultValue;
            return this;
        }
        public Object getProfessionalEditionDefaultValue() {
            return this.professionalEditionDefaultValue;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setProfessionalEditionIntervalValue(java.util.List<Integer> professionalEditionIntervalValue) {
            this.professionalEditionIntervalValue = professionalEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getProfessionalEditionIntervalValue() {
            return this.professionalEditionIntervalValue;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setStandardEditionDefaultValue(Object standardEditionDefaultValue) {
            this.standardEditionDefaultValue = standardEditionDefaultValue;
            return this;
        }
        public Object getStandardEditionDefaultValue() {
            return this.standardEditionDefaultValue;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setStandardEditionIntervalValue(java.util.List<Integer> standardEditionIntervalValue) {
            this.standardEditionIntervalValue = standardEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getStandardEditionIntervalValue() {
            return this.standardEditionIntervalValue;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers setUserConfigValue(Object userConfigValue) {
            this.userConfigValue = userConfigValue;
            return this;
        }
        public Object getUserConfigValue() {
            return this.userConfigValue;
        }

    }

    public static class ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent extends TeaModel {
        /**
         * <p><strong>The control scope.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>Tenant</p>
         */
        @NameInMap("ControlDwScope")
        public String controlDwScope;

        /**
         * <p>The control module. The SecurityStrategySchema.controlModule associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>DataQuery</p>
         */
        @NameInMap("ControlModule")
        public String controlModule;

        /**
         * <p>The control submodule. The SecurityStrategySchema.controlSubModule associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>MyCatalog</p>
         */
        @NameInMap("ControlSubModule")
        public String controlSubModule;

        /**
         * <p>The list of control items. Valid control items depend on the selected schema. Refer to the controller definition and the control item list for each schema.</p>
         */
        @NameInMap("Controllers")
        public java.util.List<ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers> controllers;

        /**
         * <p>The SecurityStrategySchema.displayName associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Analysis</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The SecurityStrategySchema.displayNameEn associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Query</p>
         */
        @NameInMap("DisplayNameEn")
        public String displayNameEn;

        /**
         * <p>The SecurityStrategySchema.name associated with the current policy.</p>
         * 
         * <strong>example:</strong>
         * <p>DataQuerySecurityStrategySchema</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The display name of the system policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Default system generate data query policy</p>
         */
        @NameInMap("SystemPolicyDisplayName")
        public String systemPolicyDisplayName;

        /**
         * <p>The system policy name. If this parameter is not empty, the system performs automatic creation of a default policy.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_GENERATE_DEFAULT_DATA_QUERY</p>
         */
        @NameInMap("SystemPolicyName")
        public String systemPolicyName;

        public static ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent self = new ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent();
            return TeaModel.build(map, self);
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent setControlDwScope(String controlDwScope) {
            this.controlDwScope = controlDwScope;
            return this;
        }
        public String getControlDwScope() {
            return this.controlDwScope;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent setControlModule(String controlModule) {
            this.controlModule = controlModule;
            return this;
        }
        public String getControlModule() {
            return this.controlModule;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent setControlSubModule(String controlSubModule) {
            this.controlSubModule = controlSubModule;
            return this;
        }
        public String getControlSubModule() {
            return this.controlSubModule;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent setControllers(java.util.List<ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers> controllers) {
            this.controllers = controllers;
            return this;
        }
        public java.util.List<ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContentControllers> getControllers() {
            return this.controllers;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent setDisplayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent setSystemPolicyDisplayName(String systemPolicyDisplayName) {
            this.systemPolicyDisplayName = systemPolicyDisplayName;
            return this;
        }
        public String getSystemPolicyDisplayName() {
            return this.systemPolicyDisplayName;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent setSystemPolicyName(String systemPolicyName) {
            this.systemPolicyName = systemPolicyName;
            return this;
        }
        public String getSystemPolicyName() {
            return this.systemPolicyName;
        }

    }

    public static class ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies extends TeaModel {
        /**
         * <p>The policy content. The content is constrained by SecurityStrategySchema.</p>
         */
        @NameInMap("Content")
        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent content;

        /**
         * <p><strong>The control scope</strong> (Workspace/Tenant).</p>
         * 
         * <strong>example:</strong>
         * <p>Tenant</p>
         */
        @NameInMap("ControlDwScope")
        public String controlDwScope;

        /**
         * <p><strong>The control module.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>DataQuery</p>
         */
        @NameInMap("ControlModule")
        public String controlModule;

        /**
         * <p><strong>The control submodule.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>MyCatalog</p>
         */
        @NameInMap("ControlSubModule")
        public String controlSubModule;

        /**
         * <p>The creation time. The format is YYYY-MM-DDTHH:mm:ss. The time zone is not specified in the current document.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-25T20:46:19</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p><strong>The ID of the creator.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>203322746501002787</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Controls the security behavior of query results in the Data Analysis module</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p><strong>Indicates whether the policy is enabled.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default Data Analysis policy</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p><strong>The source ID of the system default policy.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("OriginPolicyId")
        public Long originPolicyId;

        /**
         * <p>The name of the schema template.</p>
         * 
         * <strong>example:</strong>
         * <p>DataQuerySecurityStrategySchema</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The update time. The format is YYYY-MM-DDTHH:mm:ss. The time zone is not specified in the current document.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-25T20:46:19</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p><strong>The ID of the last updater.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>203322746501002787</p>
         */
        @NameInMap("Updater")
        public String updater;

        /**
         * <p><strong>The list of associated workspace IDs.</strong></p>
         */
        @NameInMap("Workspaces")
        public java.util.List<Long> workspaces;

        public static ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies self = new ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies();
            return TeaModel.build(map, self);
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setContent(ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent content) {
            this.content = content;
            return this;
        }
        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategiesContent getContent() {
            return this.content;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setControlDwScope(String controlDwScope) {
            this.controlDwScope = controlDwScope;
            return this;
        }
        public String getControlDwScope() {
            return this.controlDwScope;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setControlModule(String controlModule) {
            this.controlModule = controlModule;
            return this;
        }
        public String getControlModule() {
            return this.controlModule;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setControlSubModule(String controlSubModule) {
            this.controlSubModule = controlSubModule;
            return this;
        }
        public String getControlSubModule() {
            return this.controlSubModule;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setOriginPolicyId(Long originPolicyId) {
            this.originPolicyId = originPolicyId;
            return this;
        }
        public Long getOriginPolicyId() {
            return this.originPolicyId;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

        public ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies setWorkspaces(java.util.List<Long> workspaces) {
            this.workspaces = workspaces;
            return this;
        }
        public java.util.List<Long> getWorkspaces() {
            return this.workspaces;
        }

    }

    public static class ListSecurityStrategiesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of security policies.</p>
         */
        @NameInMap("SecurityStrategies")
        public java.util.List<ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies> securityStrategies;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSecurityStrategiesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityStrategiesResponseBodyPagingInfo self = new ListSecurityStrategiesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListSecurityStrategiesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSecurityStrategiesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSecurityStrategiesResponseBodyPagingInfo setSecurityStrategies(java.util.List<ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies> securityStrategies) {
            this.securityStrategies = securityStrategies;
            return this;
        }
        public java.util.List<ListSecurityStrategiesResponseBodyPagingInfoSecurityStrategies> getSecurityStrategies() {
            return this.securityStrategies;
        }

        public ListSecurityStrategiesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
