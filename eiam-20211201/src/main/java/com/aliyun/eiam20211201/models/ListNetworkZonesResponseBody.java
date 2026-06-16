// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkZonesResponseBody extends TeaModel {
    /**
     * <p>The list of network zones.</p>
     */
    @NameInMap("NetworkZones")
    public java.util.List<ListNetworkZonesResponseBodyNetworkZones> networkZones;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The token that is used to retrieve the previous page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListNetworkZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkZonesResponseBody self = new ListNetworkZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkZonesResponseBody setNetworkZones(java.util.List<ListNetworkZonesResponseBodyNetworkZones> networkZones) {
        this.networkZones = networkZones;
        return this;
    }
    public java.util.List<ListNetworkZonesResponseBodyNetworkZones> getNetworkZones() {
        return this.networkZones;
    }

    public ListNetworkZonesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNetworkZonesResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListNetworkZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkZonesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListNetworkZonesResponseBodyNetworkZones extends TeaModel {
        /**
         * <p>The description of the network zone.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IPv4 CIDR blocks.</p>
         */
        @NameInMap("Ipv4Cidrs")
        public java.util.List<String> ipv4Cidrs;

        /**
         * <p>The IPv6 CIDR blocks.</p>
         */
        @NameInMap("Ipv6Cidrs")
        public java.util.List<String> ipv6Cidrs;

        /**
         * <p>The network zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>network_m223wbvc3sn3uakfnxvhbxxxxx</p>
         */
        @NameInMap("NetworkZoneId")
        public String networkZoneId;

        /**
         * <p>The network zone name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        @NameInMap("NetworkZoneName")
        public String networkZoneName;

        /**
         * <p>The type of the network zone.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:network:zone:classic</p>
         */
        @NameInMap("NetworkZoneType")
        public String networkZoneType;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1usdmfqcgoy5ebxxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListNetworkZonesResponseBodyNetworkZones build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkZonesResponseBodyNetworkZones self = new ListNetworkZonesResponseBodyNetworkZones();
            return TeaModel.build(map, self);
        }

        public ListNetworkZonesResponseBodyNetworkZones setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNetworkZonesResponseBodyNetworkZones setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNetworkZonesResponseBodyNetworkZones setIpv4Cidrs(java.util.List<String> ipv4Cidrs) {
            this.ipv4Cidrs = ipv4Cidrs;
            return this;
        }
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        public ListNetworkZonesResponseBodyNetworkZones setIpv6Cidrs(java.util.List<String> ipv6Cidrs) {
            this.ipv6Cidrs = ipv6Cidrs;
            return this;
        }
        public java.util.List<String> getIpv6Cidrs() {
            return this.ipv6Cidrs;
        }

        public ListNetworkZonesResponseBodyNetworkZones setNetworkZoneId(String networkZoneId) {
            this.networkZoneId = networkZoneId;
            return this;
        }
        public String getNetworkZoneId() {
            return this.networkZoneId;
        }

        public ListNetworkZonesResponseBodyNetworkZones setNetworkZoneName(String networkZoneName) {
            this.networkZoneName = networkZoneName;
            return this;
        }
        public String getNetworkZoneName() {
            return this.networkZoneName;
        }

        public ListNetworkZonesResponseBodyNetworkZones setNetworkZoneType(String networkZoneType) {
            this.networkZoneType = networkZoneType;
            return this;
        }
        public String getNetworkZoneType() {
            return this.networkZoneType;
        }

        public ListNetworkZonesResponseBodyNetworkZones setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
