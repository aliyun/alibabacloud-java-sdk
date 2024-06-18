// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactVersionsResponseBody extends TeaModel {
    @NameInMap("Artifacts")
    public java.util.List<ListArtifactVersionsResponseBodyArtifacts> artifacts;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbfVwapgMwCN1wYzPVzLbItEdB0uWSY7AGnM3qCgm/YnjuEfwSnMwiMkcUoI0hRQzE=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>46577928-3162-15A6-9084-69820EB9xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>artifact-eea08d1e2d3a43aexxxx</p>
         */
        @NameInMap("ArtifactId")
        public String artifactId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;CommodityCode\&quot;:\&quot;cmjj0005xxxx\&quot;,\&quot;CommodityVersion\&quot;:\&quot;V2022xxxx\&quot;}</p>
         */
        @NameInMap("ArtifactProperty")
        public String artifactProperty;

        /**
         * <strong>example:</strong>
         * <p>EcsImage</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ArtifactVersion")
        public String artifactVersion;

        /**
         * <strong>example:</strong>
         * <p>2022-10-20T02:19:53Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-10-20T02:19:55Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ImageDelivery")
        public java.util.Map<String, String> imageDelivery;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        @NameInMap("ResultFile")
        public String resultFile;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SecurityAuditResult")
        public String securityAuditResult;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
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
