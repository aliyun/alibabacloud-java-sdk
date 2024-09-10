// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateListRequest extends TeaModel {
    /**
     * <p>Specifies whether to display the history of applying the alert templates to application groups. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("History")
    public Boolean history;

    /**
     * <p>The keyword of the alert template name.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The name of the alert template.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Template1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li>true (default): ascending order</li>
     * <li>false: descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Order")
    public Boolean order;

    /**
     * <p>The sorting basis. Valid values:</p>
     * <ul>
     * <li>gmtMotified: sorts alert templates by modification time</li>
     * <li>gmtCreate (default): sorts alert templates by creation time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert template.</p>
     * 
     * <strong>example:</strong>
     * <p>70****</p>
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
