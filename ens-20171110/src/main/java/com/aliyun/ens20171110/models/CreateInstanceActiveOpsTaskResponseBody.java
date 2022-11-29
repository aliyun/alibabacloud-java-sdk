// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateInstanceActiveOpsTaskResponseBody extends TeaModel {
    @NameInMap("InstanceActiveOpsTask")
    public InstanceActiveOpsTask instanceActiveOpsTask;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceActiveOpsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceActiveOpsTaskResponseBody self = new CreateInstanceActiveOpsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceActiveOpsTaskResponseBody setInstanceActiveOpsTask(InstanceActiveOpsTask instanceActiveOpsTask) {
        this.instanceActiveOpsTask = instanceActiveOpsTask;
        return this;
    }
    public InstanceActiveOpsTask getInstanceActiveOpsTask() {
        return this.instanceActiveOpsTask;
    }

    public CreateInstanceActiveOpsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
