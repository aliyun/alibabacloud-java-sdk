// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLRequest extends TeaModel {
    /**
     * <p>The encrypted endpoint. By default, the wildcards are used for instances that are hosted on ECS instances. This way, the endpoints that can be resolved to the same IP address are encrypted.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxxxx-master.gpdbmaster.singapore.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The status of SSL encryption. Valid values:</p>
     * <ul>
     * <li>0: disables SSL encryption.</li>
     * <li>1: enables SSL encryption.</li>
     * <li>2: updates SSL encryption.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SSLEnabled")
    public Integer SSLEnabled;

    public static ModifyDBInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSSLRequest self = new ModifyDBInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSSLRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBInstanceSSLRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceSSLRequest setSSLEnabled(Integer SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public Integer getSSLEnabled() {
        return this.SSLEnabled;
    }

}
