// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleListRequest extends TeaModel {
    /**
     * <p>The state of the alert rule. Valid values:</p>
     * <ul>
     * <li>OK: Normal.</li>
     * <li>ALARM: Alert.</li>
     * <li>INSUFFICIENT_DATA: No data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("AlertState")
    public String alertState;

    /**
     * <p>The monitoring dimensions of the specified resource.</p>
     * <p>Format: a collection of <code>key:value</code> pairs. Example: <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> and <code>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The enabled state of the alert rule. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableState")
    public Boolean enableState;

    /**
     * <p>The ID of the application group.</p>
     * <p>For information about how to obtain the application group ID, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>7301****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The metric name.</p>
     * <p>For information about how to obtain metric names, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">cloud service monitoring metrics</a>.</p>
     * <p>Note: For composite metrics, you can retrieve results only by the first metric.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the Alibaba Cloud service.</p>
     * <p>For information about how to obtain the namespace of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">cloud service monitoring metrics</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number.</p>
     * <p>Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * <p>Minimum value: 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the alert rules. Separate multiple IDs with commas (,). You can query up to 20 alert rules at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>applyTemplate344cfd42-0f32-4fd6-805a-88d7908a****</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

    /**
     * <p>The name of the alert rule.</p>
     * <p>This parameter supports fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>Rule_01</p>
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
