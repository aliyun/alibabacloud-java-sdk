// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DeleteItemRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ItemBarCode")
    public String itemBarCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static DeleteItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteItemRequest self = new DeleteItemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteItemRequest setItemBarCode(String itemBarCode) {
        this.itemBarCode = itemBarCode;
        return this;
    }
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    public DeleteItemRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
