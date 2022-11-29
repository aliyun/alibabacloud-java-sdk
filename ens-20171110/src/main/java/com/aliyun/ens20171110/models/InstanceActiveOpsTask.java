// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class InstanceActiveOpsTask extends TeaModel {
    @NameInMap("InstanceActiveOpsTaskId")
    public String instanceActiveOpsTaskId;

    @NameInMap("InstanceActiveOpsTaskStatus")
    public String instanceActiveOpsTaskStatus;

    public static InstanceActiveOpsTask build(java.util.Map<String, ?> map) throws Exception {
        InstanceActiveOpsTask self = new InstanceActiveOpsTask();
        return TeaModel.build(map, self);
    }

    public InstanceActiveOpsTask setInstanceActiveOpsTaskId(String instanceActiveOpsTaskId) {
        this.instanceActiveOpsTaskId = instanceActiveOpsTaskId;
        return this;
    }
    public String getInstanceActiveOpsTaskId() {
        return this.instanceActiveOpsTaskId;
    }

    public InstanceActiveOpsTask setInstanceActiveOpsTaskStatus(String instanceActiveOpsTaskStatus) {
        this.instanceActiveOpsTaskStatus = instanceActiveOpsTaskStatus;
        return this;
    }
    public String getInstanceActiveOpsTaskStatus() {
        return this.instanceActiveOpsTaskStatus;
    }

}
