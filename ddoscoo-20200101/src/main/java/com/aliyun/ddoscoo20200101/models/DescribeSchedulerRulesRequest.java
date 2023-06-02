// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSchedulerRulesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RuleName")
    public String ruleName;

    public static DescribeSchedulerRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSchedulerRulesRequest self = new DescribeSchedulerRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSchedulerRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSchedulerRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSchedulerRulesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSchedulerRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
