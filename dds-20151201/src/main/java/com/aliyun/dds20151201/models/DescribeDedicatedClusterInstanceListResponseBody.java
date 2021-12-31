// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterInstanceListResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeDedicatedClusterInstanceListResponseBodyInstances instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDedicatedClusterInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterInstanceListResponseBody self = new DescribeDedicatedClusterInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterInstanceListResponseBody setInstances(DescribeDedicatedClusterInstanceListResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeDedicatedClusterInstanceListResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeDedicatedClusterInstanceListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedClusterInstanceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedClusterInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedClusterInstanceListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes extends TeaModel {
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        @NameInMap("InsName")
        public String insName;

        @NameInMap("NodeId")
        public Integer nodeId;

        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Role")
        public String role;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes self = new DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes setNodeId(Integer nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Integer getNodeId() {
            return this.nodeId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeList extends TeaModel {
        @NameInMap("InstanceNodes")
        public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes> instanceNodes;

        public static DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeList self = new DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeList();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeList setInstanceNodes(java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes> instanceNodes) {
            this.instanceNodes = instanceNodes;
            return this;
        }
        public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeListInstanceNodes> getInstanceNodes() {
            return this.instanceNodes;
        }

    }

    public static class DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance extends TeaModel {
        @NameInMap("CharacterType")
        public String characterType;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomId")
        public String customId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceNodeList")
        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeList instanceNodeList;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance self = new DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setCharacterType(String characterType) {
            this.characterType = characterType;
            return this;
        }
        public String getCharacterType() {
            return this.characterType;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setCustomId(String customId) {
            this.customId = customId;
            return this;
        }
        public String getCustomId() {
            return this.customId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setInstanceNodeList(DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeList instanceNodeList) {
            this.instanceNodeList = instanceNodeList;
            return this;
        }
        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstanceInstanceNodeList getInstanceNodeList() {
            return this.instanceNodeList;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDedicatedClusterInstanceListResponseBodyInstances extends TeaModel {
        @NameInMap("dbInstance")
        public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance> dbInstance;

        public static DescribeDedicatedClusterInstanceListResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedClusterInstanceListResponseBodyInstances self = new DescribeDedicatedClusterInstanceListResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setDbInstance(java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance> dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }
        public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesDbInstance> getDbInstance() {
            return this.dbInstance;
        }

    }

}
