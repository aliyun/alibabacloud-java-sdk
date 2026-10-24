// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationStatusRequest extends TeaModel {
    /**
     * <p>The IDs of the security alert events.</p>
     * <blockquote>
     * <p>You must specify either TaskId or SecurityEventIds. The API call succeeds only if one of these parameters is specified.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityEventIds")
    public java.util.List<Long> securityEventIds;

    /**
     * <p>The ID of the task that processes the security alert event.</p>
     * <blockquote>
     * <p>You must specify either TaskId or SecurityEventIds. The API call succeeds only if one of these parameters is specified.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12121</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeSecurityEventOperationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationStatusRequest self = new DescribeSecurityEventOperationStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationStatusRequest setSecurityEventIds(java.util.List<Long> securityEventIds) {
        this.securityEventIds = securityEventIds;
        return this;
    }
    public java.util.List<Long> getSecurityEventIds() {
        return this.securityEventIds;
    }

    public DescribeSecurityEventOperationStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
