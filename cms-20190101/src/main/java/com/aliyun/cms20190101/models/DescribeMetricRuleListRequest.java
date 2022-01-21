// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleListRequest extends TeaModel {
    @NameInMap("AlertState")
    public String alertState;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("EnableState")
    public Boolean enableState;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleIds")
    public String ruleIds;

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
