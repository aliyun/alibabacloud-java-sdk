// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetLniPrivateIpAddressResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public GetLniPrivateIpAddressResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>You don\&quot;t have the permission of this operation, action=eflo:GetLniPrivateIpAddress, arn=acs:eflo:cn-wulanchabu:1382782317087063:networkinterface/00</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>DBAD15D6-3F47-5B36-8A92-57C2919D13D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLniPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLniPrivateIpAddressResponseBody self = new GetLniPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLniPrivateIpAddressResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-26 20:16:36</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>MAC address of the secondary private network</p>
         * 
         * <strong>example:</strong>
         * <p>00-ff-84-15-ba-67</p>
         */
        @NameInMap("IpAddressMac")
        public String ipAddressMac;

        /**
         * <p>IP unique identifier</p>
         * 
         * <strong>example:</strong>
         * <p>sip-xxxxx</p>
         */
        @NameInMap("IpName")
        public String ipName;

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>You don\&quot;t have the permission of this operation, action=eflo:ListVpdRouteEntries, arn=acs:eflo:cn-wulanchabu:1263399219805497:vpd_rte/*, resourceGroup=null</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Lingjun network interface controller ID</p>
         * 
         * <strong>example:</strong>
         * <p>lni-2ze4uww7n6hsfzrwq77y</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The secondary private IP address of the Lingjun network interface controller.</p>
         * 
         * <strong>example:</strong>
         * <p>10.42.5.92</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The state of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The subnet instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-aj93mko8</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        public static GetLniPrivateIpAddressResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetLniPrivateIpAddressResponseBodyContent self = new GetLniPrivateIpAddressResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetLniPrivateIpAddressResponseBodyContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public GetLniPrivateIpAddressResponseBodyContent setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

    }

}
