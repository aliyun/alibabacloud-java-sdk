// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteInvoiceEntityShrinkRequest extends TeaModel {
    @NameInMap("del_all")
    public Boolean delAll;

    @NameInMap("entities")
    public String entitiesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("third_part_id")
    public String thirdPartId;

    public static DeleteInvoiceEntityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvoiceEntityShrinkRequest self = new DeleteInvoiceEntityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInvoiceEntityShrinkRequest setDelAll(Boolean delAll) {
        this.delAll = delAll;
        return this;
    }
    public Boolean getDelAll() {
        return this.delAll;
    }

    public DeleteInvoiceEntityShrinkRequest setEntitiesShrink(String entitiesShrink) {
        this.entitiesShrink = entitiesShrink;
        return this;
    }
    public String getEntitiesShrink() {
        return this.entitiesShrink;
    }

    public DeleteInvoiceEntityShrinkRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

}
