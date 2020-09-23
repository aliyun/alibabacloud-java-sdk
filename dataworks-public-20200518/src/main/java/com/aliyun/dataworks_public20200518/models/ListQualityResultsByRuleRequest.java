// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    @Validation(required = true)
    public Integer ruleId;

    @NameInMap("StartDate")
    @Validation(required = true)
    public String startDate;

    @NameInMap("EndDate")
    @Validation(required = true)
    public String endDate;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    public static ListQualityResultsByRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByRuleRequest self = new ListQualityResultsByRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityResultsByRuleRequest setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

    public ListQualityResultsByRuleRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ListQualityResultsByRuleRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListQualityResultsByRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQualityResultsByRuleRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQualityResultsByRuleRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
