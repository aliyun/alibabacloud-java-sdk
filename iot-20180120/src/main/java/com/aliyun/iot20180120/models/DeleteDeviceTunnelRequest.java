// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceTunnelRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TunnelId")
    public String tunnelId;

    public static DeleteDeviceTunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceTunnelRequest self = new DeleteDeviceTunnelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceTunnelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteDeviceTunnelRequest setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

}
