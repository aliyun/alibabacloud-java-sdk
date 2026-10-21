// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RetryImageCacheResponseBody extends TeaModel {
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
     * <p>The retry image cache result.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public RetryImageCacheResponseBodyData data;

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
     * <p>The response message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which is used for troubleshooting.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>req-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. This does not mean that the cache production is complete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RetryImageCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryImageCacheResponseBody self = new RetryImageCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryImageCacheResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetryImageCacheResponseBody setData(RetryImageCacheResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetryImageCacheResponseBodyData getData() {
        return this.data;
    }

    public RetryImageCacheResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RetryImageCacheResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetryImageCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryImageCacheResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RetryImageCacheResponseBodyDataError extends TeaModel {
        /**
         * <p>The secure and non-empty error code for the current production failure.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACSCacheBuildFailed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The secure and non-empty display reason for the production failure, excluding credentials, internal addresses, or stack traces.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Image cache production failed. Please retry</p>
         */
        @NameInMap("message")
        public String message;

        public static RetryImageCacheResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            RetryImageCacheResponseBodyDataError self = new RetryImageCacheResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public RetryImageCacheResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RetryImageCacheResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class RetryImageCacheResponseBodyData extends TeaModel {
        /**
         * <p>The source ACR Enterprise instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-example</p>
         */
        @NameInMap("acrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The deduplicated number of agents in the current workspace that have useImageCache set to true and are associated with this logical resource. The value is greater than or equal to 0. This uses the same set as the imageCacheId filter in ListAllAgents. Agents with the feature disabled are not counted, regardless of the number of occupied instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("agentCount")
        public Long agentCount;

        /**
         * <p>The actual cache size in bytes. Known values are greater than or equal to 0. If unknown, the value is null. The compressed size of the source image cannot be used as a substitute.</p>
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
         * <p>Indicates whether deletion is allowed. The value is true when the current workspace has no configuration references with the switch enabled, no valid instances are occupying the resource, and the resource is not being deleted. If the reference status is unknown, the query fails instead of allowing deletion by default.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canDelete")
        public Boolean canDelete;

        /**
         * <p>The creation time of the logical resource in the current workspace, in RFC3339 format with time zone. Content updates for the &quot;latest&quot; tag do not refresh this time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The reason why deletion is blocked. The value is null when canDelete is true. Otherwise, the value is returned based on the priority of DELETING, AGENT_ENABLED, and INSTANCES_RELEASING. Old instances may still occupy the resource even if the agent count is 0.</p>
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
         * <p>The current content digest in the sha256: format followed by a 64-character lowercase hexadecimal string. It only describes the currently registered content and does not prove that old instances have been switched.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
         */
        @NameInMap("digest")
        public String digest;

        /**
         * <p>The reason for cache failure. This is a non-empty object when the status is FAILED, and null for other statuses. It only describes the current content and the current production round.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("error")
        public RetryImageCacheResponseBodyDataError error;

        /**
         * <p>The logical resource ID manageable by the current workspace, not the shared physical cache ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>img-example</p>
         */
        @NameInMap("imageId")
        public String imageId;

        /**
         * <p>The source image domain name, excluding the protocol, path, and credentials.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-registry.cn-hangzhou.cr.aliyuncs.com</p>
         */
        @NameInMap("registry")
        public String registry;

        /**
         * <p>The source image repository path in the namespace/repository format, which includes the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>team/app</p>
         */
        @NameInMap("repository")
        public String repository;

        /**
         * <p>The image cache status. Valid values:</p>
         * <ul>
         * <li>PENDING: The cache is being created.</li>
         * <li>READY: The cache is available.</li>
         * <li>FAILED: An exception occurred.</li>
         * <li>DELETING: The cache is being deleted in the current workspace.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The source image tag with case preserved. Regular tags cannot be registered with different digests, except for the exact lowercase &quot;latest&quot; tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The workspace ID, which is consistent with the requested workspace. Resources with the same content from other workspaces are not returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static RetryImageCacheResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetryImageCacheResponseBodyData self = new RetryImageCacheResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetryImageCacheResponseBodyData setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public RetryImageCacheResponseBodyData setAgentCount(Long agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Long getAgentCount() {
            return this.agentCount;
        }

        public RetryImageCacheResponseBodyData setCacheSizeBytes(Long cacheSizeBytes) {
            this.cacheSizeBytes = cacheSizeBytes;
            return this;
        }
        public Long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        public RetryImageCacheResponseBodyData setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public RetryImageCacheResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public RetryImageCacheResponseBodyData setDeleteBlockReason(String deleteBlockReason) {
            this.deleteBlockReason = deleteBlockReason;
            return this;
        }
        public String getDeleteBlockReason() {
            return this.deleteBlockReason;
        }

        public RetryImageCacheResponseBodyData setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public RetryImageCacheResponseBodyData setError(RetryImageCacheResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public RetryImageCacheResponseBodyDataError getError() {
            return this.error;
        }

        public RetryImageCacheResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public RetryImageCacheResponseBodyData setRegistry(String registry) {
            this.registry = registry;
            return this;
        }
        public String getRegistry() {
            return this.registry;
        }

        public RetryImageCacheResponseBodyData setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public RetryImageCacheResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RetryImageCacheResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public RetryImageCacheResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
