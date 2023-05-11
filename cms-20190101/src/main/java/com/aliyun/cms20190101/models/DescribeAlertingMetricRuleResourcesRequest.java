// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertingMetricRuleResourcesRequest extends TeaModel {
    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>For more information about the namespaces of cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The resources that are monitored.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The timestamp when the last alert was triggered for the resource based on the alert rule.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeAlertingMetricRuleResources**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
     * <br>
     * <p>*   `>=`</p>
     * <p>*   `=`</p>
     * <p>*   `<=`</p>
     * <p>*   `>`</p>
     * <p>*   `<`</p>
     * <p>*   `!=`</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static DescribeAlertingMetricRuleResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertingMetricRuleResourcesRequest self = new DescribeAlertingMetricRuleResourcesRequest();
        return TeaModel.build(map, self);
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
