// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDedicatedLineResponseBody extends TeaModel {
    @NameInMap("DedicatedLine")
    public GetDedicatedLineResponseBodyDedicatedLine dedicatedLine;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDedicatedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedLineResponseBody self = new GetDedicatedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDedicatedLineResponseBody setDedicatedLine(GetDedicatedLineResponseBodyDedicatedLine dedicatedLine) {
        this.dedicatedLine = dedicatedLine;
        return this;
    }
    public GetDedicatedLineResponseBodyDedicatedLine getDedicatedLine() {
        return this.dedicatedLine;
    }

    public GetDedicatedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDedicatedLineResponseBodyDedicatedLine extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("DedicatedLineGateway")
        public String dedicatedLineGateway;

        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        @NameInMap("DedicatedLineIp")
        public String dedicatedLineIp;

        @NameInMap("DedicatedLineRole")
        public String dedicatedLineRole;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DevicePort")
        public String devicePort;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("PhysicalSpaceId")
        public String physicalSpaceId;

        public static GetDedicatedLineResponseBodyDedicatedLine build(java.util.Map<String, ?> map) throws Exception {
            GetDedicatedLineResponseBodyDedicatedLine self = new GetDedicatedLineResponseBodyDedicatedLine();
            return TeaModel.build(map, self);
        }

        public GetDedicatedLineResponseBodyDedicatedLine setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDedicatedLineGateway(String dedicatedLineGateway) {
            this.dedicatedLineGateway = dedicatedLineGateway;
            return this;
        }
        public String getDedicatedLineGateway() {
            return this.dedicatedLineGateway;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDedicatedLineIp(String dedicatedLineIp) {
            this.dedicatedLineIp = dedicatedLineIp;
            return this;
        }
        public String getDedicatedLineIp() {
            return this.dedicatedLineIp;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDedicatedLineRole(String dedicatedLineRole) {
            this.dedicatedLineRole = dedicatedLineRole;
            return this;
        }
        public String getDedicatedLineRole() {
            return this.dedicatedLineRole;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setDevicePort(String devicePort) {
            this.devicePort = devicePort;
            return this;
        }
        public String getDevicePort() {
            return this.devicePort;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetDedicatedLineResponseBodyDedicatedLine setPhysicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

    }

}
