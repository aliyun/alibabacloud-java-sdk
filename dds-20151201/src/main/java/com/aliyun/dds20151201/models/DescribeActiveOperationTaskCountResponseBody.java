// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NeedPop")
    public Integer needPop;

    @NameInMap("TaskCount")
    public Integer taskCount;

    public static DescribeActiveOperationTaskCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskCountResponseBody self = new DescribeActiveOperationTaskCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActiveOperationTaskCountResponseBody setNeedPop(Integer needPop) {
        this.needPop = needPop;
        return this;
    }
    public Integer getNeedPop() {
        return this.needPop;
    }

    public DescribeActiveOperationTaskCountResponseBody setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
        return this;
    }
    public Integer getTaskCount() {
        return this.taskCount;
    }

}
