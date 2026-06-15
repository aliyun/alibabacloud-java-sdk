// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCloudAssistantSettingsRequest extends TeaModel {
    /**
     * <p>The configurations of upgrading the Cloud Assistant agent.</p>
     */
    @NameInMap("AgentUpgradeConfig")
    public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig agentUpgradeConfig;

    /**
     * <p>The configurations of delivering records to OSS.</p>
     */
    @NameInMap("OssDeliveryConfig")
    public ModifyCloudAssistantSettingsRequestOssDeliveryConfig ossDeliveryConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The configurations of resource usage for Cloud Assistant. This setting takes effect only when the version of the Cloud Assistant agent is not earlier than the following versions:</p>
     * <ul>
     * <li><p>Windows: 2.1.4.1065</p>
     * </li>
     * <li><p>Linux: 2.2.4.1065</p>
     * </li>
     * </ul>
     */
    @NameInMap("ResourceUsageConfig")
    public ModifyCloudAssistantSettingsRequestResourceUsageConfig resourceUsageConfig;

    /**
     * <p>The configurations of the Session Manager feature.</p>
     */
    @NameInMap("SessionManagerConfig")
    public ModifyCloudAssistantSettingsRequestSessionManagerConfig sessionManagerConfig;

    /**
     * <p>The type of the service configurations. Valid values:</p>
     * <ul>
     * <li><p><code>SessionManagerDelivery</code>: the configurations of delivering session records.</p>
     * </li>
     * <li><p><code>InvocationDelivery</code>: the configurations of delivering command execution records.</p>
     * </li>
     * <li><p><code>AgentUpgradeConfig</code>: the configurations of upgrading the Cloud Assistant agent.</p>
     * </li>
     * <li><p><code>SessionManagerConfig</code>: the configurations of Cloud Assistant Session Manager.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SessionManagerDelivery</p>
     */
    @NameInMap("SettingType")
    public String settingType;

    /**
     * <p>The configurations of delivering records to SLS.</p>
     */
    @NameInMap("SlsDeliveryConfig")
    public ModifyCloudAssistantSettingsRequestSlsDeliveryConfig slsDeliveryConfig;

    public static ModifyCloudAssistantSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudAssistantSettingsRequest self = new ModifyCloudAssistantSettingsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudAssistantSettingsRequest setAgentUpgradeConfig(ModifyCloudAssistantSettingsRequestAgentUpgradeConfig agentUpgradeConfig) {
        this.agentUpgradeConfig = agentUpgradeConfig;
        return this;
    }
    public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig getAgentUpgradeConfig() {
        return this.agentUpgradeConfig;
    }

    public ModifyCloudAssistantSettingsRequest setOssDeliveryConfig(ModifyCloudAssistantSettingsRequestOssDeliveryConfig ossDeliveryConfig) {
        this.ossDeliveryConfig = ossDeliveryConfig;
        return this;
    }
    public ModifyCloudAssistantSettingsRequestOssDeliveryConfig getOssDeliveryConfig() {
        return this.ossDeliveryConfig;
    }

    public ModifyCloudAssistantSettingsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCloudAssistantSettingsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCloudAssistantSettingsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCloudAssistantSettingsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCloudAssistantSettingsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCloudAssistantSettingsRequest setResourceUsageConfig(ModifyCloudAssistantSettingsRequestResourceUsageConfig resourceUsageConfig) {
        this.resourceUsageConfig = resourceUsageConfig;
        return this;
    }
    public ModifyCloudAssistantSettingsRequestResourceUsageConfig getResourceUsageConfig() {
        return this.resourceUsageConfig;
    }

    public ModifyCloudAssistantSettingsRequest setSessionManagerConfig(ModifyCloudAssistantSettingsRequestSessionManagerConfig sessionManagerConfig) {
        this.sessionManagerConfig = sessionManagerConfig;
        return this;
    }
    public ModifyCloudAssistantSettingsRequestSessionManagerConfig getSessionManagerConfig() {
        return this.sessionManagerConfig;
    }

    public ModifyCloudAssistantSettingsRequest setSettingType(String settingType) {
        this.settingType = settingType;
        return this;
    }
    public String getSettingType() {
        return this.settingType;
    }

    public ModifyCloudAssistantSettingsRequest setSlsDeliveryConfig(ModifyCloudAssistantSettingsRequestSlsDeliveryConfig slsDeliveryConfig) {
        this.slsDeliveryConfig = slsDeliveryConfig;
        return this;
    }
    public ModifyCloudAssistantSettingsRequestSlsDeliveryConfig getSlsDeliveryConfig() {
        return this.slsDeliveryConfig;
    }

    public static class ModifyCloudAssistantSettingsRequestAgentUpgradeConfig extends TeaModel {
        /**
         * <p>A list of time windows during which the agent is allowed to be upgraded. The time windows are accurate to minutes and are in UTC by default.</p>
         * <p>The interval between two consecutive time windows must be at least 1 hour.</p>
         * <p>Format: StartTime(HH:mm)-EndTime(HH:mm).</p>
         * <p>For example, [
         * &quot;02:00-03:00&quot;,
         * &quot;05:00-06:00&quot;
         * ]
         * indicates that the agent can be upgraded from 2:00 to 3:00 and from 5:00 to 6:00 every day in UTC.</p>
         */
        @NameInMap("AllowedUpgradeWindow")
        public java.util.List<String> allowedUpgradeWindow;

        /**
         * <p>Specifies whether to immediately check the version and perform an update when the Cloud Assistant agent is started. Default value: true.</p>
         * <p>This setting takes effect only when the version of the Cloud Assistant agent is not earlier than the following versions:</p>
         * <ul>
         * <li><p>Windows: 2.1.4.1065</p>
         * </li>
         * <li><p>Linux: 2.2.4.1065</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BootstrapUpgrade")
        public Boolean bootstrapUpgrade;

        /**
         * <p>Specifies whether to disallow the Cloud Assistant agent to check for or perform updates. Default value: false.</p>
         * <p>This setting takes effect only when the version of the Cloud Assistant agent is not earlier than the following versions:</p>
         * <ul>
         * <li><p>Windows: 2.1.4.1065</p>
         * </li>
         * <li><p>Linux: 2.2.4.1065</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableUpgrade")
        public Boolean disableUpgrade;

        /**
         * <p>Specifies whether to enable custom upgrade configurations for the agent. If you set this parameter to false, the agent attempts to upgrade every 30 minutes by default.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time zone of the time windows for agent upgrade. Default value: UTC.
         * The following formats are supported for the time zone:</p>
         * <ul>
         * <li><p>Time zone name: for example, Asia/Shanghai (China/Shanghai time) and America/Los_Angeles (US/Los Angeles time).</p>
         * </li>
         * <li><p>Offset from Greenwich Mean Time (GMT): for example, GMT+8:00 (UTC+8) and GMT-7:00 (UTC-7). The hour part cannot have a leading zero.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static ModifyCloudAssistantSettingsRequestAgentUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudAssistantSettingsRequestAgentUpgradeConfig self = new ModifyCloudAssistantSettingsRequestAgentUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig setAllowedUpgradeWindow(java.util.List<String> allowedUpgradeWindow) {
            this.allowedUpgradeWindow = allowedUpgradeWindow;
            return this;
        }
        public java.util.List<String> getAllowedUpgradeWindow() {
            return this.allowedUpgradeWindow;
        }

        public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig setBootstrapUpgrade(Boolean bootstrapUpgrade) {
            this.bootstrapUpgrade = bootstrapUpgrade;
            return this;
        }
        public Boolean getBootstrapUpgrade() {
            return this.bootstrapUpgrade;
        }

        public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig setDisableUpgrade(Boolean disableUpgrade) {
            this.disableUpgrade = disableUpgrade;
            return this;
        }
        public Boolean getDisableUpgrade() {
            return this.disableUpgrade;
        }

        public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class ModifyCloudAssistantSettingsRequestOssDeliveryConfig extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>Specifies whether to enable the feature of delivering records to OSS. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The OSS encryption algorithm. Valid values:</p>
         * <ul>
         * <li><p>AES256</p>
         * </li>
         * <li><p>SM4</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AES256</p>
         */
        @NameInMap("EncryptionAlgorithm")
        public String encryptionAlgorithm;

        /**
         * <p>The ID of the customer master key (CMK) when KMS encryption is used.</p>
         * 
         * <strong>example:</strong>
         * <p>a807****7a70e</p>
         */
        @NameInMap("EncryptionKeyId")
        public String encryptionKeyId;

        /**
         * <p>The OSS encryption mode. Valid values:</p>
         * <ul>
         * <li><p>Inherit: inherits the bucket encryption.</p>
         * </li>
         * <li><p>OssManaged: uses OSS-managed server-side encryption.</p>
         * </li>
         * <li><p>KMS: uses KMS encryption.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inherit</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The prefix of the directory in the OSS bucket. The following limits apply:</p>
         * <ul>
         * <li><p>The prefix can be up to 254 characters in length.</p>
         * </li>
         * <li><p>The prefix cannot start with a forward slash (/) or a backslash ().</p>
         * </li>
         * </ul>
         * <p>Note: If you want to deliver records to the root directory of the bucket, enter &quot;&quot;. To clear the prefix that is previously set, enter &quot;&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>sessionmanager/audit</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        public static ModifyCloudAssistantSettingsRequestOssDeliveryConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudAssistantSettingsRequestOssDeliveryConfig self = new ModifyCloudAssistantSettingsRequestOssDeliveryConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        public String getEncryptionAlgorithm() {
            return this.encryptionAlgorithm;
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setEncryptionKeyId(String encryptionKeyId) {
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }
        public String getEncryptionKeyId() {
            return this.encryptionKeyId;
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

    }

    public static class ModifyCloudAssistantSettingsRequestResourceUsageConfig extends TeaModel {
        /**
         * <p>The maximum CPU usage that is allowed for the main process of the Cloud Assistant agent.</p>
         * <ul>
         * <li><p>Unit: %.</p>
         * </li>
         * <li><p>Valid values: 10 to 95.</p>
         * </li>
         * <li><p>Default value: 20.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CpuLimit")
        public Integer cpuLimit;

        /**
         * <p>Specifies whether to retain the script file of a command in the Cloud Assistant directory after the command execution is complete.
         * Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("KeepScriptFile")
        public Boolean keepScriptFile;

        /**
         * <p>The maximum number of Cloud Assistant log files that can be retained.</p>
         * <ul>
         * <li><p>Default value: 30.</p>
         * </li>
         * <li><p>Minimum value: 7.</p>
         * </li>
         * <li><p>Maximum value: 365.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LogFileCountLimit")
        public Integer logFileCountLimit;

        /**
         * <p>The maximum size of a single Cloud Assistant log file. You must specify a unit (B, KB, or MB).</p>
         * <ul>
         * <li><p>Default value: 100 MB.</p>
         * </li>
         * <li><p>Minimum value: 10 MB.</p>
         * </li>
         * <li><p>Maximum value: 1024 MB.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10MB</p>
         */
        @NameInMap("LogSizeLimit")
        public String logSizeLimit;

        /**
         * <p>The maximum memory usage that is allowed for the main process of the Cloud Assistant agent. You must specify a unit (B, KB, or MB).</p>
         * <ul>
         * <li><p>Default value: 50 MB.</p>
         * </li>
         * <li><p>Minimum value: 35 MB.</p>
         * </li>
         * <li><p>Maximum value: 1024 MB.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50MB</p>
         */
        @NameInMap("MemoryLimit")
        public String memoryLimit;

        /**
         * <p>The maximum number of consecutive times that CPU or memory usage can exceed the specified limits. If the limits are consecutively exceeded for the specified number of times, the Cloud Assistant agent is automatically stopped.</p>
         * <ul>
         * <li><p>Default value: 3.</p>
         * </li>
         * <li><p>Minimum value: 3.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("OverloadLimit")
        public Integer overloadLimit;

        public static ModifyCloudAssistantSettingsRequestResourceUsageConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudAssistantSettingsRequestResourceUsageConfig self = new ModifyCloudAssistantSettingsRequestResourceUsageConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCloudAssistantSettingsRequestResourceUsageConfig setCpuLimit(Integer cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public Integer getCpuLimit() {
            return this.cpuLimit;
        }

        public ModifyCloudAssistantSettingsRequestResourceUsageConfig setKeepScriptFile(Boolean keepScriptFile) {
            this.keepScriptFile = keepScriptFile;
            return this;
        }
        public Boolean getKeepScriptFile() {
            return this.keepScriptFile;
        }

        public ModifyCloudAssistantSettingsRequestResourceUsageConfig setLogFileCountLimit(Integer logFileCountLimit) {
            this.logFileCountLimit = logFileCountLimit;
            return this;
        }
        public Integer getLogFileCountLimit() {
            return this.logFileCountLimit;
        }

        public ModifyCloudAssistantSettingsRequestResourceUsageConfig setLogSizeLimit(String logSizeLimit) {
            this.logSizeLimit = logSizeLimit;
            return this;
        }
        public String getLogSizeLimit() {
            return this.logSizeLimit;
        }

        public ModifyCloudAssistantSettingsRequestResourceUsageConfig setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public ModifyCloudAssistantSettingsRequestResourceUsageConfig setOverloadLimit(Integer overloadLimit) {
            this.overloadLimit = overloadLimit;
            return this;
        }
        public Integer getOverloadLimit() {
            return this.overloadLimit;
        }

    }

    public static class ModifyCloudAssistantSettingsRequestSessionManagerConfig extends TeaModel {
        /**
         * <p>The switch for the Session Manager feature. Valid values:</p>
         * <ul>
         * <li><p>true: enables the feature.</p>
         * </li>
         * <li><p>false: disables the feature.</p>
         * </li>
         * </ul>
         * <p>Note:</p>
         * <ul>
         * <li>After you enable or disable the Session Manager feature, the setting takes effect for all regions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SessionManagerEnabled")
        public Boolean sessionManagerEnabled;

        public static ModifyCloudAssistantSettingsRequestSessionManagerConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudAssistantSettingsRequestSessionManagerConfig self = new ModifyCloudAssistantSettingsRequestSessionManagerConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCloudAssistantSettingsRequestSessionManagerConfig setSessionManagerEnabled(Boolean sessionManagerEnabled) {
            this.sessionManagerEnabled = sessionManagerEnabled;
            return this;
        }
        public Boolean getSessionManagerEnabled() {
            return this.sessionManagerEnabled;
        }

    }

    public static class ModifyCloudAssistantSettingsRequestSlsDeliveryConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable the feature of delivering records to SLS.
         * Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The name of the SLS Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>example-logstore</p>
         */
        @NameInMap("LogstoreName")
        public String logstoreName;

        /**
         * <p>The name of the SLS project.</p>
         * 
         * <strong>example:</strong>
         * <p>example-project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static ModifyCloudAssistantSettingsRequestSlsDeliveryConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudAssistantSettingsRequestSlsDeliveryConfig self = new ModifyCloudAssistantSettingsRequestSlsDeliveryConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCloudAssistantSettingsRequestSlsDeliveryConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyCloudAssistantSettingsRequestSlsDeliveryConfig setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public ModifyCloudAssistantSettingsRequestSlsDeliveryConfig setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
