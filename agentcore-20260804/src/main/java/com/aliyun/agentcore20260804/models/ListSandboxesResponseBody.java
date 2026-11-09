// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSandboxesResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value is SUCCESS if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code. The value is 200 if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of sandboxes that meet the filter conditions.</p>
     */
    @NameInMap("items")
    public java.util.List<ListSandboxesResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message. The value is success if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates success, and a value of false indicates failure.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListSandboxesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxesResponseBody self = new ListSandboxesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSandboxesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSandboxesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSandboxesResponseBody setItems(java.util.List<ListSandboxesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSandboxesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSandboxesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSandboxesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSandboxesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSandboxesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSandboxesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSandboxesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSandboxesResponseBodyItems extends TeaModel {
        /**
         * <p>The number of active sessions in the sandbox.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("activeSessionCount")
        public Integer activeSessionCount;

        /**
         * <p>The time when the sandbox was created, in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-29T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The tag of the actual observed image of the currently returned instance. This parameter is empty if the tag cannot be parsed.</p>
         * 
         * <strong>example:</strong>
         * <p>202611031754</p>
         */
        @NameInMap("harnessVersion")
        public String harnessVersion;

        /**
         * <p>The time of the last activity of the sandbox, in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-29T00:02:00Z</p>
         */
        @NameInMap("lastActiveAt")
        public String lastActiveAt;

        /**
         * <p>The time of the last heartbeat of the sandbox, in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-29T00:01:00Z</p>
         */
        @NameInMap("lastHeartbeatAt")
        public String lastHeartbeatAt;

        /**
         * <p>Used to continue calling GetSandboxRebuildOperation to query the overall result after a page refresh. This parameter is empty if there is no historical rebuild. Do not use the ID of a subsequently created task instead.</p>
         * 
         * <strong>example:</strong>
         * <p>01a19f98-906d-7e82-96aa-8b7ea1d1a29d</p>
         */
        @NameInMap("lastRebuildOperationId")
        public String lastRebuildOperationId;

        /**
         * <p>The maximum number of concurrent sessions allowed for the sandbox, which is obtained from the effective auto-scaling configuration at runtime. This parameter is empty if auto-scaling is disabled or the configuration is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("maxConcurrentSessions")
        public Integer maxConcurrentSessions;

        /**
         * <p>The current running phase of the sandbox.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("phase")
        public String phase;

        /**
         * <p>The sandbox ID, which can be queried by calling ListSandboxes.</p>
         * 
         * <strong>example:</strong>
         * <p>sbx-2</p>
         */
        @NameInMap("sandboxId")
        public String sandboxId;

        /**
         * <p>The server compares the actual image tag of the instance with the pool target image tag. The value is true if the tags are different during the RUNNING, HIBERNATED, or FAILED phase. The value is false if the tags are the same or during other known phases. This parameter is empty if the tag or phase cannot be confirmed, and it cannot be treated as false. The version sequence is not determined by the tag size.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("updateAvailable")
        public Boolean updateAvailable;

        /**
         * <p>A value of true indicates that the most recent rebuild corresponding to the current instance generation failed as a whole. A value of false indicates that there is no historical rebuild or the rebuild succeeded as a whole. This parameter is empty if the rebuild is in progress, canceled, replaced, the generation does not match, or the result cannot be confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("updateFailed")
        public Boolean updateFailed;

        public static ListSandboxesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSandboxesResponseBodyItems self = new ListSandboxesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSandboxesResponseBodyItems setActiveSessionCount(Integer activeSessionCount) {
            this.activeSessionCount = activeSessionCount;
            return this;
        }
        public Integer getActiveSessionCount() {
            return this.activeSessionCount;
        }

        public ListSandboxesResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListSandboxesResponseBodyItems setHarnessVersion(String harnessVersion) {
            this.harnessVersion = harnessVersion;
            return this;
        }
        public String getHarnessVersion() {
            return this.harnessVersion;
        }

        public ListSandboxesResponseBodyItems setLastActiveAt(String lastActiveAt) {
            this.lastActiveAt = lastActiveAt;
            return this;
        }
        public String getLastActiveAt() {
            return this.lastActiveAt;
        }

        public ListSandboxesResponseBodyItems setLastHeartbeatAt(String lastHeartbeatAt) {
            this.lastHeartbeatAt = lastHeartbeatAt;
            return this;
        }
        public String getLastHeartbeatAt() {
            return this.lastHeartbeatAt;
        }

        public ListSandboxesResponseBodyItems setLastRebuildOperationId(String lastRebuildOperationId) {
            this.lastRebuildOperationId = lastRebuildOperationId;
            return this;
        }
        public String getLastRebuildOperationId() {
            return this.lastRebuildOperationId;
        }

        public ListSandboxesResponseBodyItems setMaxConcurrentSessions(Integer maxConcurrentSessions) {
            this.maxConcurrentSessions = maxConcurrentSessions;
            return this;
        }
        public Integer getMaxConcurrentSessions() {
            return this.maxConcurrentSessions;
        }

        public ListSandboxesResponseBodyItems setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListSandboxesResponseBodyItems setSandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            return this;
        }
        public String getSandboxId() {
            return this.sandboxId;
        }

        public ListSandboxesResponseBodyItems setUpdateAvailable(Boolean updateAvailable) {
            this.updateAvailable = updateAvailable;
            return this;
        }
        public Boolean getUpdateAvailable() {
            return this.updateAvailable;
        }

        public ListSandboxesResponseBodyItems setUpdateFailed(Boolean updateFailed) {
            this.updateFailed = updateFailed;
            return this;
        }
        public Boolean getUpdateFailed() {
            return this.updateFailed;
        }

    }

}
