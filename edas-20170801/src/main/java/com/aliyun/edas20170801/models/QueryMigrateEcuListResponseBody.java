// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateEcuListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EcuEntityList")
    public QueryMigrateEcuListResponseBodyEcuEntityList ecuEntityList;

    @NameInMap("Code")
    public Integer code;

    public static QueryMigrateEcuListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMigrateEcuListResponseBody self = new QueryMigrateEcuListResponseBody();
        return TeaModel.build(map, self);
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

    public QueryMigrateEcuListResponseBody setEcuEntityList(QueryMigrateEcuListResponseBodyEcuEntityList ecuEntityList) {
        this.ecuEntityList = ecuEntityList;
        return this;
    }
    public QueryMigrateEcuListResponseBodyEcuEntityList getEcuEntityList() {
        return this.ecuEntityList;
    }

    public QueryMigrateEcuListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity extends TeaModel {
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

        public static QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity self = new QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity();
            return TeaModel.build(map, self);
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setAvailableCpu(Integer availableCpu) {
            this.availableCpu = availableCpu;
            return this;
        }
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setAvailableMem(Integer availableMem) {
            this.availableMem = availableMem;
            return this;
        }
        public Integer getAvailableMem() {
            return this.availableMem;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMigrateEcuListResponseBodyEcuEntityListEcuEntity setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
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
