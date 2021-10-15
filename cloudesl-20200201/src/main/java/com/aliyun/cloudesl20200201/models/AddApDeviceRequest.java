// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class AddApDeviceRequest extends TeaModel {
    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("StoreId")
    public String storeId;

    public static AddApDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddApDeviceRequest self = new AddApDeviceRequest();
        return TeaModel.build(map, self);
    }

    public AddApDeviceRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public AddApDeviceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddApDeviceRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public AddApDeviceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddApDeviceRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public AddApDeviceRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
