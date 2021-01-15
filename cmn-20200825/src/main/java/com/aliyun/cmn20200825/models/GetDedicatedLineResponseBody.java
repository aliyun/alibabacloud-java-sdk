// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDedicatedLineResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 物理空间专线详情
    @NameInMap("DedicatedLine")
    public GetDedicatedLineResponseBodyDedicatedLine dedicatedLine;

    public static GetDedicatedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedLineResponseBody self = new GetDedicatedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDedicatedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDedicatedLineResponseBody setDedicatedLine(GetDedicatedLineResponseBodyDedicatedLine dedicatedLine) {
        this.dedicatedLine = dedicatedLine;
        return this;
    }
    public GetDedicatedLineResponseBodyDedicatedLine getDedicatedLine() {
        return this.dedicatedLine;
    }

    public static class GetDedicatedLineResponseBodyDedicatedLine extends TeaModel {
        // 专线ID
        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        // 运营商
        @NameInMap("Isp")
        public String isp;

        // 宽带（Mbps）
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        // 专线IP
        @NameInMap("DedicatedLineIp")
        public String dedicatedLineIp;

        // 专线网关
        @NameInMap("DedicatedLineGateway")
        public String dedicatedLineGateway;

        // 专线角色
        @NameInMap("DedicatedLineRole")
        public String dedicatedLineRole;

        // 关联设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 关联设备端口名称
        @NameInMap("DevicePort")
        public String devicePort;

        // 关联设备名称
        @NameInMap("DeviceName")
        public String deviceName;

        public static GetDedicatedLineResponseBodyDedicatedLine build(java.util.Map<String, ?> map) throws Exception {
            GetDedicatedLineResponseBodyDedicatedLine self = new GetDedicatedLineResponseBodyDedicatedLine();
            return TeaModel.build(map, self);
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDedicatedLineIp(String dedicatedLineIp) {
            this.dedicatedLineIp = dedicatedLineIp;
            return this;
        }
        public String getDedicatedLineIp() {
            return this.dedicatedLineIp;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDedicatedLineGateway(String dedicatedLineGateway) {
            this.dedicatedLineGateway = dedicatedLineGateway;
            return this;
        }
        public String getDedicatedLineGateway() {
            return this.dedicatedLineGateway;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDedicatedLineRole(String dedicatedLineRole) {
            this.dedicatedLineRole = dedicatedLineRole;
            return this;
        }
        public String getDedicatedLineRole() {
            return this.dedicatedLineRole;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDevicePort(String devicePort) {
            this.devicePort = devicePort;
            return this;
        }
        public String getDevicePort() {
            return this.devicePort;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

}
