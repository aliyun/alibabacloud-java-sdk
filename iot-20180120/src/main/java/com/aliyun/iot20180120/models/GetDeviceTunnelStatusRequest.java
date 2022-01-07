// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceTunnelStatusRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static GetDeviceTunnelStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceTunnelStatusRequest self = new GetDeviceTunnelStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceTunnelStatusRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public GetDeviceTunnelStatusRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetDeviceTunnelStatusRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
