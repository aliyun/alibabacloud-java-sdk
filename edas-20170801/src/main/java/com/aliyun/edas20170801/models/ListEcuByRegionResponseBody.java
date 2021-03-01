// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcuByRegionResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EcuEntityList")
    public ListEcuByRegionResponseBodyEcuEntityList ecuEntityList;

    @NameInMap("Code")
    public Integer code;

    public static ListEcuByRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEcuByRegionResponseBody self = new ListEcuByRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEcuByRegionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEcuByRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEcuByRegionResponseBody setEcuEntityList(ListEcuByRegionResponseBodyEcuEntityList ecuEntityList) {
        this.ecuEntityList = ecuEntityList;
        return this;
    }
    public ListEcuByRegionResponseBodyEcuEntityList getEcuEntityList() {
        return this.ecuEntityList;
    }

    public ListEcuByRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListEcuByRegionResponseBodyEcuEntityListEcuEntity extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("IpAddr")
        public String ipAddr;

        @NameInMap("AvailableCpu")
        public Integer availableCpu;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("EcuId")
        public String ecuId;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("DockerEnv")
        public Boolean dockerEnv;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("AvailableMem")
        public Integer availableMem;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Name")
        public String name;

        @NameInMap("HeartbeatTime")
        public Long heartbeatTime;

        public static ListEcuByRegionResponseBodyEcuEntityListEcuEntity build(java.util.Map<String, ?> map) throws Exception {
            ListEcuByRegionResponseBodyEcuEntityListEcuEntity self = new ListEcuByRegionResponseBodyEcuEntityListEcuEntity();
            return TeaModel.build(map, self);
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setAvailableCpu(Integer availableCpu) {
            this.availableCpu = availableCpu;
            return this;
        }
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setAvailableMem(Integer availableMem) {
            this.availableMem = availableMem;
            return this;
        }
        public Integer getAvailableMem() {
            return this.availableMem;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

    }

    public static class ListEcuByRegionResponseBodyEcuEntityList extends TeaModel {
        @NameInMap("EcuEntity")
        public java.util.List<ListEcuByRegionResponseBodyEcuEntityListEcuEntity> ecuEntity;

        public static ListEcuByRegionResponseBodyEcuEntityList build(java.util.Map<String, ?> map) throws Exception {
            ListEcuByRegionResponseBodyEcuEntityList self = new ListEcuByRegionResponseBodyEcuEntityList();
            return TeaModel.build(map, self);
        }

        public ListEcuByRegionResponseBodyEcuEntityList setEcuEntity(java.util.List<ListEcuByRegionResponseBodyEcuEntityListEcuEntity> ecuEntity) {
            this.ecuEntity = ecuEntity;
            return this;
        }
        public java.util.List<ListEcuByRegionResponseBodyEcuEntityListEcuEntity> getEcuEntity() {
            return this.ecuEntity;
        }

    }

}
