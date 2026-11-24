// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCloudAssistantSettingsRequest extends TeaModel {
    /**
     * <p>The Cloud Assistant Agent upgrade configuration.</p>
     */
    @NameInMap("AgentUpgradeConfig")
    public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig agentUpgradeConfig;

    /**
     * <p>The OSS delivery configuration.</p>
     */
    @NameInMap("OssDeliveryConfig")
    public ModifyCloudAssistantSettingsRequestOssDeliveryConfig ossDeliveryConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
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
     * <p>The Cloud Assistant resource usage configuration. This parameter takes effect only when the Cloud Assistant Agent version is not earlier than the following versions:</p>
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
     * <p>The Cloud Assistant session feature configuration.</p>
     */
    @NameInMap("SessionManagerConfig")
    public ModifyCloudAssistantSettingsRequestSessionManagerConfig sessionManagerConfig;

    /**
     * <p>The service configuration type. Valid values:</p>
     * <ul>
     * <li>SessionManagerDelivery: session operation record delivery</li>
     * <li>InvocationDelivery: task execution record delivery</li>
     * <li>AgentUpgradeConfig: Cloud Assistant Agent upgrade configuration</li>
     * <li>SessionManagerConfig: Cloud Assistant SessionManager configuration</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SessionManagerDelivery</p>
     */
    @NameInMap("SettingType")
    public String settingType;

    /**
     * <p>The SLS delivery configuration.</p>
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
         * <p>The list of time windows allowed for upgrades, accurate to the minute. The default time zone is UTC. The interval between time windows cannot be less than 1 hour. Format: start time (HH:mm)-end time (HH:mm). For example, [&quot;02:00-03:00&quot;, &quot;05:00-06:00&quot;] indicates that upgrades are allowed every day from 02:00 to 03:00 and from 05:00 to 06:00 in the UTC time zone.</p>
         */
        @NameInMap("AllowedUpgradeWindow")
        public java.util.List<String> allowedUpgradeWindow;

        /**
         * <p>Specifies whether to check the version and perform updates immediately when the Cloud Assistant Agent starts. Default value: true. This parameter takes effect only when the Cloud Assistant Agent version is not earlier than the following versions:</p>
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
         * <p>Specifies whether to disable the Cloud Assistant Agent from checking and performing updates. Default value: false. Precautions:</p>
         * <ol>
         * <li>Fully evaluate the security risks and business impacts caused by disabling upgrades or continuing to run an earlier version of the Agent. You are responsible for the resulting risks and impacts.</li>
         * <li>The disable upgrade configuration takes effect at the account level. It applies to all ECS instances under the account and does not support individual exemptions by instance. Therefore, the aforementioned risks cover all instances within the account.</li>
         * <li>This parameter takes effect only when the Cloud Assistant Agent version is not earlier than the following versions:<ul>
         * <li>Windows: 2.1.4.1065</li>
         * <li>Linux: 2.2.4.1065</li>
         * </ul>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableUpgrade")
        public Boolean disableUpgrade;

        /**
         * <p>Specifies whether to enable the custom Agent upgrade configuration. If set to false, the system attempts to upgrade the Agent every 30 minutes by default. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time zone for the allowed upgrade time windows. The default time zone is UTC. The time zone supports the following two formats:</p>
         * <ul>
         * <li>Full time zone name: such as Asia/Shanghai (China/Shanghai time) and America/Los_Angeles (US/Los Angeles time).</li>
         * <li>Time zone offset from Greenwich Mean Time (GMT): such as GMT+8:00 (UTC+8) and GMT-7:00 (UTC-7). Leading zeros are not supported for the hour value.</li>
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
         * <p>Specifies whether to enable delivery to OSS. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The OSS encryption algorithm. Valid values:</p>
         * <ul>
         * <li>AES256</li>
         * <li>SM4</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AES256</p>
         */
        @NameInMap("EncryptionAlgorithm")
        public String encryptionAlgorithm;

        /**
         * <p>The ID of the customer master key (CMK) when the encryption method is KMS.</p>
         * 
         * <strong>example:</strong>
         * <p>a807****7a70e</p>
         */
        @NameInMap("EncryptionKeyId")
        public String encryptionKeyId;

        /**
         * <p>The OSS encryption method. Valid values:</p>
         * <ul>
         * <li>Inherit: inherit from the bucket</li>
         * <li>OssManaged: fully managed by OSS</li>
         * <li>KMS: KMS encryption</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inherit</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The directory prefix of the OSS bucket. Constraints:</p>
         * <ul>
         * <li>The length cannot exceed 254 characters.</li>
         * <li>It cannot start with a forward slash (/) or a backslash (\).</li>
         * </ul>
         * <p>Note: Pass an empty string (&quot;&quot;) if no directory prefix is required. If a directory prefix was previously set and is no longer needed, pass an empty string (&quot;&quot;) to clear it.</p>
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
         * <p>The maximum allowed CPU usage limit for the main process of the Cloud Assistant Agent.</p>
         * <ul>
         * <li><p>Unit: percentage.</p>
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
         * <p>Specifies whether to retain the script file in the Cloud Assistant directory after the command execution is completed. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("KeepScriptFile")
        public Boolean keepScriptFile;

        /**
         * <p>The maximum number of Cloud Assistant log files to retain.</p>
         * <ul>
         * <li>Default value: 30.</li>
         * <li>Minimum value: 7.</li>
         * <li>Maximum value: 365.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LogFileCountLimit")
        public Integer logFileCountLimit;

        /**
         * <p>The size limit for a single Cloud Assistant log file. A unit (B, KB, or MB) must be specified.</p>
         * <ul>
         * <li>Default value: 100MB.</li>
         * <li>Minimum value: 10MB.</li>
         * <li>Maximum value: 1024MB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10MB</p>
         */
        @NameInMap("LogSizeLimit")
        public String logSizeLimit;

        /**
         * <p>The maximum allowed memory usage limit for the main process of the Cloud Assistant Agent. A unit (B, KB, or MB) must be specified.</p>
         * <ul>
         * <li>Default value: 50MB.</li>
         * <li>Minimum value: 35MB.</li>
         * <li>Maximum value: 1024MB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50MB</p>
         */
        @NameInMap("MemoryLimit")
        public String memoryLimit;

        /**
         * <p>The maximum number of consecutive times that the usage of CPU or memory resources exceeds the limit. When this limit is reached, the Cloud Assistant Agent automatically stops.</p>
         * <ul>
         * <li>Default value: 3.</li>
         * <li>Minimum value: 3.</li>
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
         * <p>Specifies whether to enable the Cloud Assistant session feature. Valid values:</p>
         * <ul>
         * <li>true: enabled</li>
         * <li>false: disabled</li>
         * </ul>
         * <p>Precautions:</p>
         * <ul>
         * <li>Enabling or disabling the session feature takes effect in all regions.</li>
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
         * <p>Specifies whether to enable delivery to SLS. Default value: false.</p>
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
