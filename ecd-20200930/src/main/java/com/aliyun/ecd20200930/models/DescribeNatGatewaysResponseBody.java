// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NatGateways")
    public java.util.List<DescribeNatGatewaysResponseBodyNatGateways> natGateways;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNatGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysResponseBody self = new DescribeNatGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewaysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNatGatewaysResponseBody setNatGateways(java.util.List<DescribeNatGatewaysResponseBodyNatGateways> natGateways) {
        this.natGateways = natGateways;
        return this;
    }
    public java.util.List<DescribeNatGatewaysResponseBodyNatGateways> getNatGateways() {
        return this.natGateways;
    }

    public DescribeNatGatewaysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNatGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysIpLists extends TeaModel {
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("SnatEntryEnabled")
        public String snatEntryEnabled;

        @NameInMap("UsingStatus")
        public String usingStatus;

        public static DescribeNatGatewaysResponseBodyNatGatewaysIpLists build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysIpLists self = new DescribeNatGatewaysResponseBodyNatGatewaysIpLists();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysIpLists setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysIpLists setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysIpLists setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysIpLists setSnatEntryEnabled(String snatEntryEnabled) {
            this.snatEntryEnabled = snatEntryEnabled;
            return this;
        }
        public String getSnatEntryEnabled() {
            return this.snatEntryEnabled;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysIpLists setUsingStatus(String usingStatus) {
            this.usingStatus = usingStatus;
            return this;
        }
        public String getUsingStatus() {
            return this.usingStatus;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGateways extends TeaModel {
        @NameInMap("ForwardTableIds")
        public java.util.List<String> forwardTableIds;

        @NameInMap("IpLists")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysIpLists> ipLists;

        @NameInMap("Name")
        public String name;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("SnatTableIds")
        public java.util.List<String> snatTableIds;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeNatGatewaysResponseBodyNatGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGateways self = new DescribeNatGatewaysResponseBodyNatGateways();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGateways setForwardTableIds(java.util.List<String> forwardTableIds) {
            this.forwardTableIds = forwardTableIds;
            return this;
        }
        public java.util.List<String> getForwardTableIds() {
            return this.forwardTableIds;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setIpLists(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysIpLists> ipLists) {
            this.ipLists = ipLists;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysIpLists> getIpLists() {
            return this.ipLists;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setSnatTableIds(java.util.List<String> snatTableIds) {
            this.snatTableIds = snatTableIds;
            return this;
        }
        public java.util.List<String> getSnatTableIds() {
            return this.snatTableIds;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
