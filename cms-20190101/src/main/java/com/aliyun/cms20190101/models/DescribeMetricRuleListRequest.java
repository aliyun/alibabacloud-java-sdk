// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleListRequest extends TeaModel {
    /**
     * <p>The status of the alert rule. Valid values:</p>
     * <br>
     * <p>*   OK: The alert rule has no active alerts.</p>
     * <p>*   ALARM: The alert rule has active alerts.</p>
     * <p>*   INSUFFICIENT_DATA: No data is available.</p>
     */
    @NameInMap("AlertState")
    public String alertState;

    /**
     * <p>The dimensions of the alert rule. The dimensions specify the resources for which you want to query monitoring data.</p>
     * <br>
     * <p>Set the value to a set of key-value pairs, for example, `userId:120886317861****` or `i-2ze2d6j5uhg20x47****`.</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>Specifies whether to query enabled or disabled alert rules. Valid values:</p>
     * <br>
     * <p>*   true: queries enabled alert rules.</p>
     * <p>*   false: queries disabled alert rules.</p>
     */
    @NameInMap("EnableState")
    public Boolean enableState;

    /**
     * <p>The ID of the application group.</p>
     * <br>
     * <p>For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the metric.</p>
     * <br>
     * <p>For information about how to obtain the name of a metric, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>For information about how to obtain the namespace of a cloud service, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number of the page to return.</p>
     * <br>
     * <p>Minimum value: 1. Default value: 1.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Minimum value: 1. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert rule. You can specify up to 20 IDs at a time. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

    /**
     * <p>The name of the alert rule.</p>
     * <br>
     * <p>This parameter supports fuzzy match.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static DescribeMetricRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleListRequest self = new DescribeMetricRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleListRequest setAlertState(String alertState) {
        this.alertState = alertState;
        return this;
    }
    public String getAlertState() {
        return this.alertState;
    }

    public DescribeMetricRuleListRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeMetricRuleListRequest setEnableState(Boolean enableState) {
        this.enableState = enableState;
        return this;
    }
    public Boolean getEnableState() {
        return this.enableState;
    }

    public DescribeMetricRuleListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeMetricRuleListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricRuleListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricRuleListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeMetricRuleListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMetricRuleListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricRuleListRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

    public DescribeMetricRuleListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
