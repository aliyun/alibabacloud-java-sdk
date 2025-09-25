// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySDKRequest extends TeaModel {
    /**
     * <p>The task ID for generating the SDK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1KQMcnLd4m37LN2D0F0WCD</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeVerifySDKRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySDKRequest self = new DescribeVerifySDKRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySDKRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
