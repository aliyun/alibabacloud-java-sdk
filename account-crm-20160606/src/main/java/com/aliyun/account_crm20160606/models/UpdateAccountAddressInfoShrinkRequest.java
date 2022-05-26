// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateAccountAddressInfoShrinkRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("Address2")
    public String address2;

    @NameInMap("CityJsonString")
    public String cityJsonStringShrink;

    @NameInMap("PK")
    public String PK;

    @NameInMap("PostCode")
    public String postCode;

    @NameInMap("ProvinceJsonString")
    public String provinceJsonStringShrink;

    public static UpdateAccountAddressInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountAddressInfoShrinkRequest self = new UpdateAccountAddressInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccountAddressInfoShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateAccountAddressInfoShrinkRequest setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }
    public String getAddress2() {
        return this.address2;
    }

    public UpdateAccountAddressInfoShrinkRequest setCityJsonStringShrink(String cityJsonStringShrink) {
        this.cityJsonStringShrink = cityJsonStringShrink;
        return this;
    }
    public String getCityJsonStringShrink() {
        return this.cityJsonStringShrink;
    }

    public UpdateAccountAddressInfoShrinkRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public UpdateAccountAddressInfoShrinkRequest setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

    public UpdateAccountAddressInfoShrinkRequest setProvinceJsonStringShrink(String provinceJsonStringShrink) {
        this.provinceJsonStringShrink = provinceJsonStringShrink;
        return this;
    }
    public String getProvinceJsonStringShrink() {
        return this.provinceJsonStringShrink;
    }

}
