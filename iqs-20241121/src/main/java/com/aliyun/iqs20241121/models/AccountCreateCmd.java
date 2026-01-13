// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class AccountCreateCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    public static AccountCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        AccountCreateCmd self = new AccountCreateCmd();
        return TeaModel.build(map, self);
    }

    public AccountCreateCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
