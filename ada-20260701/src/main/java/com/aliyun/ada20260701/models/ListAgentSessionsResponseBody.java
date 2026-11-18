// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class ListAgentSessionsResponseBody extends TeaModel {
    /**
     * <p>The JSON-RPC response object. The business result is located in Result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Jsonrpc&quot;:&quot;2.0&quot;,&quot;Id&quot;:&quot;request-001&quot;,&quot;Result&quot;:{&quot;MaxResults&quot;:20,&quot;NextToken&quot;:&quot;next-token-example&quot;,&quot;SessionList&quot;:[{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;title&quot;:&quot;Code review&quot;,&quot;agentName&quot;:&quot;review-agent-demo&quot;,&quot;createdAt&quot;:1793232000000,&quot;updatedAt&quot;:1793232060000}]}}</p>
     */
    @NameInMap("JsonRpcResponse")
    public ListAgentSessionsResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>The server-side request ID used to troubleshoot this call.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSessionsResponseBody self = new ListAgentSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentSessionsResponseBody setJsonRpcResponse(ListAgentSessionsResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public ListAgentSessionsResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public ListAgentSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentSessionsResponseBodyJsonRpcResponseResult extends TeaModel {
        /**
         * <p>The effective page size for the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The credential for querying the next page. Pass this value as is to Params.NextToken. Pagination ends when this value is not returned or is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-example</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The array of session summaries for the current page. If no matching records are found, an empty array [] is returned. The type is any. The fields of array elements retain the original backend names. For the structure, see the supplementary description of response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;title&quot;:&quot;Code review&quot;,&quot;agentName&quot;:&quot;review-agent-demo&quot;,&quot;createdAt&quot;:1793232000000,&quot;updatedAt&quot;:1793232060000}]</p>
         */
        @NameInMap("SessionList")
        public Object sessionList;

        public static ListAgentSessionsResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionsResponseBodyJsonRpcResponseResult self = new ListAgentSessionsResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResult setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResult setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponseResult setSessionList(Object sessionList) {
            this.sessionList = sessionList;
            return this;
        }
        public Object getSessionList() {
            return this.sessionList;
        }

    }

    public static class ListAgentSessionsResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <p>The Id from the request, echoed as is.</p>
         * 
         * <strong>example:</strong>
         * <p>request-001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The fixed value 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Jsonrpc")
        public String jsonrpc;

        /**
         * <p>The paginated result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MaxResults&quot;:20,&quot;NextToken&quot;:&quot;next-token-example&quot;,&quot;SessionList&quot;:[{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;}]}</p>
         */
        @NameInMap("Result")
        public ListAgentSessionsResponseBodyJsonRpcResponseResult result;

        public static ListAgentSessionsResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionsResponseBodyJsonRpcResponse self = new ListAgentSessionsResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionsResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public ListAgentSessionsResponseBodyJsonRpcResponse setResult(ListAgentSessionsResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public ListAgentSessionsResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

    }

}
