// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetIpcDeviceInfoResponseBody extends TeaModel {
    @NameInMap("DeviceInfos")
    public java.util.List<GetIpcDeviceInfoResponseBodyDeviceInfos> deviceInfos;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>78</p>
     */
    @NameInMap("Total")
    public Long total;

    public static GetIpcDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpcDeviceInfoResponseBody self = new GetIpcDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpcDeviceInfoResponseBody setDeviceInfos(java.util.List<GetIpcDeviceInfoResponseBodyDeviceInfos> deviceInfos) {
        this.deviceInfos = deviceInfos;
        return this;
    }
    public java.util.List<GetIpcDeviceInfoResponseBodyDeviceInfos> getDeviceInfos() {
        return this.deviceInfos;
    }

    public GetIpcDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIpcDeviceInfoResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetIpcDeviceInfoResponseBodyDeviceInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>understand</p>
         */
        @NameInMap("Capability")
        public String capability;

        /**
         * <strong>example:</strong>
         * <p>d123</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>2017-02-11T12:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        public static GetIpcDeviceInfoResponseBodyDeviceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetIpcDeviceInfoResponseBodyDeviceInfos self = new GetIpcDeviceInfoResponseBodyDeviceInfos();
            return TeaModel.build(map, self);
        }

        public GetIpcDeviceInfoResponseBodyDeviceInfos setCapability(String capability) {
            this.capability = capability;
            return this;
        }
        public String getCapability() {
            return this.capability;
        }

        public GetIpcDeviceInfoResponseBodyDeviceInfos setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetIpcDeviceInfoResponseBodyDeviceInfos setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

    }

}
