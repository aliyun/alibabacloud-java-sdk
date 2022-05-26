// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateAccountAddressInfoRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("Address2")
    public String address2;

    @NameInMap("CityJsonString")
    public java.util.Map<String, ?> cityJsonString;

    @NameInMap("PK")
    public String PK;

    @NameInMap("PostCode")
    public String postCode;

    @NameInMap("ProvinceJsonString")
    public java.util.Map<String, ?> provinceJsonString;

    public static UpdateAccountAddressInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountAddressInfoRequest self = new UpdateAccountAddressInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccountAddressInfoRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateAccountAddressInfoRequest setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }
    public String getAddress2() {
        return this.address2;
    }

    public UpdateAccountAddressInfoRequest setCityJsonString(java.util.Map<String, ?> cityJsonString) {
        this.cityJsonString = cityJsonString;
        return this;
    }
    public java.util.Map<String, ?> getCityJsonString() {
        return this.cityJsonString;
    }

    public UpdateAccountAddressInfoRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public UpdateAccountAddressInfoRequest setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

    public UpdateAccountAddressInfoRequest setProvinceJsonString(java.util.Map<String, ?> provinceJsonString) {
        this.provinceJsonString = provinceJsonString;
        return this;
    }
    public java.util.Map<String, ?> getProvinceJsonString() {
        return this.provinceJsonString;
    }

}
