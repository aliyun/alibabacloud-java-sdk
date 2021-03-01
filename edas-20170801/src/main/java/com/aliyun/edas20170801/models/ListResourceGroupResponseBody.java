// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListResourceGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupList")
    public ListResourceGroupResponseBodyResourceGroupList resourceGroupList;

    public static ListResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupResponseBody self = new ListResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListResourceGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupResponseBody setResourceGroupList(ListResourceGroupResponseBodyResourceGroupList resourceGroupList) {
        this.resourceGroupList = resourceGroupList;
        return this;
    }
    public ListResourceGroupResponseBodyResourceGroupList getResourceGroupList() {
        return this.resourceGroupList;
    }

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity extends TeaModel {
        @NameInMap("EcuId")
        public String ecuId;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("DockerEnv")
        public Boolean dockerEnv;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("IpAddr")
        public String ipAddr;

        @NameInMap("HeartbeatTime")
        public Long heartbeatTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("AvailableCpu")
        public Integer availableCpu;

        @NameInMap("AvailableMem")
        public Integer availableMem;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Mem")
        public Integer mem;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setAvailableCpu(Integer availableCpu) {
            this.availableCpu = availableCpu;
            return this;
        }
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setAvailableMem(Integer availableMem) {
            this.availableMem = availableMem;
            return this;
        }
        public Integer getAvailableMem() {
            return this.availableMem;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

    }

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Cidrblock")
        public String cidrblock;

        @NameInMap("Status")
        public String status;

        @NameInMap("Description")
        public String description;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("EcsNum")
        public Integer ecsNum;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setCidrblock(String cidrblock) {
            this.cidrblock = cidrblock;
            return this;
        }
        public String getCidrblock() {
            return this.cidrblock;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setEcsNum(Integer ecsNum) {
            this.ecsNum = ecsNum;
            return this;
        }
        public Integer getEcsNum() {
            return this.ecsNum;
        }

    }

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Status")
        public String status;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("InnerIp")
        public String innerIp;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("Eip")
        public String eip;

        @NameInMap("SerialNum")
        public String serialNum;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("SgId")
        public String sgId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("EcuEntity")
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity ecuEntity;

        @NameInMap("VpcEntity")
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity vpcEntity;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setSerialNum(String serialNum) {
            this.serialNum = serialNum;
            return this;
        }
        public String getSerialNum() {
            return this.serialNum;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setEcuEntity(ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity ecuEntity) {
            this.ecuEntity = ecuEntity;
            return this;
        }
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity getEcuEntity() {
            return this.ecuEntity;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setVpcEntity(ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity vpcEntity) {
            this.vpcEntity = vpcEntity;
            return this;
        }
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity getVpcEntity() {
            return this.vpcEntity;
        }

    }

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList extends TeaModel {
        @NameInMap("EcsEntity")
        public java.util.List<ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity> ecsEntity;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList setEcsEntity(java.util.List<ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity> ecsEntity) {
            this.ecsEntity = ecsEntity;
            return this;
        }
        public java.util.List<ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity> getEcsEntity() {
            return this.ecsEntity;
        }

    }

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity extends TeaModel {
        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("SlbName")
        public String slbName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Address")
        public String address;

        @NameInMap("SlbStatus")
        public String slbStatus;

        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("GroupId")
        public Integer groupId;

        @NameInMap("Expired")
        public Boolean expired;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setSlbName(String slbName) {
            this.slbName = slbName;
            return this;
        }
        public String getSlbName() {
            return this.slbName;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setSlbStatus(String slbStatus) {
            this.slbStatus = slbStatus;
            return this;
        }
        public String getSlbStatus() {
            return this.slbStatus;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

    }

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList extends TeaModel {
        @NameInMap("SlbEntity")
        public java.util.List<ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity> slbEntity;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList setSlbEntity(java.util.List<ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity> slbEntity) {
            this.slbEntity = slbEntity;
            return this;
        }
        public java.util.List<ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity> getSlbEntity() {
            return this.slbEntity;
        }

    }

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntity extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("AdminUserId")
        public String adminUserId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ecsList")
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList ecsList;

        @NameInMap("SlbList")
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList slbList;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntity build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntity self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntity();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setAdminUserId(String adminUserId) {
            this.adminUserId = adminUserId;
            return this;
        }
        public String getAdminUserId() {
            return this.adminUserId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setEcsList(ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList ecsList) {
            this.ecsList = ecsList;
            return this;
        }
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList getEcsList() {
            return this.ecsList;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setSlbList(ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList slbList) {
            this.slbList = slbList;
            return this;
        }
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList getSlbList() {
            return this.slbList;
        }

    }

    public static class ListResourceGroupResponseBodyResourceGroupList extends TeaModel {
        @NameInMap("ResGroupEntity")
        public java.util.List<ListResourceGroupResponseBodyResourceGroupListResGroupEntity> resGroupEntity;

        public static ListResourceGroupResponseBodyResourceGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupList self = new ListResourceGroupResponseBodyResourceGroupList();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupList setResGroupEntity(java.util.List<ListResourceGroupResponseBodyResourceGroupListResGroupEntity> resGroupEntity) {
            this.resGroupEntity = resGroupEntity;
            return this;
        }
        public java.util.List<ListResourceGroupResponseBodyResourceGroupListResGroupEntity> getResGroupEntity() {
            return this.resGroupEntity;
        }

    }

}
