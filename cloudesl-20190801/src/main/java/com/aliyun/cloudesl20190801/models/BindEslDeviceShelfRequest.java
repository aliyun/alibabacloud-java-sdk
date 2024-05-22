// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class BindEslDeviceShelfRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EslBarCode")
    public String eslBarCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ShelfCode")
    public String shelfCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static BindEslDeviceShelfRequest build(java.util.Map<String, ?> map) throws Exception {
        BindEslDeviceShelfRequest self = new BindEslDeviceShelfRequest();
        return TeaModel.build(map, self);
    }

    public BindEslDeviceShelfRequest setEslBarCode(String eslBarCode) {
        this.eslBarCode = eslBarCode;
        return this;
    }
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    public BindEslDeviceShelfRequest setShelfCode(String shelfCode) {
        this.shelfCode = shelfCode;
        return this;
    }
    public String getShelfCode() {
        return this.shelfCode;
    }

    public BindEslDeviceShelfRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
