// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticLogRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("EsnApp")
    public String esnApp;

    @NameInMap("EsnBiz")
    public String esnBiz;

    @NameInMap("EsnGroup")
    public String esnGroup;

    @NameInMap("Source")
    public String source;

    @NameInMap("Country")
    public String country;

    @NameInMap("Province")
    public String province;

    @NameInMap("City")
    public String city;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("Token")
    public String token;

    @NameInMap("SDK")
    public String SDK;

    @NameInMap("CallResult")
    public String callResult;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("EscapedLessThan")
    public Long escapedLessThan;

    @NameInMap("EscapedGreaterThan")
    public Long escapedGreaterThan;

    @NameInMap("DetectIp")
    public String detectIp;

    public static DescribeRequestStatisticLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticLogRequest self = new DescribeRequestStatisticLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticLogRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeRequestStatisticLogRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRequestStatisticLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeRequestStatisticLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRequestStatisticLogRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeRequestStatisticLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRequestStatisticLogRequest setEsnApp(String esnApp) {
        this.esnApp = esnApp;
        return this;
    }
    public String getEsnApp() {
        return this.esnApp;
    }

    public DescribeRequestStatisticLogRequest setEsnBiz(String esnBiz) {
        this.esnBiz = esnBiz;
        return this;
    }
    public String getEsnBiz() {
        return this.esnBiz;
    }

    public DescribeRequestStatisticLogRequest setEsnGroup(String esnGroup) {
        this.esnGroup = esnGroup;
        return this;
    }
    public String getEsnGroup() {
        return this.esnGroup;
    }

    public DescribeRequestStatisticLogRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeRequestStatisticLogRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DescribeRequestStatisticLogRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public DescribeRequestStatisticLogRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeRequestStatisticLogRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public DescribeRequestStatisticLogRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public DescribeRequestStatisticLogRequest setSDK(String SDK) {
        this.SDK = SDK;
        return this;
    }
    public String getSDK() {
        return this.SDK;
    }

    public DescribeRequestStatisticLogRequest setCallResult(String callResult) {
        this.callResult = callResult;
        return this;
    }
    public String getCallResult() {
        return this.callResult;
    }

    public DescribeRequestStatisticLogRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribeRequestStatisticLogRequest setEscapedLessThan(Long escapedLessThan) {
        this.escapedLessThan = escapedLessThan;
        return this;
    }
    public Long getEscapedLessThan() {
        return this.escapedLessThan;
    }

    public DescribeRequestStatisticLogRequest setEscapedGreaterThan(Long escapedGreaterThan) {
        this.escapedGreaterThan = escapedGreaterThan;
        return this;
    }
    public Long getEscapedGreaterThan() {
        return this.escapedGreaterThan;
    }

    public DescribeRequestStatisticLogRequest setDetectIp(String detectIp) {
        this.detectIp = detectIp;
        return this;
    }
    public String getDetectIp() {
        return this.detectIp;
    }

}
