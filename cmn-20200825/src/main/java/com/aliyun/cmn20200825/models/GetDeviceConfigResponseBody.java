// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceConfigResponseBody extends TeaModel {
    @NameInMap("DeviceConfig")
    public String deviceConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigResponseBody self = new GetDeviceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigResponseBody setDeviceConfig(String deviceConfig) {
        this.deviceConfig = deviceConfig;
        return this;
    }
    public String getDeviceConfig() {
        return this.deviceConfig;
    }

    public GetDeviceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
