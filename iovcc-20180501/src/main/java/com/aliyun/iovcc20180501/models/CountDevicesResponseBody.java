// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceCount")
    public Integer deviceCount;

    public static CountDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountDevicesResponseBody self = new CountDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public CountDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountDevicesResponseBody setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
    public Integer getDeviceCount() {
        return this.deviceCount;
    }

}
