// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeClientsResponseBody extends TeaModel {
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
        @NameInMap("AlertSetting")
        public String alertSetting;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientName")
        public String clientName;

        @NameInMap("ClientType")
        public String clientType;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("HeartBeatTime")
        public Long heartBeatTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("MaxVersion")
        public String maxVersion;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMessage")
        public String statusMessage;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        @NameInMap("UseHttps")
        public Boolean useHttps;

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
