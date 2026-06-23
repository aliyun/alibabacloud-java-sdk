// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1qx68m06981****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>21137950671****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceResponseBody self = new CreateDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
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
