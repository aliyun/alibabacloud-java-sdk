// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class CreateComputeJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CuLimit")
    public Double cuLimit;

    @NameInMap("CuReserved")
    public Double cuReserved;

    @NameInMap("DraftSql")
    public String draftSql;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobConfig")
    public String jobConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("UpgradeMode")
    public String upgradeMode;

    @NameInMap("UserId")
    public String userId;

    public static CreateComputeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeJobRequest self = new CreateComputeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateComputeJobRequest setCuLimit(Double cuLimit) {
        this.cuLimit = cuLimit;
        return this;
    }
    public Double getCuLimit() {
        return this.cuLimit;
    }

    public CreateComputeJobRequest setCuReserved(Double cuReserved) {
        this.cuReserved = cuReserved;
        return this;
    }
    public Double getCuReserved() {
        return this.cuReserved;
    }

    public CreateComputeJobRequest setDraftSql(String draftSql) {
        this.draftSql = draftSql;
        return this;
    }
    public String getDraftSql() {
        return this.draftSql;
    }

    public CreateComputeJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateComputeJobRequest setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }
    public String getJobConfig() {
        return this.jobConfig;
    }

    public CreateComputeJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateComputeJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateComputeJobRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateComputeJobRequest setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

    public CreateComputeJobRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
