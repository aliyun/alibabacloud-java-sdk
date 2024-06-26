// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardQueryShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("from_group")
    public Boolean fromGroup;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2006523763</p>
     */
    @NameInMap("rule_code")
    public Long ruleCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("service_type_list")
    public String serviceTypeListShrink;

    public static TravelStandardQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardQueryShrinkRequest self = new TravelStandardQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TravelStandardQueryShrinkRequest setFromGroup(Boolean fromGroup) {
        this.fromGroup = fromGroup;
        return this;
    }
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    public TravelStandardQueryShrinkRequest setRuleCode(Long ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public Long getRuleCode() {
        return this.ruleCode;
    }

    public TravelStandardQueryShrinkRequest setServiceTypeListShrink(String serviceTypeListShrink) {
        this.serviceTypeListShrink = serviceTypeListShrink;
        return this;
    }
    public String getServiceTypeListShrink() {
        return this.serviceTypeListShrink;
    }

}
