// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertHistoryListRequest extends TeaModel {
    /**
     * <p>The order of alerts. Valid values:</p>
     * <br>
     * <p>*   true (default value): reverse chronological order</p>
     * <p>*   false: chronological order</p>
     */
    @NameInMap("Ascending")
    public Boolean ascending;

    /**
     * <p>The end timestamp of the historical alerts that you want to query.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the application group.</p>
     * <br>
     * <p>For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The metric that is used to monitor the cloud service.</p>
     * <br>
     * <p>For information about how to query the name of a metric, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>For information about how to query the namespace of a cloud service, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert rule.</p>
     * <br>
     * <p>For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the alert rule.</p>
     * <br>
     * <p>For information about how to query the name of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The start timestamp of the historical alerts that you want to query.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the alert. Valid values:</p>
     * <br>
     * <p>*   ALARM (default value): Alerts are triggered.</p>
     * <p>*   OK: No alerts are triggered.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>Specifies whether alerts are muted. Valid values:</p>
     * <br>
     * <p>*   2 (default value): Alerts are muted and are not triggered within the mute period, even if the condition specified in the alert rule is met.</p>
     * <p>*   0: Alerts are triggered or cleared.</p>
     * <p>*   1: The alert rule is ineffective.</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeAlertHistoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertHistoryListRequest self = new DescribeAlertHistoryListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertHistoryListRequest setAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }
    public Boolean getAscending() {
        return this.ascending;
    }

    public DescribeAlertHistoryListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAlertHistoryListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAlertHistoryListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeAlertHistoryListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAlertHistoryListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeAlertHistoryListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertHistoryListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeAlertHistoryListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAlertHistoryListRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeAlertHistoryListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
