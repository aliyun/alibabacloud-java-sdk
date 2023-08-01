// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateEcuListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about ECUs that can be migrated.</p>
     */
    @NameInMap("EcuEntityList")
    public QueryMigrateEcuListResponseBodyEcuEntityList ecuEntityList;

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

    public static QueryMigrateEcuListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMigrateEcuListResponseBody self = new QueryMigrateEcuListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMigrateEcuListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryMigrateEcuListResponseBody setEcuEntityList(QueryMigrateEcuListResponseBodyEcuEntityList ecuEntityList) {
        this.ecuEntityList = ecuEntityList;
        return this;
    }
    public QueryMigrateEcuListResponseBodyEcuEntityList getEcuEntityList() {
        return this.ecuEntityList;
    }

    public QueryMigrateEcuListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMigrateEcuListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity extends TeaModel {
        /**
         * <p>The number of available CPUs. Unit: cores.</p>
         */
        @NameInMap("AvailableCpu")
        public Integer availableCpu;

        /**
         * <p>The size of available memory. Unit: MB.</p>
         */
        @NameInMap("AvailableMem")
        public Integer availableMem;

        /**
         * <p>The CPU quota set by the system. Unit: cores. The value 0 indicates that no quota is set by the system.</p>
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
         * <p>The total size of memory.</p>
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
         * <p>The ID of the region where the ECU resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the ECU was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the Alibaba Cloud account to which the ECU belongs.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>VPC ID</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone where the ECU resides.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity self = new QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity();
            return TeaModel.build(map, self);
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setAvailableCpu(Integer availableCpu) {
            this.availableCpu = availableCpu;
            return this;
        }
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setAvailableMem(Integer availableMem) {
            this.availableMem = availableMem;
            return this;
        }
        public Integer getAvailableMem() {
            return this.availableMem;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class QueryMigrateEcuListResponseBodyEcuEntityList extends TeaModel {
        @NameInMap("EcuEntity")
        public java.util.List<QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity> ecuEntity;

        public static QueryMigrateEcuListResponseBodyEcuEntityList build(java.util.Map<String, ?> map) throws Exception {
            QueryMigrateEcuListResponseBodyEcuEntityList self = new QueryMigrateEcuListResponseBodyEcuEntityList();
            return TeaModel.build(map, self);
        }

        public QueryMigrateEcuListResponseBodyEcuEntityList setEcuEntity(java.util.List<QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity> ecuEntity) {
            this.ecuEntity = ecuEntity;
            return this;
        }
        public java.util.List<QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity> getEcuEntity() {
            return this.ecuEntity;
        }

    }

}
