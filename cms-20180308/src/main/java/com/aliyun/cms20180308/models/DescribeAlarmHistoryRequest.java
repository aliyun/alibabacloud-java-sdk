// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeAlarmHistoryRequest extends TeaModel {
    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("Ascending")
    public Boolean ascending;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OnlyCount")
    public Boolean onlyCount;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("State")
    public String state;

    @NameInMap("Status")
    public String status;

    public static DescribeAlarmHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmHistoryRequest self = new DescribeAlarmHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmHistoryRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public DescribeAlarmHistoryRequest setAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }
    public Boolean getAscending() {
        return this.ascending;
    }

    public DescribeAlarmHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAlarmHistoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAlarmHistoryRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeAlarmHistoryRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAlarmHistoryRequest setOnlyCount(Boolean onlyCount) {
        this.onlyCount = onlyCount;
        return this;
    }
    public Boolean getOnlyCount() {
        return this.onlyCount;
    }

    public DescribeAlarmHistoryRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeAlarmHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlarmHistoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlarmHistoryRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeAlarmHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAlarmHistoryRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeAlarmHistoryRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
