// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UnbindAccountRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static UnbindAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountRequest self = new UnbindAccountRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public UnbindAccountRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
