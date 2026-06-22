// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterConnectorResponseBody extends TeaModel {
    /**
     * <p>The ACK cluster connector.</p>
     */
    @NameInMap("AckClusterConnector")
    public DescribeAckClusterConnectorResponseBodyAckClusterConnector ackClusterConnector;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>45E2E720-D2B4-506F-B682-1FCBE971****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAckClusterConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClusterConnectorResponseBody self = new DescribeAckClusterConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAckClusterConnectorResponseBody setAckClusterConnector(DescribeAckClusterConnectorResponseBodyAckClusterConnector ackClusterConnector) {
        this.ackClusterConnector = ackClusterConnector;
        return this;
    }
    public DescribeAckClusterConnectorResponseBodyAckClusterConnector getAckClusterConnector() {
        return this.ackClusterConnector;
    }

    public DescribeAckClusterConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAckClusterConnectorResponseBodyAckClusterConnector extends TeaModel {
        /**
         * <p>The ID of the ACK cluster. You can obtain the value from:</p>
         * <ul>
         * <li><a href="~~DescribeAckClusters~~">DescribeAckClusters</a>: Lists ACK clusters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>c857d908016794125883a9ee8196cba17</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-cluster-name</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The health check status of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("ConnectorHealthCheckStatus")
        public String connectorHealthCheckStatus;

        /**
         * <p>The ID of the ACK cluster connector. You can obtain the value from:</p>
         * <ul>
         * <li><a href="~~DescribeAckClusterConnectors~~">DescribeAckClusterConnectors</a>: Lists ACK cluster connectors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ac-7c1bad6c3cc84c33baab</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <p>The name of the ACK cluster connector. The name is 1 to 64 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>ack-cluster-connector-name</p>
         */
        @NameInMap("ConnectorName")
        public String connectorName;

        /**
         * <p>The instance status of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        /**
         * <p>The timestamp when the ACK cluster connector was created. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1724982259</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The Alibaba Cloud UID of the account to which the ACK cluster resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>135809047715****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The primary vSwitch of the ACK cluster connector. You can obtain the value from:</p>
         * <ul>
         * <li><a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a>: Lists vSwitches of synchronization nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zerfbbje7dvnbii2****</p>
         */
        @NameInMap("PrimaryVswitchId")
        public String primaryVswitchId;

        /**
         * <p>The IP address of the primary vSwitch of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>10.100.1.1</p>
         */
        @NameInMap("PrimaryVswitchIp")
        public String primaryVswitchIp;

        /**
         * <p>The zone of the primary vSwitch of the ACK cluster connector. You can obtain the value from:</p>
         * <ul>
         * <li><a href="~~DescribeAccessInstanceZoneList~~">DescribeAccessInstanceZoneList</a>: Lists zones of synchronization node vSwitches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
        @NameInMap("PrimaryVswitchZoneId")
        public String primaryVswitchZoneId;

        /**
         * <p>The region ID of the ACK cluster connector. You can obtain the value from:</p>
         * <ul>
         * <li><a href="~~DescribeAccessInstanceRegionList~~">DescribeAccessInstanceRegionList</a>: Queries the list of synchronization node regions.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about the regions supported by ACK cluster connectors in Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/2865120.html">ACK cluster synchronization nodes</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The standby vSwitch of the ACK cluster connector. You can obtain the value from:</p>
         * <ul>
         * <li><a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a>: Lists vSwitches of synchronization nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze2gtlfozrab01cfo****</p>
         */
        @NameInMap("StandbyVswitchId")
        public String standbyVswitchId;

        /**
         * <p>The IP address of the standby vSwitch of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>10.100.2.1</p>
         */
        @NameInMap("StandbyVswitchIp")
        public String standbyVswitchIp;

        /**
         * <p>The zone of the standby vSwitch of the ACK cluster connector. You can obtain the value from:</p>
         * <ul>
         * <li><a href="~~DescribeAccessInstanceZoneList~~">DescribeAccessInstanceZoneList</a>: Lists zones of synchronization node vSwitches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        @NameInMap("StandbyVswitchZoneId")
        public String standbyVswitchZoneId;

        /**
         * <p>The synchronization interval of the ACK cluster connector. Valid values: 2 to 60. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The reason why the ACK cluster connector is unhealthy.</p>
         * 
         * <strong>example:</strong>
         * <p>The ACK cluster status is unavailable.</p>
         */
        @NameInMap("UnhealthyReason")
        public String unhealthyReason;

        /**
         * <p>The instance ID of the VPC-connected instance to which the ACK cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-j6cvhdscntzuvr0x****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeAckClusterConnectorResponseBodyAckClusterConnector build(java.util.Map<String, ?> map) throws Exception {
            DescribeAckClusterConnectorResponseBodyAckClusterConnector self = new DescribeAckClusterConnectorResponseBodyAckClusterConnector();
            return TeaModel.build(map, self);
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setConnectorHealthCheckStatus(String connectorHealthCheckStatus) {
            this.connectorHealthCheckStatus = connectorHealthCheckStatus;
            return this;
        }
        public String getConnectorHealthCheckStatus() {
            return this.connectorHealthCheckStatus;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setConnectorName(String connectorName) {
            this.connectorName = connectorName;
            return this;
        }
        public String getConnectorName() {
            return this.connectorName;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setConnectorStatus(String connectorStatus) {
            this.connectorStatus = connectorStatus;
            return this;
        }
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setPrimaryVswitchId(String primaryVswitchId) {
            this.primaryVswitchId = primaryVswitchId;
            return this;
        }
        public String getPrimaryVswitchId() {
            return this.primaryVswitchId;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setPrimaryVswitchIp(String primaryVswitchIp) {
            this.primaryVswitchIp = primaryVswitchIp;
            return this;
        }
        public String getPrimaryVswitchIp() {
            return this.primaryVswitchIp;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setPrimaryVswitchZoneId(String primaryVswitchZoneId) {
            this.primaryVswitchZoneId = primaryVswitchZoneId;
            return this;
        }
        public String getPrimaryVswitchZoneId() {
            return this.primaryVswitchZoneId;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setStandbyVswitchId(String standbyVswitchId) {
            this.standbyVswitchId = standbyVswitchId;
            return this;
        }
        public String getStandbyVswitchId() {
            return this.standbyVswitchId;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setStandbyVswitchIp(String standbyVswitchIp) {
            this.standbyVswitchIp = standbyVswitchIp;
            return this;
        }
        public String getStandbyVswitchIp() {
            return this.standbyVswitchIp;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setStandbyVswitchZoneId(String standbyVswitchZoneId) {
            this.standbyVswitchZoneId = standbyVswitchZoneId;
            return this;
        }
        public String getStandbyVswitchZoneId() {
            return this.standbyVswitchZoneId;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setUnhealthyReason(String unhealthyReason) {
            this.unhealthyReason = unhealthyReason;
            return this;
        }
        public String getUnhealthyReason() {
            return this.unhealthyReason;
        }

        public DescribeAckClusterConnectorResponseBodyAckClusterConnector setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
