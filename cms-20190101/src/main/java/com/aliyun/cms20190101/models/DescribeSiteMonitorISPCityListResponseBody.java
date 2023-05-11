// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorISPCityListResponseBody extends TeaModel {
    /**
     * <p>This topic provides an example on how to query the detection points that are provided by China Unicom in Guiyang.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The IP address pool.</p>
     */
    @NameInMap("IspCityList")
    public DescribeSiteMonitorISPCityListResponseBodyIspCityList ispCityList;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The detection points.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSiteMonitorISPCityListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorISPCityListResponseBody self = new DescribeSiteMonitorISPCityListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorISPCityListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSiteMonitorISPCityListResponseBody setIspCityList(DescribeSiteMonitorISPCityListResponseBodyIspCityList ispCityList) {
        this.ispCityList = ispCityList;
        return this;
    }
    public DescribeSiteMonitorISPCityListResponseBodyIspCityList getIspCityList() {
        return this.ispCityList;
    }

    public DescribeSiteMonitorISPCityListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSiteMonitorISPCityListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteMonitorISPCityListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCityIPPool extends TeaModel {
        @NameInMap("IPPool")
        public java.util.List<String> IPPool;

        public static DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCityIPPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCityIPPool self = new DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCityIPPool();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCityIPPool setIPPool(java.util.List<String> IPPool) {
            this.IPPool = IPPool;
            return this;
        }
        public java.util.List<String> getIPPool() {
            return this.IPPool;
        }

    }

    public static class DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity extends TeaModel {
        @NameInMap("Area.en")
        public String area_en;

        @NameInMap("Area.zh_CN")
        public String area_zh_cN;

        /**
         * <p>The code of the province.</p>
         */
        @NameInMap("City")
        public String city;

        @NameInMap("CityName.en")
        public String cityName_en;

        @NameInMap("CityName.zh_CN")
        public String cityName_zh_cN;

        /**
         * <p>Specifies whether to query IPv4 probes. Valid values:</p>
         * <br>
         * <p>*   true (default value): IPv4 probes are queried.</p>
         * <p>*   false: IPv4 probes are not queried.</p>
         */
        @NameInMap("Country")
        public String country;

        @NameInMap("Country.en")
        public String country_en;

        @NameInMap("Country.zh_CN")
        public String country_zh_cN;

        @NameInMap("IPPool")
        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCityIPPool IPPool;

        /**
         * <p>Specifies whether to return all detection points. Valid values:</p>
         * <br>
         * <p>*   true (default value): returns all detection points.</p>
         * <p>*   false: returns only available detection points.</p>
         */
        @NameInMap("IPV4ProbeCount")
        public String IPV4ProbeCount;

        /**
         * <p>The ID of the carrier.</p>
         */
        @NameInMap("IPV6ProbeCount")
        public String IPV6ProbeCount;

        /**
         * <p>The returned message.</p>
         */
        @NameInMap("Isp")
        public String isp;

        @NameInMap("IspName.en")
        public String ispName_en;

        @NameInMap("IspName.zh_CN")
        public String ispName_zh_cN;

        /**
         * <p>The code of the country.</p>
         */
        @NameInMap("Region")
        public String region;

        @NameInMap("Region.en")
        public String region_en;

        @NameInMap("Region.zh_CN")
        public String region_zh_cN;

        public static DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity self = new DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setArea_en(String area_en) {
            this.area_en = area_en;
            return this;
        }
        public String getArea_en() {
            return this.area_en;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setArea_zh_cN(String area_zh_cN) {
            this.area_zh_cN = area_zh_cN;
            return this;
        }
        public String getArea_zh_cN() {
            return this.area_zh_cN;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setCityName_en(String cityName_en) {
            this.cityName_en = cityName_en;
            return this;
        }
        public String getCityName_en() {
            return this.cityName_en;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setCityName_zh_cN(String cityName_zh_cN) {
            this.cityName_zh_cN = cityName_zh_cN;
            return this;
        }
        public String getCityName_zh_cN() {
            return this.cityName_zh_cN;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setCountry_en(String country_en) {
            this.country_en = country_en;
            return this;
        }
        public String getCountry_en() {
            return this.country_en;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setCountry_zh_cN(String country_zh_cN) {
            this.country_zh_cN = country_zh_cN;
            return this;
        }
        public String getCountry_zh_cN() {
            return this.country_zh_cN;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setIPPool(DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCityIPPool IPPool) {
            this.IPPool = IPPool;
            return this;
        }
        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCityIPPool getIPPool() {
            return this.IPPool;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setIPV4ProbeCount(String IPV4ProbeCount) {
            this.IPV4ProbeCount = IPV4ProbeCount;
            return this;
        }
        public String getIPV4ProbeCount() {
            return this.IPV4ProbeCount;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setIPV6ProbeCount(String IPV6ProbeCount) {
            this.IPV6ProbeCount = IPV6ProbeCount;
            return this;
        }
        public String getIPV6ProbeCount() {
            return this.IPV6ProbeCount;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setIspName_en(String ispName_en) {
            this.ispName_en = ispName_en;
            return this;
        }
        public String getIspName_en() {
            return this.ispName_en;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setIspName_zh_cN(String ispName_zh_cN) {
            this.ispName_zh_cN = ispName_zh_cN;
            return this;
        }
        public String getIspName_zh_cN() {
            return this.ispName_zh_cN;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setRegion_en(String region_en) {
            this.region_en = region_en;
            return this;
        }
        public String getRegion_en() {
            return this.region_en;
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity setRegion_zh_cN(String region_zh_cN) {
            this.region_zh_cN = region_zh_cN;
            return this;
        }
        public String getRegion_zh_cN() {
            return this.region_zh_cN;
        }

    }

    public static class DescribeSiteMonitorISPCityListResponseBodyIspCityList extends TeaModel {
        @NameInMap("IspCity")
        public java.util.List<DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity> ispCity;

        public static DescribeSiteMonitorISPCityListResponseBodyIspCityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorISPCityListResponseBodyIspCityList self = new DescribeSiteMonitorISPCityListResponseBodyIspCityList();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorISPCityListResponseBodyIspCityList setIspCity(java.util.List<DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity> ispCity) {
            this.ispCity = ispCity;
            return this;
        }
        public java.util.List<DescribeSiteMonitorISPCityListResponseBodyIspCityListIspCity> getIspCity() {
            return this.ispCity;
        }

    }

}
