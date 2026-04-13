// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAgentTaskRequest extends TeaModel {
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static DescribeAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentTaskRequest self = new DescribeAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAgentTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
