// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListConnectorsResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of connectors.</p>
     */
    @NameInMap("items")
    public java.util.List<ListConnectorsResponseBodyItems> items;

    /**
     * <p>The number of entries returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of connectors.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsResponseBody self = new ListConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConnectorsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListConnectorsResponseBody setItems(java.util.List<ListConnectorsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListConnectorsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListConnectorsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConnectorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListConnectorsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListConnectorsResponseBodyItems extends TeaModel {
        /**
         * <p>The number of agents bound to the connector.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("boundAgentCount")
        public Long boundAgentCount;

        /**
         * <p>The time when the connector was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01T08:00:00Z</p>
         */
        @NameInMap("enabledAt")
        public String enabledAt;

        /**
         * <p>A JSON string. qodercli: {&quot;site&quot;:&quot;global|cn&quot;,&quot;organizationId&quot;:&quot;...&quot;,&quot;apiKey&quot;:&quot;...&quot;,&quot;serviceAccountKeys&quot;:[{&quot;id&quot;:&quot;ckey-xxx&quot;,&quot;name&quot;:&quot;default&quot;,&quot;serviceAccountKey&quot;:&quot;...&quot;}]}. This field is absent when the connector is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;site&quot;:&quot;global&quot;,&quot;organizationId&quot;:&quot;org-xxxx&quot;}</p>
         */
        @NameInMap("metadata")
        public String metadata;

        /**
         * <p>The connector name.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The connector status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("status")
        public String status;

        public static ListConnectorsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyItems self = new ListConnectorsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyItems setBoundAgentCount(Long boundAgentCount) {
            this.boundAgentCount = boundAgentCount;
            return this;
        }
        public Long getBoundAgentCount() {
            return this.boundAgentCount;
        }

        public ListConnectorsResponseBodyItems setEnabledAt(String enabledAt) {
            this.enabledAt = enabledAt;
            return this;
        }
        public String getEnabledAt() {
            return this.enabledAt;
        }

        public ListConnectorsResponseBodyItems setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public ListConnectorsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConnectorsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
