// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CloseDeviceTunnelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-<em><strong>-v6</strong></em></p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d4098041-a560-***</p>
     */
    @NameInMap("TunnelId")
    public String tunnelId;

    public static CloseDeviceTunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseDeviceTunnelRequest self = new CloseDeviceTunnelRequest();
        return TeaModel.build(map, self);
    }

    public CloseDeviceTunnelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CloseDeviceTunnelRequest setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

}
