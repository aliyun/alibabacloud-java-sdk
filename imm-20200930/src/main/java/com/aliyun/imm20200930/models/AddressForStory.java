// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddressForStory extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("Country")
    public String country;

    @NameInMap("District")
    public String district;

    @NameInMap("Province")
    public String province;

    @NameInMap("Township")
    public String township;

    public static AddressForStory build(java.util.Map<String, ?> map) throws Exception {
        AddressForStory self = new AddressForStory();
        return TeaModel.build(map, self);
    }

    public AddressForStory setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public AddressForStory setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public AddressForStory setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public AddressForStory setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public AddressForStory setTownship(String township) {
        this.township = township;
        return this;
    }
    public String getTownship() {
        return this.township;
    }

}
