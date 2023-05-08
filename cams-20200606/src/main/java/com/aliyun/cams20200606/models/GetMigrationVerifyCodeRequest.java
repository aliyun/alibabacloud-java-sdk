// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetMigrationVerifyCodeRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("Locale")
    public String locale;

    @NameInMap("Method")
    public String method;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static GetMigrationVerifyCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationVerifyCodeRequest self = new GetMigrationVerifyCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetMigrationVerifyCodeRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetMigrationVerifyCodeRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public GetMigrationVerifyCodeRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public GetMigrationVerifyCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
