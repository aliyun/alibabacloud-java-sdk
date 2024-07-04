// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleDeviceServiceResponseBody extends TeaModel {
    /**
     * <p>The IDs of the devices.</p>
     */
    @NameInMap("DeviceIds")
    public java.util.List<String> deviceIds;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>b3b5bb9a-4e0b-4cac-8ebf-e5e015726723</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3F3F3570-E721-53F6-853F-37B7725AC6CB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The key properties of the device.</p>
     */
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
        /**
         * <p>The ID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>h-uf6009zoa6hdbjyqxcn1</p>
         */
        @NameInMap("ID")
        public String ID;

        /**
         * <p>The IP address of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>10.152.196.36</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The Internet service provider (ISP) to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>The media access control (MAC) address of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>24:0B:88:04:71:E0</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The ID of the edge node to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chongqing-1</p>
         */
        @NameInMap("RegionID")
        public String regionID;

        /**
         * <p>The name of the server on which the device is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>ens-nc2</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The status of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.ac6.large</p>
         */
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
