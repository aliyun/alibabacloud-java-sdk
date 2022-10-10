// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CheckItemMarketingStatusRequest extends TeaModel {
    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("StoreId")
    public String storeId;

    public static CheckItemMarketingStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckItemMarketingStatusRequest self = new CheckItemMarketingStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckItemMarketingStatusRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public CheckItemMarketingStatusRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
