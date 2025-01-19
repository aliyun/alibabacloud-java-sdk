// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeAnnualRequest extends TeaModel {
    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("Mask")
    public String mask;

    @NameInMap("Number")
    public String number;

    public static DescribePhoneNumberOperatorAttributeAnnualRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeAnnualRequest self = new DescribePhoneNumberOperatorAttributeAnnualRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeAnnualRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneNumberOperatorAttributeAnnualRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribePhoneNumberOperatorAttributeAnnualRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
