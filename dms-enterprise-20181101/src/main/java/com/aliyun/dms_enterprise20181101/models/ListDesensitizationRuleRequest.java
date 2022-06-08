// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDesensitizationRuleRequest extends TeaModel {
    @NameInMap("FuncType")
    public String funcType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RuleId")
    public Integer ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleType")
    public String ruleType;

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
