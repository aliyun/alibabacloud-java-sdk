// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeUserFlowReportRequest extends TeaModel {
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

    @NameInMap("EsnGroupId")
    public String esnGroupId;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("EsnAppId")
    public String esnAppId;

    public static DescribeUserFlowReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserFlowReportRequest self = new DescribeUserFlowReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserFlowReportRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUserFlowReportRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUserFlowReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeUserFlowReportRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeUserFlowReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeUserFlowReportRequest setEsnGroupId(String esnGroupId) {
        this.esnGroupId = esnGroupId;
        return this;
    }
    public String getEsnGroupId() {
        return this.esnGroupId;
    }

    public DescribeUserFlowReportRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public DescribeUserFlowReportRequest setEsnAppId(String esnAppId) {
        this.esnAppId = esnAppId;
        return this;
    }
    public String getEsnAppId() {
        return this.esnAppId;
    }

}
