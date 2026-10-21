// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListImageCachesResponseBody extends TeaModel {
    /**
     * <p>The business response code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The records on the current page. An empty array is returned if no matching items are found.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<ListImageCachesResponseBodyItems> items;

    /**
     * <p>The actual page size used for this request. This is not the number of items on the current page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The opaque cursor for the next page. An empty string indicates that no more pages are available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>opaque-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID used for troubleshooting.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>req-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of true does not indicate that the cache creation is complete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records that match the current filter conditions. Do not use this value to determine whether all pages have been returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListImageCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageCachesResponseBody self = new ListImageCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageCachesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListImageCachesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListImageCachesResponseBody setItems(java.util.List<ListImageCachesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListImageCachesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListImageCachesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListImageCachesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListImageCachesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListImageCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageCachesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListImageCachesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListImageCachesResponseBodyItemsError extends TeaModel {
        /**
         * <p>The secure and non-empty error code for the current creation attempt.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACSCacheBuildFailed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The secure and non-empty description of the failure. It does not contain credentials, internal addresses, or stack traces.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to create the image cache. Please try again</p>
         */
        @NameInMap("message")
        public String message;

        public static ListImageCachesResponseBodyItemsError build(java.util.Map<String, ?> map) throws Exception {
            ListImageCachesResponseBodyItemsError self = new ListImageCachesResponseBodyItemsError();
            return TeaModel.build(map, self);
        }

        public ListImageCachesResponseBodyItemsError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListImageCachesResponseBodyItemsError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListImageCachesResponseBodyItems extends TeaModel {
        /**
         * <p>The ID of the source ACR Enterprise instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-example</p>
         */
        @NameInMap("acrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The deduplicated number of agents in the current workspace that have useImageCache set to true and are associated with this logical resource. The value is greater than or equal to 0. This matches the set filtered by imageCacheId in ListAllAgents. Disabled agents are not counted, and this value is independent of the number of occupied instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("agentCount")
        public Long agentCount;

        /**
         * <p>The actual cache size in bytes. The value is greater than or equal to 0 if known, or null if unknown. The compressed size of the source image cannot be used as a substitute.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1073741824</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("cacheSizeBytes")
        public Long cacheSizeBytes;

        /**
         * <p>Indicates whether the resource can be deleted. The value is true if no configuration references with the switch enabled exist in the current workspace, no valid instances are occupying the resource, and the resource is not being deleted. If the reference status is unknown, the query fails instead of defaulting to true.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canDelete")
        public Boolean canDelete;

        /**
         * <p>The creation time of the logical resource in the current workspace, in RFC 3339 format with the time zone. Content updates for the latest tag do not refresh this time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The reason why deletion is blocked. The value is null if canDelete is true. Otherwise, the value is returned based on the priority of DELETING, AGENT_ENABLED, and INSTANCES_RELEASING. Old instances may still occupy the resource even if the agent count is 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCES_RELEASING</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("deleteBlockReason")
        public String deleteBlockReason;

        /**
         * <p>The digest in the sha256: format followed by a 64-character lowercase hexadecimal string. It only describes the currently registered content and does not indicate whether old instances have been switched.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
         */
        @NameInMap("digest")
        public String digest;

        /**
         * <p>The cache failure details. It is a non-null object when the status is FAILED, and null for other statuses. It only describes the current content and the current creation attempt.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("error")
        public ListImageCachesResponseBodyItemsError error;

        /**
         * <p>The logical resource ID that can be managed in the current workspace. This is not the shared physical cache ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>img-example</p>
         */
        @NameInMap("imageId")
        public String imageId;

        /**
         * <p>The domain name of the source image. It does not include the protocol, path, or credentials.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-registry.cn-hangzhou.cr.aliyuncs.com</p>
         */
        @NameInMap("registry")
        public String registry;

        /**
         * <p>The path of the source image repository in the namespace/repository format. The namespace is included.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>team/app</p>
         */
        @NameInMap("repository")
        public String repository;

        /**
         * <p>The status of the image cache. Valid values: PENDING (creating), READY (available), FAILED (abnormal), and DELETING (deleting in the current workspace).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tag of the source image. It is case-sensitive. Regular tags cannot be registered with different digests, except for the exact lowercase \&quot;latest\&quot;.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The workspace ID. It must be consistent with the requested workspace. Resources with the same content from other workspaces must not be returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListImageCachesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListImageCachesResponseBodyItems self = new ListImageCachesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListImageCachesResponseBodyItems setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public ListImageCachesResponseBodyItems setAgentCount(Long agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Long getAgentCount() {
            return this.agentCount;
        }

        public ListImageCachesResponseBodyItems setCacheSizeBytes(Long cacheSizeBytes) {
            this.cacheSizeBytes = cacheSizeBytes;
            return this;
        }
        public Long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        public ListImageCachesResponseBodyItems setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListImageCachesResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListImageCachesResponseBodyItems setDeleteBlockReason(String deleteBlockReason) {
            this.deleteBlockReason = deleteBlockReason;
            return this;
        }
        public String getDeleteBlockReason() {
            return this.deleteBlockReason;
        }

        public ListImageCachesResponseBodyItems setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public ListImageCachesResponseBodyItems setError(ListImageCachesResponseBodyItemsError error) {
            this.error = error;
            return this;
        }
        public ListImageCachesResponseBodyItemsError getError() {
            return this.error;
        }

        public ListImageCachesResponseBodyItems setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImageCachesResponseBodyItems setRegistry(String registry) {
            this.registry = registry;
            return this;
        }
        public String getRegistry() {
            return this.registry;
        }

        public ListImageCachesResponseBodyItems setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public ListImageCachesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListImageCachesResponseBodyItems setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListImageCachesResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
