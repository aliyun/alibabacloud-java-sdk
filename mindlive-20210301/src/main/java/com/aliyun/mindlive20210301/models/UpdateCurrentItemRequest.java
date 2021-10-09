// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class UpdateCurrentItemRequest extends TeaModel {
    @NameInMap("ItemId")
    public String itemId;

    public static UpdateCurrentItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCurrentItemRequest self = new UpdateCurrentItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCurrentItemRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

}
