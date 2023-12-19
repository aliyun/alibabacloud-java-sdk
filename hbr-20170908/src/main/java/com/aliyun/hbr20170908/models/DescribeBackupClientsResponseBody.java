// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsResponseBody extends TeaModel {
    /**
     * <p>The HBR clients.</p>
     */
    @NameInMap("Clients")
    public java.util.List<DescribeBackupClientsResponseBodyClients> clients;

    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned HBR clients that meet the specified conditions.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeBackupClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupClientsResponseBody self = new DescribeBackupClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupClientsResponseBody setClients(java.util.List<DescribeBackupClientsResponseBodyClients> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<DescribeBackupClientsResponseBodyClients> getClients() {
        return this.clients;
    }

    public DescribeBackupClientsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBackupClientsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBackupClientsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupClientsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupClientsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupClientsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackupClientsResponseBodyClientsSettings extends TeaModel {
        @NameInMap("AlertOnPartialComplete")
        public Boolean alertOnPartialComplete;

        /**
         * <p>The type of the endpoint on the data plane. Valid values:</p>
         * <br>
         * <p>*   **PUBLIC**: Internet</p>
         * <p>*   **VPC**: virtual private cloud (VPC)</p>
         * <p>*   **CLASSIC**: classic network</p>
         */
        @NameInMap("DataNetworkType")
        public String dataNetworkType;

        /**
         * <p>The proxy configuration on the data plane. Valid values:</p>
         * <br>
         * <p>*   **DISABLE**: The proxy is not used.</p>
         * <p>*   \*\*USE_CONTROL_PROXY \*\* (default value): The configuration is the same as that on the control plane.</p>
         * <p>*   **CUSTOM**: The configuration is customized (HTTP).</p>
         */
        @NameInMap("DataProxySetting")
        public String dataProxySetting;

        /**
         * <p>The number of CPU cores used by a single backup job. The value 0 indicates that the number is unlimited.</p>
         */
        @NameInMap("MaxCpuCore")
        public String maxCpuCore;

        @NameInMap("MaxMemory")
        public Long maxMemory;

        /**
         * <p>The number of concurrent backup jobs. The value 0 indicates that the number is unlimited.</p>
         */
        @NameInMap("MaxWorker")
        public String maxWorker;

        /**
         * <p>The custom host IP address of the proxy server on the data plane.</p>
         */
        @NameInMap("ProxyHost")
        public String proxyHost;

        /**
         * <p>The custom password of the proxy server on the data plane.</p>
         */
        @NameInMap("ProxyPassword")
        public String proxyPassword;

        /**
         * <p>The custom host port of the proxy server on the data plane.</p>
         */
        @NameInMap("ProxyPort")
        public Integer proxyPort;

        /**
         * <p>The custom username of the proxy server on the data plane.</p>
         */
        @NameInMap("ProxyUser")
        public String proxyUser;

        /**
         * <p>Indicates whether data on the data plane is transmitted over HTTPS. Valid values:</p>
         * <br>
         * <p>*   true: Data is transmitted over HTTPS.</p>
         * <p>*   false: Data is transmitted over HTTP.</p>
         */
        @NameInMap("UseHttps")
        public String useHttps;

        public static DescribeBackupClientsResponseBodyClientsSettings build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupClientsResponseBodyClientsSettings self = new DescribeBackupClientsResponseBodyClientsSettings();
            return TeaModel.build(map, self);
        }

        public DescribeBackupClientsResponseBodyClientsSettings setAlertOnPartialComplete(Boolean alertOnPartialComplete) {
            this.alertOnPartialComplete = alertOnPartialComplete;
            return this;
        }
        public Boolean getAlertOnPartialComplete() {
            return this.alertOnPartialComplete;
        }

        public DescribeBackupClientsResponseBodyClientsSettings setDataNetworkType(String dataNetworkType) {
            this.dataNetworkType = dataNetworkType;
            return this;
        }
        public String getDataNetworkType() {
            return this.dataNetworkType;
        }

        public DescribeBackupClientsResponseBodyClientsSettings setDataProxySetting(String dataProxySetting) {
            this.dataProxySetting = dataProxySetting;
            return this;
        }
        public String getDataProxySetting() {
            return this.dataProxySetting;
        }

        public DescribeBackupClientsResponseBodyClientsSettings setMaxCpuCore(String maxCpuCore) {
            this.maxCpuCore = maxCpuCore;
            return this;
        }
        public String getMaxCpuCore() {
            return this.maxCpuCore;
        }

        public DescribeBackupClientsResponseBodyClientsSettings setMaxMemory(Long maxMemory) {
            this.maxMemory = maxMemory;
            return this;
        }
        public Long getMaxMemory() {
            return this.maxMemory;
        }

        public DescribeBackupClientsResponseBodyClientsSettings setMaxWorker(String maxWorker) {
            this.maxWorker = maxWorker;
            return this;
        }
        public String getMaxWorker() {
            return this.maxWorker;
        }

        public DescribeBackupClientsResponseBodyClientsSettings setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
            return this;
        }
        public String getProxyHost() {
            return this.proxyHost;
        }

        public DescribeBackupClientsResponseBodyClientsSettings setProxyPassword(String proxyPassword) {
            this.proxyPassword = proxyPassword;
            return this;
        }
        public String getProxyPassword() {
            return this.proxyPassword;
        }

        public DescribeBackupClientsResponseBodyClientsSettings setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
            return this;
        }
        public Integer getProxyPort() {
            return this.proxyPort;
        }

        public DescribeBackupClientsResponseBodyClientsSettings setProxyUser(String proxyUser) {
            this.proxyUser = proxyUser;
            return this;
        }
        public String getProxyUser() {
            return this.proxyUser;
        }

        public DescribeBackupClientsResponseBodyClientsSettings setUseHttps(String useHttps) {
            this.useHttps = useHttps;
            return this;
        }
        public String getUseHttps() {
            return this.useHttps;
        }

    }

    public static class DescribeBackupClientsResponseBodyClientsTags extends TeaModel {
        /**
         * <p>The tag key of the backup vault. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>*   The tag key cannot start with `aliyun` or `acs:`.</p>
         * <p>*   The tag key cannot contain `http://` or `https://`.</p>
         * <p>*   The tag key cannot be an empty string.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the backup vault. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>*   The tag value cannot start with `aliyun` or `acs:`.</p>
         * <p>*   The tag value cannot contain `http://` or `https://`.</p>
         * <p>*   The tag value cannot be an empty string.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeBackupClientsResponseBodyClientsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupClientsResponseBodyClientsTags self = new DescribeBackupClientsResponseBodyClientsTags();
            return TeaModel.build(map, self);
        }

        public DescribeBackupClientsResponseBodyClientsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupClientsResponseBodyClientsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeBackupClientsResponseBodyClients extends TeaModel {
        /**
         * <p>Indicates whether the HBR client is installed on an all-in-one PC that integrates hardware and monitoring program. Valid values:</p>
         * <br>
         * <p>*   true: The HBR client is installed on an all-in-one PC that integrates hardware and monitoring program.</p>
         * <p>*   false: The HBR client is not installed on an all-in-one PC that integrates hardware and monitoring program.</p>
         */
        @NameInMap("Appliance")
        public Boolean appliance;

        /**
         * <p>This parameter is valid only if the **ClientType** parameter is set to **ECS_CLIENT**. This parameter indicates the system architecture where the HBR client resides. Valid values:</p>
         * <br>
         * <p>*   **amd64**</p>
         * <p>*   **386**</p>
         */
        @NameInMap("ArchType")
        public String archType;

        /**
         * <p>The protection status of the HBR client. Valid values:</p>
         * <br>
         * <p>*   **UNPROTECTED**: The HBR client is not protected.</p>
         * <p>*   **PROTECTED**: The HBR client is protected.</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The ID of the HBR client.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The type of the HBR client. Valid value: **ECS_CLIENT**, which indicates an HBR client for ECS file backup.</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The version number of the HBR client.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The time when the HBR client was created. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The hostname of the HBR client.</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The ID of the instance.</p>
         * <br>
         * <p>*   If the HBR client is used to back up ECS files, this parameter indicates the ID of an ECS instance.</p>
         * <p>*   If the HBR client is used to back up on-premises files, this parameter indicates the hardware fingerprint that is generated based on the system information.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is valid only if the **ClientType** parameter is set to **ECS_CLIENT**. This parameter indicates the name of the ECS instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The last heartbeat time of the HBR client. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("LastHeartBeatTime")
        public Long lastHeartBeatTime;

        /**
         * <p>The latest version number of the HBR client.</p>
         */
        @NameInMap("MaxClientVersion")
        public String maxClientVersion;

        /**
         * <p>This parameter is valid only if the **ClientType** parameter is set to **ECS_CLIENT**. This parameter indicates the operating system type of the HBR client. Valid values:</p>
         * <br>
         * <p>*   **windows**</p>
         * <p>*   **linux**</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>This parameter is valid only if the **ClientType** parameter is set to **ECS_CLIENT**. This parameter indicates the internal IP address of the ECS instance.</p>
         */
        @NameInMap("PrivateIpV4")
        public String privateIpV4;

        /**
         * <p>The configuration information of the HBR client.</p>
         */
        @NameInMap("Settings")
        public DescribeBackupClientsResponseBodyClientsSettings settings;

        /**
         * <p>The status of the HBR client. Valid values:</p>
         * <br>
         * <p>*   **REGISTERED**: The HBR client is registered.</p>
         * <p>*   **ACTIVATED**: The HBR client is enabled.</p>
         * <p>*   **DEACTIVATED**: The HBR client fails to be enabled.</p>
         * <p>*   **INSTALLING**: The HBR client is being installed.</p>
         * <p>*   **INSTALL_FAILED**: The HBR client fails to be installed.</p>
         * <p>*   **NOT_INSTALLED**: The HBR client is not installed.</p>
         * <p>*   **UPGRADING**: The HBR client is being upgraded.</p>
         * <p>*   **UPGRADE_FAILED**: The HBR client fails to be upgraded.</p>
         * <p>*   **UNINSTALLING**: The HBR client is being uninstalled.</p>
         * <p>*   **UNINSTALL_FAILED**: The HBR client fails to be uninstalled.</p>
         * <p>*   **STOPPED**: The HBR client is out of service.</p>
         * <p>*   **UNKNOWN**: The HBR client is disconnected.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag information.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeBackupClientsResponseBodyClientsTags> tags;

        /**
         * <p>The time when the HBR client was updated. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>This parameter is valid only if the **ClientType** parameter is set to **ECS_CLIENT**. This parameter indicates the zone of the HBR client.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeBackupClientsResponseBodyClients build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupClientsResponseBodyClients self = new DescribeBackupClientsResponseBodyClients();
            return TeaModel.build(map, self);
        }

        public DescribeBackupClientsResponseBodyClients setAppliance(Boolean appliance) {
            this.appliance = appliance;
            return this;
        }
        public Boolean getAppliance() {
            return this.appliance;
        }

        public DescribeBackupClientsResponseBodyClients setArchType(String archType) {
            this.archType = archType;
            return this;
        }
        public String getArchType() {
            return this.archType;
        }

        public DescribeBackupClientsResponseBodyClients setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeBackupClientsResponseBodyClients setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeBackupClientsResponseBodyClients setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribeBackupClientsResponseBodyClients setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeBackupClientsResponseBodyClients setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeBackupClientsResponseBodyClients setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeBackupClientsResponseBodyClients setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBackupClientsResponseBodyClients setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeBackupClientsResponseBodyClients setLastHeartBeatTime(Long lastHeartBeatTime) {
            this.lastHeartBeatTime = lastHeartBeatTime;
            return this;
        }
        public Long getLastHeartBeatTime() {
            return this.lastHeartBeatTime;
        }

        public DescribeBackupClientsResponseBodyClients setMaxClientVersion(String maxClientVersion) {
            this.maxClientVersion = maxClientVersion;
            return this;
        }
        public String getMaxClientVersion() {
            return this.maxClientVersion;
        }

        public DescribeBackupClientsResponseBodyClients setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeBackupClientsResponseBodyClients setPrivateIpV4(String privateIpV4) {
            this.privateIpV4 = privateIpV4;
            return this;
        }
        public String getPrivateIpV4() {
            return this.privateIpV4;
        }

        public DescribeBackupClientsResponseBodyClients setSettings(DescribeBackupClientsResponseBodyClientsSettings settings) {
            this.settings = settings;
            return this;
        }
        public DescribeBackupClientsResponseBodyClientsSettings getSettings() {
            return this.settings;
        }

        public DescribeBackupClientsResponseBodyClients setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupClientsResponseBodyClients setTags(java.util.List<DescribeBackupClientsResponseBodyClientsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeBackupClientsResponseBodyClientsTags> getTags() {
            return this.tags;
        }

        public DescribeBackupClientsResponseBodyClients setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeBackupClientsResponseBodyClients setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
