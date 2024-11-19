// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceTunnelRequest extends TeaModel {
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

    public static QueryDeviceTunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceTunnelRequest self = new QueryDeviceTunnelRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceTunnelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceTunnelRequest setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

}
