// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProxyAccessRequest extends TeaModel {
    @NameInMap("IndepAccount")
    public String indepAccount;

    @NameInMap("IndepPassword")
    public String indepPassword;

    @NameInMap("ProxyId")
    public Long proxyId;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("UserId")
    public Long userId;

    public static CreateProxyAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProxyAccessRequest self = new CreateProxyAccessRequest();
        return TeaModel.build(map, self);
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

    public CreateProxyAccessRequest setProxyId(Long proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public Long getProxyId() {
        return this.proxyId;
    }

    public CreateProxyAccessRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CreateProxyAccessRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
