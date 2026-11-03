// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentSessionsRequest extends TeaModel {
    /**
     * <p>The ID passed by the requester, which is returned as is.</p>
     * 
     * <strong>example:</strong>
     * <p>676303114031776</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Fixed to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameters.</p>
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
         * <p>The exact filter for the <strong>agent name</strong>. You must specify at least one of this parameter and SessionSourceList.</p>
         * 
         * <strong>example:</strong>
         * <p>chat_cli_chatbi</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>Specifies whether to return only archived sessions. Valid values:</p>
         * <ul>
         * <li>true: Only archived sessions are returned.</li>
         * <li>false or not specified: Only unarchived sessions are returned.</li>
         * </ul>
         */
        @NameInMap("Archived")
        public Boolean archived;

        /**
         * <p>The number of entries per page. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page. Set this parameter to 1 for the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The exact match for the session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The filter for the <strong>session source list</strong>. You must specify at least one of this parameter and AgentName.</p>
         */
        @NameInMap("SessionSourceList")
        public java.util.List<String> sessionSourceList;

        /**
         * <p>The fuzzy filter for the session title.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales in the last 30 days</p>
         */
        @NameInMap("SessionTitle")
        public String sessionTitle;

        /**
         * <p>The filter for the session tag code list.</p>
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

        public ListAgentSessionsRequestParams setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
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
