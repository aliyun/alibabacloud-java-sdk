// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListContextStoreAPIKeysResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("results")
    public java.util.List<ListContextStoreAPIKeysResponseBodyResults> results;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListContextStoreAPIKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextStoreAPIKeysResponseBody self = new ListContextStoreAPIKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextStoreAPIKeysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContextStoreAPIKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListContextStoreAPIKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextStoreAPIKeysResponseBody setResults(java.util.List<ListContextStoreAPIKeysResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ListContextStoreAPIKeysResponseBodyResults> getResults() {
        return this.results;
    }

    public ListContextStoreAPIKeysResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListContextStoreAPIKeysResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <strong>example:</strong>
         * <p>sk-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        @NameInMap("contextStoreName")
        public String contextStoreName;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>my-api-key</p>
         */
        @NameInMap("name")
        public String name;

        public static ListContextStoreAPIKeysResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListContextStoreAPIKeysResponseBodyResults self = new ListContextStoreAPIKeysResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ListContextStoreAPIKeysResponseBodyResults setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public ListContextStoreAPIKeysResponseBodyResults setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListContextStoreAPIKeysResponseBodyResults setContextStoreName(String contextStoreName) {
            this.contextStoreName = contextStoreName;
            return this;
        }
        public String getContextStoreName() {
            return this.contextStoreName;
        }

        public ListContextStoreAPIKeysResponseBodyResults setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListContextStoreAPIKeysResponseBodyResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
