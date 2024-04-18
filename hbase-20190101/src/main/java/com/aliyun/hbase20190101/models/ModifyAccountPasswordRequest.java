// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyAccountPasswordRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("NewAccountPassword")
    public String newAccountPassword;

    public static ModifyAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPasswordRequest self = new ModifyAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountPasswordRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyAccountPasswordRequest setNewAccountPassword(String newAccountPassword) {
        this.newAccountPassword = newAccountPassword;
        return this;
    }
    public String getNewAccountPassword() {
        return this.newAccountPassword;
    }

}
