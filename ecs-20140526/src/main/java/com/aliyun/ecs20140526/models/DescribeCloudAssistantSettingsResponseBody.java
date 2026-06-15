// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantSettingsResponseBody extends TeaModel {
    /**
     * <p>The upgrade settings for the Cloud Assistant agent.</p>
     */
    @NameInMap("AgentUpgradeConfig")
    public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig agentUpgradeConfig;

    @NameInMap("OssDeliveryConfigs")
    public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs ossDeliveryConfigs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource usage settings for the Cloud Assistant agent.</p>
     */
    @NameInMap("ResourceUsageConfig")
    public DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig resourceUsageConfig;

    /**
     * <p>Configurations for the Session Manager feature.</p>
     */
    @NameInMap("SessionManagerConfig")
    public DescribeCloudAssistantSettingsResponseBodySessionManagerConfig sessionManagerConfig;

    @NameInMap("SlsDeliveryConfigs")
    public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs slsDeliveryConfigs;

    public static DescribeCloudAssistantSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudAssistantSettingsResponseBody self = new DescribeCloudAssistantSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudAssistantSettingsResponseBody setAgentUpgradeConfig(DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig agentUpgradeConfig) {
        this.agentUpgradeConfig = agentUpgradeConfig;
        return this;
    }
    public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig getAgentUpgradeConfig() {
        return this.agentUpgradeConfig;
    }

    public DescribeCloudAssistantSettingsResponseBody setOssDeliveryConfigs(DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs ossDeliveryConfigs) {
        this.ossDeliveryConfigs = ossDeliveryConfigs;
        return this;
    }
    public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs getOssDeliveryConfigs() {
        return this.ossDeliveryConfigs;
    }

    public DescribeCloudAssistantSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudAssistantSettingsResponseBody setResourceUsageConfig(DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig resourceUsageConfig) {
        this.resourceUsageConfig = resourceUsageConfig;
        return this;
    }
    public DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig getResourceUsageConfig() {
        return this.resourceUsageConfig;
    }

    public DescribeCloudAssistantSettingsResponseBody setSessionManagerConfig(DescribeCloudAssistantSettingsResponseBodySessionManagerConfig sessionManagerConfig) {
        this.sessionManagerConfig = sessionManagerConfig;
        return this;
    }
    public DescribeCloudAssistantSettingsResponseBodySessionManagerConfig getSessionManagerConfig() {
        return this.sessionManagerConfig;
    }

    public DescribeCloudAssistantSettingsResponseBody setSlsDeliveryConfigs(DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs slsDeliveryConfigs) {
        this.slsDeliveryConfigs = slsDeliveryConfigs;
        return this;
    }
    public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs getSlsDeliveryConfigs() {
        return this.slsDeliveryConfigs;
    }

    public static class DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows extends TeaModel {
        @NameInMap("AllowedUpgradeWindow")
        public java.util.List<String> allowedUpgradeWindow;

        public static DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows self = new DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows setAllowedUpgradeWindow(java.util.List<String> allowedUpgradeWindow) {
            this.allowedUpgradeWindow = allowedUpgradeWindow;
            return this;
        }
        public java.util.List<String> getAllowedUpgradeWindow() {
            return this.allowedUpgradeWindow;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig extends TeaModel {
        @NameInMap("AllowedUpgradeWindows")
        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows allowedUpgradeWindows;

        /**
         * <p>Indicates whether the Cloud Assistant agent checks for and applies updates upon startup.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BootstrapUpgrade")
        public Boolean bootstrapUpgrade;

        /**
         * <p>Indicates whether to prevent the Cloud Assistant agent from automatically updating.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisableUpgrade")
        public Boolean disableUpgrade;

        /**
         * <p>Indicates whether custom agent upgrade settings are enabled. If this parameter is not specified or is set to <code>false</code>, the system attempts to upgrade the agent every 30 minutes by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time zone of the allowed upgrade windows.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig self = new DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig setAllowedUpgradeWindows(DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows allowedUpgradeWindows) {
            this.allowedUpgradeWindows = allowedUpgradeWindows;
            return this;
        }
        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows getAllowedUpgradeWindows() {
            return this.allowedUpgradeWindows;
        }

        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig setBootstrapUpgrade(Boolean bootstrapUpgrade) {
            this.bootstrapUpgrade = bootstrapUpgrade;
            return this;
        }
        public Boolean getBootstrapUpgrade() {
            return this.bootstrapUpgrade;
        }

        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig setDisableUpgrade(Boolean disableUpgrade) {
            this.disableUpgrade = disableUpgrade;
            return this;
        }
        public Boolean getDisableUpgrade() {
            return this.disableUpgrade;
        }

        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("DeliveryType")
        public String deliveryType;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("EncryptionAlgorithm")
        public String encryptionAlgorithm;

        @NameInMap("EncryptionKeyId")
        public String encryptionKeyId;

        @NameInMap("EncryptionType")
        public String encryptionType;

        @NameInMap("Prefix")
        public String prefix;

        public static DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig self = new DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public String getDeliveryType() {
            return this.deliveryType;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        public String getEncryptionAlgorithm() {
            return this.encryptionAlgorithm;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setEncryptionKeyId(String encryptionKeyId) {
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }
        public String getEncryptionKeyId() {
            return this.encryptionKeyId;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs extends TeaModel {
        @NameInMap("OssDeliveryConfig")
        public java.util.List<DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig> ossDeliveryConfig;

        public static DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs self = new DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs setOssDeliveryConfig(java.util.List<DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig> ossDeliveryConfig) {
            this.ossDeliveryConfig = ossDeliveryConfig;
            return this;
        }
        public java.util.List<DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig> getOssDeliveryConfig() {
            return this.ossDeliveryConfig;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig extends TeaModel {
        /**
         * <p>The maximum CPU usage limit for the main process of the Cloud Assistant agent.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CpuLimit")
        public Integer cpuLimit;

        /**
         * <p>Indicates whether to retain the script file in the Cloud Assistant directory after a command invocation is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("KeepScriptFile")
        public Boolean keepScriptFile;

        /**
         * <p>The maximum number of Cloud Assistant log files to retain.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LogFileCountLimit")
        public Integer logFileCountLimit;

        /**
         * <p>The maximum size for a single Cloud Assistant log file.</p>
         * 
         * <strong>example:</strong>
         * <p>100MB</p>
         */
        @NameInMap("LogSizeLimit")
        public String logSizeLimit;

        /**
         * <p>The maximum memory usage limit for the main process of the Cloud Assistant agent.</p>
         * 
         * <strong>example:</strong>
         * <p>35MB</p>
         */
        @NameInMap("MemoryLimit")
        public String memoryLimit;

        /**
         * <p>The number of consecutive times CPU or memory usage can exceed the configured limits before the Cloud Assistant agent process is terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("OverloadLimit")
        public Integer overloadLimit;

        public static DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig self = new DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig setCpuLimit(Integer cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public Integer getCpuLimit() {
            return this.cpuLimit;
        }

        public DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig setKeepScriptFile(Boolean keepScriptFile) {
            this.keepScriptFile = keepScriptFile;
            return this;
        }
        public Boolean getKeepScriptFile() {
            return this.keepScriptFile;
        }

        public DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig setLogFileCountLimit(Integer logFileCountLimit) {
            this.logFileCountLimit = logFileCountLimit;
            return this;
        }
        public Integer getLogFileCountLimit() {
            return this.logFileCountLimit;
        }

        public DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig setLogSizeLimit(String logSizeLimit) {
            this.logSizeLimit = logSizeLimit;
            return this;
        }
        public String getLogSizeLimit() {
            return this.logSizeLimit;
        }

        public DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public DescribeCloudAssistantSettingsResponseBodyResourceUsageConfig setOverloadLimit(Integer overloadLimit) {
            this.overloadLimit = overloadLimit;
            return this;
        }
        public Integer getOverloadLimit() {
            return this.overloadLimit;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodySessionManagerConfig extends TeaModel {
        /**
         * <p>Indicates whether the Session Manager feature is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * <p><strong>Note</strong>:</p>
         * <ul>
         * <li>This setting takes effect in all regions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SessionManagerEnabled")
        public Boolean sessionManagerEnabled;

        public static DescribeCloudAssistantSettingsResponseBodySessionManagerConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodySessionManagerConfig self = new DescribeCloudAssistantSettingsResponseBodySessionManagerConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodySessionManagerConfig setSessionManagerEnabled(Boolean sessionManagerEnabled) {
            this.sessionManagerEnabled = sessionManagerEnabled;
            return this;
        }
        public Boolean getSessionManagerEnabled() {
            return this.sessionManagerEnabled;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig extends TeaModel {
        @NameInMap("DeliveryType")
        public String deliveryType;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("LogstoreName")
        public String logstoreName;

        @NameInMap("ProjectName")
        public String projectName;

        public static DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig self = new DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public String getDeliveryType() {
            return this.deliveryType;
        }

        public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs extends TeaModel {
        @NameInMap("SlsDeliveryConfig")
        public java.util.List<DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig> slsDeliveryConfig;

        public static DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs self = new DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs setSlsDeliveryConfig(java.util.List<DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig> slsDeliveryConfig) {
            this.slsDeliveryConfig = slsDeliveryConfig;
            return this;
        }
        public java.util.List<DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig> getSlsDeliveryConfig() {
            return this.slsDeliveryConfig;
        }

    }

}
