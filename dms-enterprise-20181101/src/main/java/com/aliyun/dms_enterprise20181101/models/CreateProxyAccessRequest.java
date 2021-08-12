// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProxyAccessRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("ProxyId")
    public Long proxyId;

    @NameInMap("IndepAccount")
    public String indepAccount;

    @NameInMap("IndepPassword")
    public String indepPassword;

    @NameInMap("Tid")
    public Long tid;

    public static CreateProxyAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProxyAccessRequest self = new CreateProxyAccessRequest();
        return TeaModel.build(map, self);
    }

    public CreateProxyAccessRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public CreateProxyAccessRequest setProxyId(Long proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public Long getProxyId() {
        return this.proxyId;
    }

    public CreateProxyAccessRequest setIndepAccount(String indepAccount) {
        this.indepAccount = indepAccount;
        return this;
    }
    public String getIndepAccount() {
        return this.indepAccount;
    }

    public CreateProxyAccessRequest setIndepPassword(String indepPassword) {
        this.indepPassword = indepPassword;
        return this;
    }
    public String getIndepPassword() {
        return this.indepPassword;
    }

    public CreateProxyAccessRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
