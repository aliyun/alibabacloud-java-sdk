// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPreValidatePhoneIdRequest extends TeaModel {
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("VerifyCode")
    public String verifyCode;

    public static GetPreValidatePhoneIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPreValidatePhoneIdRequest self = new GetPreValidatePhoneIdRequest();
        return TeaModel.build(map, self);
    }

    public GetPreValidatePhoneIdRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetPreValidatePhoneIdRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
