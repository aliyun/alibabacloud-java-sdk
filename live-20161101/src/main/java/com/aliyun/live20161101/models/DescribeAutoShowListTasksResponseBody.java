// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeAutoShowListTasksResponseBody extends TeaModel {
    @NameInMap("AutoShowListTasks")
    public String autoShowListTasks;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAutoShowListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoShowListTasksResponseBody self = new DescribeAutoShowListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoShowListTasksResponseBody setAutoShowListTasks(String autoShowListTasks) {
        this.autoShowListTasks = autoShowListTasks;
        return this;
    }
    public String getAutoShowListTasks() {
        return this.autoShowListTasks;
    }

    public DescribeAutoShowListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
