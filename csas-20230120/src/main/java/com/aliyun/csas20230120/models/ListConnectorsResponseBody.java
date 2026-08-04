// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListConnectorsResponseBody extends TeaModel {
    /**
     * <p>A list of connectors.</p>
     */
    @NameInMap("Connectors")
    public java.util.List<ListConnectorsResponseBodyConnectors> connectors;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of connectors.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsResponseBody self = new ListConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectorsResponseBody setConnectors(java.util.List<ListConnectorsResponseBodyConnectors> connectors) {
        this.connectors = connectors;
        return this;
    }
    public java.util.List<ListConnectorsResponseBodyConnectors> getConnectors() {
        return this.connectors;
    }

    public ListConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectorsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListConnectorsResponseBodyConnectorsApplications extends TeaModel {
        /**
         * <p>The private access application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The private access application name.</p>
         * 
         * <strong>example:</strong>
         * <p>application_name</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        public static ListConnectorsResponseBodyConnectorsApplications build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyConnectorsApplications self = new ListConnectorsResponseBodyConnectorsApplications();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyConnectorsApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListConnectorsResponseBodyConnectorsApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

    }

    public static class ListConnectorsResponseBodyConnectorsConnectorClients extends TeaModel {
        /**
         * <p>The connection status between the connector client and connector server.</p>
         * 
         * <strong>example:</strong>
         * <p>Disconnected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The unique device ID of the connector client.</p>
         * 
         * <strong>example:</strong>
         * <p>C50A2386-F851-4F11-920B-DF7148DA0C22</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <p>The hostname of the connector client.</p>
         * 
         * <strong>example:</strong>
         * <p>connector_client</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The public IP address of the connector client.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.1</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        public static ListConnectorsResponseBodyConnectorsConnectorClients build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyConnectorsConnectorClients self = new ListConnectorsResponseBodyConnectorsConnectorClients();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyConnectorsConnectorClients setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListConnectorsResponseBodyConnectorsConnectorClients setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public ListConnectorsResponseBodyConnectorsConnectorClients setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListConnectorsResponseBodyConnectorsConnectorClients setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

    }

    public static class ListConnectorsResponseBodyConnectorsUpgradeTime extends TeaModel {
        /**
         * <p>The end time of the upgrade window.</p>
         * 
         * <strong>example:</strong>
         * <p>23:00</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start time of the upgrade window.</p>
         * 
         * <strong>example:</strong>
         * <p>20:00</p>
         */
        @NameInMap("Start")
        public String start;

        public static ListConnectorsResponseBodyConnectorsUpgradeTime build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyConnectorsUpgradeTime self = new ListConnectorsResponseBodyConnectorsUpgradeTime();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyConnectorsUpgradeTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public ListConnectorsResponseBodyConnectorsUpgradeTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class ListConnectorsResponseBodyConnectors extends TeaModel {
        /**
         * <p>Indicates whether global acceleration is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Global acceleration is enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Global acceleration is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("AccelerateStatus")
        public String accelerateStatus;

        /**
         * <p>A list of associated private access applications.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListConnectorsResponseBodyConnectorsApplications> applications;

        /**
         * <p>The cluster IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("ClusterIP")
        public String clusterIP;

        /**
         * <p>The cluster port.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("ClusterPort")
        public String clusterPort;

        /**
         * <p>A list of deployed connector clients.</p>
         */
        @NameInMap("ConnectorClients")
        public java.util.List<ListConnectorsResponseBodyConnectorsConnectorClients> connectorClients;

        /**
         * <p>The connector ID.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-94db94e06b98****</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <p>The time the connector was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-27 18:10:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The connector name.</p>
         * 
         * <strong>example:</strong>
         * <p>connector_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The connection status of the connector. Valid values:</p>
         * <ul>
         * <li><p><strong>Online</strong>: The connector is online.</p>
         * </li>
         * <li><p><strong>Offline</strong>: The connector is offline.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status of the connector instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: The connector is enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: The connector is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("SwitchStatus")
        public String switchStatus;

        /**
         * <p>The upgrade window for the connector.</p>
         */
        @NameInMap("UpgradeTime")
        public ListConnectorsResponseBodyConnectorsUpgradeTime upgradeTime;

        @NameInMap("VipCidr")
        public String vipCidr;

        public static ListConnectorsResponseBodyConnectors build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyConnectors self = new ListConnectorsResponseBodyConnectors();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyConnectors setAccelerateStatus(String accelerateStatus) {
            this.accelerateStatus = accelerateStatus;
            return this;
        }
        public String getAccelerateStatus() {
            return this.accelerateStatus;
        }

        public ListConnectorsResponseBodyConnectors setApplications(java.util.List<ListConnectorsResponseBodyConnectorsApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListConnectorsResponseBodyConnectorsApplications> getApplications() {
            return this.applications;
        }

        public ListConnectorsResponseBodyConnectors setClusterIP(String clusterIP) {
            this.clusterIP = clusterIP;
            return this;
        }
        public String getClusterIP() {
            return this.clusterIP;
        }

        public ListConnectorsResponseBodyConnectors setClusterPort(String clusterPort) {
            this.clusterPort = clusterPort;
            return this;
        }
        public String getClusterPort() {
            return this.clusterPort;
        }

        public ListConnectorsResponseBodyConnectors setConnectorClients(java.util.List<ListConnectorsResponseBodyConnectorsConnectorClients> connectorClients) {
            this.connectorClients = connectorClients;
            return this;
        }
        public java.util.List<ListConnectorsResponseBodyConnectorsConnectorClients> getConnectorClients() {
            return this.connectorClients;
        }

        public ListConnectorsResponseBodyConnectors setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public ListConnectorsResponseBodyConnectors setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListConnectorsResponseBodyConnectors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConnectorsResponseBodyConnectors setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListConnectorsResponseBodyConnectors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListConnectorsResponseBodyConnectors setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public ListConnectorsResponseBodyConnectors setUpgradeTime(ListConnectorsResponseBodyConnectorsUpgradeTime upgradeTime) {
            this.upgradeTime = upgradeTime;
            return this;
        }
        public ListConnectorsResponseBodyConnectorsUpgradeTime getUpgradeTime() {
            return this.upgradeTime;
        }

        public ListConnectorsResponseBodyConnectors setVipCidr(String vipCidr) {
            this.vipCidr = vipCidr;
            return this;
        }
        public String getVipCidr() {
            return this.vipCidr;
        }

    }

}
