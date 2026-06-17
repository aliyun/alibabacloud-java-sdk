// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleBlackListRequest extends TeaModel {
    /**
     * <p>The category of the Alibaba Cloud service. For example, Redis has different editions, such as <code>kvstore_standard</code> (Standard Edition), <code>kvstore_sharding</code> (Cluster Edition), and <code>kvstore_splitrw</code> (Read/write Splitting Edition).</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The IDs of the blacklist policies.</p>
     */
    @NameInMap("Ids")
    public java.util.List<String> ids;

    /**
     * <p>The IDs of instances in the blacklist policy.</p>
     * <p>The value of N can be an integer from 0 to 10.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The status of the blacklist policy. Valid values:</p>
     * <ul>
     * <li><p>true: enabled.</p>
     * </li>
     * <li><p>false: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsEnable")
    public Boolean isEnable;

    /**
     * <p>The name of the blacklist policy.</p>
     * <p>Fuzzy queries are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Blacklist-01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace of the Alibaba Cloud service.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Metrics</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The order in which to sort the results by time. Valid values:</p>
     * <ul>
     * <li><p>DESC (default): descending order.</p>
     * </li>
     * <li><p>ASC: ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public Integer order;

    /**
     * <p>The page number.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scope of the blacklist policy. Valid values:</p>
     * <ul>
     * <li><p>USER: The blacklist policy takes effect only for the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>GROUP: The blacklist policy takes effect for the specified application groups.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
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
