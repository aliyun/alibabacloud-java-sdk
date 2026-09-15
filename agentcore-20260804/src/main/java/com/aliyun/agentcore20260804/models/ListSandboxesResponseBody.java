// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSandboxesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("items")
    public java.util.List<ListSandboxesResponseBodyItems> items;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("message")
    public String message;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

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
        @NameInMap("activeSessionCount")
        public Integer activeSessionCount;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("lastActiveAt")
        public String lastActiveAt;

        @NameInMap("lastHeartbeatAt")
        public String lastHeartbeatAt;

        @NameInMap("maxConcurrentSessions")
        public Integer maxConcurrentSessions;

        @NameInMap("phase")
        public String phase;

        @NameInMap("sandboxId")
        public String sandboxId;

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

    }

}
