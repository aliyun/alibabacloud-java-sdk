// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleDeviceServiceResponseBody extends TeaModel {
    @NameInMap("DeviceIds")
    public java.util.List<String> deviceIds;

    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceDetailInfos")
    public java.util.List<RescaleDeviceServiceResponseBodyResourceDetailInfos> resourceDetailInfos;

    public static RescaleDeviceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RescaleDeviceServiceResponseBody self = new RescaleDeviceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RescaleDeviceServiceResponseBody setDeviceIds(java.util.List<String> deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public java.util.List<String> getDeviceIds() {
        return this.deviceIds;
    }

    public RescaleDeviceServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RescaleDeviceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RescaleDeviceServiceResponseBody setResourceDetailInfos(java.util.List<RescaleDeviceServiceResponseBodyResourceDetailInfos> resourceDetailInfos) {
        this.resourceDetailInfos = resourceDetailInfos;
        return this;
    }
    public java.util.List<RescaleDeviceServiceResponseBodyResourceDetailInfos> getResourceDetailInfos() {
        return this.resourceDetailInfos;
    }

    public static class RescaleDeviceServiceResponseBodyResourceDetailInfos extends TeaModel {
        @NameInMap("ID")
        public String ID;

        @NameInMap("IP")
        public String IP;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("RegionID")
        public String regionID;

        @NameInMap("Server")
        public String server;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static RescaleDeviceServiceResponseBodyResourceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            RescaleDeviceServiceResponseBodyResourceDetailInfos self = new RescaleDeviceServiceResponseBodyResourceDetailInfos();
            return TeaModel.build(map, self);
        }

        public RescaleDeviceServiceResponseBodyResourceDetailInfos setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

        public RescaleDeviceServiceResponseBodyResourceDetailInfos setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public RescaleDeviceServiceResponseBodyResourceDetailInfos setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public RescaleDeviceServiceResponseBodyResourceDetailInfos setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public RescaleDeviceServiceResponseBodyResourceDetailInfos setRegionID(String regionID) {
            this.regionID = regionID;
            return this;
        }
        public String getRegionID() {
            return this.regionID;
        }

        public RescaleDeviceServiceResponseBodyResourceDetailInfos setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public RescaleDeviceServiceResponseBodyResourceDetailInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RescaleDeviceServiceResponseBodyResourceDetailInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
