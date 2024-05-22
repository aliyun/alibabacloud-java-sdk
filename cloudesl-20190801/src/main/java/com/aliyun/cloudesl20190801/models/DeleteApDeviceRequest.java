// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DeleteApDeviceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApMac")
    public String apMac;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static DeleteApDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApDeviceRequest self = new DeleteApDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApDeviceRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public DeleteApDeviceRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
