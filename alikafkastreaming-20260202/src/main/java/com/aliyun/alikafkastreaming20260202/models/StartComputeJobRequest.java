// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class StartComputeJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CuLimit")
    public Double cuLimit;

    @NameInMap("CuReserved")
    public Double cuReserved;

    @NameInMap("DraftSql")
    public String draftSql;

    @NameInMap("DraftSqlStart")
    public Boolean draftSqlStart;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("RecoveryMode")
    public String recoveryMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StartComputeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartComputeJobRequest self = new StartComputeJobRequest();
        return TeaModel.build(map, self);
    }

    public StartComputeJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartComputeJobRequest setCuLimit(Double cuLimit) {
        this.cuLimit = cuLimit;
        return this;
    }
    public Double getCuLimit() {
        return this.cuLimit;
    }

    public StartComputeJobRequest setCuReserved(Double cuReserved) {
        this.cuReserved = cuReserved;
        return this;
    }
    public Double getCuReserved() {
        return this.cuReserved;
    }

    public StartComputeJobRequest setDraftSql(String draftSql) {
        this.draftSql = draftSql;
        return this;
    }
    public String getDraftSql() {
        return this.draftSql;
    }

    public StartComputeJobRequest setDraftSqlStart(Boolean draftSqlStart) {
        this.draftSqlStart = draftSqlStart;
        return this;
    }
    public Boolean getDraftSqlStart() {
        return this.draftSqlStart;
    }

    public StartComputeJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartComputeJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public StartComputeJobRequest setRecoveryMode(String recoveryMode) {
        this.recoveryMode = recoveryMode;
        return this;
    }
    public String getRecoveryMode() {
        return this.recoveryMode;
    }

    public StartComputeJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
