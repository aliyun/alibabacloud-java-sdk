// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddInvoiceEntityShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("entities")
    public String entitiesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4854821</p>
     */
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
