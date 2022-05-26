// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AsyncCreateAgAccountRequest extends TeaModel {
    @NameInMap("LoginEmail")
    public String loginEmail;

    @NameInMap("MaserAccountInfo")
    public String maserAccountInfo;

    @NameInMap("Mpk")
    public String mpk;

    public static AsyncCreateAgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateAgAccountRequest self = new AsyncCreateAgAccountRequest();
        return TeaModel.build(map, self);
    }

    public AsyncCreateAgAccountRequest setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
        return this;
    }
    public String getLoginEmail() {
        return this.loginEmail;
    }

    public AsyncCreateAgAccountRequest setMaserAccountInfo(String maserAccountInfo) {
        this.maserAccountInfo = maserAccountInfo;
        return this;
    }
    public String getMaserAccountInfo() {
        return this.maserAccountInfo;
    }

    public AsyncCreateAgAccountRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

}
