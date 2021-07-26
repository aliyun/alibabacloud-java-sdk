// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDedicatedLinesResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("DedicatedLines")
    public java.util.List<ListDedicatedLinesResponseBodyDedicatedLines> dedicatedLines;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListDedicatedLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDedicatedLinesResponseBody self = new ListDedicatedLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDedicatedLinesResponseBody setDedicatedLines(java.util.List<ListDedicatedLinesResponseBodyDedicatedLines> dedicatedLines) {
        this.dedicatedLines = dedicatedLines;
        return this;
    }
    public java.util.List<ListDedicatedLinesResponseBodyDedicatedLines> getDedicatedLines() {
        return this.dedicatedLines;
    }

    public ListDedicatedLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDedicatedLinesResponseBodyDedicatedLines extends TeaModel {
        // 物理空间专线ID
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

        // 关联设备端口
        @NameInMap("DevicePort")
        public String devicePort;

        // 关联设备名称
        @NameInMap("DeviceName")
        public String deviceName;

        // 关联物理空间ID
        @NameInMap("PhysicalSpaceId")
        public String physicalSpaceId;

        public static ListDedicatedLinesResponseBodyDedicatedLines build(java.util.Map<String, ?> map) throws Exception {
            ListDedicatedLinesResponseBodyDedicatedLines self = new ListDedicatedLinesResponseBodyDedicatedLines();
            return TeaModel.build(map, self);
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineIp(String dedicatedLineIp) {
            this.dedicatedLineIp = dedicatedLineIp;
            return this;
        }
        public String getDedicatedLineIp() {
            return this.dedicatedLineIp;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineGateway(String dedicatedLineGateway) {
            this.dedicatedLineGateway = dedicatedLineGateway;
            return this;
        }
        public String getDedicatedLineGateway() {
            return this.dedicatedLineGateway;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineRole(String dedicatedLineRole) {
            this.dedicatedLineRole = dedicatedLineRole;
            return this;
        }
        public String getDedicatedLineRole() {
            return this.dedicatedLineRole;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDevicePort(String devicePort) {
            this.devicePort = devicePort;
            return this;
        }
        public String getDevicePort() {
            return this.devicePort;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setPhysicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

    }

}
