// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateConnectorClientResponseBody extends TeaModel {
    /**
     * <p>ConnectorClient。</p>
     */
    @NameInMap("ConnectorClient")
    public UpdateConnectorClientResponseBodyConnectorClient connectorClient;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConnectorClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectorClientResponseBody self = new UpdateConnectorClientResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConnectorClientResponseBody setConnectorClient(UpdateConnectorClientResponseBodyConnectorClient connectorClient) {
        this.connectorClient = connectorClient;
        return this;
    }
    public UpdateConnectorClientResponseBodyConnectorClient getConnectorClient() {
        return this.connectorClient;
    }

    public UpdateConnectorClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateConnectorClientResponseBodyConnectorClient extends TeaModel {
        /**
         * <p>The number of CPUs of the ConnectorClient.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("CPUSize")
        public String CPUSize;

        /**
         * <p>The connection status of the ConnectorClient. Valid values:</p>
         * <ul>
         * <li><strong>Connected</strong>: connected.</li>
         * <li><strong>Disconnected</strong>: disconnected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>ConnectorID。</p>
         * 
         * <strong>example:</strong>
         * <p>connector-94db94e06b98****</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <p>The time when the connector was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The unique identifier of the ConnectorClient device.</p>
         * 
         * <strong>example:</strong>
         * <p>E86266A0-2859-58EF-8F5B-EDE226FF6EB2</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>connector_client_hostname</p>
         */
        @NameInMap("Hosname")
        public String hosname;

        /**
         * <p>The kernel version of the ConnectorClient.</p>
         * 
         * <strong>example:</strong>
         * <p>22.3.0</p>
         */
        @NameInMap("KernelVersion")
        public String kernelVersion;

        /**
         * <p>The memory size of the ConnectorClient. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>32768</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <p>The O&amp;M status. Valid values:</p>
         * <ul>
         * <li><strong>Running</strong>: O&amp;M in progress.</li>
         * <li><strong>Failed</strong>: O&amp;M failed.</li>
         * <li>(empty string): not in O&amp;M status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("OperationStatus")
        public String operationStatus;

        /**
         * <p>The private IP address of the ConnectorClient.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The program runtime. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProcessRunTime")
        public Integer processRunTime;

        /**
         * <p>The public IP address of the ConnectorClient.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.1</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <p>The version number.</p>
         */
        @NameInMap("ReleaseNotes")
        public java.util.List<String> releaseNotes;

        /**
         * <p>The enabled status of the ConnectorClient, which can be used to force the client offline. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version status of the connector. Valid values:</p>
         * <ul>
         * <li><strong>Latest</strong>: the current version is the latest version.</li>
         * <li><strong>NewVersionAvailable</strong>: a newer version is available for upgrade.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Latest</p>
         */
        @NameInMap("UpgradeStatus")
        public String upgradeStatus;

        /**
         * <p>The blockchain version.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-02</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The version to roll back to.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("VersionToRollback")
        public String versionToRollback;

        public static UpdateConnectorClientResponseBodyConnectorClient build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectorClientResponseBodyConnectorClient self = new UpdateConnectorClientResponseBodyConnectorClient();
            return TeaModel.build(map, self);
        }

        public UpdateConnectorClientResponseBodyConnectorClient setCPUSize(String CPUSize) {
            this.CPUSize = CPUSize;
            return this;
        }
        public String getCPUSize() {
            return this.CPUSize;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setHosname(String hosname) {
            this.hosname = hosname;
            return this;
        }
        public String getHosname() {
            return this.hosname;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setKernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setProcessRunTime(Integer processRunTime) {
            this.processRunTime = processRunTime;
            return this;
        }
        public Integer getProcessRunTime() {
            return this.processRunTime;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setReleaseNotes(java.util.List<String> releaseNotes) {
            this.releaseNotes = releaseNotes;
            return this;
        }
        public java.util.List<String> getReleaseNotes() {
            return this.releaseNotes;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setUpgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateConnectorClientResponseBodyConnectorClient setVersionToRollback(String versionToRollback) {
            this.versionToRollback = versionToRollback;
            return this;
        }
        public String getVersionToRollback() {
            return this.versionToRollback;
        }

    }

}
