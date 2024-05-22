// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class ActivateApDeviceRequest extends TeaModel {
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

    public static ActivateApDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateApDeviceRequest self = new ActivateApDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ActivateApDeviceRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public ActivateApDeviceRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
