// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDeviceServiceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceDetailInfos")
    public java.util.List<DescribeDeviceServiceResponseBodyResourceDetailInfos> resourceDetailInfos;

    public static DescribeDeviceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceServiceResponseBody self = new DescribeDeviceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceServiceResponseBody setResourceDetailInfos(java.util.List<DescribeDeviceServiceResponseBodyResourceDetailInfos> resourceDetailInfos) {
        this.resourceDetailInfos = resourceDetailInfos;
        return this;
    }
    public java.util.List<DescribeDeviceServiceResponseBodyResourceDetailInfos> getResourceDetailInfos() {
        return this.resourceDetailInfos;
    }

    public static class DescribeDeviceServiceResponseBodyResourceDetailInfos extends TeaModel {
        @NameInMap("RegionID")
        public String regionID;

        @NameInMap("ID")
        public String ID;

        @NameInMap("IP")
        public String IP;

        @NameInMap("Server")
        public String server;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeDeviceServiceResponseBodyResourceDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceServiceResponseBodyResourceDetailInfos self = new DescribeDeviceServiceResponseBodyResourceDetailInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setRegionID(String regionID) {
            this.regionID = regionID;
            return this;
        }
        public String getRegionID() {
            return this.regionID;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDeviceServiceResponseBodyResourceDetailInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
