// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationEcuResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("EcuInfoList")
    public ListApplicationEcuResponseBodyEcuInfoList ecuInfoList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationEcuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationEcuResponseBody self = new ListApplicationEcuResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationEcuResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListApplicationEcuResponseBody setEcuInfoList(ListApplicationEcuResponseBodyEcuInfoList ecuInfoList) {
        this.ecuInfoList = ecuInfoList;
        return this;
    }
    public ListApplicationEcuResponseBodyEcuInfoList getEcuInfoList() {
        return this.ecuInfoList;
    }

    public ListApplicationEcuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationEcuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationEcuResponseBodyEcuInfoListEcuEntity extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AvailableCpu")
        public Integer availableCpu;

        @NameInMap("AvailableMem")
        public Integer availableMem;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DockerEnv")
        public Boolean dockerEnv;

        @NameInMap("EcuId")
        public String ecuId;

        @NameInMap("HeartbeatTime")
        public Long heartbeatTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IpAddr")
        public String ipAddr;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("Name")
        public String name;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListApplicationEcuResponseBodyEcuInfoListEcuEntity build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationEcuResponseBodyEcuInfoListEcuEntity self = new ListApplicationEcuResponseBodyEcuInfoListEcuEntity();
            return TeaModel.build(map, self);
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setAvailableCpu(Integer availableCpu) {
            this.availableCpu = availableCpu;
            return this;
        }
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setAvailableMem(Integer availableMem) {
            this.availableMem = availableMem;
            return this;
        }
        public Integer getAvailableMem() {
            return this.availableMem;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListApplicationEcuResponseBodyEcuInfoListEcuEntity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListApplicationEcuResponseBodyEcuInfoList extends TeaModel {
        @NameInMap("EcuEntity")
        public java.util.List<ListApplicationEcuResponseBodyEcuInfoListEcuEntity> ecuEntity;

        public static ListApplicationEcuResponseBodyEcuInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationEcuResponseBodyEcuInfoList self = new ListApplicationEcuResponseBodyEcuInfoList();
            return TeaModel.build(map, self);
        }

        public ListApplicationEcuResponseBodyEcuInfoList setEcuEntity(java.util.List<ListApplicationEcuResponseBodyEcuInfoListEcuEntity> ecuEntity) {
            this.ecuEntity = ecuEntity;
            return this;
        }
        public java.util.List<ListApplicationEcuResponseBodyEcuInfoListEcuEntity> getEcuEntity() {
            return this.ecuEntity;
        }

    }

}
