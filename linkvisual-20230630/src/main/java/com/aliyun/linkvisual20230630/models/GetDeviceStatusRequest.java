// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GetDeviceStatusRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProductKey")
    public String productKey;

    public static GetDeviceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusRequest self = new GetDeviceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public GetDeviceStatusRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public GetDeviceStatusRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
