// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateListRequest extends TeaModel {
    /**
     * <p>Specifies whether to display the history of applying the alert templates to application groups. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     */
    @NameInMap("History")
    public Boolean history;

    /**
     * <p>The keyword of the alert template name.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The name of the alert template.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sorting order. Valid values:</p>
     * <br>
     * <p>*   true (default): ascending order</p>
     * <p>*   false: descending order</p>
     */
    @NameInMap("Order")
    public Boolean order;

    /**
     * <p>The sorting basis. Valid values:</p>
     * <br>
     * <p>*   gmtMotified: sorts alert templates by modification time</p>
     * <p>*   gmtCreate (default): sorts alert templates by creation time</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert template.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeMetricRuleTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateListRequest self = new DescribeMetricRuleTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTemplateListRequest setHistory(Boolean history) {
        this.history = history;
        return this;
    }
    public Boolean getHistory() {
        return this.history;
    }

    public DescribeMetricRuleTemplateListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeMetricRuleTemplateListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeMetricRuleTemplateListRequest setOrder(Boolean order) {
        this.order = order;
        return this;
    }
    public Boolean getOrder() {
        return this.order;
    }

    public DescribeMetricRuleTemplateListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeMetricRuleTemplateListRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMetricRuleTemplateListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeMetricRuleTemplateListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricRuleTemplateListRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
