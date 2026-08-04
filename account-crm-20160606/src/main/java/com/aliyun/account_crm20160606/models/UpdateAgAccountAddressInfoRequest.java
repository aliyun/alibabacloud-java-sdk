// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateAgAccountAddressInfoRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("Address2")
    public String address2;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("City")
    public String city;

    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("PK")
    public String PK;

    @NameInMap("PostCode")
    public String postCode;

    @NameInMap("Province")
    public String province;

    public static UpdateAgAccountAddressInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgAccountAddressInfoRequest self = new UpdateAgAccountAddressInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgAccountAddressInfoRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateAgAccountAddressInfoRequest setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }
    public String getAddress2() {
        return this.address2;
    }

    public UpdateAgAccountAddressInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateAgAccountAddressInfoRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public UpdateAgAccountAddressInfoRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public UpdateAgAccountAddressInfoRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public UpdateAgAccountAddressInfoRequest setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

    public UpdateAgAccountAddressInfoRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
