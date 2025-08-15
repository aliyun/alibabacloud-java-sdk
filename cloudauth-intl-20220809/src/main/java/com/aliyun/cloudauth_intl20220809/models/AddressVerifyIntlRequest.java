// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddressVerifyIntlRequest extends TeaModel {
    /**
     * <p>Verification address type:</p>
     * <ul>
     * <li>“0”: Text address</li>
     * <li>“1”: Latitude and longitude</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>“0”</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>Default city</p>
     * 
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("DefaultCity")
    public String defaultCity;

    /**
     * <p>Country name, currently only supports: China</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("DefaultCountry")
    public String defaultCountry;

    /**
     * <p>Default district</p>
     * 
     * <strong>example:</strong>
     * <p>余杭区</p>
     */
    @NameInMap("DefaultDistrict")
    public String defaultDistrict;

    /**
     * <p>Default province</p>
     * 
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("DefaultProvince")
    public String defaultProvince;

    /**
     * <p>Latitude.</p>
     * 
     * <strong>example:</strong>
     * <p>“31.2304”</p>
     */
    @NameInMap("Latitude")
    public String latitude;

    /**
     * <p>Longitude.</p>
     * 
     * <strong>example:</strong>
     * <p>“121.4737”</p>
     */
    @NameInMap("Longitude")
    public String longitude;

    /**
     * <p>Supports Chinese mobile phone numbers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1872334****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>Fixed value: ADD_VERIFY_PRO</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD_VERIFY_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Detailed address text content</p>
     * 
     * <strong>example:</strong>
     * <p>阿里巴巴西溪园区</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>Address verification method:</p>
     * <ul>
     * <li>HOME: Home address verification</li>
     * <li>WORK: Work address verification</li>
     * </ul>
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
