// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceShadowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceShadow")
    public DescribeDeviceShadowResponseBodyDeviceShadow deviceShadow;

    public static DescribeDeviceShadowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceShadowResponseBody self = new DescribeDeviceShadowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceShadowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceShadowResponseBody setDeviceShadow(DescribeDeviceShadowResponseBodyDeviceShadow deviceShadow) {
        this.deviceShadow = deviceShadow;
        return this;
    }
    public DescribeDeviceShadowResponseBodyDeviceShadow getDeviceShadow() {
        return this.deviceShadow;
    }

    public static class DescribeDeviceShadowResponseBodyDeviceShadow extends TeaModel {
        @NameInMap("DeviceShadow")
        public String deviceShadow;

        @NameInMap("DeviceInfo")
        public String deviceInfo;

        public static DescribeDeviceShadowResponseBodyDeviceShadow build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceShadowResponseBodyDeviceShadow self = new DescribeDeviceShadowResponseBodyDeviceShadow();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceShadowResponseBodyDeviceShadow setDeviceShadow(String deviceShadow) {
            this.deviceShadow = deviceShadow;
            return this;
        }
        public String getDeviceShadow() {
            return this.deviceShadow;
        }

        public DescribeDeviceShadowResponseBodyDeviceShadow setDeviceInfo(String deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }
        public String getDeviceInfo() {
            return this.deviceInfo;
        }

    }

}
