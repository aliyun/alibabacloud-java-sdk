// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateImageCacheResponseBody extends TeaModel {
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
     * <p>The result of creating the image cache.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public CreateImageCacheResponseBodyData data;

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
     * <p>Indicates whether the request is successful. This does not indicate that the cache creation is complete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateImageCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheResponseBody self = new CreateImageCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageCacheResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateImageCacheResponseBody setData(CreateImageCacheResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateImageCacheResponseBodyData getData() {
        return this.data;
    }

    public CreateImageCacheResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateImageCacheResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateImageCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageCacheResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateImageCacheResponseBodyDataError extends TeaModel {
        /**
         * <p>The secure and non-null error code for the current creation failure.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACSCacheBuildFailed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The secure and non-null display reason for the creation failure, excluding credentials, internal addresses, or stack traces.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to create the image cache. Please try again</p>
         */
        @NameInMap("message")
        public String message;

        public static CreateImageCacheResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheResponseBodyDataError self = new CreateImageCacheResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateImageCacheResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CreateImageCacheResponseBodyData extends TeaModel {
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
         * <p>The deduplicated number of agents that have useImageCache set to true and are associated with this logical resource in the current workspace. The value is greater than or equal to 0. This set is the same as the set filtered by imageCacheId in ListAllAgents. Agents with the feature disabled are not counted, and this value is independent of the number of occupied instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("agentCount")
        public Long agentCount;

        /**
         * <p>The actual cache size in bytes. The known value is greater than or equal to 0. If the value is unknown, it is null. The compressed size of the source image cannot be used as a substitute.</p>
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
         * <p>Indicates whether deletion is allowed. The value is true when there are no configuration references with the switch enabled, no valid instances occupying the resource, and the resource is not being deleted in the current workspace. If the reference status is unknown, the query should fail, and deletion cannot be allowed by default.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canDelete")
        public Boolean canDelete;

        /**
         * <p>The creation time of the logical resource in the current workspace, in RFC3339 format with time zone. The time is not refreshed when the content of the latest tag is updated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The reason why deletion is blocked. The value is null when canDelete is true. Otherwise, the value is returned based on the priority of DELETING, AGENT_ENABLED, and INSTANCES_RELEASING. Even if the number of agents is 0, old instances may still occupy the resource.</p>
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
         * <p>The current content digest in the format of sha256: followed by a 64-character lowercase hexadecimal string. It only describes the currently registered content and does not prove that old instances have been switched.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
         */
        @NameInMap("digest")
        public String digest;

        /**
         * <p>The reason for the cache failure. This is a non-null object when the status is FAILED, and null for other statuses. It only describes the current content and the current creation round.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("error")
        public CreateImageCacheResponseBodyDataError error;

        /**
         * <p>The logical resource ID manageable by the current workspace, which is not a shared physical cache ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>img-example</p>
         */
        @NameInMap("imageId")
        public String imageId;

        /**
         * <p>The domain name of the source image, excluding the protocol, path, and credentials.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-registry.cn-hangzhou.cr.aliyuncs.com</p>
         */
        @NameInMap("registry")
        public String registry;

        /**
         * <p>The path of the source image repository in the namespace/repository format, which already includes the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>team/app</p>
         */
        @NameInMap("repository")
        public String repository;

        /**
         * <p>The status of the image cache. Valid values: PENDING: creating, READY: available, FAILED: abnormal, DELETING: deleting in the current workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tag of the source image. Case is preserved. Regular tags cannot be registered with different digests, with the exact lowercase latest tag being the only exception.</p>
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

        public static CreateImageCacheResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheResponseBodyData self = new CreateImageCacheResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateImageCacheResponseBodyData setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public CreateImageCacheResponseBodyData setAgentCount(Long agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Long getAgentCount() {
            return this.agentCount;
        }

        public CreateImageCacheResponseBodyData setCacheSizeBytes(Long cacheSizeBytes) {
            this.cacheSizeBytes = cacheSizeBytes;
            return this;
        }
        public Long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        public CreateImageCacheResponseBodyData setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public CreateImageCacheResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateImageCacheResponseBodyData setDeleteBlockReason(String deleteBlockReason) {
            this.deleteBlockReason = deleteBlockReason;
            return this;
        }
        public String getDeleteBlockReason() {
            return this.deleteBlockReason;
        }

        public CreateImageCacheResponseBodyData setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public CreateImageCacheResponseBodyData setError(CreateImageCacheResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public CreateImageCacheResponseBodyDataError getError() {
            return this.error;
        }

        public CreateImageCacheResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateImageCacheResponseBodyData setRegistry(String registry) {
            this.registry = registry;
            return this;
        }
        public String getRegistry() {
            return this.registry;
        }

        public CreateImageCacheResponseBodyData setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public CreateImageCacheResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateImageCacheResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public CreateImageCacheResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
