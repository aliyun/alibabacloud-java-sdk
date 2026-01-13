// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class AccountCredentialDTO extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("callerIdentity")
    public String callerIdentity;

    @NameInMap("id")
    public Long id;

    public static AccountCredentialDTO build(java.util.Map<String, ?> map) throws Exception {
        AccountCredentialDTO self = new AccountCredentialDTO();
        return TeaModel.build(map, self);
    }

    public AccountCredentialDTO setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AccountCredentialDTO setCallerIdentity(String callerIdentity) {
        this.callerIdentity = callerIdentity;
        return this;
    }
    public String getCallerIdentity() {
        return this.callerIdentity;
    }

    public AccountCredentialDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
