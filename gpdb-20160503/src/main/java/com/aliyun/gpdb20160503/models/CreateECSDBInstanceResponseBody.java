// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateECSDBInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Port")
    public String port;

    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("OrderId")
    public String orderId;

    public static CreateECSDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateECSDBInstanceResponseBody self = new CreateECSDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateECSDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateECSDBInstanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateECSDBInstanceResponseBody setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateECSDBInstanceResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateECSDBInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
