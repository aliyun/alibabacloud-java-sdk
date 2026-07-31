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
     * <p>The Cloud Assistant resource usage configuration. This parameter takes effect only when the Cloud Assistant Agent version meets the following minimum requirements:</p>
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
     * <li>SessionManagerDelivery: session operation log delivery.</li>
     * <li>InvocationDelivery: task execution log delivery.</li>
     * <li>AgentUpgradeConfig: Cloud Assistant Agent upgrade configuration.</li>
     * <li>SessionManagerConfig: Cloud Assistant SessionManager configuration.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SessionManagerDelivery</p>
     */
    @NameInMap("SettingType")
    public String settingType;

    /**
     * <p>The Simple Log Service (SLS) delivery configuration.</p>
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
         * <p>The list of time windows during which upgrades are allowed. The time can be specified down to the minute. The default time zone is UTC.</p>
         * <p>The interval between time windows cannot be less than 1 hour.</p>
         * <p>Format: Start time (HH:mm)-End time (HH:mm).</p>
         * <p>Example: [
         * &quot;02:00-03:00&quot;,
         * &quot;05:00-06:00&quot;
         * ]
         * This indicates that upgrades are allowed daily from 02:00 to 03:00 and from 05:00 to 06:00 in the UTC time zone.</p>
         */
        @NameInMap("AllowedUpgradeWindow")
        public java.util.List<String> allowedUpgradeWindow;

        /**
         * <p>Specifies whether the Cloud Assistant Agent checks for updates and performs an upgrade immediately upon startup. Default value: true.</p>
         * <p>This parameter takes effect only when the Cloud Assistant Agent version meets the following minimum requirements:</p>
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
         * <p>Specifies whether to prevent the Cloud Assistant Agent from checking for and performing updates. Default value: false.</p>
         * <p>This parameter takes effect only when the Cloud Assistant Agent version meets the following minimum requirements:</p>
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
         * <p>Specifies whether to enable the custom Agent upgrade configuration. If this parameter is set to false, the system attempts to upgrade the Agent every 30 minutes by default.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time zone for the allowed upgrade time windows. Default value: UTC.
         * The time zone can be specified in the following formats:</p>
         * <ul>
         * <li>Full time zone name, such as Asia/Shanghai or America/Los_Angeles.</li>
         * <li>GMT offset from Greenwich Mean Time, such as GMT+8:00 or GMT-7:00. Leading zeros are not supported for the hour value.</li>
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
         * <p>The ID of the customer master key (CMK) when the encryption method is set to KMS.</p>
         * 
         * <strong>example:</strong>
         * <p>a807****7a70e</p>
         */
        @NameInMap("EncryptionKeyId")
        public String encryptionKeyId;

        /**
         * <p>The OSS encryption method. Valid values:</p>
         * <ul>
         * <li>Inherit: inherits the encryption method of the bucket.</li>
         * <li>OssManaged: OSS-managed encryption.</li>
         * <li>KMS: Key Management Service (KMS) encryption.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inherit</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The directory prefix of the OSS bucket. The following limits apply:</p>
         * <ul>
         * <li>The prefix cannot exceed 254 characters in length.</li>
         * <li>The prefix cannot start with a forward slash (/) or a backslash (\).</li>
         * </ul>
         * <blockquote>
         * <p>Note: Set this parameter to an empty string (&quot;&quot;) if no directory prefix is required. If a prefix was previously configured and is no longer needed, set this parameter to an empty string (&quot;&quot;) to clear it.</p>
         * </blockquote>
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
         * <p>The maximum CPU usage allowed for the Cloud Assistant Agent main process.</p>
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
         * <p>Specifies whether to retain the script file in the Cloud Assistant directory after command execution is complete.
         * Default value: false.</p>
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
         * <p>The maximum size of a single Cloud Assistant log file. You must specify the unit (B|KB|MB).</p>
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
         * <p>The maximum memory usage allowed for the Cloud Assistant Agent main process. You must specify the unit (B|KB|MB).</p>
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
         * <p>The maximum number of consecutive times that CPU or memory resources usage can exceed the limit before the Cloud Assistant Agent automatically stops running.</p>
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
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Note:</p>
         * <ul>
         * <li>Enabling or disabling the session feature takes effect across all regions.</li>
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
         * <p>Specifies whether to enable delivery to SLS.
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
