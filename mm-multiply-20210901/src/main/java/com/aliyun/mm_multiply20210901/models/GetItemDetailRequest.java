// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetItemDetailRequest extends TeaModel {
    // ItemId
    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("StoreId")
    public String storeId;

    public static GetItemDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetItemDetailRequest self = new GetItemDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetItemDetailRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public GetItemDetailRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
