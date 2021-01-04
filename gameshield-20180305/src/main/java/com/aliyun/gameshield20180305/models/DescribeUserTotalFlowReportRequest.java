// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeUserTotalFlowReportRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeUserTotalFlowReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTotalFlowReportRequest self = new DescribeUserTotalFlowReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserTotalFlowReportRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUserTotalFlowReportRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUserTotalFlowReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeUserTotalFlowReportRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeUserTotalFlowReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
