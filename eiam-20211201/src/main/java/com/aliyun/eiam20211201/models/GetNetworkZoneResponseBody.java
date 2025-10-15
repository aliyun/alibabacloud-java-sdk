// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetNetworkZoneResponseBody extends TeaModel {
    @NameInMap("NetworkZone")
    public GetNetworkZoneResponseBodyNetworkZone networkZone;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNetworkZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkZoneResponseBody self = new GetNetworkZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkZoneResponseBody setNetworkZone(GetNetworkZoneResponseBodyNetworkZone networkZone) {
        this.networkZone = networkZone;
        return this;
    }
    public GetNetworkZoneResponseBodyNetworkZone getNetworkZone() {
        return this.networkZone;
    }

    public GetNetworkZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNetworkZoneResponseBodyNetworkZone extends TeaModel {
        /**
         * <p>IDaaS EIAM 网络区域描述</p>
         * 
         * <strong>example:</strong>
         * <p>test_description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ipv4Cidrs")
        public java.util.List<String> ipv4Cidrs;

        @NameInMap("Ipv6Cidrs")
        public java.util.List<String> ipv6Cidrs;

        /**
         * <p>IDaaS EIAM 网络区域Id</p>
         * 
         * <strong>example:</strong>
         * <p>network_m6fbr2bcbcadu3bcdpgzcxxxxx</p>
         */
        @NameInMap("NetworkZoneId")
        public String networkZoneId;

        /**
         * <p>IDaaS EIAM 网络区域名称</p>
         * 
         * <strong>example:</strong>
         * <p>test4_name</p>
         */
        @NameInMap("NetworkZoneName")
        public String networkZoneName;

        /**
         * <p>IDaaS EIAM 网络区域类型</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:network:zone:classic</p>
         */
        @NameInMap("NetworkZoneType")
        public String networkZoneType;

        /**
         * <p>IDaaS EIAM 专有网络VpcId</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-25w8wxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetNetworkZoneResponseBodyNetworkZone build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkZoneResponseBodyNetworkZone self = new GetNetworkZoneResponseBodyNetworkZone();
            return TeaModel.build(map, self);
        }

        public GetNetworkZoneResponseBodyNetworkZone setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetNetworkZoneResponseBodyNetworkZone setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetNetworkZoneResponseBodyNetworkZone setIpv4Cidrs(java.util.List<String> ipv4Cidrs) {
            this.ipv4Cidrs = ipv4Cidrs;
            return this;
        }
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        public GetNetworkZoneResponseBodyNetworkZone setIpv6Cidrs(java.util.List<String> ipv6Cidrs) {
            this.ipv6Cidrs = ipv6Cidrs;
            return this;
        }
        public java.util.List<String> getIpv6Cidrs() {
            return this.ipv6Cidrs;
        }

        public GetNetworkZoneResponseBodyNetworkZone setNetworkZoneId(String networkZoneId) {
            this.networkZoneId = networkZoneId;
            return this;
        }
        public String getNetworkZoneId() {
            return this.networkZoneId;
        }

        public GetNetworkZoneResponseBodyNetworkZone setNetworkZoneName(String networkZoneName) {
            this.networkZoneName = networkZoneName;
            return this;
        }
        public String getNetworkZoneName() {
            return this.networkZoneName;
        }

        public GetNetworkZoneResponseBodyNetworkZone setNetworkZoneType(String networkZoneType) {
            this.networkZoneType = networkZoneType;
            return this;
        }
        public String getNetworkZoneType() {
            return this.networkZoneType;
        }

        public GetNetworkZoneResponseBodyNetworkZone setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
