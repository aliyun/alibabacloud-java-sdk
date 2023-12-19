// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeClientsResponseBody extends TeaModel {
    /**
     * <p>The backup clients.</p>
     */
    @NameInMap("Clients")
    public DescribeClientsResponseBodyClients clients;

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
     * <p>The number of entries returned per page. Valid values: 1 to 99. Default value: 10.</p>
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
     * <p>The total number of returned entries.</p>
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
         * <p>The alert settings. Valid value: INHERITED, which indicates that the backup client sends alert notifications in the same way as the backup vault.</p>
         */
        @NameInMap("AlertSetting")
        public String alertSetting;

        /**
         * <p>The ID of the backup client.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The name of the backup client.</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        /**
         * <p>The type of the backup client. Valid value:**ECS_AGENT**, which indicates an SAP HANA backup client.</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The version number of the backup client.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The ID of the SAP HANA instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The time when the backup client was created.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ECS instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The maximum version number of the backup client.</p>
         */
        @NameInMap("MaxVersion")
        public String maxVersion;

        /**
         * <p>The network type. Valid values:</p>
         * <br>
         * <p>*   **CLASSIC**: classic network</p>
         * <p>*   **VPC**: virtual private cloud (VPC)</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The status of the backup client. Valid values:</p>
         * <br>
         * <p>*   **REGISTERED**: The backup client is registered.</p>
         * <p>*   **ACTIVATED**: The backup client is enabled.</p>
         * <p>*   **DEACTIVATED**: The backup client fails to be enabled.</p>
         * <p>*   **INSTALLING**: The backup client is being installed.</p>
         * <p>*   **INSTALL_FAILED**: The backup client fails to be installed.</p>
         * <p>*   **NOT_INSTALLED**: The backup client is not installed.</p>
         * <p>*   **UPGRADING**: The backup client is being upgraded.</p>
         * <p>*   **UPGRADE_FAILED**: The backup client fails to be upgraded.</p>
         * <p>*   **UNINSTALLING**: The backup client is being uninstalled.</p>
         * <p>*   **UNINSTALL_FAILED**: The backup client fails to be uninstalled.</p>
         * <p>*   **STOPPED**: The backup client is out of service.</p>
         * <p>*   **UNKNOWN**: The backup client is disconnected.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status information.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The time when the backup client was updated. This value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>Indicates whether data is transmitted over HTTPS. Valid values:</p>
         * <br>
         * <p>*   true: Data is transmitted over HTTPS.</p>
         * <p>*   false: Data is transmitted over HTTP.</p>
         */
        @NameInMap("UseHttps")
        public Boolean useHttps;

        /**
         * <p>The ID of the backup vault.</p>
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
