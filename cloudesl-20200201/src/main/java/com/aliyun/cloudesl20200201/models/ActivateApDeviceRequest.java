// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class ActivateApDeviceRequest extends TeaModel {
    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("ExtraParams")
    public String extraParams;

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

    public ActivateApDeviceRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public ActivateApDeviceRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
