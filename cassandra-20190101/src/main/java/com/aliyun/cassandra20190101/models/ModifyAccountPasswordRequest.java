// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyAccountPasswordRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Account")
    public String account;

    @NameInMap("Password")
    public String password;

    public static ModifyAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPasswordRequest self = new ModifyAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPasswordRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyAccountPasswordRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ModifyAccountPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
