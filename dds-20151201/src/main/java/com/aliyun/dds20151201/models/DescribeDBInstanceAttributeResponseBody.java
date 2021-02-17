// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstances")
    public DescribeDBInstanceAttributeResponseBodyDBInstances DBInstances;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceAttributeResponseBody setDBInstances(DescribeDBInstanceAttributeResponseBodyDBInstances DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBodyDBInstances getDBInstances() {
        return this.DBInstances;
    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet extends TeaModel {
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ConnectionPort")
        public String connectionPort;

        @NameInMap("ReplicaSetRole")
        public String replicaSetRole;

        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        @NameInMap("VPCCloudInstanceId")
        public String VPCCloudInstanceId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("VPCId")
        public String VPCId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setConnectionPort(String connectionPort) {
            this.connectionPort = connectionPort;
            return this;
        }
        public String getConnectionPort() {
            return this.connectionPort;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setReplicaSetRole(String replicaSetRole) {
            this.replicaSetRole = replicaSetRole;
            return this;
        }
        public String getReplicaSetRole() {
            return this.replicaSetRole;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setConnectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setVPCCloudInstanceId(String VPCCloudInstanceId) {
            this.VPCCloudInstanceId = VPCCloudInstanceId;
            return this;
        }
        public String getVPCCloudInstanceId() {
            return this.VPCCloudInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSetsReplicaSet setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
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

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute extends TeaModel {
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("ConnectSting")
        public String connectSting;

        @NameInMap("NodeDescription")
        public String nodeDescription;

        @NameInMap("NodeId")
        public String nodeId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setConnectSting(String connectSting) {
            this.connectSting = connectSting;
            return this;
        }
        public String getConnectSting() {
            return this.connectSting;
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

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute extends TeaModel {
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        @NameInMap("ConnectString")
        public String connectString;

        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("NodeDescription")
        public String nodeDescription;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        @NameInMap("ReadonlyReplicas")
        public Integer readonlyReplicas;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setConnectString(String connectString) {
            this.connectString = connectString;
            return this;
        }
        public String getConnectString() {
            return this.connectString;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
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

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardListShardAttribute setReadonlyReplicas(Integer readonlyReplicas) {
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }
        public Integer getReadonlyReplicas() {
            return this.readonlyReplicas;
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

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute extends TeaModel {
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        @NameInMap("ConnectString")
        public String connectString;

        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("NodeDescription")
        public String nodeDescription;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setConnectString(String connectString) {
            this.connectString = connectString;
            return this;
        }
        public String getConnectString() {
            return this.connectString;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverListConfigserverAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
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

    public static class DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ReplicaSets")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets replicaSets;

        @NameInMap("ReplacateId")
        public String replacateId;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Tags")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags tags;

        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        @NameInMap("VPCCloudInstanceIds")
        public String VPCCloudInstanceIds;

        @NameInMap("MongosList")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList mongosList;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("CurrentKernelVersion")
        public String currentKernelVersion;

        @NameInMap("DBInstanceReleaseProtection")
        public Boolean DBInstanceReleaseProtection;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("LastDowngradeTime")
        public String lastDowngradeTime;

        @NameInMap("ShardList")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList shardList;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        @NameInMap("ReplicaSetName")
        public String replicaSetName;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("StorageEngine")
        public String storageEngine;

        @NameInMap("ConfigserverList")
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList configserverList;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("ReadonlyReplicas")
        public String readonlyReplicas;

        @NameInMap("ReplicationFactor")
        public String replicationFactor;

        @NameInMap("KindCode")
        public String kindCode;

        public static DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance self = new DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setReplicaSets(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets replicaSets) {
            this.replicaSets = replicaSets;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceReplicaSets getReplicaSets() {
            return this.replicaSets;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setReplacateId(String replacateId) {
            this.replacateId = replacateId;
            return this;
        }
        public String getReplacateId() {
            return this.replacateId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setTags(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceTags getTags() {
            return this.tags;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setVpcAuthMode(String vpcAuthMode) {
            this.vpcAuthMode = vpcAuthMode;
            return this;
        }
        public String getVpcAuthMode() {
            return this.vpcAuthMode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setVPCCloudInstanceIds(String VPCCloudInstanceIds) {
            this.VPCCloudInstanceIds = VPCCloudInstanceIds;
            return this;
        }
        public String getVPCCloudInstanceIds() {
            return this.VPCCloudInstanceIds;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMongosList(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList mongosList) {
            this.mongosList = mongosList;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceMongosList getMongosList() {
            return this.mongosList;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setCurrentKernelVersion(String currentKernelVersion) {
            this.currentKernelVersion = currentKernelVersion;
            return this;
        }
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceReleaseProtection(Boolean DBInstanceReleaseProtection) {
            this.DBInstanceReleaseProtection = DBInstanceReleaseProtection;
            return this;
        }
        public Boolean getDBInstanceReleaseProtection() {
            return this.DBInstanceReleaseProtection;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setLastDowngradeTime(String lastDowngradeTime) {
            this.lastDowngradeTime = lastDowngradeTime;
            return this;
        }
        public String getLastDowngradeTime() {
            return this.lastDowngradeTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setShardList(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList shardList) {
            this.shardList = shardList;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceShardList getShardList() {
            return this.shardList;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setReplicaSetName(String replicaSetName) {
            this.replicaSetName = replicaSetName;
            return this;
        }
        public String getReplicaSetName() {
            return this.replicaSetName;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setStorageEngine(String storageEngine) {
            this.storageEngine = storageEngine;
            return this;
        }
        public String getStorageEngine() {
            return this.storageEngine;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setConfigserverList(DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList configserverList) {
            this.configserverList = configserverList;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstanceConfigserverList getConfigserverList() {
            return this.configserverList;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setReadonlyReplicas(String readonlyReplicas) {
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }
        public String getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setReplicationFactor(String replicationFactor) {
            this.replicationFactor = replicationFactor;
            return this;
        }
        public String getReplicationFactor() {
            return this.replicationFactor;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstancesDBInstance setKindCode(String kindCode) {
            this.kindCode = kindCode;
            return this;
        }
        public String getKindCode() {
            return this.kindCode;
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
