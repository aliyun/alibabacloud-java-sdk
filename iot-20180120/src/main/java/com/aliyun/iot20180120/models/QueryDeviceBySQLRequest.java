// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceBySQLRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SQL")
    @Validation(required = true)
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
