// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListWebFilterRulesRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. The value must be greater than or equal to 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The rule action for exact matching. Valid values:</p>
     * <ul>
     * <li><strong>Allow</strong>: Allows the request.</li>
     * <li><strong>Alert</strong>: Monitors the request.</li>
     * <li><strong>Deny</strong>: Blocks the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Deny</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>The ID of the web filtering rule for exact matching.</p>
     * 
     * <strong>example:</strong>
     * <p>wfr-8c1d2e3f4a5b6c7d</p>
     */
    @NameInMap("WebFilterRuleId")
    public String webFilterRuleId;

    /**
     * <p>The ID of the web filtering template for exact matching.</p>
     * 
     * <strong>example:</strong>
     * <p>wft-3f2a9c1d4b5e6f70</p>
     */
    @NameInMap("WebFilterTemplateId")
    public String webFilterTemplateId;

    public static ListWebFilterRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWebFilterRulesRequest self = new ListWebFilterRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListWebFilterRulesRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListWebFilterRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWebFilterRulesRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public ListWebFilterRulesRequest setWebFilterRuleId(String webFilterRuleId) {
        this.webFilterRuleId = webFilterRuleId;
        return this;
    }
    public String getWebFilterRuleId() {
        return this.webFilterRuleId;
    }

    public ListWebFilterRulesRequest setWebFilterTemplateId(String webFilterTemplateId) {
        this.webFilterTemplateId = webFilterTemplateId;
        return this;
    }
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

}
