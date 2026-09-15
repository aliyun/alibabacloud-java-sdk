// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class StartComputeJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("CuLimit")
    public Double cuLimit;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("CuReserved")
    public Double cuReserved;

    /**
     * <strong>example:</strong>
     * <p>CREATE TEMPORARY TABLE src (id BIGINT) WITH (\&quot;connector\&quot; = \&quot;datagen\&quot;); CREATE TEMPORARY TABLE sink (id BIGINT) WITH (\&quot;connector\&quot; = \&quot;print\&quot;); INSERT INTO sink SELECT id FROM src;</p>
     */
    @NameInMap("DraftSql")
    public String draftSql;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_streaming-cn-pe333xxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order_enrichment</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <strong>example:</strong>
     * <p>savepoint</p>
     */
    @NameInMap("RecoveryMode")
    public String recoveryMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StartComputeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartComputeJobRequest self = new StartComputeJobRequest();
        return TeaModel.build(map, self);
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
