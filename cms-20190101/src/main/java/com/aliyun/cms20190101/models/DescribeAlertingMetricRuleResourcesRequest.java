// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertingMetricRuleResourcesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Dimensions")
    public String dimensions;

    public static DescribeAlertingMetricRuleResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertingMetricRuleResourcesRequest self = new DescribeAlertingMetricRuleResourcesRequest();
        return TeaModel.build(map, self);
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

    public DescribeAlertingMetricRuleResourcesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
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

    public DescribeAlertingMetricRuleResourcesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAlertingMetricRuleResourcesRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

}
