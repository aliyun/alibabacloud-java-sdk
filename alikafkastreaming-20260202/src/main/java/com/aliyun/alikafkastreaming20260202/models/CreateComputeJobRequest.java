// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class CreateComputeJobRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>订单流实时清洗</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static CreateComputeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeJobRequest self = new CreateComputeJobRequest();
        return TeaModel.build(map, self);
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

    public CreateComputeJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

}
