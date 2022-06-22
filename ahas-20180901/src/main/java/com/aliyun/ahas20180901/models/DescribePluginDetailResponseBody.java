// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribePluginDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePluginDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribePluginDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginDetailResponseBody self = new DescribePluginDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePluginDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePluginDetailResponseBody setData(DescribePluginDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePluginDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribePluginDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePluginDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePluginDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePluginDetailResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ConfigurationId")
        public String configurationId;

        @NameInMap("ConnectTime")
        public Long connectTime;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("InstallMode")
        public String installMode;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("PluginStatus")
        public Integer pluginStatus;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("Upgrade")
        public Boolean upgrade;

        @NameInMap("UpgradeVersion")
        public String upgradeVersion;

        @NameInMap("Version")
        public String version;

        public static DescribePluginDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginDetailResponseBodyData self = new DescribePluginDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePluginDetailResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribePluginDetailResponseBodyData setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public DescribePluginDetailResponseBodyData setConnectTime(Long connectTime) {
            this.connectTime = connectTime;
            return this;
        }
        public Long getConnectTime() {
            return this.connectTime;
        }

        public DescribePluginDetailResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribePluginDetailResponseBodyData setInstallMode(String installMode) {
            this.installMode = installMode;
            return this;
        }
        public String getInstallMode() {
            return this.installMode;
        }

        public DescribePluginDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePluginDetailResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePluginDetailResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribePluginDetailResponseBodyData setPluginStatus(Integer pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public Integer getPluginStatus() {
            return this.pluginStatus;
        }

        public DescribePluginDetailResponseBodyData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public DescribePluginDetailResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribePluginDetailResponseBodyData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribePluginDetailResponseBodyData setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public DescribePluginDetailResponseBodyData setUpgradeVersion(String upgradeVersion) {
            this.upgradeVersion = upgradeVersion;
            return this;
        }
        public String getUpgradeVersion() {
            return this.upgradeVersion;
        }

        public DescribePluginDetailResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
