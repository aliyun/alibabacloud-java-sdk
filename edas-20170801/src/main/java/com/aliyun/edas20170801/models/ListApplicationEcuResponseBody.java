// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationEcuResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about ECUs.</p>
     */
    @NameInMap("EcuInfoList")
    public ListApplicationEcuResponseBodyEcuInfoList ecuInfoList;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>b197-40ab-9155-7ca7</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>e809****-43d7-4c6b-8e01-b0d9d1db****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The number of available CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AvailableCpu")
        public Integer availableCpu;

        /**
         * <p>The size of available memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("AvailableMem")
        public Integer availableMem;

        /**
         * <p>The total number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the ECU was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1542692376066</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether Docker is installed. Valid values:</p>
         * <ul>
         * <li>true: Docker is installed.</li>
         * <li>false: Docker is not installed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DockerEnv")
        public Boolean dockerEnv;

        /**
         * <p>The unique ID of the ECU. To query the ID, you can run the <code>dmidecode</code> command on the ECS instance that corresponds to the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>0de2ebdb-9490-4fc4-be41***************</p>
         */
        @NameInMap("EcuId")
        public String ecuId;

        /**
         * <p>The time when the last heartbeat detection was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1573281040819</p>
         */
        @NameInMap("HeartbeatTime")
        public Long heartbeatTime;

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zej4i2jdf*********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The internal IP address allocated to the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XXX.XXX</p>
         */
        @NameInMap("IpAddr")
        public String ipAddr;

        /**
         * <p>The total size of memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The name of the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the ECU is online. Valid values:</p>
         * <ul>
         * <li>true: The ECU is online.</li>
         * <li>false: The ECU is offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the ECU was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1599803995894</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the Alibaba Cloud account to which the ECU belongs.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><em>common</em></strong></strong>@aliyun.com</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zef6ob8**********</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
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
