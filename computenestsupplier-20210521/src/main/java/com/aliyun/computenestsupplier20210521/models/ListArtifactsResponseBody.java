// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactsResponseBody extends TeaModel {
    @NameInMap("Artifacts")
    public java.util.List<ListArtifactsResponseBodyArtifacts> artifacts;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListArtifactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactsResponseBody self = new ListArtifactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListArtifactsResponseBody setArtifacts(java.util.List<ListArtifactsResponseBodyArtifacts> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public java.util.List<ListArtifactsResponseBodyArtifacts> getArtifacts() {
        return this.artifacts;
    }

    public ListArtifactsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListArtifactsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListArtifactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListArtifactsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListArtifactsResponseBodyArtifactsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListArtifactsResponseBodyArtifactsTags build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactsResponseBodyArtifactsTags self = new ListArtifactsResponseBodyArtifactsTags();
            return TeaModel.build(map, self);
        }

        public ListArtifactsResponseBodyArtifactsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListArtifactsResponseBodyArtifactsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListArtifactsResponseBodyArtifacts extends TeaModel {
        @NameInMap("ArtifactId")
        public String artifactId;

        @NameInMap("ArtifactType")
        public String artifactType;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MaxVersion")
        public String maxVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListArtifactsResponseBodyArtifactsTags> tags;

        public static ListArtifactsResponseBodyArtifacts build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactsResponseBodyArtifacts self = new ListArtifactsResponseBodyArtifacts();
            return TeaModel.build(map, self);
        }

        public ListArtifactsResponseBodyArtifacts setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public ListArtifactsResponseBodyArtifacts setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListArtifactsResponseBodyArtifacts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListArtifactsResponseBodyArtifacts setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListArtifactsResponseBodyArtifacts setMaxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }
        public String getMaxVersion() {
            return this.maxVersion;
        }

        public ListArtifactsResponseBodyArtifacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListArtifactsResponseBodyArtifacts setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListArtifactsResponseBodyArtifacts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListArtifactsResponseBodyArtifacts setTags(java.util.List<ListArtifactsResponseBodyArtifactsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListArtifactsResponseBodyArtifactsTags> getTags() {
            return this.tags;
        }

    }

}
