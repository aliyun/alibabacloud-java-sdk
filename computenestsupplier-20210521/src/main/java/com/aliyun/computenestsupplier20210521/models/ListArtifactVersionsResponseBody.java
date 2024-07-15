// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactVersionsResponseBody extends TeaModel {
    /**
     * <p>The version information about the deployment package.</p>
     */
    @NameInMap("Artifacts")
    public java.util.List<ListArtifactVersionsResponseBodyArtifacts> artifacts;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbfVwapgMwCN1wYzPVzLbItEdB0uWSY7AGnM3qCgm/YnjuEfwSnMwiMkcUoI0hRQzE=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46577928-3162-15A6-9084-69820EB9xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListArtifactVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactVersionsResponseBody self = new ListArtifactVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListArtifactVersionsResponseBody setArtifacts(java.util.List<ListArtifactVersionsResponseBodyArtifacts> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public java.util.List<ListArtifactVersionsResponseBodyArtifacts> getArtifacts() {
        return this.artifacts;
    }

    public ListArtifactVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListArtifactVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListArtifactVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListArtifactVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListArtifactVersionsResponseBodyArtifacts extends TeaModel {
        /**
         * <p>The ID of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>artifact-eea08d1e2d3a43aexxxx</p>
         */
        @NameInMap("ArtifactId")
        public String artifactId;

        /**
         * <p>The properties of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;CommodityCode\&quot;:\&quot;cmjj0005xxxx\&quot;,\&quot;CommodityVersion\&quot;:\&quot;V2022xxxx\&quot;}</p>
         */
        @NameInMap("ArtifactProperty")
        public String artifactProperty;

        /**
         * <p>The type of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsImage</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The version of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ArtifactVersion")
        public String artifactVersion;

        /**
         * <p>The time when the certificate was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-20T02:19:53Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the deployment package was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-20T02:19:55Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The distribution result of the image.</p>
         */
        @NameInMap("ImageDelivery")
        public java.util.Map<String, String> imageDelivery;

        /**
         * <p>The distribution progress of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The result file of the security scan.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://compute-nest-security-audit-bucket-ap-southeast-1.oss-ap-southeast-1.aliyuncs.com/51416747xxxx/xxxx">https://compute-nest-security-audit-bucket-ap-southeast-1.oss-ap-southeast-1.aliyuncs.com/51416747xxxx/xxxx</a></p>
         */
        @NameInMap("ResultFile")
        public String resultFile;

        /**
         * <p>The result of the security scan. Valid values:</p>
         * <ul>
         * <li>Normal: No risks exist on the deployment package.</li>
         * <li>AtRisk: Risks exist on the deployment package.</li>
         * <li>Processing: The deployment package is being scanned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SecurityAuditResult")
        public String securityAuditResult;

        /**
         * <p>The status of the deployment package. Valid values:</p>
         * <ul>
         * <li>Created: The deployment package is created.</li>
         * <li>Scanning: The deployment package is being scanned.</li>
         * <li>ScanFailed: The deployment package failed to be scanned.</li>
         * <li>Delivering: The deployment package is being distributed.</li>
         * <li>Available: The deployment package is available.</li>
         * <li>Deleted: The deployment package is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the region that supports the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *                     &quot;cn-beijing&quot;,
         *                     &quot;cn-hangzhou&quot;,
         *                     &quot;cn-shanghai&quot;
         *                 ]</p>
         */
        @NameInMap("SupportRegionIds")
        public String supportRegionIds;

        /**
         * <p>The version name of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static ListArtifactVersionsResponseBodyArtifacts build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactVersionsResponseBodyArtifacts self = new ListArtifactVersionsResponseBodyArtifacts();
            return TeaModel.build(map, self);
        }

        public ListArtifactVersionsResponseBodyArtifacts setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public ListArtifactVersionsResponseBodyArtifacts setArtifactProperty(String artifactProperty) {
            this.artifactProperty = artifactProperty;
            return this;
        }
        public String getArtifactProperty() {
            return this.artifactProperty;
        }

        public ListArtifactVersionsResponseBodyArtifacts setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListArtifactVersionsResponseBodyArtifacts setArtifactVersion(String artifactVersion) {
            this.artifactVersion = artifactVersion;
            return this;
        }
        public String getArtifactVersion() {
            return this.artifactVersion;
        }

        public ListArtifactVersionsResponseBodyArtifacts setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListArtifactVersionsResponseBodyArtifacts setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListArtifactVersionsResponseBodyArtifacts setImageDelivery(java.util.Map<String, String> imageDelivery) {
            this.imageDelivery = imageDelivery;
            return this;
        }
        public java.util.Map<String, String> getImageDelivery() {
            return this.imageDelivery;
        }

        public ListArtifactVersionsResponseBodyArtifacts setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListArtifactVersionsResponseBodyArtifacts setResultFile(String resultFile) {
            this.resultFile = resultFile;
            return this;
        }
        public String getResultFile() {
            return this.resultFile;
        }

        public ListArtifactVersionsResponseBodyArtifacts setSecurityAuditResult(String securityAuditResult) {
            this.securityAuditResult = securityAuditResult;
            return this;
        }
        public String getSecurityAuditResult() {
            return this.securityAuditResult;
        }

        public ListArtifactVersionsResponseBodyArtifacts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListArtifactVersionsResponseBodyArtifacts setSupportRegionIds(String supportRegionIds) {
            this.supportRegionIds = supportRegionIds;
            return this;
        }
        public String getSupportRegionIds() {
            return this.supportRegionIds;
        }

        public ListArtifactVersionsResponseBodyArtifacts setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
