// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Address extends TeaModel {
    /**
     * <p>The full address.</p>
     * 
     * <strong>example:</strong>
     * <p>中国浙江省杭州市余杭区文一西路969号</p>
     */
    @NameInMap("AddressLine")
    public String addressLine;

    /**
     * <p>The city.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The country or region.</p>
     * 
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>The district.</p>
     * 
     * <strong>example:</strong>
     * <p>余杭区</p>
     */
    @NameInMap("District")
    public String district;

    /**
     * <p>The BCP 47 language code.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-Hans</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The province.</p>
     * 
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>The street.</p>
     * 
     * <strong>example:</strong>
     * <p>文一西路</p>
     */
    @NameInMap("Township")
    public String township;

    public static Address build(java.util.Map<String, ?> map) throws Exception {
        Address self = new Address();
        return TeaModel.build(map, self);
    }

    public Address setAddressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }
    public String getAddressLine() {
        return this.addressLine;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public Address setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public Address setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public Address setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public Address setTownship(String township) {
        this.township = township;
        return this;
    }
    public String getTownship() {
        return this.township;
    }

}
