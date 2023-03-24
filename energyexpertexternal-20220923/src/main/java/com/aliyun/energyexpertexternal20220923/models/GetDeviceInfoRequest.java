// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDeviceInfoRequest extends TeaModel {
    @NameInMap("deviceId")
    public String deviceId;

    @NameInMap("ds")
    public String ds;

    @NameInMap("factoryId")
    public String factoryId;

    public static GetDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInfoRequest self = new GetDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceInfoRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceInfoRequest setDs(String ds) {
        this.ds = ds;
        return this;
    }
    public String getDs() {
        return this.ds;
    }

    public GetDeviceInfoRequest setFactoryId(String factoryId) {
        this.factoryId = factoryId;
        return this;
    }
    public String getFactoryId() {
        return this.factoryId;
    }

}
