// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponseBody extends TeaModel {
    /**
     * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86910.html">DescribeDBInstanceAttribute</a> operation to query the endpoint that is used to connect to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************.gpdb.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111111111111</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86910.html">DescribeDBInstanceAttribute</a> operation to query the port number that is used to connect to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5414A4E5-4C36-4461-95FC-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceResponseBody self = new CreateDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
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

    public CreateDBInstanceResponseBody setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
