// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentCodeRuntimesResponseBody extends TeaModel {
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
     * <p>The list of supported code runtime environments.</p>
     */
    @NameInMap("items")
    public java.util.List<ListAgentCodeRuntimesResponseBodyItems> items;

    /**
     * <p>The actual page size.</p>
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
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>d3MtYTFiMmMzZDRlNWY2CmNvZGUtcnVudGltZS1leGFtcGxlCjE</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The number of available runtime environments.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListAgentCodeRuntimesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentCodeRuntimesResponseBody self = new ListAgentCodeRuntimesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentCodeRuntimesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentCodeRuntimesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentCodeRuntimesResponseBody setItems(java.util.List<ListAgentCodeRuntimesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAgentCodeRuntimesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAgentCodeRuntimesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentCodeRuntimesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentCodeRuntimesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentCodeRuntimesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentCodeRuntimesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAgentCodeRuntimesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAgentCodeRuntimesResponseBodyItems extends TeaModel {
        /**
         * <p>The runtime architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>linux/amd64</p>
         */
        @NameInMap("architecture")
        public String architecture;

        /**
         * <p>The display name of the runtime environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Python 3.12</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The language runtime environment.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.12</p>
         */
        @NameInMap("languageRuntime")
        public String languageRuntime;

        public static ListAgentCodeRuntimesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAgentCodeRuntimesResponseBodyItems self = new ListAgentCodeRuntimesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAgentCodeRuntimesResponseBodyItems setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListAgentCodeRuntimesResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAgentCodeRuntimesResponseBodyItems setLanguageRuntime(String languageRuntime) {
            this.languageRuntime = languageRuntime;
            return this;
        }
        public String getLanguageRuntime() {
            return this.languageRuntime;
        }

    }

}
