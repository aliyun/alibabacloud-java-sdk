// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    // Details of the instance.
    @NameInMap("DBInstances")
    public DescribeDBInstanceAttributeResponseBodyDBInstances DBInstances;

    // The ID of the request.
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
        // The endpoint of the Configserver node.
        @NameInMap("ConnectString")
        public String connectString;

        // The maximum number of connections to the Configserver node.
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        // The maximum IOPS of the Configserver node.
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        // The type of the Configserver node.
        @NameInMap("NodeClass")
        public String nodeClass;

        // The name of the Configserver node.
        @NameInMap("NodeDescription")
        public String nodeDescription;

        // The ID of the Configserver node.
        @NameInMap("NodeId")
        public String nodeId;

        // The storage capacity of the Configserver node.
        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        // The port number that is used to connect to the Configserver node.
        @NameInMap("Port")
        public Integer port;

        // The state of the Configserver node. For more information, see [Instance states](~~63870~~).
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
        // The endpoint of the mongos node.
        @NameInMap("ConnectSting")
        public String connectSting;

        // The maximum number of connections to the mongos node.
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        // The maximum IOPS of the mongos node.
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        // The type of the mongos node.
        @NameInMap("NodeClass")
        public String nodeClass;

        // The name of the mongos node.
        @NameInMap("NodeDescription")
        public String nodeDescription;

        // The ID of the mongos node.
        @NameInMap("NodeId")
        public String nodeId;

        // The port number that is used to connect to the mongos node.
        @NameInMap("Port")
        public Integer port;

        // The state of the mongos node. For more information, see [Instance states](~~63870~~).
        @NameInMap("Status")
        public String status;

        // The ID of the VPC.
        // 
        // >  This parameter is returned if the network type of the instance is VPC.
        @NameInMap("VPCId")
        public String VPCId;

        // The ID of the vSwitch.
        // 
        // >  This parameter is returned if the network type of the instance is VPC.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // The ID of the mongos node.
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
        // The endpoint of the node.
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        // The port number that is used to connect to the node.
        @NameInMap("ConnectionPort")
        public String connectionPort;

        // The network type of the instance. Valid values:
        // 
        // *   **Classic**: classic network
        // *   **VPC**: VPC
        @NameInMap("NetworkType")
        public String networkType;

        // The role of the node. Valid values:
        // 
        // *   **Primary**
        // *   **Secondary**
        @NameInMap("ReplicaSetRole")
        public String replicaSetRole;

        // The ID of the instance.
        // 
        // >  This parameter is returned if the network type of the instance is VPC.
        @NameInMap("VPCCloudInstanceId")
        public String VPCCloudInstanceId;

        // The ID of the VPC.
        // 
        // >  This parameter is returned if the network type of the instance is VPC.
        @NameInMap("VPCId")
        public String VPCId;

        // The ID of the vSwitch.
        // 
        // >  This parameter is returned if the network type of the instance is Virtual Private Cloud (VPC).
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
        // The endpoint of the shard node.
        @NameInMap("ConnectString")
        public String connectString;

        // The maximum number of connections to the shard node.
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        // The maximum IOPS of the shard node.
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        // The type of the shard node.
        @NameInMap("NodeClass")
        public String nodeClass;

        // The name of the shard node.
        @NameInMap("NodeDescription")
        public String nodeDescription;

        // The ID of the shard node.
        @NameInMap("NodeId")
        public String nodeId;

        // The storage capacity of the shard node.
        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        // The port number that is used to connect to the shard node.
        @NameInMap("Port")
        public Integer port;

        // The number of read-only nodes in the shard node. Valid values: **0** to **5**. The value must be an integer.
        @NameInMap("ReadonlyReplicas")
        public Integer readonlyReplicas;

        // The state of the shard node. For more information, see [Instance states](~~63870~~).
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
        // The tag key of the instance.
        @NameInMap("Key")
        public String key;

        // The tag value of the instance.
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
        // The I/O throughput consumed by the instance.
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        // The billing method of the instance. Valid values:
        // 
        // *   **PrePaid**: subscription
        // *   **PostPaid**: pay-as-you-go
        @NameInMap("ChargeType")
        public String chargeType;

        // Details of the Configserver nodes.
        // 
        // >  This parameter is returned if the instance is a sharded cluster instance.
        @NameInMap("ConfigserverList")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList configserverList;

        // The time when the instance was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The minor version of the current database in the instance.
        @NameInMap("CurrentKernelVersion")
        public String currentKernelVersion;

        // The instance type.
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        // The name of the instance.
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        // The ID of the instance.
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        // Indicates whether release protection is enabled for the instance. Valid values:
        // 
        // *   **true**: Release protection is enabled.
        // *   **false**: Release protection is disabled.
        @NameInMap("DBInstanceReleaseProtection")
        public Boolean DBInstanceReleaseProtection;

        // The state of the instance. For more information, see [Instance states](~~63870~~).
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        // The storage capacity of the instance.
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        // The architecture of the instance. Valid values:
        // 
        // *   **replicate**: replica set instance
        // *   **sharding**: sharded cluster instance
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        // The database engine of the instance.
        @NameInMap("Engine")
        public String engine;

        // The database engine version of the instance. Valid values:
        // 
        // *   **5.0**
        // *   **4.4**
        // *   **4.2**
        // *   **4.0**
        // *   **3.4**
        @NameInMap("EngineVersion")
        public String engineVersion;

        // The time when the subscription instance expires. The time is in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
        // 
        // >  This parameter is returned if the instance is a subscription instance.
        @NameInMap("ExpireTime")
        public String expireTime;

        // The ID of the secondary zone 2 of the instance. Valid values:
        // 
        // *   **cn-hangzhou-g**: Hangzhou Zone G
        // *   **cn-hangzhou-h**: Hangzhou Zone H
        // *   **cn-hangzhou-i**: Hangzhou Zone I
        // *   **cn-hongkong-b**: Hongkong Zone B
        // *   **cn-hongkong-c**: Hongkong Zone C
        // *   **cn-hongkong-d**: Hongkong Zone D
        // *   **cn-wulanchabu-a**: Ulanqab Zone A
        // *   **cn-wulanchabu-b**: Ulanqab Zone B
        // *   **cn-wulanchabu-c**: Ulanqab Zone C
        // *   **ap-southeast-1a**: Singapore Zone A
        // *   **ap-southeast-1b**: Singapore Zone B
        // *   **ap-southeast-1c**: Singapore Zone C
        // *   **ap-southeast-5a**: Jakarta Zone A
        // *   **ap-southeast-5b**: Jakarta Zone B
        // *   **ap-southeast-5c**: Jakarta Zone C
        // *   **eu-central-1a**: Frankfurt Zone A
        // *   **eu-central-1b**: Frankfurt Zone B
        // *   **eu-central-1c**: Frankfurt Zone C
        // 
        // > 
        // *   This parameter is returned if the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses multi-zone deployment.
        // *   This parameter is returned only if you use the Chine site (aliyun.com).
        @NameInMap("HiddenZoneId")
        public String hiddenZoneId;

        // The kind code of the instance. Valid values:
        // 
        // *   **0**: physical machine
        // *   **1**: Elastic Compute Service (ECS) instance
        // *   **2**: Docker cluster
        // *   **18**: Kubernetes cluster
        @NameInMap("KindCode")
        public String kindCode;

        // The date when the last downgrade operation was performed.
        @NameInMap("LastDowngradeTime")
        public String lastDowngradeTime;

        // The lock state of the instance. Valid values:
        // 
        // *   **Unlock**: The instance is not locked.
        // *   **ManualLock**: The instance is manually locked.
        // *   **LockByExpiration**: The instance is automatically locked due to instance expiration.
        // *   **LockByRestoration**: The instance is automatically locked before it is rolled back.
        // *   **LockByDiskQuota**: The instance is automatically locked due to exhausted storage capacity.
        // *   **Released**: The instance is released.
        @NameInMap("LockMode")
        public String lockMode;

        // The end time of the maintenance window of the instance.
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        // The start time of the maintenance window. The time is in the *HH:mm*Z format. The time is displayed in UTC.
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        // The maximum number of connections to the instance.
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        // The maximum IOPS of the instance.
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        // Details of the mongos nodes.
        // 
        // >  This parameter is returned if the instance is a sharded cluster instance.
        @NameInMap("MongosList")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList mongosList;

        // The network type of the instance. Valid values:
        // 
        // *   **Classic**: classic network
        // *   **VPC**: VPC
        @NameInMap("NetworkType")
        public String networkType;

        // The access protocol type of the instance. Valid values:
        // 
        // - **mongodb**: the MongoDB protocol
        // - **dynamodb**: the DynamoDB protocol
        // 
        // >  This parameter is returned if the instance is a sharded cluster instance.
        @NameInMap("ProtocolType")
        public String protocolType;

        // The number of read-only nodes in the instance.
        @NameInMap("ReadonlyReplicas")
        public String readonlyReplicas;

        // The region ID of the instance.
        @NameInMap("RegionId")
        public String regionId;

        // The logical ID of the replica instance. 
        // 
        // >  ApsaraDB for MongoDB does not support new instances of this type. This parameter applies only to previous-version replica instances.
        @NameInMap("ReplacateId")
        public String replacateId;

        // The name of the replica set instance.
        // 
        // >  This parameter is returned if the instance is a replica set instance.
        @NameInMap("ReplicaSetName")
        public String replicaSetName;

        // Details of the replica set instance.
        // 
        // >  This parameter is returned if the instance is a replica set instance.
        @NameInMap("ReplicaSets")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets replicaSets;

        // The number of nodes in the instance.
        // 
        // >  This parameter is returned if the instance is a replica set instance.
        @NameInMap("ReplicationFactor")
        public String replicationFactor;

        // The ID of the resource group. 
        // 
        // >  This parameter is returned only if you use the Chine site (aliyun.com).
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The ID of the secondary zone 1 of the instance. Valid values:
        // 
        // *   **cn-hangzhou-g**: Hangzhou Zone G
        // *   **cn-hangzhou-h**: Hangzhou Zone H
        // *   **cn-hangzhou-i**: Hangzhou Zone I
        // *   **cn-hongkong-b**: Hongkong Zone B
        // *   **cn-hongkong-c**: Hongkong Zone C
        // *   **cn-hongkong-d**: Hongkong Zone D
        // *   **cn-wulanchabu-a**: Ulanqab Zone A
        // *   **cn-wulanchabu-b**: Ulanqab Zone B
        // *   **cn-wulanchabu-c**: Ulanqab Zone C
        // *   **ap-southeast-1a**: Singapore Zone A
        // *   **ap-southeast-1b**: Singapore Zone B
        // *   **ap-southeast-1c**: Singapore Zone C
        // *   **ap-southeast-5a**: Jakarta Zone A
        // *   **ap-southeast-5b**: Jakarta Zone B
        // *   **ap-southeast-5c**: Jakarta Zone C
        // *   **eu-central-1a**: Frankfurt Zone A
        // *   **eu-central-1b**: Frankfurt Zone B
        // *   **eu-central-1c**: Frankfurt Zone C
        // 
        // > 
        // *   This parameter is returned if the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses multi-zone deployment.
        // *   This parameter is returned only if you use the Chine site (aliyun.com).
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        // Details of the shard nodes.
        // 
        // >  This parameter is returned if the instance is a sharded cluster instance.
        @NameInMap("ShardList")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList shardList;

        // The storage engine of the instance.
        @NameInMap("StorageEngine")
        public String storageEngine;

        // Details of the instance tags.
        @NameInMap("Tags")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags tags;

        // The ID of the instance.
        // 
        // >  This parameter is returned if the network type of the instance is VPC.
        @NameInMap("VPCCloudInstanceIds")
        public String VPCCloudInstanceIds;

        // The ID of the VPC.
        // 
        // >  This parameter is returned if the network type of the instance is VPC.
        @NameInMap("VPCId")
        public String VPCId;

        // The ID of the vSwitch.
        // 
        // >  This parameter is returned if the network type of the instance is VPC.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // Indicates whether password-free access within the VPC is enabled. Valid values:
        // 
        // - **Open**: Password-free access is enabled.
        // - **Close**: Password-free access is disabled, and you must use a password for access.
        // - **NotSupport**: Password-free access is not supported.
        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        // The zone ID of the instance.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance();
            return TeaModel.build(map, self);
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

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setTags(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags getTags() {
            return this.tags;
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
