// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ModifyItemRequest extends TeaModel {
    // [123, 456, 789]
    @NameInMap("ItemIdsJson")
    public String itemIdsJson;

    @NameInMap("MallId")
    public String mallId;

    public static ModifyItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyItemRequest self = new ModifyItemRequest();
        return TeaModel.build(map, self);
    }

    public ModifyItemRequest setItemIdsJson(String itemIdsJson) {
        this.itemIdsJson = itemIdsJson;
        return this;
    }
    public String getItemIdsJson() {
        return this.itemIdsJson;
    }

    public ModifyItemRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

}
