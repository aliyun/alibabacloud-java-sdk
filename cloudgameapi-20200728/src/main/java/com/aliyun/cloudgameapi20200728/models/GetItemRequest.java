// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetItemRequest extends TeaModel {
    @NameInMap("ItemId")
    @Validation(required = true)
    public String itemId;

    public static GetItemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetItemRequest self = new GetItemRequest();
        return TeaModel.build(map, self);
    }

    public GetItemRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

}
