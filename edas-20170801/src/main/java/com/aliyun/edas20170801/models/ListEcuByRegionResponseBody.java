// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcuByRegionResponseBody extends TeaModel {
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
    @NameInMap("EcuEntityList")
    public ListEcuByRegionResponseBodyEcuEntityList ecuEntityList;

    /**
     * <p>The additional information that is returned.</p>
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
     * <p>00000000-0000-0000-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEcuByRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEcuByRegionResponseBody self = new ListEcuByRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEcuByRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEcuByRegionResponseBody setEcuEntityList(ListEcuByRegionResponseBodyEcuEntityList ecuEntityList) {
        this.ecuEntityList = ecuEntityList;
        return this;
    }
    public ListEcuByRegionResponseBodyEcuEntityList getEcuEntityList() {
        return this.ecuEntityList;
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

    public static class ListEcuByRegionResponseBodyEcuEntityListEcuEntity extends TeaModel {
        /**
         * <p>The number of available CPU cores for the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AvailableCpu")
        public Integer availableCpu;

        /**
         * <p>The size of available memory for the ECU. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("AvailableMem")
        public Integer availableMem;

        /**
         * <p>The total number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The timestamp when the ECU was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1572539283168</p>
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
         * <p>c96c494c-1b91-4456-bbb3-b5afcd16****</p>
         */
        @NameInMap("EcuId")
        public String ecuId;

        /**
         * <p>The timestamp when the last heartbeat detection was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1572867865221</p>
         */
        @NameInMap("HeartbeatTime")
        public Long heartbeatTime;

        /**
         * <p>The ID of the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze82h8f4zcn449y****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The private IP address of the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xxx.xxx</p>
         */
        @NameInMap("IpAddr")
        public String ipAddr;

        /**
         * <p>The total size of memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The name of the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-k8s-for</p>
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
         * <p>false</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The ID of the region in which the ECU resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The timestamp when the ECU was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1572867895575</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>edas@aliyun-****.com</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the ECU resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zew8mi6gqbo5wf****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone in which the ECU resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListEcuByRegionResponseBodyEcuEntityListEcuEntity build(java.util.Map<String, ?> map) throws Exception {
            ListEcuByRegionResponseBodyEcuEntityListEcuEntity self = new ListEcuByRegionResponseBodyEcuEntityListEcuEntity();
            return TeaModel.build(map, self);
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setAvailableCpu(Integer availableCpu) {
            this.availableCpu = availableCpu;
            return this;
        }
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setAvailableMem(Integer availableMem) {
            this.availableMem = availableMem;
            return this;
        }
        public Integer getAvailableMem() {
            return this.availableMem;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListEcuByRegionResponseBodyEcuEntityListEcuEntity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
