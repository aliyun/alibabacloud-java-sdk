// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class InstanceActiveOpsTask extends TeaModel {
    /**
     * <p>instance active ops task id</p>
     */
    @NameInMap("InstanceActiveOpsTaskId")
    public String instanceActiveOpsTaskId;

    /**
     * <p>the status of instance active ops task</p>
     */
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
