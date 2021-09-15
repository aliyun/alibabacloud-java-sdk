// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("SSLEnabled")
    public Integer SSLEnabled;

    public static ModifyDBInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSSLRequest self = new ModifyDBInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSSLRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceSSLRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBInstanceSSLRequest setSSLEnabled(Integer SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public Integer getSSLEnabled() {
        return this.SSLEnabled;
    }

}
