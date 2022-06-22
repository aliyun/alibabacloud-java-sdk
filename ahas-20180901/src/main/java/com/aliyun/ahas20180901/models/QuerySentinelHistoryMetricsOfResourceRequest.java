// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySentinelHistoryMetricsOfResourceRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("StartTime")
    public Long startTime;

    public static QuerySentinelHistoryMetricsOfResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySentinelHistoryMetricsOfResourceRequest self = new QuerySentinelHistoryMetricsOfResourceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySentinelHistoryMetricsOfResourceRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QuerySentinelHistoryMetricsOfResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QuerySentinelHistoryMetricsOfResourceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QuerySentinelHistoryMetricsOfResourceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QuerySentinelHistoryMetricsOfResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QuerySentinelHistoryMetricsOfResourceRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public QuerySentinelHistoryMetricsOfResourceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
