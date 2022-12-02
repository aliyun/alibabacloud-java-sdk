// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceResourceRequest extends TeaModel {
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDeviceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceResourceRequest self = new GetDeviceResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceResourceRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    public GetDeviceResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
