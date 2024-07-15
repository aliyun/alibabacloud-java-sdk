// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactsResponseBody extends TeaModel {
    /**
     * <p>The information about deployment packages.</p>
     */
    @NameInMap("Artifacts")
    public java.util.List<ListArtifactsResponseBodyArtifacts> artifacts;

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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
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
        /**
         * <p>The ID of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>artifact-eea08d1e2d3a43aexxxx</p>
         */
        @NameInMap("ArtifactId")
        public String artifactId;

        /**
         * <p>The type of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsImage</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The description of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the deployment package was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-20T02:19:55Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The latest version of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxVersion")
        public String maxVersion;

        /**
         * <p>The name of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek25rexxxxxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

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
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
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
