// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceOnlineInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Devices")
    public java.util.List<DescribeDeviceOnlineInfoResponseBodyDevices> devices;

    public static DescribeDeviceOnlineInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceOnlineInfoResponseBody self = new DescribeDeviceOnlineInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceOnlineInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceOnlineInfoResponseBody setDevices(java.util.List<DescribeDeviceOnlineInfoResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<DescribeDeviceOnlineInfoResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public static class DescribeDeviceOnlineInfoResponseBodyDevices extends TeaModel {
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Terminal")
        public String terminal;

        @NameInMap("IasId")
        public String iasId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("SystemVersion")
        public String systemVersion;

        @NameInMap("Online")
        public Integer online;

        @NameInMap("LoginTime")
        public Long loginTime;

        public static DescribeDeviceOnlineInfoResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceOnlineInfoResponseBodyDevices self = new DescribeDeviceOnlineInfoResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceOnlineInfoResponseBodyDevices setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeDeviceOnlineInfoResponseBodyDevices setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

        public DescribeDeviceOnlineInfoResponseBodyDevices setIasId(String iasId) {
            this.iasId = iasId;
            return this;
        }
        public String getIasId() {
            return this.iasId;
        }

        public DescribeDeviceOnlineInfoResponseBodyDevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeDeviceOnlineInfoResponseBodyDevices setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeDeviceOnlineInfoResponseBodyDevices setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public DescribeDeviceOnlineInfoResponseBodyDevices setOnline(Integer online) {
            this.online = online;
            return this;
        }
        public Integer getOnline() {
            return this.online;
        }

        public DescribeDeviceOnlineInfoResponseBodyDevices setLoginTime(Long loginTime) {
            this.loginTime = loginTime;
            return this;
        }
        public Long getLoginTime() {
            return this.loginTime;
        }

    }

}
