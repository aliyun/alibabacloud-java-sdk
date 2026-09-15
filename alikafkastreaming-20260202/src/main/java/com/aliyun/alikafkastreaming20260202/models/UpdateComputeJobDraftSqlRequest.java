// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class UpdateComputeJobDraftSqlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSERT INTO sink_table SELECT * FROM source_table;</p>
     */
    @NameInMap("DraftSql")
    public String draftSql;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_streaming-cn-a1b2c3d4</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateComputeJobDraftSqlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeJobDraftSqlRequest self = new UpdateComputeJobDraftSqlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeJobDraftSqlRequest setDraftSql(String draftSql) {
        this.draftSql = draftSql;
        return this;
    }
    public String getDraftSql() {
        return this.draftSql;
    }

    public UpdateComputeJobDraftSqlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateComputeJobDraftSqlRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public UpdateComputeJobDraftSqlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
