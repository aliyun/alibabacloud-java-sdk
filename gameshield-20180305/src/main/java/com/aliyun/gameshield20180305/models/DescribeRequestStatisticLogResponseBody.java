// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeRequestStatisticLogResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeRequestStatisticLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticLogResponseBody self = new DescribeRequestStatisticLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRequestStatisticLogResponseBody setStatistic(java.util.List<DescribeRequestStatisticLogResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeRequestStatisticLogResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeRequestStatisticLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeRequestStatisticLogResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeRequestStatisticLogResponseBodyStatistic extends TeaModel {
        @NameInMap("ServerTime")
        public String serverTime;

        @NameInMap("CallResult")
        public String callResult;

        @NameInMap("Token")
        public String token;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("DetectIp")
        public String detectIp;

        @NameInMap("EsnAppId")
        public String esnAppId;

        @NameInMap("City")
        public String city;

        @NameInMap("IspId")
        public String ispId;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("EscapedTime")
        public String escapedTime;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("CityId")
        public String cityId;

        @NameInMap("ProvinceId")
        public String provinceId;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("SdkVersion")
        public String sdkVersion;

        @NameInMap("Country")
        public String country;

        @NameInMap("EsnGroupId")
        public String esnGroupId;

        @NameInMap("Province")
        public String province;

        @NameInMap("EsnBizId")
        public String esnBizId;

        public static DescribeRequestStatisticLogResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestStatisticLogResponseBodyStatistic self = new DescribeRequestStatisticLogResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setServerTime(String serverTime) {
            this.serverTime = serverTime;
            return this;
        }
        public String getServerTime() {
            return this.serverTime;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setCallResult(String callResult) {
            this.callResult = callResult;
            return this;
        }
        public String getCallResult() {
            return this.callResult;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setDetectIp(String detectIp) {
            this.detectIp = detectIp;
            return this;
        }
        public String getDetectIp() {
            return this.detectIp;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setEsnAppId(String esnAppId) {
            this.esnAppId = esnAppId;
            return this;
        }
        public String getEsnAppId() {
            return this.esnAppId;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setIspId(String ispId) {
            this.ispId = ispId;
            return this;
        }
        public String getIspId() {
            return this.ispId;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setEscapedTime(String escapedTime) {
            this.escapedTime = escapedTime;
            return this;
        }
        public String getEscapedTime() {
            return this.escapedTime;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }
        public String getCityId() {
            return this.cityId;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setProvinceId(String provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public String getProvinceId() {
            return this.provinceId;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setEsnGroupId(String esnGroupId) {
            this.esnGroupId = esnGroupId;
            return this;
        }
        public String getEsnGroupId() {
            return this.esnGroupId;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public DescribeRequestStatisticLogResponseBodyStatistic setEsnBizId(String esnBizId) {
            this.esnBizId = esnBizId;
            return this;
        }
        public String getEsnBizId() {
            return this.esnBizId;
        }

    }

}
