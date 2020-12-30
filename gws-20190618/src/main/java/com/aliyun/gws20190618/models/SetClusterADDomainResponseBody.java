// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterADDomainResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static SetClusterADDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetClusterADDomainResponseBody self = new SetClusterADDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public SetClusterADDomainResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SetClusterADDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
