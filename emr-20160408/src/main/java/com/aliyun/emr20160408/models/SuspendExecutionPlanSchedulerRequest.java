// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class SuspendExecutionPlanSchedulerRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Id")
    public String id;

    public static SuspendExecutionPlanSchedulerRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendExecutionPlanSchedulerRequest self = new SuspendExecutionPlanSchedulerRequest();
        return TeaModel.build(map, self);
    }

    public SuspendExecutionPlanSchedulerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SuspendExecutionPlanSchedulerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SuspendExecutionPlanSchedulerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
