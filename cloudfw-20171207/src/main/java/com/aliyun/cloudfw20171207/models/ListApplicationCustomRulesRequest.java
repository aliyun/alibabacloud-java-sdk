// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListApplicationCustomRulesRequest extends TeaModel {
    /**
     * <p>The ID of the application custom rule. Exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>acr-7d2e4f6a8b0c1d3e</p>
     */
    @NameInMap("ApplicationCustomRuleId")
    public String applicationCustomRuleId;

    /**
     * <p>The name of the custom rule. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom rule</p>
     */
    @NameInMap("ApplicationCustomRuleName")
    public String applicationCustomRuleName;

    /**
     * <p>The ID of the application. This parameter is used to filter custom rules associated with the application. The application must exist in the built-in application signature library.</p>
     * 
     * <strong>example:</strong>
     * <p>10012150000</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>The ID of the application template to query. This parameter is required. The template must exist within the current Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ati-4f0691c56b8d4f06</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    /**
     * <p>The language of the returned information. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese. This is the default value.</li>
     * <li><strong>en</strong>: English.
     * This parameter determines whether the returned application names are in Chinese or English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Valid values: integers greater than or equal to 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Valid values: integers greater than or equal to 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The priority of the rule. Exact match is supported. Valid values: integers from 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The action of the rule. Exact match is supported. Valid values:</p>
     * <ul>
     * <li><strong>Allow</strong>: allows the traffic.</li>
     * <li><strong>Alert</strong>: monitors the traffic.</li>
     * <li><strong>Deny</strong>: blocks the traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Deny</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    public static ListApplicationCustomRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationCustomRulesRequest self = new ListApplicationCustomRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationCustomRulesRequest setApplicationCustomRuleId(String applicationCustomRuleId) {
        this.applicationCustomRuleId = applicationCustomRuleId;
        return this;
    }
    public String getApplicationCustomRuleId() {
        return this.applicationCustomRuleId;
    }

    public ListApplicationCustomRulesRequest setApplicationCustomRuleName(String applicationCustomRuleName) {
        this.applicationCustomRuleName = applicationCustomRuleName;
        return this;
    }
    public String getApplicationCustomRuleName() {
        return this.applicationCustomRuleName;
    }

    public ListApplicationCustomRulesRequest setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public Long getApplicationId() {
        return this.applicationId;
    }

    public ListApplicationCustomRulesRequest setApplicationTemplateId(String applicationTemplateId) {
        this.applicationTemplateId = applicationTemplateId;
        return this;
    }
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    public ListApplicationCustomRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListApplicationCustomRulesRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListApplicationCustomRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationCustomRulesRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public ListApplicationCustomRulesRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

}
