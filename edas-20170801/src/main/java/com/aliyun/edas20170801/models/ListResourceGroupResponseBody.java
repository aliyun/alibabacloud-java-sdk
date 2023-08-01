// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>For more information about how to define a resource group, see ResGroupEntity.</p>
     */
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

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity extends TeaModel {
        /**
         * <p>The IP address of the SLB instance.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The type of the IP address of the SLB instance. Valid values:</p>
         * <br>
         * <p>*   Internet: Users can connect to the SLB instance over the Internet.</p>
         * <p>*   Intranet: Users can connect to the SLB instance over the internal network.</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>Indicates whether the SLB instance has expired. Valid values:</p>
         * <br>
         * <p>*   true: The SLB instance has expired.</p>
         * <p>*   false: The SLB instance has not expired.</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The ID of the group to which the SLB instance belongs.</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The network type of the SLB instance. Valid values:</p>
         * <br>
         * <p>*   Classic network</p>
         * <p>*   VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The unique ID of the SLB instance.</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The name of the SLB instance.</p>
         */
        @NameInMap("SlbName")
        public String slbName;

        /**
         * <p>The status of the SLB instance.</p>
         */
        @NameInMap("SlbStatus")
        public String slbStatus;

        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setSlbStatus(String slbStatus) {
            this.slbStatus = slbStatus;
            return this;
        }
        public String getSlbStatus() {
            return this.slbStatus;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbListSlbEntity setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
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

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity extends TeaModel {
        /**
         * <p>The number of available CPUs.</p>
         */
        @NameInMap("AvailableCpu")
        public Integer availableCpu;

        /**
         * <p>The size of the available memory.</p>
         */
        @NameInMap("AvailableMem")
        public Integer availableMem;

        /**
         * <p>The total number of CPU cores.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the ECU was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether Docker is installed. Valid values:</p>
         * <br>
         * <p>*   true: Docker is installed.</p>
         * <p>*   false: Docker is not installed.</p>
         */
        @NameInMap("DockerEnv")
        public Boolean dockerEnv;

        /**
         * <p>The unique ID of the elastic compute unit (ECU). You can run the `dmidecode` command on the ECS instance to query the ECU ID.</p>
         */
        @NameInMap("EcuId")
        public String ecuId;

        /**
         * <p>The time when the last heartbeat detection was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("HeartbeatTime")
        public Long heartbeatTime;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The private IP address of the ECU.</p>
         */
        @NameInMap("IpAddr")
        public String ipAddr;

        /**
         * <p>The total size of memory. Unit: MB.</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The name of the ECU.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the ECU is online. Valid values:</p>
         * <br>
         * <p>*   true: The ECU is online.</p>
         * <p>*   false: The ECU is offline.</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the ECU was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the user associated with the ECU.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity();
            return TeaModel.build(map, self);
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

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity extends TeaModel {
        /**
         * <p>The IPv4 CIDR block of the vSwitch.</p>
         */
        @NameInMap("Cidrblock")
        public String cidrblock;

        /**
         * <p>The description of the VPC.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of ECS instances that run in the VPC.</p>
         */
        @NameInMap("EcsNum")
        public Integer ecsNum;

        /**
         * <p>Indicates whether the VPC has expired. Valid values:</p>
         * <br>
         * <p>*   true: The VPC has expired.</p>
         * <p>*   false: The VPC has not expired.</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the VPC.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The unique ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setCidrblock(String cidrblock) {
            this.cidrblock = cidrblock;
            return this;
        }
        public String getCidrblock() {
            return this.cidrblock;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setEcsNum(Integer ecsNum) {
            this.ecsNum = ecsNum;
            return this;
        }
        public Integer getEcsNum() {
            return this.ecsNum;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
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

    }

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity extends TeaModel {
        /**
         * <p>The total number of CPU cores.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The description of the ECS instance.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The elastic compute unit (ECU) that corresponds to the ECS instance.</p>
         */
        @NameInMap("EcuEntity")
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity ecuEntity;

        /**
         * <p>The elastic IP address (EIP).</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <p>Indicates whether the ECS instance has expired. Valid values:</p>
         * <br>
         * <p>*   true: The ECS instance has expired.</p>
         * <p>*   false: The ECS instance has not expired.</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The ID of the resource group in Enterprise Distributed Application Service (EDAS).</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the host.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The private IP address.</p>
         */
        @NameInMap("InnerIp")
        public String innerIp;

        /**
         * <p>The ID of the ECS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ECS instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The total size of memory. Unit: MB.</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The private IP address of the ECS instance.</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The public IP address.</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The serial number of the ECS instance.</p>
         */
        @NameInMap("SerialNum")
        public String serialNum;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SgId")
        public String sgId;

        /**
         * <p>The status of the ECS instance. Valid values:</p>
         * <br>
         * <p>*   Pending: The ECS instance is being created.</p>
         * <p>*   Running: The ECS instance is running.</p>
         * <p>*   Starting: The ECS instance is being started.</p>
         * <p>*   Stopping: The ECS instance is being stopped.</p>
         * <p>*   Stopped: The ECS instance is stopped.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the user account.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The VPCs.</p>
         */
        @NameInMap("VpcEntity")
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity vpcEntity;

        /**
         * <p>The unique ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setEcuEntity(ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity ecuEntity) {
            this.ecuEntity = ecuEntity;
            return this;
        }
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityEcuEntity getEcuEntity() {
            return this.ecuEntity;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
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

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setSerialNum(String serialNum) {
            this.serialNum = serialNum;
            return this;
        }
        public String getSerialNum() {
            return this.serialNum;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setVpcEntity(ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity vpcEntity) {
            this.vpcEntity = vpcEntity;
            return this;
        }
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntityVpcEntity getVpcEntity() {
            return this.vpcEntity;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsListEcsEntity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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

    public static class ListResourceGroupResponseBodyResourceGroupListResGroupEntity extends TeaModel {
        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AdminUserId")
        public String adminUserId;

        /**
         * <p>The time when the resource group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the resource group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the region where the resource group belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The Server Load Balancer (SLB) instances.</p>
         */
        @NameInMap("SlbList")
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList slbList;

        /**
         * <p>The time when the resource group was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The Elastic Compute Service (ECS) instances.</p>
         */
        @NameInMap("ecsList")
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList ecsList;

        public static ListResourceGroupResponseBodyResourceGroupListResGroupEntity build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupResponseBodyResourceGroupListResGroupEntity self = new ListResourceGroupResponseBodyResourceGroupListResGroupEntity();
            return TeaModel.build(map, self);
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

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setSlbList(ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList slbList) {
            this.slbList = slbList;
            return this;
        }
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntitySlbList getSlbList() {
            return this.slbList;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListResourceGroupResponseBodyResourceGroupListResGroupEntity setEcsList(ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList ecsList) {
            this.ecsList = ecsList;
            return this;
        }
        public ListResourceGroupResponseBodyResourceGroupListResGroupEntityEcsList getEcsList() {
            return this.ecsList;
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
