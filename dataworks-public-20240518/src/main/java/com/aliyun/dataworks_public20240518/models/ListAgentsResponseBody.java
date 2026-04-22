// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentsResponseBody extends TeaModel {
    @NameInMap("JsonRpcResponse")
    public ListAgentsResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4003B739-C33C-5297-B810-0490EEE5A767</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentsResponseBody self = new ListAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentsResponseBody setJsonRpcResponse(ListAgentsResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public ListAgentsResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public ListAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentsResponseBodyJsonRpcResponseResultAgents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>chat_cli_chatbi</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        public static ListAgentsResponseBodyJsonRpcResponseResultAgents build(java.util.Map<String, ?> map) throws Exception {
            ListAgentsResponseBodyJsonRpcResponseResultAgents self = new ListAgentsResponseBodyJsonRpcResponseResultAgents();
            return TeaModel.build(map, self);
        }

        public ListAgentsResponseBodyJsonRpcResponseResultAgents setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

    }

    public static class ListAgentsResponseBodyJsonRpcResponseResult extends TeaModel {
        @NameInMap("Agents")
        public java.util.List<ListAgentsResponseBodyJsonRpcResponseResultAgents> agents;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentsResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            ListAgentsResponseBodyJsonRpcResponseResult self = new ListAgentsResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public ListAgentsResponseBodyJsonRpcResponseResult setAgents(java.util.List<ListAgentsResponseBodyJsonRpcResponseResultAgents> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<ListAgentsResponseBodyJsonRpcResponseResultAgents> getAgents() {
            return this.agents;
        }

        public ListAgentsResponseBodyJsonRpcResponseResult setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAgentsResponseBodyJsonRpcResponseResult setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListAgentsResponseBodyJsonRpcResponseResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListAgentsResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>70623e38-a889-4192-930a-752ffdd75f48</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Jsonrpc")
        public String jsonrpc;

        @NameInMap("Result")
        public ListAgentsResponseBodyJsonRpcResponseResult result;

        public static ListAgentsResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            ListAgentsResponseBodyJsonRpcResponse self = new ListAgentsResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public ListAgentsResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAgentsResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public ListAgentsResponseBodyJsonRpcResponse setResult(ListAgentsResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public ListAgentsResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

    }

}
