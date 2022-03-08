// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteWorkOrderRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 工单编号
    @NameInMap("WorkOrderId")
    public String workOrderId;

    public static DeleteWorkOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkOrderRequest self = new DeleteWorkOrderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteWorkOrderRequest setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }
    public String getWorkOrderId() {
        return this.workOrderId;
    }

}
