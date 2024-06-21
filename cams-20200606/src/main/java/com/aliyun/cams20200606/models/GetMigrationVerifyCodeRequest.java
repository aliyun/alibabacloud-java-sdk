// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetMigrationVerifyCodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sms</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800001234</p>
     */
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
