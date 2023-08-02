// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListGovernanceIssueTasksRequest extends TeaModel {
    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RuleCategory")
    public String ruleCategory;

    @NameInMap("RuleId")
    public String ruleId;

    public static ListGovernanceIssueTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGovernanceIssueTasksRequest self = new ListGovernanceIssueTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListGovernanceIssueTasksRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public ListGovernanceIssueTasksRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListGovernanceIssueTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGovernanceIssueTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGovernanceIssueTasksRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListGovernanceIssueTasksRequest setRuleCategory(String ruleCategory) {
        this.ruleCategory = ruleCategory;
        return this;
    }
    public String getRuleCategory() {
        return this.ruleCategory;
    }

    public ListGovernanceIssueTasksRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
