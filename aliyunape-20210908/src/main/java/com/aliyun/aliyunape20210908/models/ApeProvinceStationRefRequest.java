// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class ApeProvinceStationRefRequest extends TeaModel {
    // adcode
    @NameInMap("Adcode")
    public Long adcode;

    // appName
    @NameInMap("AppName")
    public String appName;

    // city
    @NameInMap("City")
    public String city;

    // cnty
    @NameInMap("Cnty")
    public String cnty;

    // country
    @NameInMap("Country")
    public String country;

    // offset
    @NameInMap("Offset")
    public Integer offset;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // provinceCode
    @NameInMap("ProvinceCode")
    public Long provinceCode;

    // provinceName
    @NameInMap("ProvinceName")
    public String provinceName;

    // stationName
    @NameInMap("StationName")
    public String stationName;

    public static ApeProvinceStationRefRequest build(java.util.Map<String, ?> map) throws Exception {
        ApeProvinceStationRefRequest self = new ApeProvinceStationRefRequest();
        return TeaModel.build(map, self);
    }

    public ApeProvinceStationRefRequest setAdcode(Long adcode) {
        this.adcode = adcode;
        return this;
    }
    public Long getAdcode() {
        return this.adcode;
    }

    public ApeProvinceStationRefRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ApeProvinceStationRefRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public ApeProvinceStationRefRequest setCnty(String cnty) {
        this.cnty = cnty;
        return this;
    }
    public String getCnty() {
        return this.cnty;
    }

    public ApeProvinceStationRefRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ApeProvinceStationRefRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ApeProvinceStationRefRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ApeProvinceStationRefRequest setProvinceCode(Long provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public Long getProvinceCode() {
        return this.provinceCode;
    }

    public ApeProvinceStationRefRequest setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }
    public String getProvinceName() {
        return this.provinceName;
    }

    public ApeProvinceStationRefRequest setStationName(String stationName) {
        this.stationName = stationName;
        return this;
    }
    public String getStationName() {
        return this.stationName;
    }

}
