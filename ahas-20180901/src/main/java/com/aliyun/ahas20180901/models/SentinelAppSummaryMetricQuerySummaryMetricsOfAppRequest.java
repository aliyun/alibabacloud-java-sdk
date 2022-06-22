// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppSummaryMetricQuerySummaryMetricsOfAppRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("StartTime")
    public Long startTime;

    public static SentinelAppSummaryMetricQuerySummaryMetricsOfAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppSummaryMetricQuerySummaryMetricsOfAppRequest self = new SentinelAppSummaryMetricQuerySummaryMetricsOfAppRequest();
        return TeaModel.build(map, self);
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelAppSummaryMetricQuerySummaryMetricsOfAppRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
