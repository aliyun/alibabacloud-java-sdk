// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProxyAccessRequest extends TeaModel {
    // The database account.
    @NameInMap("IndepAccount")
    public String indepAccount;

    // The password that is used to log on to the database.
    @NameInMap("IndepPassword")
    public String indepPassword;

    // The ID of the security protection agent. You can call the [ListProxies](https://www.alibabacloud.com/help/en/data-management-service/latest/listproxies) or [GetProxy](https://www.alibabacloud.com/help/en/data-management-service/latest/getproxy) operation to obtain this parameter.
    @NameInMap("ProxyId")
    public Long proxyId;

    // The ID of the tenant. You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) or [ListUserTenants](https://www.alibabacloud.com/help/en/data-management-service/latest/listusertenants) operation to obtain this parameter.
    @NameInMap("Tid")
    public Long tid;

    // The ID of the user. You can call the [ListUsers](https://www.alibabacloud.com/help/en/data-management-service/latest/listusers) or [GetUser](https://www.alibabacloud.com/help/en/data-management-service/latest/getuser) operation to obtain this parameter.
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
