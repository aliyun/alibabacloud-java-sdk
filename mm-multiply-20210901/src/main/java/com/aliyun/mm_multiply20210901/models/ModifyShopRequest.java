// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ModifyShopRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("Title")
    public String title;

    public static ModifyShopRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyShopRequest self = new ModifyShopRequest();
        return TeaModel.build(map, self);
    }

    public ModifyShopRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyShopRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public ModifyShopRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
