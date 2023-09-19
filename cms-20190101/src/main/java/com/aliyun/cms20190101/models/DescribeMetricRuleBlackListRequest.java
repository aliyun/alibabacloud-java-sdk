// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleBlackListRequest extends TeaModel {
    /**
     * <p>The ID of the blacklist policy.</p>
     */
    @NameInMap("Category")
    public String category;

    @NameInMap("Ids")
    public java.util.List<String> ids;

    /**
     * <p>The IDs of the instances in the blacklist policy.</p>
     * <br>
     * <p>Valid values of N: 0 to 10.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The status of the blacklist policy. Valid values:</p>
     * <br>
     * <p>*   true: The blacklist policy is enabled.</p>
     * <p>*   false: The blacklist policy is disabled.</p>
     */
    @NameInMap("IsEnable")
    public Boolean isEnable;

    /**
     * <p>The name of the blacklist policy.</p>
     * <br>
     * <p>This parameter supports fuzzy match.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The timestamp when the blacklist policy expired.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Order")
    public Integer order;

    /**
     * <p>The name of the metric.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The categories of the Alibaba Cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include `kvstore_standard`, `kvstore_sharding`, and `kvstore_splitrw`.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The effective scope of the blacklist policy. Valid values:</p>
     * <br>
     * <p>*   USER: The blacklist policy takes effect only within the current Alibaba Cloud account.</p>
     * <p>*   GROUP: The blacklist policy takes effect only within the specified application group.</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    public static DescribeMetricRuleBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleBlackListRequest self = new DescribeMetricRuleBlackListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleBlackListRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeMetricRuleBlackListRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public DescribeMetricRuleBlackListRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeMetricRuleBlackListRequest setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    public DescribeMetricRuleBlackListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeMetricRuleBlackListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricRuleBlackListRequest setOrder(Integer order) {
        this.order = order;
        return this;
    }
    public Integer getOrder() {
        return this.order;
    }

    public DescribeMetricRuleBlackListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMetricRuleBlackListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMetricRuleBlackListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricRuleBlackListRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

}
