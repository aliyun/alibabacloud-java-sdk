// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteInvoiceEntityShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all applicable personnel. If del_all is set to true, all entities under the invoice header are deleted, and the entity list parameter is not validated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("del_all")
    public Boolean delAll;

    /**
     * <p>The entity list. This parameter is required when del_all is set to false or null.</p>
     */
    @NameInMap("entities")
    public String entitiesShrink;

    /**
     * <p>The third-party invoice ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340049</p>
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
