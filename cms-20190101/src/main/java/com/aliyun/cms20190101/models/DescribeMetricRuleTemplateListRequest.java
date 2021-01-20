// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateListRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("History")
    public Boolean history;

    public static DescribeMetricRuleTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateListRequest self = new DescribeMetricRuleTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTemplateListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeMetricRuleTemplateListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeMetricRuleTemplateListRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
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

    public DescribeMetricRuleTemplateListRequest setHistory(Boolean history) {
        this.history = history;
        return this;
    }
    public Boolean getHistory() {
        return this.history;
    }

}
