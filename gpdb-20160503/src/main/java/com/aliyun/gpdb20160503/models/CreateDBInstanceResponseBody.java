// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponseBody extends TeaModel {
    /**
     * <p>This parameter is deprecated and will not return a value.</p>
     * <p>You can use the <a href="https://help.aliyun.com/document_detail/86910.html">DescribeDBInstanceAttribute</a> interface to view the connection address of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****.gpdb.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111111111111</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>This parameter is deprecated and will not return a value.</p>
     * <p>You can use the <a href="https://help.aliyun.com/document_detail/86910.html">DescribeDBInstanceAttribute</a> interface to view the port number of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3432</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>Request ID.</p>
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
