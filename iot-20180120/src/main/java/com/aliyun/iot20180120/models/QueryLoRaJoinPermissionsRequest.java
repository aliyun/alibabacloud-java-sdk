// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryLoRaJoinPermissionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryLoRaJoinPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoRaJoinPermissionsRequest self = new QueryLoRaJoinPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoRaJoinPermissionsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
