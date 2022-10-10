// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class DownShelfItemsRequest extends TeaModel {
    @NameInMap("ItemIds")
    public String itemIds;

    @NameInMap("StoreId")
    public String storeId;

    public static DownShelfItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownShelfItemsRequest self = new DownShelfItemsRequest();
        return TeaModel.build(map, self);
    }

    public DownShelfItemsRequest setItemIds(String itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public String getItemIds() {
        return this.itemIds;
    }

    public DownShelfItemsRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
