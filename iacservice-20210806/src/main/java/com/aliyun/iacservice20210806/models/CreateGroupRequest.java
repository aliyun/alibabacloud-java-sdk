// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoDestroy")
    public Boolean autoDestroy;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoTrigger")
    public Boolean autoTrigger;

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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("forcedSetting")
    public Boolean forcedSetting;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("notifyConfig")
    public java.util.List<CreateGroupRequestNotifyConfig> notifyConfig;

    @NameInMap("notifyOperationTypes")
    public java.util.List<String> notifyOperationTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p-433aead7560571a87349d054b4</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>ramName</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    @NameInMap("reportExportField")
    public java.util.List<String> reportExportField;

    /**
     * <strong>example:</strong>
     * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/test/test">https://test.oss-cn-hangzhou.aliyuncs.com/test/test</a></p>
     */
    @NameInMap("reportExportPath")
    public String reportExportPath;

    /**
     * <strong>example:</strong>
     * <p>1.189.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    @NameInMap("triggerConfig")
    public java.util.List<CreateGroupRequestTriggerConfig> triggerConfig;

    @NameInMap("triggerResourceType")
    public java.util.List<String> triggerResourceType;

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setAutoDestroy(Boolean autoDestroy) {
        this.autoDestroy = autoDestroy;
        return this;
    }
    public Boolean getAutoDestroy() {
        return this.autoDestroy;
    }

    public CreateGroupRequest setAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
        return this;
    }
    public Boolean getAutoTrigger() {
        return this.autoTrigger;
    }

    public CreateGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupRequest setForcedSetting(Boolean forcedSetting) {
        this.forcedSetting = forcedSetting;
        return this;
    }
    public Boolean getForcedSetting() {
        return this.forcedSetting;
    }

    public CreateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupRequest setNotifyConfig(java.util.List<CreateGroupRequestNotifyConfig> notifyConfig) {
        this.notifyConfig = notifyConfig;
        return this;
    }
    public java.util.List<CreateGroupRequestNotifyConfig> getNotifyConfig() {
        return this.notifyConfig;
    }

    public CreateGroupRequest setNotifyOperationTypes(java.util.List<String> notifyOperationTypes) {
        this.notifyOperationTypes = notifyOperationTypes;
        return this;
    }
    public java.util.List<String> getNotifyOperationTypes() {
        return this.notifyOperationTypes;
    }

    public CreateGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateGroupRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public CreateGroupRequest setReportExportField(java.util.List<String> reportExportField) {
        this.reportExportField = reportExportField;
        return this;
    }
    public java.util.List<String> getReportExportField() {
        return this.reportExportField;
    }

    public CreateGroupRequest setReportExportPath(String reportExportPath) {
        this.reportExportPath = reportExportPath;
        return this;
    }
    public String getReportExportPath() {
        return this.reportExportPath;
    }

    public CreateGroupRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public CreateGroupRequest setTriggerConfig(java.util.List<CreateGroupRequestTriggerConfig> triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public java.util.List<CreateGroupRequestTriggerConfig> getTriggerConfig() {
        return this.triggerConfig;
    }

    public CreateGroupRequest setTriggerResourceType(java.util.List<String> triggerResourceType) {
        this.triggerResourceType = triggerResourceType;
        return this;
    }
    public java.util.List<String> getTriggerResourceType() {
        return this.triggerResourceType;
    }

    public static class CreateGroupRequestNotifyConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("notifyPath")
        public String notifyPath;

        /**
         * <strong>example:</strong>
         * <p>DingDing</p>
         */
        @NameInMap("notifyType")
        public String notifyType;

        public static CreateGroupRequestNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupRequestNotifyConfig self = new CreateGroupRequestNotifyConfig();
            return TeaModel.build(map, self);
        }

        public CreateGroupRequestNotifyConfig setNotifyPath(String notifyPath) {
            this.notifyPath = notifyPath;
            return this;
        }
        public String getNotifyPath() {
            return this.notifyPath;
        }

        public CreateGroupRequestNotifyConfig setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

    }

    public static class CreateGroupRequestTriggerConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Cron</p>
         */
        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        /**
         * <strong>example:</strong>
         * <p>0 0 19 * * ？</p>
         */
        @NameInMap("triggerValue")
        public String triggerValue;

        public static CreateGroupRequestTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupRequestTriggerConfig self = new CreateGroupRequestTriggerConfig();
            return TeaModel.build(map, self);
        }

        public CreateGroupRequestTriggerConfig setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        public CreateGroupRequestTriggerConfig setTriggerValue(String triggerValue) {
            this.triggerValue = triggerValue;
            return this;
        }
        public String getTriggerValue() {
            return this.triggerValue;
        }

    }

}
