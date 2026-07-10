// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleDeleteShrinkRequest extends TeaModel {
    @NameInMap("del_all")
    public Boolean delAll;

    @NameInMap("entities")
    public String entitiesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("third_part_id")
    public String thirdPartId;

    public static InvoiceRuleDeleteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleDeleteShrinkRequest self = new InvoiceRuleDeleteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleDeleteShrinkRequest setDelAll(Boolean delAll) {
        this.delAll = delAll;
        return this;
    }
    public Boolean getDelAll() {
        return this.delAll;
    }

    public InvoiceRuleDeleteShrinkRequest setEntitiesShrink(String entitiesShrink) {
        this.entitiesShrink = entitiesShrink;
        return this;
    }
    public String getEntitiesShrink() {
        return this.entitiesShrink;
    }

    public InvoiceRuleDeleteShrinkRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

}
