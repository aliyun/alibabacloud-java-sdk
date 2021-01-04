// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticResultByEsnBizProvince1DayRequest extends TeaModel {
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

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Type")
    public String type;

    public static DescribeSDKStatisticResultByEsnBizProvince1DayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticResultByEsnBizProvince1DayRequest self = new DescribeSDKStatisticResultByEsnBizProvince1DayRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayRequest setEsnApp(String esnApp) {
        this.esnApp = esnApp;
        return this;
    }
    public String getEsnApp() {
        return this.esnApp;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayRequest setEsnBiz(String esnBiz) {
        this.esnBiz = esnBiz;
        return this;
    }
    public String getEsnBiz() {
        return this.esnBiz;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
