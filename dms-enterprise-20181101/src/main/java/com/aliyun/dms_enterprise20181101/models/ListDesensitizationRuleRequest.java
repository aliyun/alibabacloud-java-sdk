// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDesensitizationRuleRequest extends TeaModel {
    // The type of the masking algorithm.
    @NameInMap("FuncType")
    public String funcType;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. The maximum value is 100.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the masking rule.
    @NameInMap("RuleId")
    public Integer ruleId;

    // The name of the masking rule.
    @NameInMap("RuleName")
    public String ruleName;

    // The algorithm used for masking.
    @NameInMap("RuleType")
    public String ruleType;

    // The ID of the tenant.
    // 
    // >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [View information about the current tenant](~~181330~~).
    @NameInMap("Tid")
    public Long tid;

    public static ListDesensitizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDesensitizationRuleRequest self = new ListDesensitizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListDesensitizationRuleRequest setFuncType(String funcType) {
        this.funcType = funcType;
        return this;
    }
    public String getFuncType() {
        return this.funcType;
    }

    public ListDesensitizationRuleRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDesensitizationRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDesensitizationRuleRequest setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

    public ListDesensitizationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListDesensitizationRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ListDesensitizationRuleRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
