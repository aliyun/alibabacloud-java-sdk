// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeIpv6LocationResponseBody extends TeaModel {
    @NameInMap("ProvinceEn")
    public String provinceEn;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CityEn")
    public String cityEn;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("City")
    public String city;

    @NameInMap("County")
    public String county;

    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("CountryEn")
    public String countryEn;

    @NameInMap("Province")
    public String province;

    @NameInMap("Country")
    public String country;

    @NameInMap("CountryCode")
    public String countryCode;

    public static DescribeIpv6LocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6LocationResponseBody self = new DescribeIpv6LocationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6LocationResponseBody setProvinceEn(String provinceEn) {
        this.provinceEn = provinceEn;
        return this;
    }
    public String getProvinceEn() {
        return this.provinceEn;
    }

    public DescribeIpv6LocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpv6LocationResponseBody setCityEn(String cityEn) {
        this.cityEn = cityEn;
        return this;
    }
    public String getCityEn() {
        return this.cityEn;
    }

    public DescribeIpv6LocationResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeIpv6LocationResponseBody setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeIpv6LocationResponseBody setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public DescribeIpv6LocationResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeIpv6LocationResponseBody setCounty(String county) {
        this.county = county;
        return this;
    }
    public String getCounty() {
        return this.county;
    }

    public DescribeIpv6LocationResponseBody setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public DescribeIpv6LocationResponseBody setCountryEn(String countryEn) {
        this.countryEn = countryEn;
        return this;
    }
    public String getCountryEn() {
        return this.countryEn;
    }

    public DescribeIpv6LocationResponseBody setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public DescribeIpv6LocationResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DescribeIpv6LocationResponseBody setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

}
