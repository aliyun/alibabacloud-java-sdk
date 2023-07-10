// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The name of the account.</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <br>
     * <p>*   The instance is in the running state.</p>
     * <p>*   The instance is not locked.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static ResetAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordRequest self = new ResetAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ResetAccountPasswordRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public ResetAccountPasswordRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
