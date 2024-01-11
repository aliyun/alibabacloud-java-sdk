// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The information of the instance.</p>
     */
    @NameInMap("DBInstances")
    public DescribeDBInstanceAttributeResponseBodyDBInstances DBInstances;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setDBInstances(DescribeDBInstanceAttributeResponseBodyDBInstances DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBodyDBInstances getDBInstances() {
        return this.DBInstances;
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute extends TeaModel {
        /**
         * <p>The endpoint of the Configserver node.</p>
         */
        @NameInMap("ConnectString")
        public String connectString;

        /**
         * <p>The maximum number of connections to the Configserver node.</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum IOPS of the Configserver node.</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>The instance type of the Configserver node.</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The name of the Configserver node.</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The ID of the Configserver node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The storage capacity of the Configserver node. Unit: GB.</p>
         */
        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        /**
         * <p>The port number that is used to connect to the Configserver node.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The status of the Configserver node. For more information, see [Instance states](~~63870~~).</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setConnectString(String connectString) {
            this.connectString = connectString;
            return this;
        }
        public String getConnectString() {
            return this.connectString;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setNodeStorage(Integer nodeStorage) {
            this.nodeStorage = nodeStorage;
            return this;
        }
        public Integer getNodeStorage() {
            return this.nodeStorage;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList extends TeaModel {
        @NameInMap("ConfigserverAttribute")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute> configserverAttribute;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList setConfigserverAttribute(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute> configserverAttribute) {
            this.configserverAttribute = configserverAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute> getConfigserverAttribute() {
            return this.configserverAttribute;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute extends TeaModel {
        /**
         * <p>The endpoint of the mongos node.</p>
         */
        @NameInMap("ConnectSting")
        public String connectSting;

        /**
         * <p>The maximum number of connections to the mongos node.</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum IOPS of the mongos node.</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>The instance type of the mongos node.</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The name of the mongos node.</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The ID of the mongos node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The port number that is used to connect to the mongos node.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The status of the mongos node. For more information, see [Instance states](~~63870~~).</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The VPC ID of the instance.</p>
         * <br>
         * <p>>  This parameter is returned if the network type of the instance is VPC.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID of the instance.</p>
         * <br>
         * <p>>  This parameter is returned if the network type of the instance is VPC.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the mongos node.</p>
         */
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setConnectSting(String connectSting) {
            this.connectSting = connectSting;
            return this;
        }
        public String getConnectSting() {
            return this.connectSting;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList extends TeaModel {
        @NameInMap("MongosAttribute")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute> mongosAttribute;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList setMongosAttribute(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute> mongosAttribute) {
            this.mongosAttribute = mongosAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute> getMongosAttribute() {
            return this.mongosAttribute;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet extends TeaModel {
        /**
         * <p>The endpoint of the node.</p>
         */
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        /**
         * <p>The port number that is used to connect to the node.</p>
         */
        @NameInMap("ConnectionPort")
        public String connectionPort;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Classic**: classic network</p>
         * <p>*   **VPC**: VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The role of the node. Valid values:</p>
         * <br>
         * <p>*   **Primary**</p>
         * <p>*   **Secondary**</p>
         */
        @NameInMap("ReplicaSetRole")
        public String replicaSetRole;

        /**
         * <p>The instance ID.</p>
         * <br>
         * <p>>  This parameter is returned if the network type of the instance is VPC.</p>
         */
        @NameInMap("VPCCloudInstanceId")
        public String VPCCloudInstanceId;

        /**
         * <p>The VPC ID of the instance.</p>
         * <br>
         * <p>>  This parameter is returned if the network type of the instance is VPC.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID of the instance.</p>
         * <br>
         * <p>>  This parameter is returned if the network type of the instance is virtual private cloud (VPC).</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setConnectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setConnectionPort(String connectionPort) {
            this.connectionPort = connectionPort;
            return this;
        }
        public String getConnectionPort() {
            return this.connectionPort;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setReplicaSetRole(String replicaSetRole) {
            this.replicaSetRole = replicaSetRole;
            return this;
        }
        public String getReplicaSetRole() {
            return this.replicaSetRole;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setVPCCloudInstanceId(String VPCCloudInstanceId) {
            this.VPCCloudInstanceId = VPCCloudInstanceId;
            return this;
        }
        public String getVPCCloudInstanceId() {
            return this.VPCCloudInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets extends TeaModel {
        @NameInMap("ReplicaSet")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet> replicaSet;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets setReplicaSet(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet> replicaSet) {
            this.replicaSet = replicaSet;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet> getReplicaSet() {
            return this.replicaSet;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute extends TeaModel {
        /**
         * <p>The endpoint of the shard node.</p>
         */
        @NameInMap("ConnectString")
        public String connectString;

        /**
         * <p>The maximum number of connections to the shard node.</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum  MBPS of the shard node, Unit: MB/s.</p>
         */
        @NameInMap("MaxDiskMbps")
        public String maxDiskMbps;

        /**
         * <p>The maximum IOPS of the shard node.</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>The instance type of the shard node.</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The name of the shard node.</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The ID of the shard node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The storage capacity of the shard node. Unit: GB.</p>
         */
        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        /**
         * <p>The port number that is used to connect to the shard node.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The number of read-only nodes in the shard node. Valid values: **0** to **5**. The value must be an integer.</p>
         */
        @NameInMap("ReadonlyReplicas")
        public Integer readonlyReplicas;

        /**
         * <p>The status of the shard node. For more information, see [Instance states](~~63870~~).</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setConnectString(String connectString) {
            this.connectString = connectString;
            return this;
        }
        public String getConnectString() {
            return this.connectString;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setMaxDiskMbps(String maxDiskMbps) {
            this.maxDiskMbps = maxDiskMbps;
            return this;
        }
        public String getMaxDiskMbps() {
            return this.maxDiskMbps;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeStorage(Integer nodeStorage) {
            this.nodeStorage = nodeStorage;
            return this;
        }
        public Integer getNodeStorage() {
            return this.nodeStorage;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setReadonlyReplicas(Integer readonlyReplicas) {
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }
        public Integer getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList extends TeaModel {
        @NameInMap("ShardAttribute")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute> shardAttribute;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList setShardAttribute(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute> shardAttribute) {
            this.shardAttribute = shardAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute> getShardAttribute() {
            return this.shardAttribute;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTagsTag self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTagsTag> tag;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags setTag(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance extends TeaModel {
        /**
         * <p>Indicates whether performance burst is enabled for the ESSD AutoPL disk.</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The read and write throughput consumed by the instance.</p>
         */
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **PrePaid**: subscription</p>
         * <p>*   **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The information of the Configserver nodes.</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a sharded cluster instance.</p>
         */
        @NameInMap("ConfigserverList")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList configserverList;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The minor version of the current database in the instance.</p>
         */
        @NameInMap("CurrentKernelVersion")
        public String currentKernelVersion;

        /**
         * <p>The instance type of the instance.</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The status of the orders generated for the instance. Valid values:</p>
         * <br>
         * <p>*   **all_completed**: All orders are being produced or complete.</p>
         * <p>*   **order_unpaid**: The instance has unpaid orders.</p>
         * <p>*   **order_wait_for_produce**: Orders are being delivered for production.</p>
         * <br>
         * <p>>  The order production process includes the following steps: place an order, pay for an order, deliver an order for production, produce an order, and complete the production.</p>
         * <p>> *   If an order is in the **order_wait_for_produce** state for a long time, an error occurs when the order is being delivered for production. The system will automatically retry.</p>
         * <p>> *   The instance status changes only when the order is in the producing and complete state, such as changing configurations and running.</p>
         */
        @NameInMap("DBInstanceOrderStatus")
        public String DBInstanceOrderStatus;

        /**
         * <p>Indicates whether release protection is enabled for the instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("DBInstanceReleaseProtection")
        public Boolean DBInstanceReleaseProtection;

        /**
         * <p>The status of the instance. For more information, see [Instance states](~~63870~~).</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The storage capacity of the instance.</p>
         */
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <br>
         * <p>*   **replicate**: replica set instance</p>
         * <p>*   **sharding**: sharded cluster instance</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The time when the instance data was destroyed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The Key Management Service (KMS) key used for disk encryption.</p>
         */
        @NameInMap("EncryptionKey")
        public String encryptionKey;

        /**
         * <p>The database engine of the instance.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance.</p>
         * <br>
         * <p>*   **6.0**</p>
         * <p>*   **5.0**</p>
         * <p>*   **4.4**</p>
         * <p>*   **4.2**</p>
         * <p>*   **4.0**</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the subscription instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a subscription instance.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the secondary zone 2 of the instance. Valid values:</p>
         * <br>
         * <p>*   **cn-hangzhou-g**: Hangzhou Zone G</p>
         * <p>*   **cn-hangzhou-h**: Hangzhou Zone H</p>
         * <p>*   **cn-hangzhou-i**: Hangzhou Zone I</p>
         * <p>*   **cn-hongkong-b**: Hongkong Zone B</p>
         * <p>*   **cn-hongkong-c**: Hongkong Zone C</p>
         * <p>*   **cn-hongkong-d**: Hongkong Zone D</p>
         * <p>*   **cn-wulanchabu-a**: Ulanqab Zone A</p>
         * <p>*   **cn-wulanchabu-b**: Ulanqab Zone B</p>
         * <p>*   **cn-wulanchabu-c**: Ulanqab Zone C</p>
         * <p>*   **ap-southeast-1a**: Singapore Zone A</p>
         * <p>*   **ap-southeast-1b**: Singapore Zone B</p>
         * <p>*   **ap-southeast-1c**: Singapore Zone C</p>
         * <p>*   **ap-southeast-5a**: Jakarta Zone A</p>
         * <p>*   **ap-southeast-5b**: Jakarta Zone B</p>
         * <p>*   **ap-southeast-5c**: Jakarta Zone C</p>
         * <p>*   **eu-central-1a**: Frankfurt Zone A</p>
         * <p>*   **eu-central-1b**: Frankfurt Zone B</p>
         * <p>*   **eu-central-1c**: Frankfurt Zone C</p>
         * <br>
         * <p>> *   This parameter is returned if the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses multi-zone deployment.</p>
         * <p>> *   This parameter is returned only if you use the China site (aliyun.com).</p>
         */
        @NameInMap("HiddenZoneId")
        public String hiddenZoneId;

        /**
         * <p>The kind code of the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: physical machine</p>
         * <p>*   **1**: Elastic Compute Service (ECS) instance</p>
         * <p>*   **2**: Docker cluster</p>
         * <p>*   **18**: Kubernetes cluster</p>
         */
        @NameInMap("KindCode")
        public String kindCode;

        /**
         * <p>The date when the last downgrade operation was performed on the instance.</p>
         */
        @NameInMap("LastDowngradeTime")
        public String lastDowngradeTime;

        /**
         * <p>The lock status of the instance. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The instance is not locked.</p>
         * <p>*   **ManualLock**: The instance is manually locked.</p>
         * <p>*   **LockByExpiration**: The instance is automatically locked due to instance expiration.</p>
         * <p>*   **LockByRestoration**: The instance is automatically locked before the instance is rolled back.</p>
         * <p>*   **LockByDiskQuota**: The instance is automatically locked after the storage space is exhausted.</p>
         * <p>*   **Released**: The instance is released.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The end time of the maintenance window. The time follows the ISO 8601 standard in the *HH:mm*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window. The time follows the ISO 8601 standard in the *HH:mm*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The maximum number of connections to the instance.</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum IOPS of the instance.</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>The maximum MBPS of the instance, Unit: MB/s.</p>
         */
        @NameInMap("MaxMBPS")
        public Integer maxMBPS;

        /**
         * <p>The information of the mongos nodes.</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a sharded cluster instance.</p>
         */
        @NameInMap("MongosList")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList mongosList;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Classic**: classic network</p>
         * <p>*   **VPC**: VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The access protocol type of the instance. Valid values:</p>
         * <br>
         * <p>*   **mongodb**</p>
         * <p>*   **dynamodb**</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a sharded cluster instance.</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The provisioned performance of the ESSD AutoPL disk.</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The number of read-only nodes in the instance.</p>
         */
        @NameInMap("ReadonlyReplicas")
        public String readonlyReplicas;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The logical ID of the replica set instance.</p>
         * <br>
         * <p>>  ApsaraDB for MongoDB does not support new instances of this type. This parameter applies only to previous-version replica set instances.</p>
         */
        @NameInMap("ReplacateId")
        public String replacateId;

        /**
         * <p>The name of the replica set instance.</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a replica set instance.</p>
         */
        @NameInMap("ReplicaSetName")
        public String replicaSetName;

        /**
         * <p>The information of the replica set instance.</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a replica set instance.</p>
         */
        @NameInMap("ReplicaSets")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets replicaSets;

        /**
         * <p>The number of nodes in the instance.</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a replica set instance.</p>
         */
        @NameInMap("ReplicationFactor")
        public String replicationFactor;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * <br>
         * <p>>  This parameter is returned only if you use the China site (aliyun.com).</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the secondary zone 1 of the instance. Valid values:</p>
         * <br>
         * <p>*   **cn-hangzhou-g**: Hangzhou Zone G</p>
         * <p>*   **cn-hangzhou-h**: Hangzhou Zone H</p>
         * <p>*   **cn-hangzhou-i**: Hangzhou Zone I</p>
         * <p>*   **cn-hongkong-b**: Hongkong Zone B</p>
         * <p>*   **cn-hongkong-c**: Hongkong Zone C</p>
         * <p>*   **cn-hongkong-d**: Hongkong Zone D</p>
         * <p>*   **cn-wulanchabu-a**: Ulanqab Zone A</p>
         * <p>*   **cn-wulanchabu-b**: Ulanqab Zone B</p>
         * <p>*   **cn-wulanchabu-c**: Ulanqab Zone C</p>
         * <p>*   **ap-southeast-1a**: Singapore Zone A</p>
         * <p>*   **ap-southeast-1b**: Singapore Zone B</p>
         * <p>*   **ap-southeast-1c**: Singapore Zone C</p>
         * <p>*   **ap-southeast-5a**: Jakarta Zone A</p>
         * <p>*   **ap-southeast-5b**: Jakarta Zone B</p>
         * <p>*   **ap-southeast-5c**: Jakarta Zone C</p>
         * <p>*   **eu-central-1a**: Frankfurt Zone A</p>
         * <p>*   **eu-central-1b**: Frankfurt Zone B</p>
         * <p>*   **eu-central-1c**: Frankfurt Zone C</p>
         * <br>
         * <p>> *   This parameter is returned if the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses multi-zone deployment.</p>
         * <p>> *   This parameter is returned only if you use the China site (aliyun.com).</p>
         */
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        /**
         * <p>The information of the shard nodes.</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a sharded cluster instance.</p>
         */
        @NameInMap("ShardList")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList shardList;

        /**
         * <p>The storage engine of the instance.</p>
         */
        @NameInMap("StorageEngine")
        public String storageEngine;

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <br>
         * <p>**cloud_essd1**: ESSD PL1 **cloud_essd2**: ESSD PL2 **cloud_essd3**: ESSD PL3 **local_ssd**: local SSD **cloud_essd_dbfs_s**: DBFS disk</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The progress of data synchronization in percentage. When you are changing the configurations of the instance, you must synchronize the data of the instance. You can obtain the data synchronization progress based on the value returned for this parameter.</p>
         */
        @NameInMap("SyncPercent")
        public String syncPercent;

        /**
         * <p>The details of the instance tags.</p>
         */
        @NameInMap("Tags")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags tags;

        /**
         * <p>Indicates whether the cluster backup mode is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: The cluster backup mode is enabled.</p>
         * <p>*   **false**: The cluster backup mode is disabled.</p>
         */
        @NameInMap("UseClusterBackup")
        public Boolean useClusterBackup;

        /**
         * <p>The instance ID.</p>
         * <br>
         * <p>>  This parameter is returned if the network type of the instance is VPC.</p>
         */
        @NameInMap("VPCCloudInstanceIds")
        public String VPCCloudInstanceIds;

        /**
         * <p>The VPC ID of the instance.</p>
         * <br>
         * <p>>  This parameter is returned if the network type of the instance is VPC.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID of the instance.</p>
         * <br>
         * <p>>  This parameter is returned if the network type of the instance is VPC.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>Indicates whether password-free access within the VPC is enabled. Valid values:</p>
         * <br>
         * <p>*   **Open**: Password-free access within the VPC is enabled.</p>
         * <p>*   **Close**: Password-free access within the VPC is disabled, and you must use a password for access.</p>
         * <p>*   **NotSupport**: Password-free access within the VPC is not supported.</p>
         */
        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        /**
         * <p>The ID of the zone in which the instance resides.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setCapacityUnit(String capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setConfigserverList(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList configserverList) {
            this.configserverList = configserverList;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList getConfigserverList() {
            return this.configserverList;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setCurrentKernelVersion(String currentKernelVersion) {
            this.currentKernelVersion = currentKernelVersion;
            return this;
        }
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceOrderStatus(String DBInstanceOrderStatus) {
            this.DBInstanceOrderStatus = DBInstanceOrderStatus;
            return this;
        }
        public String getDBInstanceOrderStatus() {
            return this.DBInstanceOrderStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceReleaseProtection(Boolean DBInstanceReleaseProtection) {
            this.DBInstanceReleaseProtection = DBInstanceReleaseProtection;
            return this;
        }
        public Boolean getDBInstanceReleaseProtection() {
            return this.DBInstanceReleaseProtection;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setEncryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setHiddenZoneId(String hiddenZoneId) {
            this.hiddenZoneId = hiddenZoneId;
            return this;
        }
        public String getHiddenZoneId() {
            return this.hiddenZoneId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setKindCode(String kindCode) {
            this.kindCode = kindCode;
            return this;
        }
        public String getKindCode() {
            return this.kindCode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setLastDowngradeTime(String lastDowngradeTime) {
            this.lastDowngradeTime = lastDowngradeTime;
            return this;
        }
        public String getLastDowngradeTime() {
            return this.lastDowngradeTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMaxMBPS(Integer maxMBPS) {
            this.maxMBPS = maxMBPS;
            return this;
        }
        public Integer getMaxMBPS() {
            return this.maxMBPS;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMongosList(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList mongosList) {
            this.mongosList = mongosList;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList getMongosList() {
            return this.mongosList;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setReadonlyReplicas(String readonlyReplicas) {
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }
        public String getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setReplacateId(String replacateId) {
            this.replacateId = replacateId;
            return this;
        }
        public String getReplacateId() {
            return this.replacateId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setReplicaSetName(String replicaSetName) {
            this.replicaSetName = replicaSetName;
            return this;
        }
        public String getReplicaSetName() {
            return this.replicaSetName;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setReplicaSets(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets replicaSets) {
            this.replicaSets = replicaSets;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets getReplicaSets() {
            return this.replicaSets;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setReplicationFactor(String replicationFactor) {
            this.replicationFactor = replicationFactor;
            return this;
        }
        public String getReplicationFactor() {
            return this.replicationFactor;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setSecondaryZoneId(String secondaryZoneId) {
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setShardList(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList shardList) {
            this.shardList = shardList;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList getShardList() {
            return this.shardList;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setStorageEngine(String storageEngine) {
            this.storageEngine = storageEngine;
            return this;
        }
        public String getStorageEngine() {
            return this.storageEngine;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setSyncPercent(String syncPercent) {
            this.syncPercent = syncPercent;
            return this;
        }
        public String getSyncPercent() {
            return this.syncPercent;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setTags(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags getTags() {
            return this.tags;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setUseClusterBackup(Boolean useClusterBackup) {
            this.useClusterBackup = useClusterBackup;
            return this;
        }
        public Boolean getUseClusterBackup() {
            return this.useClusterBackup;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setVPCCloudInstanceIds(String VPCCloudInstanceIds) {
            this.VPCCloudInstanceIds = VPCCloudInstanceIds;
            return this;
        }
        public String getVPCCloudInstanceIds() {
            return this.VPCCloudInstanceIds;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setVpcAuthMode(String vpcAuthMode) {
            this.vpcAuthMode = vpcAuthMode;
            return this;
        }
        public String getVpcAuthMode() {
            return this.vpcAuthMode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstances extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance> DBInstance;

        public static DescribeDBInstanceAttributeResponseBodyDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstances self = new DescribeDBInstanceAttributeResponseBodyDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstances setDBInstance(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
