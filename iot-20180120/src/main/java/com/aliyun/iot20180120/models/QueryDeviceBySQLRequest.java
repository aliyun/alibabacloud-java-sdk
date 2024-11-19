// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceBySQLRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
     * <p><strong>Important</strong></p>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
     * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The SQL-like statement that you want to execute to query devices. For more information about specific requirements and examples, see the following section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM device where product_key = &quot;a1*********&quot; limit 100, 20</p>
     */
    @NameInMap("SQL")
    public String SQL;

    public static QueryDeviceBySQLRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceBySQLRequest self = new QueryDeviceBySQLRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceBySQLRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceBySQLRequest setSQL(String SQL) {
        this.SQL = SQL;
        return this;
    }
    public String getSQL() {
        return this.SQL;
    }

}
