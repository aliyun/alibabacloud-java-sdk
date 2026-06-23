// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentSessionsRequest extends TeaModel {
    /**
     * <p>The ID provided by the caller. The value is returned as-is.</p>
     * 
     * <strong>example:</strong>
     * <p>676303114031776</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. The value must be <code>2.0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>Business parameters.</p>
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
         * <p>Filters sessions by the <strong>agent name</strong>. You must specify at least one of this parameter and <code>SessionSourceList</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>chat_cli_chatbi</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The maximum number of results to return per page. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page of results. Set this parameter to <code>1</code> to retrieve the first page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>Filters sessions by session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>Filters sessions by the <strong>list of session sources</strong>. You must specify at least one of this parameter and <code>AgentName</code>.</p>
         */
        @NameInMap("SessionSourceList")
        public java.util.List<String> sessionSourceList;

        /**
         * <p>Filters sessions by session title using a fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales in the last 30 days</p>
         */
        @NameInMap("SessionTitle")
        public String sessionTitle;

        /**
         * <p>Filters sessions by a list of session tag codes.</p>
         */
        @NameInMap("TagList")
        public java.util.List<String> tagList;

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

        public ListAgentSessionsRequestParams setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListAgentSessionsRequestParams setSessionSourceList(java.util.List<String> sessionSourceList) {
            this.sessionSourceList = sessionSourceList;
            return this;
        }
        public java.util.List<String> getSessionSourceList() {
            return this.sessionSourceList;
        }

        public ListAgentSessionsRequestParams setSessionTitle(String sessionTitle) {
            this.sessionTitle = sessionTitle;
            return this;
        }
        public String getSessionTitle() {
            return this.sessionTitle;
        }

        public ListAgentSessionsRequestParams setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

    }

}
