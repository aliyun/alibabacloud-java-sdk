// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class UnbindAccountIdentityInfoRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Biz")
    public String biz;

    @NameInMap("Source")
    public String source;

    public static UnbindAccountIdentityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountIdentityInfoRequest self = new UnbindAccountIdentityInfoRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAccountIdentityInfoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UnbindAccountIdentityInfoRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public UnbindAccountIdentityInfoRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
