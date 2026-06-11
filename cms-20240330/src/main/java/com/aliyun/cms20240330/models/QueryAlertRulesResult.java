// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesResult extends TeaModel {
    /**
     * <p>The list of alert rules for the current page.</p>
     */
    @NameInMap("alertRules")
    public java.util.List<AlertRuleV2> alertRules;

    /**
     * <p>The total number of alert rules that match the query.</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static QueryAlertRulesResult build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesResult self = new QueryAlertRulesResult();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesResult setAlertRules(java.util.List<AlertRuleV2> alertRules) {
        this.alertRules = alertRules;
        return this;
    }
    public java.util.List<AlertRuleV2> getAlertRules() {
        return this.alertRules;
    }

    public QueryAlertRulesResult setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
