// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleFlightItemListBestPriceItemFlightRuleInfosValue extends TeaModel {
    @NameInMap("refund_change_rule_desc")
    public String refundChangeRuleDesc;

    @NameInMap("baggage_desc")
    public String baggageDesc;

    public static ModuleFlightItemListBestPriceItemFlightRuleInfosValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleFlightItemListBestPriceItemFlightRuleInfosValue self = new ModuleFlightItemListBestPriceItemFlightRuleInfosValue();
        return TeaModel.build(map, self);
    }

    public ModuleFlightItemListBestPriceItemFlightRuleInfosValue setRefundChangeRuleDesc(String refundChangeRuleDesc) {
        this.refundChangeRuleDesc = refundChangeRuleDesc;
        return this;
    }
    public String getRefundChangeRuleDesc() {
        return this.refundChangeRuleDesc;
    }

    public ModuleFlightItemListBestPriceItemFlightRuleInfosValue setBaggageDesc(String baggageDesc) {
        this.baggageDesc = baggageDesc;
        return this;
    }
    public String getBaggageDesc() {
        return this.baggageDesc;
    }

}
