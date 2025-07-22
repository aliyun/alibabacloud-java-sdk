// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesResponseBody extends TeaModel {
    @NameInMap("ForwardTableEntries")
    public java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntries> forwardTableEntries;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeForwardTableEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesResponseBody self = new DescribeForwardTableEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeForwardTableEntriesResponseBody setForwardTableEntries(java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntries> forwardTableEntries) {
        this.forwardTableEntries = forwardTableEntries;
        return this;
    }
    public java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntries> getForwardTableEntries() {
        return this.forwardTableEntries;
    }

    public DescribeForwardTableEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeForwardTableEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeForwardTableEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeForwardTableEntriesResponseBodyForwardTableEntries extends TeaModel {
        @NameInMap("ExternalIp")
        public String externalIp;

        @NameInMap("ExternalPort")
        public String externalPort;

        @NameInMap("ForwardEntryId")
        public String forwardEntryId;

        @NameInMap("ForwardEntryName")
        public String forwardEntryName;

        @NameInMap("ForwardTableId")
        public String forwardTableId;

        @NameInMap("InternalIp")
        public String internalIp;

        @NameInMap("InternalPort")
        public String internalPort;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("Status")
        public String status;

        public static DescribeForwardTableEntriesResponseBodyForwardTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseBodyForwardTableEntries self = new DescribeForwardTableEntriesResponseBodyForwardTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setForwardEntryId(String forwardEntryId) {
            this.forwardEntryId = forwardEntryId;
            return this;
        }
        public String getForwardEntryId() {
            return this.forwardEntryId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setForwardEntryName(String forwardEntryName) {
            this.forwardEntryName = forwardEntryName;
            return this;
        }
        public String getForwardEntryName() {
            return this.forwardEntryName;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setForwardTableId(String forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public String getForwardTableId() {
            return this.forwardTableId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
