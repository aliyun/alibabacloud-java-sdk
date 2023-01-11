// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneNumberVerificationStatusRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static GetPhoneNumberVerificationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberVerificationStatusRequest self = new GetPhoneNumberVerificationStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberVerificationStatusRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetPhoneNumberVerificationStatusRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
