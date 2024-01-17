// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebReportTopIpRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Top")
    public Integer top;

    public static DescribeWebReportTopIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebReportTopIpRequest self = new DescribeWebReportTopIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebReportTopIpRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeWebReportTopIpRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeWebReportTopIpRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeWebReportTopIpRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeWebReportTopIpRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeWebReportTopIpRequest setTop(Integer top) {
        this.top = top;
        return this;
    }
    public Integer getTop() {
        return this.top;
    }

}
