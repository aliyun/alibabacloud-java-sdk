// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertingMetricRuleResourcesRequest extends TeaModel {
    /**
     * <p>Queries alerts that occurred before this point in time. The value is a millisecond-level timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1698827400000</p>
     */
    @NameInMap("AlertBeforeTime")
    public String alertBeforeTime;

    /**
     * <p>The dimension map used to query monitoring data of a specified resource.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;userId\&quot;:\&quot;120886317861****\&quot;,\&quot;region\&quot;:\&quot;cn-huhehaote\&quot;,\&quot;queue\&quot;:\&quot;test-0128\&quot;}</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The ID of the application group. For more information about how to query application group IDs, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>7671****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The data namespace of the Alibaba Cloud service.</p>
     * <p>For more information about how to obtain the data namespace of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service monitoring metrics</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_mns_new</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number. </p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert rule. For more information about how to query alert rule IDs, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>putNewAlarm_user_7e78d765-0e3e-4671-ba6d-7ce39108****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static DescribeAlertingMetricRuleResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertingMetricRuleResourcesRequest self = new DescribeAlertingMetricRuleResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertingMetricRuleResourcesRequest setAlertBeforeTime(String alertBeforeTime) {
        this.alertBeforeTime = alertBeforeTime;
        return this;
    }
    public String getAlertBeforeTime() {
        return this.alertBeforeTime;
    }

    public DescribeAlertingMetricRuleResourcesRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeAlertingMetricRuleResourcesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeAlertingMetricRuleResourcesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAlertingMetricRuleResourcesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeAlertingMetricRuleResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertingMetricRuleResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertingMetricRuleResourcesRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
