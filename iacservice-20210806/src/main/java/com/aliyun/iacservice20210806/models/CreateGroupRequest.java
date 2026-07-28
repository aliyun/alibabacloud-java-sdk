// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the group after creation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoDestroy")
    public Boolean autoDestroy;

    /**
     * <p>Specifies whether to enable the automatic trigger policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoTrigger")
    public Boolean autoTrigger;

    /**
     * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to forcibly use the group configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("forcedSetting")
    public Boolean forcedSetting;

    /**
     * <p>The name of the group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The notification configuration.</p>
     */
    @NameInMap("notifyConfig")
    public java.util.List<CreateGroupRequestNotifyConfig> notifyConfig;

    /**
     * <p>The list of notification operation types.</p>
     */
    @NameInMap("notifyOperationTypes")
    public java.util.List<String> notifyOperationTypes;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p-433aead7560571a87349d054b4</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <p>The RAM role (1-128 characters).
     * The system assumes this role to execute the template when a new job is triggered.
     * This parameter is required when the job trigger method is not manual.</p>
     * 
     * <strong>example:</strong>
     * <p>ramName</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    /**
     * <p>The list of export fields for the report.</p>
     */
    @NameInMap("reportExportField")
    public java.util.List<String> reportExportField;

    /**
     * <p>The export address for the execution report. OSS addresses are supported.
     * https://<OSS bucket address>/<path>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/test/test">https://test.oss-cn-hangzhou.aliyuncs.com/test/test</a></p>
     */
    @NameInMap("reportExportPath")
    public String reportExportPath;

    /**
     * <p>The Terraform Provider version.
     * Select a Terraform Provider version. The version configured on the task takes higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1.189.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    /**
     * <p>The trigger policy.
     * This parameter cannot be empty when autoTrigger is set to true.</p>
     */
    @NameInMap("triggerConfig")
    public java.util.List<CreateGroupRequestTriggerConfig> triggerConfig;

    /**
     * <p>The resource type for triggered execution. Valid values:</p>
     * <ul>
     * <li>Task: regular task.</li>
     * <li>SceneTestingTask: scenario-based testing task.</li>
     * </ul>
     */
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
         * <p>The path configuration for notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("notifyPath")
        public String notifyPath;

        /**
         * <p>The notification type:
         * DingDing.</p>
         * 
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
         * <p>The trigger policy. Valid values:</p>
         * <ul>
         * <li>ProviderNewVersion: triggered when a new Provider version is released.</li>
         * <li>Cron: triggered on a schedule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cron</p>
         */
        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        /**
         * <p>The policy value to maintain for scheduled triggering. This is a cron expression.</p>
         * 
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
