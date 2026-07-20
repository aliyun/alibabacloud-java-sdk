// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleItemListFlightRuleInfosValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>退改规则简述</p>
     */
    @NameInMap("refund_change_rule_desc")
    public String refundChangeRuleDesc;

    /**
     * <strong>example:</strong>
     * <p>行李额规则简述</p>
     */
    @NameInMap("baggage_desc")
    public String baggageDesc;

    public static ModuleItemListFlightRuleInfosValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleItemListFlightRuleInfosValue self = new ModuleItemListFlightRuleInfosValue();
        return TeaModel.build(map, self);
    }

    public ModuleItemListFlightRuleInfosValue setRefundChangeRuleDesc(String refundChangeRuleDesc) {
        this.refundChangeRuleDesc = refundChangeRuleDesc;
        return this;
    }
    public String getRefundChangeRuleDesc() {
        return this.refundChangeRuleDesc;
    }

    public ModuleItemListFlightRuleInfosValue setBaggageDesc(String baggageDesc) {
        this.baggageDesc = baggageDesc;
        return this;
    }
    public String getBaggageDesc() {
        return this.baggageDesc;
    }

}
