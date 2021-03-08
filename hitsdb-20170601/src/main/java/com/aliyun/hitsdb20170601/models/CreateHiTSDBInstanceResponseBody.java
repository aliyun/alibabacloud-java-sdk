// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class CreateHiTSDBInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderId")
    public Long orderId;

    public static CreateHiTSDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHiTSDBInstanceResponseBody self = new CreateHiTSDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHiTSDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHiTSDBInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateHiTSDBInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
