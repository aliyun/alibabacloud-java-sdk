// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ChangeAgSecurityMobileRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("SecurityMobile")
    public String securityMobile;

    public static ChangeAgSecurityMobileRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAgSecurityMobileRequest self = new ChangeAgSecurityMobileRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAgSecurityMobileRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ChangeAgSecurityMobileRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public ChangeAgSecurityMobileRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public ChangeAgSecurityMobileRequest setSecurityMobile(String securityMobile) {
        this.securityMobile = securityMobile;
        return this;
    }
    public String getSecurityMobile() {
        return this.securityMobile;
    }

}
