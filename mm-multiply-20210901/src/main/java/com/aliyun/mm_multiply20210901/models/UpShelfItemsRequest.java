// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpShelfItemsRequest extends TeaModel {
    @NameInMap("ItemIds")
    public String itemIds;

    @NameInMap("StoreId")
    public String storeId;

    public static UpShelfItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpShelfItemsRequest self = new UpShelfItemsRequest();
        return TeaModel.build(map, self);
    }

    public UpShelfItemsRequest setItemIds(String itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public String getItemIds() {
        return this.itemIds;
    }

    public UpShelfItemsRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
