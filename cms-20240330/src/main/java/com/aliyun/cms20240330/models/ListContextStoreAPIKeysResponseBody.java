// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContextStoreAPIKeysResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. To retrieve the next page of results, include this value in the <code>nextToken</code> parameter of your next request. If this parameter is not returned, there are no more results.</p>
     * 
     * <strong>example:</strong>
     * <p>xCs4wJD41qEejNkappMSJ1OL2Ky2GeKLqmBLJrC61WrgUOj9F-31jHbo5Kgqzifv</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of API keys.</p>
     */
    @NameInMap("results")
    public java.util.List<ListContextStoreAPIKeysResponseBodyResults> results;

    /**
     * <p>The total count of entries that match the query.</p>
     * 
     * <strong>example:</strong>
     * <p>454</p>
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
         * <p>The complete API key value.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-3ac8d45d741e4f31b81aa6ee984ce9fd</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The name of the context store.</p>
         * 
         * <strong>example:</strong>
         * <p>test-context-Store</p>
         */
        @NameInMap("contextStoreName")
        public String contextStoreName;

        /**
         * <p>The time when the API key was created, represented as a Unix timestamp.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1778205145</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The display name of the API key. This name helps you identify the purpose of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>Production Service Key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-workspace</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListContextStoreAPIKeysResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListContextStoreAPIKeysResponseBodyResults self = new ListContextStoreAPIKeysResponseBodyResults();
            return TeaModel.build(map, self);
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

        public ListContextStoreAPIKeysResponseBodyResults setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
