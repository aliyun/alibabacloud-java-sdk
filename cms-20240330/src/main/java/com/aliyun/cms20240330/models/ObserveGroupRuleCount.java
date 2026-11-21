// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupRuleCount extends TeaModel {
    /**
     * <p>The number of deduplicated primary entities.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("mainCount")
    public Long mainCount;

    /**
     * <p>The number of deduplicated associated child entities.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("relatedCount")
    public Long relatedCount;

    /**
     * <p>The stable ID of the managed rule.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-rocketmq-prod</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>The total number of deduplicated entities.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ObserveGroupRuleCount build(java.util.Map<String, ?> map) throws Exception {
        ObserveGroupRuleCount self = new ObserveGroupRuleCount();
        return TeaModel.build(map, self);
    }

    public ObserveGroupRuleCount setMainCount(Long mainCount) {
        this.mainCount = mainCount;
        return this;
    }
    public Long getMainCount() {
        return this.mainCount;
    }

    public ObserveGroupRuleCount setRelatedCount(Long relatedCount) {
        this.relatedCount = relatedCount;
        return this;
    }
    public Long getRelatedCount() {
        return this.relatedCount;
    }

    public ObserveGroupRuleCount setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ObserveGroupRuleCount setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
