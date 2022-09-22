// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeNetworkInsightsPathsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NetworkInsightsPathSets")
    public NetworkInsightsPathSets networkInsightsPathSets;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNetworkInsightsPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInsightsPathsResponseBody self = new DescribeNetworkInsightsPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInsightsPathsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNetworkInsightsPathsResponseBody setNetworkInsightsPathSets(NetworkInsightsPathSets networkInsightsPathSets) {
        this.networkInsightsPathSets = networkInsightsPathSets;
        return this;
    }
    public NetworkInsightsPathSets getNetworkInsightsPathSets() {
        return this.networkInsightsPathSets;
    }

    public DescribeNetworkInsightsPathsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkInsightsPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class NetworkInsightsPathSet extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("DestinationPort")
        public String destinationPort;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("NetworkInsightsPathId")
        public String networkInsightsPathId;

        @NameInMap("NetworkInsightsPathName")
        public String networkInsightsPathName;

        @NameInMap("NetworkPathFound")
        public String networkPathFound;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        public static NetworkInsightsPathSet build(java.util.Map<String, ?> map) throws Exception {
            NetworkInsightsPathSet self = new NetworkInsightsPathSet();
            return TeaModel.build(map, self);
        }

        public NetworkInsightsPathSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public NetworkInsightsPathSet setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public NetworkInsightsPathSet setDestinationPort(String destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public String getDestinationPort() {
            return this.destinationPort;
        }

        public NetworkInsightsPathSet setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public NetworkInsightsPathSet setNetworkInsightsPathId(String networkInsightsPathId) {
            this.networkInsightsPathId = networkInsightsPathId;
            return this;
        }
        public String getNetworkInsightsPathId() {
            return this.networkInsightsPathId;
        }

        public NetworkInsightsPathSet setNetworkInsightsPathName(String networkInsightsPathName) {
            this.networkInsightsPathName = networkInsightsPathName;
            return this;
        }
        public String getNetworkInsightsPathName() {
            return this.networkInsightsPathName;
        }

        public NetworkInsightsPathSet setNetworkPathFound(String networkPathFound) {
            this.networkPathFound = networkPathFound;
            return this;
        }
        public String getNetworkPathFound() {
            return this.networkPathFound;
        }

        public NetworkInsightsPathSet setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public NetworkInsightsPathSet setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public NetworkInsightsPathSet setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public NetworkInsightsPathSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class NetworkInsightsPathSets extends TeaModel {
        @NameInMap("NetworkInsightsPathSet")
        public java.util.List<NetworkInsightsPathSet> networkInsightsPathSet;

        public static NetworkInsightsPathSets build(java.util.Map<String, ?> map) throws Exception {
            NetworkInsightsPathSets self = new NetworkInsightsPathSets();
            return TeaModel.build(map, self);
        }

        public NetworkInsightsPathSets setNetworkInsightsPathSet(java.util.List<NetworkInsightsPathSet> networkInsightsPathSet) {
            this.networkInsightsPathSet = networkInsightsPathSet;
            return this;
        }
        public java.util.List<NetworkInsightsPathSet> getNetworkInsightsPathSet() {
            return this.networkInsightsPathSet;
        }

    }

}
