// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DeleteItemRequest extends TeaModel {
    @NameInMap("ItemBarCode")
    public String itemBarCode;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("UnbindEslDevice")
    public Boolean unbindEslDevice;

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

    public DeleteItemRequest setUnbindEslDevice(Boolean unbindEslDevice) {
        this.unbindEslDevice = unbindEslDevice;
        return this;
    }
    public Boolean getUnbindEslDevice() {
        return this.unbindEslDevice;
    }

}
