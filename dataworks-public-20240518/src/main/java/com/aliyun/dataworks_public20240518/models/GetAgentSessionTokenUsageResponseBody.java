// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentSessionTokenUsageResponseBody extends TeaModel {
    /**
     * <p>The JSON-RPC result.</p>
     */
    @NameInMap("JsonRpcResponse")
    public GetAgentSessionTokenUsageResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B313938A-4475-599B-98EB-A0875019FD5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAgentSessionTokenUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionTokenUsageResponseBody self = new GetAgentSessionTokenUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionTokenUsageResponseBody setJsonRpcResponse(GetAgentSessionTokenUsageResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public GetAgentSessionTokenUsageResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public GetAgentSessionTokenUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult extends TeaModel {
        /**
         * <p>The cumulative number of cache-hit tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("CachedTokens")
        public Long cachedTokens;

        /**
         * <p><strong>Cumulative number of completion tokens generated.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("CompletionTokens")
        public Long completionTokens;

        /**
         * <p><strong>Cumulative number of prompt tokens consumed.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PromptTokens")
        public Long promptTokens;

        /**
         * <p>Cumulative number of tokens used for thoughts.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("ThoughtsTokens")
        public Long thoughtsTokens;

        /**
         * <p>The cumulative number of all tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult self = new GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult setCachedTokens(Long cachedTokens) {
            this.cachedTokens = cachedTokens;
            return this;
        }
        public Long getCachedTokens() {
            return this.cachedTokens;
        }

        public GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult setCompletionTokens(Long completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }
        public Long getCompletionTokens() {
            return this.completionTokens;
        }

        public GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult setPromptTokens(Long promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }
        public Long getPromptTokens() {
            return this.promptTokens;
        }

        public GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult setThoughtsTokens(Long thoughtsTokens) {
            this.thoughtsTokens = thoughtsTokens;
            return this;
        }
        public Long getThoughtsTokens() {
            return this.thoughtsTokens;
        }

        public GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetAgentSessionTokenUsageResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <p>The ID provided by the requester, which is echoed in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>8212598228302533855</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The JSON-RPC version. The value is always 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Jsonrpc")
        public String jsonrpc;

        /**
         * <p>Token usage result.</p>
         */
        @NameInMap("Result")
        public GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult result;

        public static GetAgentSessionTokenUsageResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSessionTokenUsageResponseBodyJsonRpcResponse self = new GetAgentSessionTokenUsageResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public GetAgentSessionTokenUsageResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAgentSessionTokenUsageResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public GetAgentSessionTokenUsageResponseBodyJsonRpcResponse setResult(GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public GetAgentSessionTokenUsageResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

    }

}
