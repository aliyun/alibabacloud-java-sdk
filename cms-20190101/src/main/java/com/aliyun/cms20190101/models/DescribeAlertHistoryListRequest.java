// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertHistoryListRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Status")
    public String status;

    @NameInMap("State")
    public String state;

    @NameInMap("Ascending")
    public Boolean ascending;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Page")
    public Integer page;

    public static DescribeAlertHistoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertHistoryListRequest self = new DescribeAlertHistoryListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertHistoryListRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeAlertHistoryListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeAlertHistoryListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAlertHistoryListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeAlertHistoryListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAlertHistoryListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAlertHistoryListRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeAlertHistoryListRequest setAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }
    public Boolean getAscending() {
        return this.ascending;
    }

    public DescribeAlertHistoryListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAlertHistoryListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAlertHistoryListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertHistoryListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

}
