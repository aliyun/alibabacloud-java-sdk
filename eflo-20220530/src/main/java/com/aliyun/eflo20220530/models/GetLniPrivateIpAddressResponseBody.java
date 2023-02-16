// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetLniPrivateIpAddressResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetLniPrivateIpAddressResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLniPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLniPrivateIpAddressResponseBody self = new GetLniPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLniPrivateIpAddressResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLniPrivateIpAddressResponseBody setContent(GetLniPrivateIpAddressResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetLniPrivateIpAddressResponseBodyContent getContent() {
        return this.content;
    }

    public GetLniPrivateIpAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLniPrivateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLniPrivateIpAddressResponseBodyContent extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("IpAddressMac")
        public String ipAddressMac;

        @NameInMap("IpName")
        public String ipName;

        @NameInMap("Message")
        public String message;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        public static GetLniPrivateIpAddressResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetLniPrivateIpAddressResponseBodyContent self = new GetLniPrivateIpAddressResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetLniPrivateIpAddressResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLniPrivateIpAddressResponseBodyContent setIpAddressMac(String ipAddressMac) {
            this.ipAddressMac = ipAddressMac;
            return this;
        }
        public String getIpAddressMac() {
            return this.ipAddressMac;
        }

        public GetLniPrivateIpAddressResponseBodyContent setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

        public GetLniPrivateIpAddressResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetLniPrivateIpAddressResponseBodyContent setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public GetLniPrivateIpAddressResponseBodyContent setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public GetLniPrivateIpAddressResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetLniPrivateIpAddressResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
