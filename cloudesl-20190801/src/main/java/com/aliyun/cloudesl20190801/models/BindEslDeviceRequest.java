// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class BindEslDeviceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EslBarCode")
    public String eslBarCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ItemBarCode")
    public String itemBarCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static BindEslDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindEslDeviceRequest self = new BindEslDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BindEslDeviceRequest setEslBarCode(String eslBarCode) {
        this.eslBarCode = eslBarCode;
        return this;
    }
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    public BindEslDeviceRequest setItemBarCode(String itemBarCode) {
        this.itemBarCode = itemBarCode;
        return this;
    }
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    public BindEslDeviceRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
