// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticByEsnBizIntervalRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("EsnApp")
    public String esnApp;

    @NameInMap("EsnBiz")
    public String esnBiz;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("Province")
    public String province;

    @NameInMap("Country")
    public String country;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeRequestStatisticByEsnBizIntervalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticByEsnBizIntervalRequest self = new DescribeRequestStatisticByEsnBizIntervalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setEsnApp(String esnApp) {
        this.esnApp = esnApp;
        return this;
    }
    public String getEsnApp() {
        return this.esnApp;
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setEsnBiz(String esnBiz) {
        this.esnBiz = esnBiz;
        return this;
    }
    public String getEsnBiz() {
        return this.esnBiz;
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeRequestStatisticByEsnBizIntervalRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
