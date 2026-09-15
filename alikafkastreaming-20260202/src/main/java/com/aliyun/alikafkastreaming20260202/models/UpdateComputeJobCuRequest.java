// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class UpdateComputeJobCuRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("CuLimit")
    public Double cuLimit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("CuReserved")
    public Double cuReserved;

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

    public static UpdateComputeJobCuRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeJobCuRequest self = new UpdateComputeJobCuRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeJobCuRequest setCuLimit(Double cuLimit) {
        this.cuLimit = cuLimit;
        return this;
    }
    public Double getCuLimit() {
        return this.cuLimit;
    }

    public UpdateComputeJobCuRequest setCuReserved(Double cuReserved) {
        this.cuReserved = cuReserved;
        return this;
    }
    public Double getCuReserved() {
        return this.cuReserved;
    }

    public UpdateComputeJobCuRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateComputeJobCuRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public UpdateComputeJobCuRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
