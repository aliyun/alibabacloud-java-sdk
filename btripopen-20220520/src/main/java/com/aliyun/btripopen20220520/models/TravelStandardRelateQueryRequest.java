// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardRelateQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("from_group")
    public Boolean fromGroup;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6516571</p>
     */
    @NameInMap("rule_id")
    public Long ruleId;

    public static TravelStandardRelateQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardRelateQueryRequest self = new TravelStandardRelateQueryRequest();
        return TeaModel.build(map, self);
    }

    public TravelStandardRelateQueryRequest setFromGroup(Boolean fromGroup) {
        this.fromGroup = fromGroup;
        return this;
    }
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    public TravelStandardRelateQueryRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
