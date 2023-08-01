// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListScaleOutEcuResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ECUs.</p>
     */
    @NameInMap("EcuInfoList")
    public ListScaleOutEcuResponseBodyEcuInfoList ecuInfoList;

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

    public static ListScaleOutEcuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScaleOutEcuResponseBody self = new ListScaleOutEcuResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScaleOutEcuResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
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

    public static class ListScaleOutEcuResponseBodyEcuInfoListEcuInfo extends TeaModel {
        /**
         * <p>The number of available CPU cores for the ECU.</p>
         */
        @NameInMap("AvailableCpu")
        public Integer availableCpu;

        /**
         * <p>The size of available memory for the ECU. Unit: MB.</p>
         */
        @NameInMap("AvailableMem")
        public Integer availableMem;

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
         * <p>The unique ID of the ECU. To query the ID, you can run the `dmidecode` command on the ECS instance that corresponds to the ECU.</p>
         */
        @NameInMap("EcuId")
        public String ecuId;

        /**
         * <p>The time when the last heartbeat detection was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("HeartbeatTime")
        public Long heartbeatTime;

        /**
         * <p>The ID of the ECU.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The private IP address of the ECU.</p>
         */
        @NameInMap("IpAddr")
        public String ipAddr;

        /**
         * <p>The name of the ECU.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the ECU is online. If the ECU is online, its corresponding ECS instance is managed in EDAS. Valid values:</p>
         * <br>
         * <p>*   true: The ECU is online.</p>
         * <p>*   false: The ECU is offline.</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The ID of the region where the ECU is located.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the ECU was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the Alibaba Cloud account to which the ECU belongs.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the virtual private cloud (VPC) where the ECU is located.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone where the ECU resides.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListScaleOutEcuResponseBodyEcuInfoListEcuInfo build(java.util.Map<String, ?> map) throws Exception {
            ListScaleOutEcuResponseBodyEcuInfoListEcuInfo self = new ListScaleOutEcuResponseBodyEcuInfoListEcuInfo();
            return TeaModel.build(map, self);
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setAvailableCpu(Integer availableCpu) {
            this.availableCpu = availableCpu;
            return this;
        }
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setAvailableMem(Integer availableMem) {
            this.availableMem = availableMem;
            return this;
        }
        public Integer getAvailableMem() {
            return this.availableMem;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListScaleOutEcuResponseBodyEcuInfoListEcuInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
