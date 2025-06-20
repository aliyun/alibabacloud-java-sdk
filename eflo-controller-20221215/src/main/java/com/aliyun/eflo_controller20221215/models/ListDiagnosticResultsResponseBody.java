// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListDiagnosticResultsResponseBody extends TeaModel {
    @NameInMap("DiagnosticResults")
    public java.util.List<ListDiagnosticResultsResponseBodyDiagnosticResults> diagnosticResults;

    /**
     * <ul>
     * <li></li>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>a3f2224a5ec7224116c4f5246120abe4</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>AC4F0004-7BCE-52E0-891B-CAC7D64E3368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDiagnosticResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosticResultsResponseBody self = new ListDiagnosticResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiagnosticResultsResponseBody setDiagnosticResults(java.util.List<ListDiagnosticResultsResponseBodyDiagnosticResults> diagnosticResults) {
        this.diagnosticResults = diagnosticResults;
        return this;
    }
    public java.util.List<ListDiagnosticResultsResponseBodyDiagnosticResults> getDiagnosticResults() {
        return this.diagnosticResults;
    }

    public ListDiagnosticResultsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListDiagnosticResultsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDiagnosticResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDiagnosticResultsResponseBodyDiagnosticResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i118578141694745246055</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>pjlab-lingjun</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>2024-01-15T02:01:12Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>diagcontent</p>
         */
        @NameInMap("DiagContent")
        public String diagContent;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DiagId")
        public String diagId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("DiagResult")
        public String diagResult;

        /**
         * <strong>example:</strong>
         * <p>2024-10-16T02:04Z</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <strong>example:</strong>
         * <p>e01-cn-bl03ofg6206</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>proxy-rps.mos.csvw.com</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        /**
         * <strong>example:</strong>
         * <p>succeed</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDiagnosticResultsResponseBodyDiagnosticResults build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnosticResultsResponseBodyDiagnosticResults self = new ListDiagnosticResultsResponseBodyDiagnosticResults();
            return TeaModel.build(map, self);
        }

        public ListDiagnosticResultsResponseBodyDiagnosticResults setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListDiagnosticResultsResponseBodyDiagnosticResults setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListDiagnosticResultsResponseBodyDiagnosticResults setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListDiagnosticResultsResponseBodyDiagnosticResults setDiagContent(String diagContent) {
            this.diagContent = diagContent;
            return this;
        }
        public String getDiagContent() {
            return this.diagContent;
        }

        public ListDiagnosticResultsResponseBodyDiagnosticResults setDiagId(String diagId) {
            this.diagId = diagId;
            return this;
        }
        public String getDiagId() {
            return this.diagId;
        }

        public ListDiagnosticResultsResponseBodyDiagnosticResults setDiagResult(String diagResult) {
            this.diagResult = diagResult;
            return this;
        }
        public String getDiagResult() {
            return this.diagResult;
        }

        public ListDiagnosticResultsResponseBodyDiagnosticResults setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ListDiagnosticResultsResponseBodyDiagnosticResults setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListDiagnosticResultsResponseBodyDiagnosticResults setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

        public ListDiagnosticResultsResponseBodyDiagnosticResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
