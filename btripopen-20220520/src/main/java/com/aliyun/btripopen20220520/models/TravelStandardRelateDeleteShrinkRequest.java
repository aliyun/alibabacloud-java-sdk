// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardRelateDeleteShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("from_group")
    public Boolean fromGroup;

    @NameInMap("remove_list")
    public String removeListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6523763</p>
     */
    @NameInMap("rule_id")
    public Long ruleId;

    public static TravelStandardRelateDeleteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardRelateDeleteShrinkRequest self = new TravelStandardRelateDeleteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TravelStandardRelateDeleteShrinkRequest setFromGroup(Boolean fromGroup) {
        this.fromGroup = fromGroup;
        return this;
    }
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    public TravelStandardRelateDeleteShrinkRequest setRemoveListShrink(String removeListShrink) {
        this.removeListShrink = removeListShrink;
        return this;
    }
    public String getRemoveListShrink() {
        return this.removeListShrink;
    }

    public TravelStandardRelateDeleteShrinkRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
