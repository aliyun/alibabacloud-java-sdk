// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ResumeExecutionPlanSchedulerRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Id")
    public String id;

    public static ResumeExecutionPlanSchedulerRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeExecutionPlanSchedulerRequest self = new ResumeExecutionPlanSchedulerRequest();
        return TeaModel.build(map, self);
    }

    public ResumeExecutionPlanSchedulerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ResumeExecutionPlanSchedulerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResumeExecutionPlanSchedulerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
