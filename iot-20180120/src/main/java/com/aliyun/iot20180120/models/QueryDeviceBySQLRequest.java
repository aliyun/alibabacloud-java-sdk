// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceBySQLRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Instance Overview** page in the IoT Platform console.</p>
     * <br>
     * <br>
     * <p>**Important**</p>
     * <br>
     * <p>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</p>
     * <p>*   If no **Overview** page or **ID** is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The SQL-like statement that you want to execute to query devices. For more information about specific requirements and examples, see the following section.</p>
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
