// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterConnectorsResponseBody extends TeaModel {
    /**
     * <p>The list of ACK cluster connectors.</p>
     */
    @NameInMap("AckClusterConnectors")
    public java.util.List<DescribeAckClusterConnectorsResponseBodyAckClusterConnectors> ackClusterConnectors;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>E7F333E0-7B70-54DA-A307-4B2B49DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAckClusterConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClusterConnectorsResponseBody self = new DescribeAckClusterConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAckClusterConnectorsResponseBody setAckClusterConnectors(java.util.List<DescribeAckClusterConnectorsResponseBodyAckClusterConnectors> ackClusterConnectors) {
        this.ackClusterConnectors = ackClusterConnectors;
        return this;
    }
    public java.util.List<DescribeAckClusterConnectorsResponseBodyAckClusterConnectors> getAckClusterConnectors() {
        return this.ackClusterConnectors;
    }

    public DescribeAckClusterConnectorsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeAckClusterConnectorsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAckClusterConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAckClusterConnectorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAckClusterConnectorsResponseBodyAckClusterConnectors extends TeaModel {
        /**
         * <p>The ACK cluster ID. You can call the following operation to obtain the value:</p>
         * <ul>
         * <li><a href="~~DescribeAckClusters~~">DescribeAckClusters</a>: Queries a list of ACK clusters in batches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>f9b9815a5280****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>TestClusterA</p>
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
         * <p>The ID of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-7c1bad6c3cc84c33baab</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <p>The name of the ACK cluster connector. The name must be 1 to 64 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
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
         * <p>1760493347</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The list of address book UUIDs created on the ACK cluster connector.</p>
         */
        @NameInMap("GroupUuids")
        public java.util.List<String> groupUuids;

        /**
         * <p>The Alibaba Cloud UID of the account to which the ACK cluster resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>159663371500****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The primary vSwitch of the ACK cluster connector. You can call the following operation to obtain the value:</p>
         * <ul>
         * <li><a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a>: Queries the list of synchronization node vSwitches in batches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze2gtlfozrab01cfo****</p>
         */
        @NameInMap("PrimaryVswitchId")
        public String primaryVswitchId;

        /**
         * <p>The IP address of the primary vSwitch of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>10.100.2.XXX</p>
         */
        @NameInMap("PrimaryVswitchIp")
        public String primaryVswitchIp;

        /**
         * <p>The zone of the primary vSwitch of the ACK cluster connector. You can call the following operation to obtain the value:</p>
         * <ul>
         * <li><a href="~~DescribeAccessInstanceZoneList~~">DescribeAccessInstanceZoneList</a>: Queries the list of synchronization node vSwitch zones in batches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
        @NameInMap("PrimaryVswitchZoneId")
        public String primaryVswitchZoneId;

        /**
         * <p>The region ID of the ACK cluster connector. You can call the following operation to obtain the value:</p>
         * <ul>
         * <li><a href="~~DescribeAccessInstanceRegionList~~">DescribeAccessInstanceRegionList</a>: Queries the list of synchronization node regions.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about the regions supported by ACK cluster connectors in Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/2865120.html">ACK cluster synchronization nodes</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The standby vSwitch of the ACK cluster connector. You can call the following operation to obtain the value:</p>
         * <ul>
         * <li><a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a>: Queries the list of synchronization node vSwitches in batches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zerfbbje7dvnbii2****</p>
         */
        @NameInMap("StandbyVswitchId")
        public String standbyVswitchId;

        /**
         * <p>The IP address of the standby vSwitch of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>10.100.1.XXX</p>
         */
        @NameInMap("StandbyVswitchIp")
        public String standbyVswitchIp;

        /**
         * <p>The zone of the standby vSwitch of the ACK cluster connector. You can call the following operation to obtain the value:</p>
         * <ul>
         * <li><a href="~~DescribeAccessInstanceZoneList~~">DescribeAccessInstanceZoneList</a>: Queries the list of synchronization node vSwitch zones in batches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        @NameInMap("StandbyVswitchZoneId")
        public String standbyVswitchZoneId;

        /**
         * <p>The container synchronization cycle of the ACK cluster connector.</p>
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

        public static DescribeAckClusterConnectorsResponseBodyAckClusterConnectors build(java.util.Map<String, ?> map) throws Exception {
            DescribeAckClusterConnectorsResponseBodyAckClusterConnectors self = new DescribeAckClusterConnectorsResponseBodyAckClusterConnectors();
            return TeaModel.build(map, self);
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setConnectorHealthCheckStatus(String connectorHealthCheckStatus) {
            this.connectorHealthCheckStatus = connectorHealthCheckStatus;
            return this;
        }
        public String getConnectorHealthCheckStatus() {
            return this.connectorHealthCheckStatus;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setConnectorName(String connectorName) {
            this.connectorName = connectorName;
            return this;
        }
        public String getConnectorName() {
            return this.connectorName;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setConnectorStatus(String connectorStatus) {
            this.connectorStatus = connectorStatus;
            return this;
        }
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setGroupUuids(java.util.List<String> groupUuids) {
            this.groupUuids = groupUuids;
            return this;
        }
        public java.util.List<String> getGroupUuids() {
            return this.groupUuids;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setPrimaryVswitchId(String primaryVswitchId) {
            this.primaryVswitchId = primaryVswitchId;
            return this;
        }
        public String getPrimaryVswitchId() {
            return this.primaryVswitchId;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setPrimaryVswitchIp(String primaryVswitchIp) {
            this.primaryVswitchIp = primaryVswitchIp;
            return this;
        }
        public String getPrimaryVswitchIp() {
            return this.primaryVswitchIp;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setPrimaryVswitchZoneId(String primaryVswitchZoneId) {
            this.primaryVswitchZoneId = primaryVswitchZoneId;
            return this;
        }
        public String getPrimaryVswitchZoneId() {
            return this.primaryVswitchZoneId;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setStandbyVswitchId(String standbyVswitchId) {
            this.standbyVswitchId = standbyVswitchId;
            return this;
        }
        public String getStandbyVswitchId() {
            return this.standbyVswitchId;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setStandbyVswitchIp(String standbyVswitchIp) {
            this.standbyVswitchIp = standbyVswitchIp;
            return this;
        }
        public String getStandbyVswitchIp() {
            return this.standbyVswitchIp;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setStandbyVswitchZoneId(String standbyVswitchZoneId) {
            this.standbyVswitchZoneId = standbyVswitchZoneId;
            return this;
        }
        public String getStandbyVswitchZoneId() {
            return this.standbyVswitchZoneId;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setUnhealthyReason(String unhealthyReason) {
            this.unhealthyReason = unhealthyReason;
            return this;
        }
        public String getUnhealthyReason() {
            return this.unhealthyReason;
        }

        public DescribeAckClusterConnectorsResponseBodyAckClusterConnectors setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
