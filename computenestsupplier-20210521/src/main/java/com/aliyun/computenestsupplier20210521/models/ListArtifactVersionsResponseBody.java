// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactVersionsResponseBody extends TeaModel {
    @NameInMap("Artifacts")
    public java.util.List<ListArtifactVersionsResponseBodyArtifacts> artifacts;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ArtifactId")
        public String artifactId;

        @NameInMap("ArtifactProperty")
        public String artifactProperty;

        @NameInMap("ArtifactType")
        public String artifactType;

        @NameInMap("ArtifactVersion")
        public String artifactVersion;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ImageDelivery")
        public java.util.Map<String, String> imageDelivery;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ResultFile")
        public String resultFile;

        @NameInMap("SecurityAuditResult")
        public String securityAuditResult;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupportRegionIds")
        public String supportRegionIds;

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
