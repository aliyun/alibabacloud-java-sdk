// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class EnableDelegateAccountRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    public static EnableDelegateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDelegateAccountRequest self = new EnableDelegateAccountRequest();
        return TeaModel.build(map, self);
    }

    public EnableDelegateAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
