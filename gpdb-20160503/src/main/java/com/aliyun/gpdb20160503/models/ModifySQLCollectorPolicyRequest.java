// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to enable or disable SQL collection.</p>
     * <br>
     * <p>*   Enable: enables SQL collection.</p>
     * <p>*   Disabled: disables SQL collection.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SQLCollectorStatus")
    public String SQLCollectorStatus;

    public static ModifySQLCollectorPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorPolicyRequest self = new ModifySQLCollectorPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifySQLCollectorPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifySQLCollectorPolicyRequest setSQLCollectorStatus(String SQLCollectorStatus) {
        this.SQLCollectorStatus = SQLCollectorStatus;
        return this;
    }
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

}
