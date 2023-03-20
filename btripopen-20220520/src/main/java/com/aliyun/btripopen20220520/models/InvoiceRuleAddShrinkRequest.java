// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleAddShrinkRequest extends TeaModel {
    @NameInMap("entities")
    public String entitiesShrink;

    @NameInMap("third_part_id")
    public String thirdPartId;

    public static InvoiceRuleAddShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleAddShrinkRequest self = new InvoiceRuleAddShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleAddShrinkRequest setEntitiesShrink(String entitiesShrink) {
        this.entitiesShrink = entitiesShrink;
        return this;
    }
    public String getEntitiesShrink() {
        return this.entitiesShrink;
    }

    public InvoiceRuleAddShrinkRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

}
