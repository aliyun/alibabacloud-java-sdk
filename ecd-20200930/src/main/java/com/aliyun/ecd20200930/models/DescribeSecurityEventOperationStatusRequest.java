// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationStatusRequest extends TeaModel {
    /**
     * <p>The ID of the task to handle the alerts.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityEventId")
    public java.util.List<String> securityEventId;

    /**
     * <p>The ID of the alert.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeSecurityEventOperationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationStatusRequest self = new DescribeSecurityEventOperationStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityEventOperationStatusRequest setSecurityEventId(java.util.List<String> securityEventId) {
        this.securityEventId = securityEventId;
        return this;
    }
    public java.util.List<String> getSecurityEventId() {
        return this.securityEventId;
    }

    public DescribeSecurityEventOperationStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
