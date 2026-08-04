// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ChangeAgAccountNationalityCodeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("NationalityCode")
    public String nationalityCode;

    @NameInMap("PK")
    public String PK;

    public static ChangeAgAccountNationalityCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAgAccountNationalityCodeRequest self = new ChangeAgAccountNationalityCodeRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAgAccountNationalityCodeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ChangeAgAccountNationalityCodeRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public ChangeAgAccountNationalityCodeRequest setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
        return this;
    }
    public String getNationalityCode() {
        return this.nationalityCode;
    }

    public ChangeAgAccountNationalityCodeRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
