// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUpdatePackageResultRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TaskId")
    public String taskId;

    public static DescribeUpdatePackageResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdatePackageResultRequest self = new DescribeUpdatePackageResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUpdatePackageResultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUpdatePackageResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
