// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeAnnualUseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mask")
    public String mask;

    public static DescribePhoneNumberOperatorAttributeAnnualUseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeAnnualUseRequest self = new DescribePhoneNumberOperatorAttributeAnnualUseRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

}
