// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RefreshDeviceTunnelSharePasswordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LEGatewayAuto_B3XM******</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1Wmy******</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static RefreshDeviceTunnelSharePasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshDeviceTunnelSharePasswordRequest self = new RefreshDeviceTunnelSharePasswordRequest();
        return TeaModel.build(map, self);
    }

    public RefreshDeviceTunnelSharePasswordRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RefreshDeviceTunnelSharePasswordRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public RefreshDeviceTunnelSharePasswordRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
