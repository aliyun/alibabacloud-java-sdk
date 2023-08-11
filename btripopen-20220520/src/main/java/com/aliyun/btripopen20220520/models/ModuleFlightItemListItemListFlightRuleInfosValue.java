// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleFlightItemListItemListFlightRuleInfosValue extends TeaModel {
    @NameInMap("refund_change_rule_desc")
    public String refundChangeRuleDesc;

    @NameInMap("baggage_desc")
    public String baggageDesc;

    public static ModuleFlightItemListItemListFlightRuleInfosValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleFlightItemListItemListFlightRuleInfosValue self = new ModuleFlightItemListItemListFlightRuleInfosValue();
        return TeaModel.build(map, self);
    }

    public ModuleFlightItemListItemListFlightRuleInfosValue setRefundChangeRuleDesc(String refundChangeRuleDesc) {
        this.refundChangeRuleDesc = refundChangeRuleDesc;
        return this;
    }
    public String getRefundChangeRuleDesc() {
        return this.refundChangeRuleDesc;
    }

    public ModuleFlightItemListItemListFlightRuleInfosValue setBaggageDesc(String baggageDesc) {
        this.baggageDesc = baggageDesc;
        return this;
    }
    public String getBaggageDesc() {
        return this.baggageDesc;
    }

}
