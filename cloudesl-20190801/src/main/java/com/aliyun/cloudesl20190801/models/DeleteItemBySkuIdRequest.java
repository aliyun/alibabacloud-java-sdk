// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DeleteItemBySkuIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SkuId")
    public String skuId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static DeleteItemBySkuIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteItemBySkuIdRequest self = new DeleteItemBySkuIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteItemBySkuIdRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public DeleteItemBySkuIdRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
