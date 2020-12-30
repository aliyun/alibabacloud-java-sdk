// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class KillExecutionJobInstanceRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("JobInstanceId")
    public String jobInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static KillExecutionJobInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        KillExecutionJobInstanceRequest self = new KillExecutionJobInstanceRequest();
        return TeaModel.build(map, self);
    }

    public KillExecutionJobInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public KillExecutionJobInstanceRequest setJobInstanceId(String jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public String getJobInstanceId() {
        return this.jobInstanceId;
    }

    public KillExecutionJobInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
