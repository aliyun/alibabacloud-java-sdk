// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddInvoiceEntityShrinkRequest extends TeaModel {
    @NameInMap("entities")
    public String entitiesShrink;

    @NameInMap("third_part_id")
    public String thirdPartId;

    public static AddInvoiceEntityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInvoiceEntityShrinkRequest self = new AddInvoiceEntityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddInvoiceEntityShrinkRequest setEntitiesShrink(String entitiesShrink) {
        this.entitiesShrink = entitiesShrink;
        return this;
    }
    public String getEntitiesShrink() {
        return this.entitiesShrink;
    }

    public AddInvoiceEntityShrinkRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

}
