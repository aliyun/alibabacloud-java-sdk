// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesResult extends TeaModel {
    /**
     * <p>The list of alert rules returned by the query. Each element contains the complete configuration information of an alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;uuid&quot;:&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890&quot;,&quot;displayName&quot;:&quot;CPU usage alert&quot;,&quot;status&quot;:&quot;OK&quot;}]</p>
     */
    @NameInMap("alertRules")
    public java.util.List<AlertRuleV2> alertRules;

    /**
     * <p>The total number of alert rules that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
