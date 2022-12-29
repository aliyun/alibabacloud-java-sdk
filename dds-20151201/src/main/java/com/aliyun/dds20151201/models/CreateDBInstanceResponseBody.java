// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponseBody extends TeaModel {
    // The ID of the instance.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The ID of the order.
    @NameInMap("OrderId")
    public String orderId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceResponseBody self = new CreateDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
