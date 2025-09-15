// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardRelateAddShrinkRequest extends TeaModel {
    @NameInMap("add_list")
    public String addListShrink;

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

    public static TravelStandardRelateAddShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardRelateAddShrinkRequest self = new TravelStandardRelateAddShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TravelStandardRelateAddShrinkRequest setAddListShrink(String addListShrink) {
        this.addListShrink = addListShrink;
        return this;
    }
    public String getAddListShrink() {
        return this.addListShrink;
    }

    public TravelStandardRelateAddShrinkRequest setFromGroup(Boolean fromGroup) {
        this.fromGroup = fromGroup;
        return this;
    }
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    public TravelStandardRelateAddShrinkRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
