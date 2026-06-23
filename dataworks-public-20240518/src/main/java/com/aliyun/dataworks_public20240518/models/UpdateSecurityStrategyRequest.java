// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateSecurityStrategyRequest extends TeaModel {
    /**
     * <p>A client token to ensure request idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9*****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The policy content, which is constrained by the <code>SecurityStrategySchema</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public UpdateSecurityStrategyRequestContent content;

    /**
     * <p><strong>The policy description.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>控制数据分析模块的查询结果安全行为</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p><strong>The policy ID.</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p><strong>The policy name.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>默认数据分析策略</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p><strong>A list of associated workspace IDs.</strong></p>
     */
    @NameInMap("Workspaces")
    public java.util.List<Long> workspaces;

    public static UpdateSecurityStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityStrategyRequest self = new UpdateSecurityStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSecurityStrategyRequest setContent(UpdateSecurityStrategyRequestContent content) {
        this.content = content;
        return this;
    }
    public UpdateSecurityStrategyRequestContent getContent() {
        return this.content;
    }

    public UpdateSecurityStrategyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSecurityStrategyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSecurityStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSecurityStrategyRequest setWorkspaces(java.util.List<Long> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<Long> getWorkspaces() {
        return this.workspaces;
    }

    public static class UpdateSecurityStrategyRequestContentControllers extends TeaModel {
        /**
         * <p>The default value for the Basic edition.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("BasicEditionDefaultValue")
        public Object basicEditionDefaultValue;

        /**
         * <p>The value range for the Basic edition, specified as <code>[min, max]</code>.</p>
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
         * <p>The data type of the controller\&quot;s value. Valid values: <code>Boolean</code>, <code>Integer</code>, <code>Long</code>, and <code>String</code>.</p>
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
         * <p>Indicates whether the controller is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The default value for the Enterprise edition.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("EnterpriseEditionDefaultValue")
        public Object enterpriseEditionDefaultValue;

        /**
         * <p>The value range for the Enterprise edition, specified as <code>[min, max]</code>.</p>
         */
        @NameInMap("EnterpriseEditionIntervalValue")
        public java.util.List<Integer> enterpriseEditionIntervalValue;

        /**
         * <p>The default value for the Professional edition.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProfessionalEditionDefaultValue")
        public Object professionalEditionDefaultValue;

        /**
         * <p>The value range for the Professional edition, specified as <code>[min, max]</code>.</p>
         */
        @NameInMap("ProfessionalEditionIntervalValue")
        public java.util.List<Integer> professionalEditionIntervalValue;

        /**
         * <p>The default value for the Standard edition.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("StandardEditionDefaultValue")
        public Object standardEditionDefaultValue;

        /**
         * <p>The value range for the Standard edition, specified as <code>[min, max]</code>.</p>
         */
        @NameInMap("StandardEditionIntervalValue")
        public java.util.List<Integer> standardEditionIntervalValue;

        /**
         * <p>The user-configured value. The type of this value is determined by the <code>ControllerValueType</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("UserConfigValue")
        public Object userConfigValue;

        public static UpdateSecurityStrategyRequestContentControllers build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecurityStrategyRequestContentControllers self = new UpdateSecurityStrategyRequestContentControllers();
            return TeaModel.build(map, self);
        }

        public UpdateSecurityStrategyRequestContentControllers setBasicEditionDefaultValue(Object basicEditionDefaultValue) {
            this.basicEditionDefaultValue = basicEditionDefaultValue;
            return this;
        }
        public Object getBasicEditionDefaultValue() {
            return this.basicEditionDefaultValue;
        }

        public UpdateSecurityStrategyRequestContentControllers setBasicEditionIntervalValue(java.util.List<Integer> basicEditionIntervalValue) {
            this.basicEditionIntervalValue = basicEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getBasicEditionIntervalValue() {
            return this.basicEditionIntervalValue;
        }

        public UpdateSecurityStrategyRequestContentControllers setController(String controller) {
            this.controller = controller;
            return this;
        }
        public String getController() {
            return this.controller;
        }

        public UpdateSecurityStrategyRequestContentControllers setControllerValueType(String controllerValueType) {
            this.controllerValueType = controllerValueType;
            return this;
        }
        public String getControllerValueType() {
            return this.controllerValueType;
        }

        public UpdateSecurityStrategyRequestContentControllers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateSecurityStrategyRequestContentControllers setDisplayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        public UpdateSecurityStrategyRequestContentControllers setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateSecurityStrategyRequestContentControllers setEnterpriseEditionDefaultValue(Object enterpriseEditionDefaultValue) {
            this.enterpriseEditionDefaultValue = enterpriseEditionDefaultValue;
            return this;
        }
        public Object getEnterpriseEditionDefaultValue() {
            return this.enterpriseEditionDefaultValue;
        }

        public UpdateSecurityStrategyRequestContentControllers setEnterpriseEditionIntervalValue(java.util.List<Integer> enterpriseEditionIntervalValue) {
            this.enterpriseEditionIntervalValue = enterpriseEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getEnterpriseEditionIntervalValue() {
            return this.enterpriseEditionIntervalValue;
        }

        public UpdateSecurityStrategyRequestContentControllers setProfessionalEditionDefaultValue(Object professionalEditionDefaultValue) {
            this.professionalEditionDefaultValue = professionalEditionDefaultValue;
            return this;
        }
        public Object getProfessionalEditionDefaultValue() {
            return this.professionalEditionDefaultValue;
        }

        public UpdateSecurityStrategyRequestContentControllers setProfessionalEditionIntervalValue(java.util.List<Integer> professionalEditionIntervalValue) {
            this.professionalEditionIntervalValue = professionalEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getProfessionalEditionIntervalValue() {
            return this.professionalEditionIntervalValue;
        }

        public UpdateSecurityStrategyRequestContentControllers setStandardEditionDefaultValue(Object standardEditionDefaultValue) {
            this.standardEditionDefaultValue = standardEditionDefaultValue;
            return this;
        }
        public Object getStandardEditionDefaultValue() {
            return this.standardEditionDefaultValue;
        }

        public UpdateSecurityStrategyRequestContentControllers setStandardEditionIntervalValue(java.util.List<Integer> standardEditionIntervalValue) {
            this.standardEditionIntervalValue = standardEditionIntervalValue;
            return this;
        }
        public java.util.List<Integer> getStandardEditionIntervalValue() {
            return this.standardEditionIntervalValue;
        }

        public UpdateSecurityStrategyRequestContentControllers setUserConfigValue(Object userConfigValue) {
            this.userConfigValue = userConfigValue;
            return this;
        }
        public Object getUserConfigValue() {
            return this.userConfigValue;
        }

    }

    public static class UpdateSecurityStrategyRequestContent extends TeaModel {
        /**
         * <p>A list of controllers.</p>
         * <p>Note: The valid controllers depend on the selected schema. For more information, see the controller definition and the list of controllers for each schema.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Controllers")
        public java.util.List<UpdateSecurityStrategyRequestContentControllers> controllers;

        public static UpdateSecurityStrategyRequestContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecurityStrategyRequestContent self = new UpdateSecurityStrategyRequestContent();
            return TeaModel.build(map, self);
        }

        public UpdateSecurityStrategyRequestContent setControllers(java.util.List<UpdateSecurityStrategyRequestContentControllers> controllers) {
            this.controllers = controllers;
            return this;
        }
        public java.util.List<UpdateSecurityStrategyRequestContentControllers> getControllers() {
            return this.controllers;
        }

    }

}
