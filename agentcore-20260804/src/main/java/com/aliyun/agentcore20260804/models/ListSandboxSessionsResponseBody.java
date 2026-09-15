// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSandboxSessionsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("items")
    public java.util.List<ListSandboxSessionsResponseBodyItems> items;

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

    public static ListSandboxSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxSessionsResponseBody self = new ListSandboxSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSandboxSessionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSandboxSessionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSandboxSessionsResponseBody setItems(java.util.List<ListSandboxSessionsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSandboxSessionsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSandboxSessionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSandboxSessionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSandboxSessionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSandboxSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSandboxSessionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSandboxSessionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSandboxSessionsResponseBodyItems extends TeaModel {
        /**
         * <p>The external channel type, such as DINGTALK, FEISHU, or WECOM. This parameter is empty for non-external channels.</p>
         */
        @NameInMap("channelType")
        public String channelType;

        @NameInMap("sessionId")
        public String sessionId;

        @NameInMap("sourceType")
        public String sourceType;

        public static ListSandboxSessionsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSandboxSessionsResponseBodyItems self = new ListSandboxSessionsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSandboxSessionsResponseBodyItems setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public ListSandboxSessionsResponseBodyItems setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListSandboxSessionsResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
