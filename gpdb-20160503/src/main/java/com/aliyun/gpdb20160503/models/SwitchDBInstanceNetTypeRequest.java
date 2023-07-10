// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceNetTypeRequest extends TeaModel {
    /**
     * <p>The prefix of the custom endpoint. The prefix must be 8 to 64 characters in length and can contain letters and digits. It must start with a lowercase letter. A valid endpoint is in the following format: Prefix.Database engine.rds.aliyuncs.com. Example: test1234.mysql.rds.aliyuncs.com.</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The port number. Valid values: 3000 to 5999.</p>
     * <br>
     * <p>> </p>
     * <p>*   Only ApsaraDB PolarDB MySQL-compatible edition clusters support this parameter. If you leave this parameter empty, the default port 3306 is used.</p>
     */
    @NameInMap("Port")
    public String port;

    public static SwitchDBInstanceNetTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceNetTypeRequest self = new SwitchDBInstanceNetTypeRequest();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceNetTypeRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public SwitchDBInstanceNetTypeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public SwitchDBInstanceNetTypeRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

}
