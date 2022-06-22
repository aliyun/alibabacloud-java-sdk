// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListMetricsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Group")
    public Boolean group;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MetricNames")
    public String metricNames;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("StartTime")
    public Long startTime;

    public static ListMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsRequest self = new ListMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListMetricsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ListMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListMetricsRequest setGroup(Boolean group) {
        this.group = group;
        return this;
    }
    public Boolean getGroup() {
        return this.group;
    }

    public ListMetricsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ListMetricsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListMetricsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMetricsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListMetricsRequest setMetricNames(String metricNames) {
        this.metricNames = metricNames;
        return this;
    }
    public String getMetricNames() {
        return this.metricNames;
    }

    public ListMetricsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
