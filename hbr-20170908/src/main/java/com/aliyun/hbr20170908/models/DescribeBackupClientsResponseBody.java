// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsResponseBody extends TeaModel {
    /**
     * <p>The list of backup clients.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Client\&quot;: []}</p>
     */
    @NameInMap("Clients")
    public java.util.List<DescribeBackupClientsResponseBodyClients> clients;

    /**
     * <p>The response code. 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message. The value &quot;successful&quot; is returned for successful requests. An error message is returned for failed requests.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Minimum value: 1. Maximum value: 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of backup clients that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
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
        /**
         * <p>Specifies whether to send alerts for partially completed jobs. This setting applies only to File Backup and ECS File Backup Essential Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AlertOnPartialComplete")
        public Boolean alertOnPartialComplete;

        /**
         * <p>The type of the data plane endpoint. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC</strong>: public network.</li>
         * <li><strong>VPC</strong>: VPC network.</li>
         * <li><strong>CLASSIC</strong>: classic network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("DataNetworkType")
        public String dataNetworkType;

        /**
         * <p>The data plane proxy setting. Valid values:</p>
         * <ul>
         * <li><strong>DISABLE</strong>: No proxy is used.</li>
         * <li><strong>USE_CONTROL_PROXY</strong> (default): The same configuration as the control plane is used.</li>
         * <li><strong>CUSTOM</strong>: A custom configuration is used (HTTP protocol).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USE_CONTROL_PROXY</p>
         */
        @NameInMap("DataProxySetting")
        public String dataProxySetting;

        /**
         * <p>The number of CPU cores used by a single backup job. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxCpuCore")
        public String maxCpuCore;

        /**
         * <p>The maximum memory that the client can use. Unit: bytes. Only versions 2.13.0 and later are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxMemory")
        public Long maxMemory;

        /**
         * <p>The number of concurrent workers for a single backup job. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxWorker")
        public String maxWorker;

        /**
         * <p>The IP address of the custom data plane proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.11.100</p>
         */
        @NameInMap("ProxyHost")
        public String proxyHost;

        /**
         * <p>The password of the custom data plane proxy server.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ProxyPassword")
        public String proxyPassword;

        /**
         * <p>The port of the custom data plane proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p>3128</p>
         */
        @NameInMap("ProxyPort")
        public Integer proxyPort;

        /**
         * <p>The username of the custom data plane proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("ProxyUser")
        public String proxyUser;

        /**
         * <p>Indicates whether HTTPS is used to transmit data plane data.</p>
         * <ul>
         * <li>true: HTTPS is used for transmission.</li>
         * <li>false: HTTP is used for transmission.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <ul>
         * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>. </li>
         * <li>The tag key cannot contain <code>http://</code> or <code>https://</code>.</li>
         * <li>The tag key cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the backup vault. Valid values of N: 1 to 20.</p>
         * <ul>
         * <li>The tag value cannot start with <code>aliyun</code> or <code>acs:</code>. </li>
         * <li>The tag value cannot contain <code>http://</code> or <code>https://</code>.</li>
         * <li>The tag value cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
         * <p>Indicates whether the client is a hardware monitoring appliance client.</p>
         * <ul>
         * <li>true: The client is a hardware monitoring appliance client.</li>
         * <li>false: The client is not a hardware monitoring appliance client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Appliance")
        public Boolean appliance;

        /**
         * <p>This parameter is valid only when <strong>ClientType</strong> is set to <strong>ECS_CLIENT</strong>. The system architecture of the backup client. Valid values:</p>
         * <ul>
         * <li><strong>amd64</strong></li>
         * <li><strong>386</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>amd64</p>
         */
        @NameInMap("ArchType")
        public String archType;

        /**
         * <p>The protection status of the backup client. Valid values:</p>
         * <ul>
         * <li><strong>UNPROTECTED</strong>: The server is not protected.</li>
         * <li><strong>PROTECTED</strong>: The server is protected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PROTECTED</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The ID of the backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>c-*********************</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The type of the backup client. The value <strong>ECS_CLIENT</strong> indicates an ECS File Backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_CLIENT</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The version number of the backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4.5</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The time when the backup client was created. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The hostname of the backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>hostname</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The instance ID.</p>
         * <ul>
         * <li>If the client type is ECS File Backup client, this parameter indicates the ECS instance ID.</li>
         * <li>If the client type is local file backup client, this parameter indicates the hardware fingerprint generated based on system information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-*********************</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is valid only when <strong>ClientType</strong> is set to <strong>ECS_CLIENT</strong>. The name of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instancename</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The time of the last heartbeat of the backup client. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("LastHeartBeatTime")
        public Long lastHeartBeatTime;

        /**
         * <p>The latest version number of the backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4.5</p>
         */
        @NameInMap("MaxClientVersion")
        public String maxClientVersion;

        /**
         * <p>This parameter is valid only when <strong>ClientType</strong> is set to <strong>ECS_CLIENT</strong>. The operating system type of the client. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong></li>
         * <li><strong>linux</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>This parameter is valid only when <strong>ClientType</strong> is set to <strong>ECS_CLIENT</strong>. The internal IP address of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("PrivateIpV4")
        public String privateIpV4;

        /**
         * <p>The configuration information of the backup client.</p>
         */
        @NameInMap("Settings")
        public DescribeBackupClientsResponseBodyClientsSettings settings;

        /**
         * <p>The status of the backup client. Valid values:</p>
         * <ul>
         * <li><strong>REGISTERED</strong>: The client is registered.</li>
         * <li><strong>ACTIVATED</strong>: The client is activated.</li>
         * <li><strong>DEACTIVATED</strong>: The client activation has expired.</li>
         * <li><strong>INSTALLING</strong>: The client is being installed.</li>
         * <li><strong>INSTALL_FAILED</strong>: The client installation failed.</li>
         * <li><strong>NOT_INSTALLED</strong>: The client is not installed.</li>
         * <li><strong>UPGRADING</strong>: The client is being upgraded.</li>
         * <li><strong>UPGRADE_FAILED</strong>: The client upgrade failed.</li>
         * <li><strong>UNINSTALLING</strong>: The client is being uninstalled.</li>
         * <li><strong>UNINSTALL_FAILED</strong>: The client uninstallation failed.</li>
         * <li><strong>STOPPED</strong>: The client service is stopped.</li>
         * <li><strong>UNKNOWN</strong>: The client is disconnected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag information.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeBackupClientsResponseBodyClientsTags> tags;

        /**
         * <p>The time when the backup client was last updated. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>This parameter is valid only when <strong>ClientType</strong> is set to <strong>ECS_CLIENT</strong>. The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-f</p>
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
