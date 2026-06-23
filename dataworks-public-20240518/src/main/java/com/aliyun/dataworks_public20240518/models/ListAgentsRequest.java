// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentsRequest extends TeaModel {
    /**
     * <p>The request ID passed in by the caller. The value is returned as-is in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>4as3dasf654a</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Fixed value: 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The parameters for this request.</p>
     */
    @NameInMap("Params")
    public ListAgentsRequestParams params;

    public static ListAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentsRequest self = new ListAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAgentsRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public ListAgentsRequest setParams(ListAgentsRequestParams params) {
        this.params = params;
        return this;
    }
    public ListAgentsRequestParams getParams() {
        return this.params;
    }

    public static class ListAgentsRequestParams extends TeaModel {
        /**
         * <p>The exact agent name to filter by. If not specified, all agents are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>chat_cli_chatbi</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The number of entries per page. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page, following the Alibaba Cloud OpenAPI convention. Do not specify this parameter for the first page. For subsequent pages, pass in the nextToken value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListAgentsRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListAgentsRequestParams self = new ListAgentsRequestParams();
            return TeaModel.build(map, self);
        }

        public ListAgentsRequestParams setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAgentsRequestParams setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAgentsRequestParams setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
