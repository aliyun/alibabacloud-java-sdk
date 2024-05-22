// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class RefreshTaobaoItemRequest extends TeaModel {
    @NameInMap("OuterId")
    public String outerId;

    @NameInMap("SkuId")
    public String skuId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("TaobaoItemId")
    public String taobaoItemId;

    public static RefreshTaobaoItemRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshTaobaoItemRequest self = new RefreshTaobaoItemRequest();
        return TeaModel.build(map, self);
    }

    public RefreshTaobaoItemRequest setOuterId(String outerId) {
        this.outerId = outerId;
        return this;
    }
    public String getOuterId() {
        return this.outerId;
    }

    public RefreshTaobaoItemRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public RefreshTaobaoItemRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public RefreshTaobaoItemRequest setTaobaoItemId(String taobaoItemId) {
        this.taobaoItemId = taobaoItemId;
        return this;
    }
    public String getTaobaoItemId() {
        return this.taobaoItemId;
    }

}
