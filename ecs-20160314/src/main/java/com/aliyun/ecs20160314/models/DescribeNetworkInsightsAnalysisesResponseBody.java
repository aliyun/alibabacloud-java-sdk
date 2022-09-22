// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeNetworkInsightsAnalysisesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NetworkInsightsAnalysisSets")
    public NetworkInsightsAnalysisSets networkInsightsAnalysisSets;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNetworkInsightsAnalysisesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInsightsAnalysisesResponseBody self = new DescribeNetworkInsightsAnalysisesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInsightsAnalysisesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNetworkInsightsAnalysisesResponseBody setNetworkInsightsAnalysisSets(NetworkInsightsAnalysisSets networkInsightsAnalysisSets) {
        this.networkInsightsAnalysisSets = networkInsightsAnalysisSets;
        return this;
    }
    public NetworkInsightsAnalysisSets getNetworkInsightsAnalysisSets() {
        return this.networkInsightsAnalysisSets;
    }

    public DescribeNetworkInsightsAnalysisesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkInsightsAnalysisesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class NetworkInsightsAnalysisSet extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("NetworkInsightsAnalysisId")
        public String networkInsightsAnalysisId;

        @NameInMap("NetworkInsightsPathId")
        public String networkInsightsPathId;

        @NameInMap("NetworkPathFound")
        public String networkPathFound;

        @NameInMap("Status")
        public String status;

        public static NetworkInsightsAnalysisSet build(java.util.Map<String, ?> map) throws Exception {
            NetworkInsightsAnalysisSet self = new NetworkInsightsAnalysisSet();
            return TeaModel.build(map, self);
        }

        public NetworkInsightsAnalysisSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public NetworkInsightsAnalysisSet setNetworkInsightsAnalysisId(String networkInsightsAnalysisId) {
            this.networkInsightsAnalysisId = networkInsightsAnalysisId;
            return this;
        }
        public String getNetworkInsightsAnalysisId() {
            return this.networkInsightsAnalysisId;
        }

        public NetworkInsightsAnalysisSet setNetworkInsightsPathId(String networkInsightsPathId) {
            this.networkInsightsPathId = networkInsightsPathId;
            return this;
        }
        public String getNetworkInsightsPathId() {
            return this.networkInsightsPathId;
        }

        public NetworkInsightsAnalysisSet setNetworkPathFound(String networkPathFound) {
            this.networkPathFound = networkPathFound;
            return this;
        }
        public String getNetworkPathFound() {
            return this.networkPathFound;
        }

        public NetworkInsightsAnalysisSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class NetworkInsightsAnalysisSets extends TeaModel {
        @NameInMap("NetworkInsightsAnalysisSet")
        public java.util.List<NetworkInsightsAnalysisSet> networkInsightsAnalysisSet;

        public static NetworkInsightsAnalysisSets build(java.util.Map<String, ?> map) throws Exception {
            NetworkInsightsAnalysisSets self = new NetworkInsightsAnalysisSets();
            return TeaModel.build(map, self);
        }

        public NetworkInsightsAnalysisSets setNetworkInsightsAnalysisSet(java.util.List<NetworkInsightsAnalysisSet> networkInsightsAnalysisSet) {
            this.networkInsightsAnalysisSet = networkInsightsAnalysisSet;
            return this;
        }
        public java.util.List<NetworkInsightsAnalysisSet> getNetworkInsightsAnalysisSet() {
            return this.networkInsightsAnalysisSet;
        }

    }

}
