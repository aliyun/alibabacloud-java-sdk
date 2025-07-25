// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListDiagnosticResultsResponseBody extends TeaModel {
    /**
     * <p>The diagnostic information.</p>
     */
    @NameInMap("DiagnosticResults")
    public java.util.List<ListDiagnosticResultsResponseBodyDiagnosticResults> diagnosticResults;

    /**
     * <p>Number of items per page in a paginated query. The maximum value is 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If no value is set or the set value is less than 20, the default value is 20.</li>
     * <li>If the set value is greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>NextToken for the next page. Include this value when requesting the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>a3f2224a5ec7224116c4f5246120abe4</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i118578141694745246055</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>Cluster Name</p>
         * 
         * <strong>example:</strong>
         * <p>pjlab-lingjun</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>Creation time of the diagnostic task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-15T02:01:12Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Diagnostic content. For example, in network diagnostics, there are static configuration checks, dynamic operation checks, and other diagnostic contents.</p>
         * 
         * <strong>example:</strong>
         * <p>diagcontent</p>
         */
        @NameInMap("DiagContent")
        public String diagContent;

        /**
         * <p>Diagnosis ID</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DiagId")
        public String diagId;

        /**
         * <p>Diagnostic result, either success or failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("DiagResult")
        public String diagResult;

        /**
         * <p>Completion time of the diagnostic task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16T02:04Z</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-bl03ofg6206</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Server name.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy-rps.mos.csvw.com</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        /**
         * <p>Status of the diagnostic task. Possible values:</p>
         * <ul>
         * <li>InProgress: Diagnosing.</li>
         * <li>Finished: Diagnosis completed.</li>
         * <li>Failed: Diagnosis failed.</li>
         * </ul>
         * 
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
