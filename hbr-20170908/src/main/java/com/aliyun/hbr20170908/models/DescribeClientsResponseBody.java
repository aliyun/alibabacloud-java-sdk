// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeClientsResponseBody extends TeaModel {
    /**
     * <p>The Cloud Backup clients.</p>
     */
    @NameInMap("Clients")
    public DescribeClientsResponseBodyClients clients;

    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
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
     * <p>17189276-465D-5EF3-8FFD-0FF51B5A41A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientsResponseBody self = new DescribeClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientsResponseBody setClients(DescribeClientsResponseBodyClients clients) {
        this.clients = clients;
        return this;
    }
    public DescribeClientsResponseBodyClients getClients() {
        return this.clients;
    }

    public DescribeClientsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeClientsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeClientsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClientsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClientsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeClientsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeClientsResponseBodyClientsClient extends TeaModel {
        /**
         * <p>The alert settings. Valid value: INHERITED, which indicates that the Cloud Backup client sends alert notifications by using the same method configured for the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>INHERITED</p>
         */
        @NameInMap("AlertSetting")
        public String alertSetting;

        /**
         * <p>The ID of the Cloud Backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>c-00062uu******2fgj</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client name.</p>
         * 
         * <strong>example:</strong>
         * <p>client-20211224-101226</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        /**
         * <p>The type of the Cloud Backup client. Valid value: <strong>ECS_AGENT</strong>, which indicates an SAP HANA backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_AGENT</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The version number of the Cloud Backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.11.16</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The ID of the SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-0008c48frr******ncpk</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The time when the Cloud Backup client was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("HeartBeatTime")
        public Long heartBeatTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9b6wya******n8yo</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>swh-hbr</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The maximum version number of the Cloud Backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.11.23</p>
         */
        @NameInMap("MaxVersion")
        public String maxVersion;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC</strong>: the classic network</li>
         * <li><strong>VPC</strong>: the virtual private cloud (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The status of the Cloud Backup client. Valid values:</p>
         * <ul>
         * <li><strong>REGISTERED</strong>: The backup client is registered.</li>
         * <li><strong>ACTIVATED</strong>: The backup client is activated.</li>
         * <li><strong>DEACTIVATED</strong>: The backup client fails to be activated.</li>
         * <li><strong>INSTALLING</strong>: The backup client is being installed.</li>
         * <li><strong>INSTALL_FAILED</strong>: The backup client fails to be installed.</li>
         * <li><strong>NOT_INSTALLED</strong>: The backup client is not installed.</li>
         * <li><strong>UPGRADING</strong>: The backup client is being upgraded.</li>
         * <li><strong>UPGRADE_FAILED</strong>: The backup client fails to be upgraded.</li>
         * <li><strong>UNINSTALLING</strong>: The backup client is being uninstalled.</li>
         * <li><strong>UNINSTALL_FAILED</strong>: The backup client fails to be uninstalled.</li>
         * <li><strong>STOPPED</strong>: The backup client is out of service.</li>
         * <li><strong>UNKNOWN</strong>: The backup client is disconnected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status information.</p>
         * 
         * <strong>example:</strong>
         * <p>HANA_NOT_SUPPORT</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The time when the Cloud Backup client was updated. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>Indicates whether data is transmitted over HTTPS. Valid values:</p>
         * <ul>
         * <li>true: Data is transmitted over HTTPS.</li>
         * <li>false: Data is transmitted over HTTP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseHttps")
        public Boolean useHttps;

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-00029mx6o******n85lg</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static DescribeClientsResponseBodyClientsClient build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientsResponseBodyClientsClient self = new DescribeClientsResponseBodyClientsClient();
            return TeaModel.build(map, self);
        }

        public DescribeClientsResponseBodyClientsClient setAlertSetting(String alertSetting) {
            this.alertSetting = alertSetting;
            return this;
        }
        public String getAlertSetting() {
            return this.alertSetting;
        }

        public DescribeClientsResponseBodyClientsClient setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeClientsResponseBodyClientsClient setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public DescribeClientsResponseBodyClientsClient setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribeClientsResponseBodyClientsClient setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeClientsResponseBodyClientsClient setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClientsResponseBodyClientsClient setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeClientsResponseBodyClientsClient setHeartBeatTime(Long heartBeatTime) {
            this.heartBeatTime = heartBeatTime;
            return this;
        }
        public Long getHeartBeatTime() {
            return this.heartBeatTime;
        }

        public DescribeClientsResponseBodyClientsClient setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClientsResponseBodyClientsClient setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeClientsResponseBodyClientsClient setMaxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }
        public String getMaxVersion() {
            return this.maxVersion;
        }

        public DescribeClientsResponseBodyClientsClient setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeClientsResponseBodyClientsClient setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClientsResponseBodyClientsClient setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public DescribeClientsResponseBodyClientsClient setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeClientsResponseBodyClientsClient setUseHttps(Boolean useHttps) {
            this.useHttps = useHttps;
            return this;
        }
        public Boolean getUseHttps() {
            return this.useHttps;
        }

        public DescribeClientsResponseBodyClientsClient setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

    public static class DescribeClientsResponseBodyClients extends TeaModel {
        @NameInMap("Client")
        public java.util.List<DescribeClientsResponseBodyClientsClient> client;

        public static DescribeClientsResponseBodyClients build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientsResponseBodyClients self = new DescribeClientsResponseBodyClients();
            return TeaModel.build(map, self);
        }

        public DescribeClientsResponseBodyClients setClient(java.util.List<DescribeClientsResponseBodyClientsClient> client) {
            this.client = client;
            return this;
        }
        public java.util.List<DescribeClientsResponseBodyClientsClient> getClient() {
            return this.client;
        }

    }

}
