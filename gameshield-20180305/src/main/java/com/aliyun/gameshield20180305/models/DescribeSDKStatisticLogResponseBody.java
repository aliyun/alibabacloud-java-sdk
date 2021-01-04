// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeSDKStatisticLogResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeSDKStatisticLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticLogResponseBody self = new DescribeSDKStatisticLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSDKStatisticLogResponseBody setStatistic(java.util.List<DescribeSDKStatisticLogResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeSDKStatisticLogResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeSDKStatisticLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeSDKStatisticLogResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeSDKStatisticLogResponseBodyStatistic extends TeaModel {
        @NameInMap("ServerTime")
        public String serverTime;

        @NameInMap("CallResult")
        public String callResult;

        @NameInMap("Token")
        public String token;

        @NameInMap("PingResult")
        public String pingResult;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("City")
        public String city;

        @NameInMap("ConnectResult")
        public String connectResult;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("ProvinceId")
        public String provinceId;

        @NameInMap("DetectIp")
        public String detectIp;

        @NameInMap("TraceResult")
        public String traceResult;

        @NameInMap("EsnAppId")
        public String esnAppId;

        @NameInMap("MType")
        public String MType;

        @NameInMap("IspId")
        public String ispId;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("CityId")
        public String cityId;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("VerdictCode")
        public String verdictCode;

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

        public static DescribeSDKStatisticLogResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDKStatisticLogResponseBodyStatistic self = new DescribeSDKStatisticLogResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setServerTime(String serverTime) {
            this.serverTime = serverTime;
            return this;
        }
        public String getServerTime() {
            return this.serverTime;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setCallResult(String callResult) {
            this.callResult = callResult;
            return this;
        }
        public String getCallResult() {
            return this.callResult;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setPingResult(String pingResult) {
            this.pingResult = pingResult;
            return this;
        }
        public String getPingResult() {
            return this.pingResult;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setConnectResult(String connectResult) {
            this.connectResult = connectResult;
            return this;
        }
        public String getConnectResult() {
            return this.connectResult;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setProvinceId(String provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public String getProvinceId() {
            return this.provinceId;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setDetectIp(String detectIp) {
            this.detectIp = detectIp;
            return this;
        }
        public String getDetectIp() {
            return this.detectIp;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setTraceResult(String traceResult) {
            this.traceResult = traceResult;
            return this;
        }
        public String getTraceResult() {
            return this.traceResult;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setEsnAppId(String esnAppId) {
            this.esnAppId = esnAppId;
            return this;
        }
        public String getEsnAppId() {
            return this.esnAppId;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setMType(String MType) {
            this.MType = MType;
            return this;
        }
        public String getMType() {
            return this.MType;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setIspId(String ispId) {
            this.ispId = ispId;
            return this;
        }
        public String getIspId() {
            return this.ispId;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }
        public String getCityId() {
            return this.cityId;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setVerdictCode(String verdictCode) {
            this.verdictCode = verdictCode;
            return this;
        }
        public String getVerdictCode() {
            return this.verdictCode;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setEsnGroupId(String esnGroupId) {
            this.esnGroupId = esnGroupId;
            return this;
        }
        public String getEsnGroupId() {
            return this.esnGroupId;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public DescribeSDKStatisticLogResponseBodyStatistic setEsnBizId(String esnBizId) {
            this.esnBizId = esnBizId;
            return this;
        }
        public String getEsnBizId() {
            return this.esnBizId;
        }

    }

}
