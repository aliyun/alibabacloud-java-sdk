// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class CorrectAddressRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("DefaultCity")
    public String defaultCity;

    @NameInMap("DefaultDistrict")
    public String defaultDistrict;

    @NameInMap("DefaultProvince")
    public String defaultProvince;

    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Text")
    public String text;

    public static CorrectAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CorrectAddressRequest self = new CorrectAddressRequest();
        return TeaModel.build(map, self);
    }

    public CorrectAddressRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CorrectAddressRequest setDefaultCity(String defaultCity) {
        this.defaultCity = defaultCity;
        return this;
    }
    public String getDefaultCity() {
        return this.defaultCity;
    }

    public CorrectAddressRequest setDefaultDistrict(String defaultDistrict) {
        this.defaultDistrict = defaultDistrict;
        return this;
    }
    public String getDefaultDistrict() {
        return this.defaultDistrict;
    }

    public CorrectAddressRequest setDefaultProvince(String defaultProvince) {
        this.defaultProvince = defaultProvince;
        return this;
    }
    public String getDefaultProvince() {
        return this.defaultProvince;
    }

    public CorrectAddressRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CorrectAddressRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
