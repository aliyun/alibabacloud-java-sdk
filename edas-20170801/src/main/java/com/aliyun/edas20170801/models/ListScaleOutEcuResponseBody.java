// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListScaleOutEcuResponseBody extends TeaModel {
    @NameInMap("EcuInfoList")
    public ListScaleOutEcuResponseBodyEcuInfoList ecuInfoList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static ListScaleOutEcuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScaleOutEcuResponseBody self = new ListScaleOutEcuResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScaleOutEcuResponseBody setEcuInfoList(ListScaleOutEcuResponseBodyEcuInfoList ecuInfoList) {
        this.ecuInfoList = ecuInfoList;
        return this;
    }
    public ListScaleOutEcuResponseBodyEcuInfoList getEcuInfoList() {
        return this.ecuInfoList;
    }

    public ListScaleOutEcuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScaleOutEcuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScaleOutEcuResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListScaleOutEcuResponseBodyEcuInfoListEcuInfo extends TeaModel {
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

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("EcuId")
        public String ecuId;

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

        public static ListScaleOutEcuResponseBodyEcuInfoListEcuInfo build(java.util.Map<String, ?> map) throws Exception {
            ListScaleOutEcuResponseBodyEcuInfoListEcuInfo self = new ListScaleOutEcuResponseBodyEcuInfoListEcuInfo();
            return TeaModel.build(map, self);
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setAvailableCpu(Integer availableCpu) {
            this.availableCpu = availableCpu;
            return this;
        }
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setAvailableMem(Integer availableMem) {
            this.availableMem = availableMem;
            return this;
        }
        public Integer getAvailableMem() {
            return this.availableMem;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

    }

    public static class ListScaleOutEcuResponseBodyEcuInfoList extends TeaModel {
        @NameInMap("EcuInfo")
        public java.util.List<ListScaleOutEcuResponseBodyEcuInfoListEcuInfo> ecuInfo;

        public static ListScaleOutEcuResponseBodyEcuInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListScaleOutEcuResponseBodyEcuInfoList self = new ListScaleOutEcuResponseBodyEcuInfoList();
            return TeaModel.build(map, self);
        }

        public ListScaleOutEcuResponseBodyEcuInfoList setEcuInfo(java.util.List<ListScaleOutEcuResponseBodyEcuInfoListEcuInfo> ecuInfo) {
            this.ecuInfo = ecuInfo;
            return this;
        }
        public java.util.List<ListScaleOutEcuResponseBodyEcuInfoListEcuInfo> getEcuInfo() {
            return this.ecuInfo;
        }

    }

}
