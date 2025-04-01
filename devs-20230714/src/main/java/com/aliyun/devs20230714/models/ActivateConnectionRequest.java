// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ActivateConnectionRequest extends TeaModel {
    @NameInMap("account")
    public GitAccount account;

    @NameInMap("credential")
    public OAuthCredential credential;

    public static ActivateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateConnectionRequest self = new ActivateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ActivateConnectionRequest setAccount(GitAccount account) {
        this.account = account;
        return this;
    }
    public GitAccount getAccount() {
        return this.account;
    }

    public ActivateConnectionRequest setCredential(OAuthCredential credential) {
        this.credential = credential;
        return this;
    }
    public OAuthCredential getCredential() {
        return this.credential;
    }

}
