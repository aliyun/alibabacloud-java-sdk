// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSyntheticProbeListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("IspCityList")
    public java.util.List<DescribeSyntheticProbeListResponseBodyIspCityList> ispCityList;

    /**
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>87170bc7-e28a-4c93-b9bf-90a1dbe84736</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSyntheticProbeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyntheticProbeListResponseBody self = new DescribeSyntheticProbeListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyntheticProbeListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSyntheticProbeListResponseBody setIspCityList(java.util.List<DescribeSyntheticProbeListResponseBodyIspCityList> ispCityList) {
        this.ispCityList = ispCityList;
        return this;
    }
    public java.util.List<DescribeSyntheticProbeListResponseBodyIspCityList> getIspCityList() {
        return this.ispCityList;
    }

    public DescribeSyntheticProbeListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSyntheticProbeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSyntheticProbeListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSyntheticProbeListResponseBodyIspCityList extends TeaModel {
        @NameInMap("AreaCn")
        public String areaCn;

        /**
         * <strong>example:</strong>
         * <p>Huabei</p>
         */
        @NameInMap("AreaEn")
        public String areaEn;

        /**
         * <strong>example:</strong>
         * <p>738</p>
         */
        @NameInMap("City")
        public String city;

        @NameInMap("CityCn")
        public String cityCn;

        /**
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("CityEn")
        public String cityEn;

        /**
         * <strong>example:</strong>
         * <p>629</p>
         */
        @NameInMap("Country")
        public String country;

        @NameInMap("CountryCn")
        public String countryCn;

        /**
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("CountryEn")
        public String countryEn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IdcV4ProbeCount")
        public Integer idcV4ProbeCount;

        @NameInMap("IdcV6ProbeCount")
        public Integer idcV6ProbeCount;

        @NameInMap("IpPool")
        public java.util.List<String> ipPool;

        /**
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("Isp")
        public String isp;

        @NameInMap("IspCn")
        public String ispCn;

        /**
         * <strong>example:</strong>
         * <p>China-Unicom</p>
         */
        @NameInMap("IspEn")
        public String ispEn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LmProbeCount")
        public Integer lmProbeCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MbProbeCount")
        public Integer mbProbeCount;

        /**
         * <strong>example:</strong>
         * <p>264</p>
         */
        @NameInMap("Region")
        public String region;

        @NameInMap("RegionCn")
        public String regionCn;

        /**
         * <strong>example:</strong>
         * <p>Jiangxi</p>
         */
        @NameInMap("RegionEn")
        public String regionEn;

        public static DescribeSyntheticProbeListResponseBodyIspCityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyntheticProbeListResponseBodyIspCityList self = new DescribeSyntheticProbeListResponseBodyIspCityList();
            return TeaModel.build(map, self);
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setAreaCn(String areaCn) {
            this.areaCn = areaCn;
            return this;
        }
        public String getAreaCn() {
            return this.areaCn;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setAreaEn(String areaEn) {
            this.areaEn = areaEn;
            return this;
        }
        public String getAreaEn() {
            return this.areaEn;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setCityCn(String cityCn) {
            this.cityCn = cityCn;
            return this;
        }
        public String getCityCn() {
            return this.cityCn;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setCityEn(String cityEn) {
            this.cityEn = cityEn;
            return this;
        }
        public String getCityEn() {
            return this.cityEn;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setCountryCn(String countryCn) {
            this.countryCn = countryCn;
            return this;
        }
        public String getCountryCn() {
            return this.countryCn;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setCountryEn(String countryEn) {
            this.countryEn = countryEn;
            return this;
        }
        public String getCountryEn() {
            return this.countryEn;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setIdcV4ProbeCount(Integer idcV4ProbeCount) {
            this.idcV4ProbeCount = idcV4ProbeCount;
            return this;
        }
        public Integer getIdcV4ProbeCount() {
            return this.idcV4ProbeCount;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setIdcV6ProbeCount(Integer idcV6ProbeCount) {
            this.idcV6ProbeCount = idcV6ProbeCount;
            return this;
        }
        public Integer getIdcV6ProbeCount() {
            return this.idcV6ProbeCount;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setIpPool(java.util.List<String> ipPool) {
            this.ipPool = ipPool;
            return this;
        }
        public java.util.List<String> getIpPool() {
            return this.ipPool;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setIspCn(String ispCn) {
            this.ispCn = ispCn;
            return this;
        }
        public String getIspCn() {
            return this.ispCn;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setIspEn(String ispEn) {
            this.ispEn = ispEn;
            return this;
        }
        public String getIspEn() {
            return this.ispEn;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setLmProbeCount(Integer lmProbeCount) {
            this.lmProbeCount = lmProbeCount;
            return this;
        }
        public Integer getLmProbeCount() {
            return this.lmProbeCount;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setMbProbeCount(Integer mbProbeCount) {
            this.mbProbeCount = mbProbeCount;
            return this;
        }
        public Integer getMbProbeCount() {
            return this.mbProbeCount;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setRegionCn(String regionCn) {
            this.regionCn = regionCn;
            return this;
        }
        public String getRegionCn() {
            return this.regionCn;
        }

        public DescribeSyntheticProbeListResponseBodyIspCityList setRegionEn(String regionEn) {
            this.regionEn = regionEn;
            return this;
        }
        public String getRegionEn() {
            return this.regionEn;
        }

    }

}
