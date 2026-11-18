// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class ListAgentSessionsRequest extends TeaModel {
    /**
     * <p>The correlation identifier for this call. This identifier is echoed in the response and does not provide idempotency guarantees.</p>
     * 
     * <strong>example:</strong>
     * <p>request-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC protocol version. Set this parameter to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameter object. The public fields are only AgentName, MaxResults, and NextToken.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AgentName&quot;:&quot;review-agent-demo&quot;,&quot;MaxResults&quot;:20}</p>
     */
    @NameInMap("Params")
    public ListAgentSessionsRequestParams params;

    public static ListAgentSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSessionsRequest self = new ListAgentSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentSessionsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAgentSessionsRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public ListAgentSessionsRequest setParams(ListAgentSessionsRequestParams params) {
        this.params = params;
        return this;
    }
    public ListAgentSessionsRequestParams getParams() {
        return this.params;
    }

    public static class ListAgentSessionsRequestParams extends TeaModel {
        /**
         * <p>Optional. Filters sessions by agent name. The maximum length is 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>review-agent-demo</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 50. Keep the page size and filter conditions consistent for subsequent pages.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The NextToken returned from the previous page. Do not pass this parameter on the first page. In the first phase, the default uses a native opaque cursor. Keep the same filter conditions and pass the token back as is.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-example</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListAgentSessionsRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSessionsRequestParams self = new ListAgentSessionsRequestParams();
            return TeaModel.build(map, self);
        }

        public ListAgentSessionsRequestParams setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAgentSessionsRequestParams setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAgentSessionsRequestParams setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
