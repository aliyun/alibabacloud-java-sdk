// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressVerifyIntlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>“0”</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("DefaultCity")
    public String defaultCity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DefaultCountry")
    public String defaultCountry;

    @NameInMap("DefaultDistrict")
    public String defaultDistrict;

    @NameInMap("DefaultProvince")
    public String defaultProvince;

    /**
     * <strong>example:</strong>
     * <p>“31.2304”</p>
     */
    @NameInMap("Latitude")
    public String latitude;

    /**
     * <strong>example:</strong>
     * <p>“121.4737”</p>
     */
    @NameInMap("Longitude")
    public String longitude;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1872334****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD_VERIFY_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Text")
    public String text;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HOME</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static AddressVerifyIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        AddressVerifyIntlRequest self = new AddressVerifyIntlRequest();
        return TeaModel.build(map, self);
    }

    public AddressVerifyIntlRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public AddressVerifyIntlRequest setDefaultCity(String defaultCity) {
        this.defaultCity = defaultCity;
        return this;
    }
    public String getDefaultCity() {
        return this.defaultCity;
    }

    public AddressVerifyIntlRequest setDefaultCountry(String defaultCountry) {
        this.defaultCountry = defaultCountry;
        return this;
    }
    public String getDefaultCountry() {
        return this.defaultCountry;
    }

    public AddressVerifyIntlRequest setDefaultDistrict(String defaultDistrict) {
        this.defaultDistrict = defaultDistrict;
        return this;
    }
    public String getDefaultDistrict() {
        return this.defaultDistrict;
    }

    public AddressVerifyIntlRequest setDefaultProvince(String defaultProvince) {
        this.defaultProvince = defaultProvince;
        return this;
    }
    public String getDefaultProvince() {
        return this.defaultProvince;
    }

    public AddressVerifyIntlRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public AddressVerifyIntlRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public AddressVerifyIntlRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public AddressVerifyIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddressVerifyIntlRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public AddressVerifyIntlRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
