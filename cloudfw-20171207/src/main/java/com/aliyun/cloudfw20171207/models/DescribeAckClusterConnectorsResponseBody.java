// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterConnectorsResponseBody extends TeaModel {
    @NameInMap("AckClusterConnectors")
    public java.util.List<DescribeAckClusterConnectorsResponseBodyAckClusterConnectors> ackClusterConnectors;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>E7F333E0-7B70-54DA-A307-4B2B49DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>f9b9815a5280****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>TestClusterA</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("ConnectorHealthCheckStatus")
        public String connectorHealthCheckStatus;

        /**
         * <strong>example:</strong>
         * <p>connector-7ff4df316c9a458d****</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ConnectorName")
        public String connectorName;

        /**
         * <strong>example:</strong>
         * <p>ready</p>
         */
        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        /**
         * <strong>example:</strong>
         * <p>1760493347</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("GroupUuids")
        public java.util.List<String> groupUuids;

        /**
         * <strong>example:</strong>
         * <p>159663371500****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <strong>example:</strong>
         * <p>vsw-2ze2gtlfozrab01cfo****</p>
         */
        @NameInMap("PrimaryVswitchId")
        public String primaryVswitchId;

        /**
         * <strong>example:</strong>
         * <p>10.100.2.XXX</p>
         */
        @NameInMap("PrimaryVswitchIp")
        public String primaryVswitchIp;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
        @NameInMap("PrimaryVswitchZoneId")
        public String primaryVswitchZoneId;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>vsw-2zerfbbje7dvnbii2****</p>
         */
        @NameInMap("StandbyVswitchId")
        public String standbyVswitchId;

        /**
         * <strong>example:</strong>
         * <p>10.100.1.XXX</p>
         */
        @NameInMap("StandbyVswitchIp")
        public String standbyVswitchIp;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        @NameInMap("StandbyVswitchZoneId")
        public String standbyVswitchZoneId;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        @NameInMap("UnhealthyReason")
        public String unhealthyReason;

        /**
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
