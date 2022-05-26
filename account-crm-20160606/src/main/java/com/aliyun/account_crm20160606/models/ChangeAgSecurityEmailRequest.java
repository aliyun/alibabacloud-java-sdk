// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ChangeAgSecurityEmailRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("SecurityEmail")
    public String securityEmail;

    public static ChangeAgSecurityEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAgSecurityEmailRequest self = new ChangeAgSecurityEmailRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAgSecurityEmailRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ChangeAgSecurityEmailRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public ChangeAgSecurityEmailRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public ChangeAgSecurityEmailRequest setSecurityEmail(String securityEmail) {
        this.securityEmail = securityEmail;
        return this;
    }
    public String getSecurityEmail() {
        return this.securityEmail;
    }

}
