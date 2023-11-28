// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class MigrationJob extends TeaModel {
    @NameInMap("currentState")
    public String currentState;

    @NameInMap("disableSourceClusterAuth")
    public Boolean disableSourceClusterAuth;

    @NameInMap("disableTargetClusterAuth")
    public Boolean disableTargetClusterAuth;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("migrationJobId")
    public String migrationJobId;

    @NameInMap("phase")
    public String phase;

    @NameInMap("sourceCluster")
    public MigrationJobSourceCluster sourceCluster;

    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("statusResult")
    public java.util.List<MigrationJobStatusResult> statusResult;

    @NameInMap("targetCluster")
    public MigrationJobTargetCluster targetCluster;

    @NameInMap("updateTime")
    public Long updateTime;

    public static MigrationJob build(java.util.Map<String, ?> map) throws Exception {
        MigrationJob self = new MigrationJob();
        return TeaModel.build(map, self);
    }

    public MigrationJob setCurrentState(String currentState) {
        this.currentState = currentState;
        return this;
    }
    public String getCurrentState() {
        return this.currentState;
    }

    public MigrationJob setDisableSourceClusterAuth(Boolean disableSourceClusterAuth) {
        this.disableSourceClusterAuth = disableSourceClusterAuth;
        return this;
    }
    public Boolean getDisableSourceClusterAuth() {
        return this.disableSourceClusterAuth;
    }

    public MigrationJob setDisableTargetClusterAuth(Boolean disableTargetClusterAuth) {
        this.disableTargetClusterAuth = disableTargetClusterAuth;
        return this;
    }
    public Boolean getDisableTargetClusterAuth() {
        return this.disableTargetClusterAuth;
    }

    public MigrationJob setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public MigrationJob setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public MigrationJob setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public MigrationJob setSourceCluster(MigrationJobSourceCluster sourceCluster) {
        this.sourceCluster = sourceCluster;
        return this;
    }
    public MigrationJobSourceCluster getSourceCluster() {
        return this.sourceCluster;
    }

    public MigrationJob setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public MigrationJob setStatusResult(java.util.List<MigrationJobStatusResult> statusResult) {
        this.statusResult = statusResult;
        return this;
    }
    public java.util.List<MigrationJobStatusResult> getStatusResult() {
        return this.statusResult;
    }

    public MigrationJob setTargetCluster(MigrationJobTargetCluster targetCluster) {
        this.targetCluster = targetCluster;
        return this;
    }
    public MigrationJobTargetCluster getTargetCluster() {
        return this.targetCluster;
    }

    public MigrationJob setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class MigrationJobSourceCluster extends TeaModel {
        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("type")
        public String type;

        public static MigrationJobSourceCluster build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobSourceCluster self = new MigrationJobSourceCluster();
            return TeaModel.build(map, self);
        }

        public MigrationJobSourceCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MigrationJobSourceCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MigrationJobStatusResult extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("success")
        public Boolean success;

        public static MigrationJobStatusResult build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobStatusResult self = new MigrationJobStatusResult();
            return TeaModel.build(map, self);
        }

        public MigrationJobStatusResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MigrationJobStatusResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class MigrationJobTargetCluster extends TeaModel {
        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("type")
        public String type;

        public static MigrationJobTargetCluster build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobTargetCluster self = new MigrationJobTargetCluster();
            return TeaModel.build(map, self);
        }

        public MigrationJobTargetCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MigrationJobTargetCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
