// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListGovernanceRulesRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("IssueType")
    public String issueType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListGovernanceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGovernanceRulesRequest self = new ListGovernanceRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListGovernanceRulesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListGovernanceRulesRequest setIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }
    public String getIssueType() {
        return this.issueType;
    }

    public ListGovernanceRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGovernanceRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
