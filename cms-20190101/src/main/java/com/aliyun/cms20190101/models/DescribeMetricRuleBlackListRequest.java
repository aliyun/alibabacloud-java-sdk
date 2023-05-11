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

}
