// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class UnbindEslDeviceShelfRequest extends TeaModel {
    @NameInMap("EslBarCode")
    public String eslBarCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static UnbindEslDeviceShelfRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindEslDeviceShelfRequest self = new UnbindEslDeviceShelfRequest();
        return TeaModel.build(map, self);
    }

    public UnbindEslDeviceShelfRequest setEslBarCode(String eslBarCode) {
        this.eslBarCode = eslBarCode;
        return this;
    }
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    public UnbindEslDeviceShelfRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
