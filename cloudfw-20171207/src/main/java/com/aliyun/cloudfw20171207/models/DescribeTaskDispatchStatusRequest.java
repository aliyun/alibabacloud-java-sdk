// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTaskDispatchStatusRequest extends TeaModel {
    /**
     * <p>The task ID. It is the unique identifier of the log configuration modification task. You can obtain the task ID from the TaskId parameter in the response of the ModifySlsDispatchConfig operation.</p>
     * <p><strong>Note</strong>: This parameter is required. If it is not provided, the server returns a 400 error and rejects the request. Make sure to specify a valid TaskId.</p>
     * 
     * <strong>example:</strong>
     * <p>65db4ce2418b44b3be7c3xxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeTaskDispatchStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskDispatchStatusRequest self = new DescribeTaskDispatchStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskDispatchStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
