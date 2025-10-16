// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateAckClusterConnectorResponseBody extends TeaModel {
    @NameInMap("AckClusterConnector")
    public UpdateAckClusterConnectorResponseBodyAckClusterConnector ackClusterConnector;

    /**
     * <strong>example:</strong>
     * <p>5D16AADE-DA2E-5CAB-AA3B-AA197D97****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAckClusterConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterConnectorResponseBody self = new UpdateAckClusterConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterConnectorResponseBody setAckClusterConnector(UpdateAckClusterConnectorResponseBodyAckClusterConnector ackClusterConnector) {
        this.ackClusterConnector = ackClusterConnector;
        return this;
    }
    public UpdateAckClusterConnectorResponseBodyAckClusterConnector getAckClusterConnector() {
        return this.ackClusterConnector;
    }

    public UpdateAckClusterConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAckClusterConnectorResponseBodyAckClusterConnector extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c57ecf39ff32c415e8549a7df27a7e947</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>ack-cluster-name</p>
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
         * <p>ac-7c1bad6c3cc84c33baab</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <strong>example:</strong>
         * <p>ack-cluster-connector-name</p>
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
         * <p>1724982259</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>135809047715****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <strong>example:</strong>
         * <p>vsw-2zerfbbje7dvnbii2****</p>
         */
        @NameInMap("PrimaryVswitchId")
        public String primaryVswitchId;

        /**
         * <strong>example:</strong>
         * <p>10.100.1.1</p>
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
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>vsw-2ze2gtlfozrab01cfo****</p>
         */
        @NameInMap("StandbyVswitchId")
        public String standbyVswitchId;

        /**
         * <strong>example:</strong>
         * <p>10.100.2.1</p>
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

        /**
         * <strong>example:</strong>
         * <p>vpc-j6cvhdscntzuvr0x****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateAckClusterConnectorResponseBodyAckClusterConnector build(java.util.Map<String, ?> map) throws Exception {
            UpdateAckClusterConnectorResponseBodyAckClusterConnector self = new UpdateAckClusterConnectorResponseBodyAckClusterConnector();
            return TeaModel.build(map, self);
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setConnectorHealthCheckStatus(String connectorHealthCheckStatus) {
            this.connectorHealthCheckStatus = connectorHealthCheckStatus;
            return this;
        }
        public String getConnectorHealthCheckStatus() {
            return this.connectorHealthCheckStatus;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setConnectorName(String connectorName) {
            this.connectorName = connectorName;
            return this;
        }
        public String getConnectorName() {
            return this.connectorName;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setConnectorStatus(String connectorStatus) {
            this.connectorStatus = connectorStatus;
            return this;
        }
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setPrimaryVswitchId(String primaryVswitchId) {
            this.primaryVswitchId = primaryVswitchId;
            return this;
        }
        public String getPrimaryVswitchId() {
            return this.primaryVswitchId;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setPrimaryVswitchIp(String primaryVswitchIp) {
            this.primaryVswitchIp = primaryVswitchIp;
            return this;
        }
        public String getPrimaryVswitchIp() {
            return this.primaryVswitchIp;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setPrimaryVswitchZoneId(String primaryVswitchZoneId) {
            this.primaryVswitchZoneId = primaryVswitchZoneId;
            return this;
        }
        public String getPrimaryVswitchZoneId() {
            return this.primaryVswitchZoneId;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setStandbyVswitchId(String standbyVswitchId) {
            this.standbyVswitchId = standbyVswitchId;
            return this;
        }
        public String getStandbyVswitchId() {
            return this.standbyVswitchId;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setStandbyVswitchIp(String standbyVswitchIp) {
            this.standbyVswitchIp = standbyVswitchIp;
            return this;
        }
        public String getStandbyVswitchIp() {
            return this.standbyVswitchIp;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setStandbyVswitchZoneId(String standbyVswitchZoneId) {
            this.standbyVswitchZoneId = standbyVswitchZoneId;
            return this;
        }
        public String getStandbyVswitchZoneId() {
            return this.standbyVswitchZoneId;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public UpdateAckClusterConnectorResponseBodyAckClusterConnector setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
