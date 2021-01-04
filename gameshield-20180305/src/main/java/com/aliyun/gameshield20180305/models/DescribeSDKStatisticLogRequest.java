// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticLogRequest extends TeaModel {
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

    @NameInMap("Result")
    public String result;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("DetectIp")
    public String detectIp;

    public static DescribeSDKStatisticLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticLogRequest self = new DescribeSDKStatisticLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticLogRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSDKStatisticLogRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSDKStatisticLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSDKStatisticLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSDKStatisticLogRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeSDKStatisticLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSDKStatisticLogRequest setEsnApp(String esnApp) {
        this.esnApp = esnApp;
        return this;
    }
    public String getEsnApp() {
        return this.esnApp;
    }

    public DescribeSDKStatisticLogRequest setEsnBiz(String esnBiz) {
        this.esnBiz = esnBiz;
        return this;
    }
    public String getEsnBiz() {
        return this.esnBiz;
    }

    public DescribeSDKStatisticLogRequest setEsnGroup(String esnGroup) {
        this.esnGroup = esnGroup;
        return this;
    }
    public String getEsnGroup() {
        return this.esnGroup;
    }

    public DescribeSDKStatisticLogRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeSDKStatisticLogRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DescribeSDKStatisticLogRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public DescribeSDKStatisticLogRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeSDKStatisticLogRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public DescribeSDKStatisticLogRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public DescribeSDKStatisticLogRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DescribeSDKStatisticLogRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribeSDKStatisticLogRequest setDetectIp(String detectIp) {
        this.detectIp = detectIp;
        return this;
    }
    public String getDetectIp() {
        return this.detectIp;
    }

}
