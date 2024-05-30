// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySDKRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
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
