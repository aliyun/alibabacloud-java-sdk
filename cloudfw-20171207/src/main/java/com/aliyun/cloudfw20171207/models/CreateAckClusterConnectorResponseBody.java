// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateAckClusterConnectorResponseBody extends TeaModel {
    @NameInMap("AckClusterConnector")
    public CreateAckClusterConnectorResponseBodyAckClusterConnector ackClusterConnector;

    /**
     * <strong>example:</strong>
     * <p>0DC783F1-B3A7-578D-8A63-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAckClusterConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAckClusterConnectorResponseBody self = new CreateAckClusterConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAckClusterConnectorResponseBody setAckClusterConnector(CreateAckClusterConnectorResponseBodyAckClusterConnector ackClusterConnector) {
        this.ackClusterConnector = ackClusterConnector;
        return this;
    }
    public CreateAckClusterConnectorResponseBodyAckClusterConnector getAckClusterConnector() {
        return this.ackClusterConnector;
    }

    public CreateAckClusterConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAckClusterConnectorResponseBodyAckClusterConnector extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10.40.32.240</p>
         */
        @NameInMap("AckClientHostIp")
        public String ackClientHostIp;

        /**
         * <strong>example:</strong>
         * <p>cb0f5640b1b2d404cad6ba21509d7847b</p>
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
         * <p>cn-hangzhou-g</p>
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
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("StandbyVswitchZoneId")
        public String standbyVswitchZoneId;

        /**
         * <strong>example:</strong>
         * <p>task-c92d4544ef7b6a42</p>
         */
        @NameInMap("TaskId")
        public String taskId;

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

        public static CreateAckClusterConnectorResponseBodyAckClusterConnector build(java.util.Map<String, ?> map) throws Exception {
            CreateAckClusterConnectorResponseBodyAckClusterConnector self = new CreateAckClusterConnectorResponseBodyAckClusterConnector();
            return TeaModel.build(map, self);
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setAckClientHostIp(String ackClientHostIp) {
            this.ackClientHostIp = ackClientHostIp;
            return this;
        }
        public String getAckClientHostIp() {
            return this.ackClientHostIp;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setConnectorHealthCheckStatus(String connectorHealthCheckStatus) {
            this.connectorHealthCheckStatus = connectorHealthCheckStatus;
            return this;
        }
        public String getConnectorHealthCheckStatus() {
            return this.connectorHealthCheckStatus;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setConnectorName(String connectorName) {
            this.connectorName = connectorName;
            return this;
        }
        public String getConnectorName() {
            return this.connectorName;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setConnectorStatus(String connectorStatus) {
            this.connectorStatus = connectorStatus;
            return this;
        }
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setPrimaryVswitchId(String primaryVswitchId) {
            this.primaryVswitchId = primaryVswitchId;
            return this;
        }
        public String getPrimaryVswitchId() {
            return this.primaryVswitchId;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setPrimaryVswitchIp(String primaryVswitchIp) {
            this.primaryVswitchIp = primaryVswitchIp;
            return this;
        }
        public String getPrimaryVswitchIp() {
            return this.primaryVswitchIp;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setPrimaryVswitchZoneId(String primaryVswitchZoneId) {
            this.primaryVswitchZoneId = primaryVswitchZoneId;
            return this;
        }
        public String getPrimaryVswitchZoneId() {
            return this.primaryVswitchZoneId;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setStandbyVswitchId(String standbyVswitchId) {
            this.standbyVswitchId = standbyVswitchId;
            return this;
        }
        public String getStandbyVswitchId() {
            return this.standbyVswitchId;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setStandbyVswitchIp(String standbyVswitchIp) {
            this.standbyVswitchIp = standbyVswitchIp;
            return this;
        }
        public String getStandbyVswitchIp() {
            return this.standbyVswitchIp;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setStandbyVswitchZoneId(String standbyVswitchZoneId) {
            this.standbyVswitchZoneId = standbyVswitchZoneId;
            return this;
        }
        public String getStandbyVswitchZoneId() {
            return this.standbyVswitchZoneId;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public CreateAckClusterConnectorResponseBodyAckClusterConnector setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
