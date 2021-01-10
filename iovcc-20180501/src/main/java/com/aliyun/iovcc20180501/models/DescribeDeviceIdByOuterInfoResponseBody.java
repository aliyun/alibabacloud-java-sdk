// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceIdByOuterInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static DescribeDeviceIdByOuterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceIdByOuterInfoResponseBody self = new DescribeDeviceIdByOuterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceIdByOuterInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceIdByOuterInfoResponseBody setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
