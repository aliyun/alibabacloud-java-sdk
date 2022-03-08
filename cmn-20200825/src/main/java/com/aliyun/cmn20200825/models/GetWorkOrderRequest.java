// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetWorkOrderRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 工单Id
    @NameInMap("WorkOrderId")
    public String workOrderId;

    public static GetWorkOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkOrderRequest self = new GetWorkOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetWorkOrderRequest setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }
    public String getWorkOrderId() {
        return this.workOrderId;
    }

}
