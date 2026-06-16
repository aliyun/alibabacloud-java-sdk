// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressVerifyV2IntlRequest extends TeaModel {
    /**
     * <p>The device token, which is used for risk identification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tk9SSUQuMS*****************ZDNmNWY5NzQxOW1o</p>
     */
    @NameInMap("DeviceToken")
    public String deviceToken;

    /**
     * <p>The China mobile phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>1872334****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The product code. Set this parameter to ADD_VERIFY_PRO.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD_VERIFY_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The list of prohibited countries.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>目前仅支持：USA</p>
     */
    @NameInMap("RegCountry")
    public String regCountry;

    /**
     * <p>The detailed address text.</p>
     * 
     * <strong>example:</strong>
     * <p>江苏省常州市*******小区</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>The address verification method. Valid values:</p>
     * <ul>
     * <li>HOME: home address verification.</li>
     * <li>WORK: work address verification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HOME</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static AddressVerifyV2IntlRequest build(java.util.Map<String, ?> map) throws Exception {
        AddressVerifyV2IntlRequest self = new AddressVerifyV2IntlRequest();
        return TeaModel.build(map, self);
    }

    public AddressVerifyV2IntlRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public AddressVerifyV2IntlRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public AddressVerifyV2IntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddressVerifyV2IntlRequest setRegCountry(String regCountry) {
        this.regCountry = regCountry;
        return this;
    }
    public String getRegCountry() {
        return this.regCountry;
    }

    public AddressVerifyV2IntlRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public AddressVerifyV2IntlRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
