// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CommonAddress extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("City")
    public String city;

    @NameInMap("Country")
    public String country;

    @NameInMap("State")
    public String state;

    @NameInMap("Zip")
    public String zip;

    public static CommonAddress build(java.util.Map<String, ?> map) throws Exception {
        CommonAddress self = new CommonAddress();
        return TeaModel.build(map, self);
    }

    public CommonAddress setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CommonAddress setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CommonAddress setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CommonAddress setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CommonAddress setZip(String zip) {
        this.zip = zip;
        return this;
    }
    public String getZip() {
        return this.zip;
    }

}
