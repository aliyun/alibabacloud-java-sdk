// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateGroupRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("notifyConfig")
    public java.util.List<UpdateGroupRequestNotifyConfig> notifyConfig;

    @NameInMap("notifyOperationTypes")
    public java.util.List<String> notifyOperationTypes;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    @NameInMap("reportExportField")
    public java.util.List<String> reportExportField;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("reportExportPath")
    public String reportExportPath;

    /**
     * <strong>example:</strong>
     * <p>1.183.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    @NameInMap("triggerConfig")
    public java.util.List<UpdateGroupRequestTriggerConfig> triggerConfig;

    @NameInMap("triggerResourceType")
    public java.util.List<String> triggerResourceType;

    public static UpdateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupRequest self = new UpdateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupRequest setAutoDestroy(Boolean autoDestroy) {
        this.autoDestroy = autoDestroy;
        return this;
    }
    public Boolean getAutoDestroy() {
        return this.autoDestroy;
    }

    public UpdateGroupRequest setAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
        return this;
    }
    public Boolean getAutoTrigger() {
        return this.autoTrigger;
    }

    public UpdateGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGroupRequest setForcedSetting(Boolean forcedSetting) {
        this.forcedSetting = forcedSetting;
        return this;
    }
    public Boolean getForcedSetting() {
        return this.forcedSetting;
    }

    public UpdateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGroupRequest setNotifyConfig(java.util.List<UpdateGroupRequestNotifyConfig> notifyConfig) {
        this.notifyConfig = notifyConfig;
        return this;
    }
    public java.util.List<UpdateGroupRequestNotifyConfig> getNotifyConfig() {
        return this.notifyConfig;
    }

    public UpdateGroupRequest setNotifyOperationTypes(java.util.List<String> notifyOperationTypes) {
        this.notifyOperationTypes = notifyOperationTypes;
        return this;
    }
    public java.util.List<String> getNotifyOperationTypes() {
        return this.notifyOperationTypes;
    }

    public UpdateGroupRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public UpdateGroupRequest setReportExportField(java.util.List<String> reportExportField) {
        this.reportExportField = reportExportField;
        return this;
    }
    public java.util.List<String> getReportExportField() {
        return this.reportExportField;
    }

    public UpdateGroupRequest setReportExportPath(String reportExportPath) {
        this.reportExportPath = reportExportPath;
        return this;
    }
    public String getReportExportPath() {
        return this.reportExportPath;
    }

    public UpdateGroupRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public UpdateGroupRequest setTriggerConfig(java.util.List<UpdateGroupRequestTriggerConfig> triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public java.util.List<UpdateGroupRequestTriggerConfig> getTriggerConfig() {
        return this.triggerConfig;
    }

    public UpdateGroupRequest setTriggerResourceType(java.util.List<String> triggerResourceType) {
        this.triggerResourceType = triggerResourceType;
        return this;
    }
    public java.util.List<String> getTriggerResourceType() {
        return this.triggerResourceType;
    }

    public static class UpdateGroupRequestNotifyConfig extends TeaModel {
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

        public static UpdateGroupRequestNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupRequestNotifyConfig self = new UpdateGroupRequestNotifyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateGroupRequestNotifyConfig setNotifyPath(String notifyPath) {
            this.notifyPath = notifyPath;
            return this;
        }
        public String getNotifyPath() {
            return this.notifyPath;
        }

        public UpdateGroupRequestNotifyConfig setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

    }

    public static class UpdateGroupRequestTriggerConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Cron</p>
         */
        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        /**
         * <strong>example:</strong>
         * <p>0 0 * * * ？</p>
         */
        @NameInMap("triggerValue")
        public String triggerValue;

        public static UpdateGroupRequestTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupRequestTriggerConfig self = new UpdateGroupRequestTriggerConfig();
            return TeaModel.build(map, self);
        }

        public UpdateGroupRequestTriggerConfig setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        public UpdateGroupRequestTriggerConfig setTriggerValue(String triggerValue) {
            this.triggerValue = triggerValue;
            return this;
        }
        public String getTriggerValue() {
            return this.triggerValue;
        }

    }

}
