// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class BindAccountRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RamUser")
    public String ramUser;

    public static BindAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAccountRequest self = new BindAccountRequest();
        return TeaModel.build(map, self);
    }

    public BindAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public BindAccountRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public BindAccountRequest setRamUser(String ramUser) {
        this.ramUser = ramUser;
        return this;
    }
    public String getRamUser() {
        return this.ramUser;
    }

}
