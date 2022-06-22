// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyNodeMetricRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ConfigurationId")
    public String configurationId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MetricKey")
    public String metricKey;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("ViewId")
    public String viewId;

    public static QueryTopologyNodeMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyNodeMetricRequest self = new QueryTopologyNodeMetricRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopologyNodeMetricRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryTopologyNodeMetricRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

    public QueryTopologyNodeMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryTopologyNodeMetricRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTopologyNodeMetricRequest setMetricKey(String metricKey) {
        this.metricKey = metricKey;
        return this;
    }
    public String getMetricKey() {
        return this.metricKey;
    }

    public QueryTopologyNodeMetricRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryTopologyNodeMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryTopologyNodeMetricRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
