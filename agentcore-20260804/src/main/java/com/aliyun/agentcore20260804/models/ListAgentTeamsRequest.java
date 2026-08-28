// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentTeamsRequest extends TeaModel {
    /**
     * <p>The request parameters for querying the agent team list.</p>
     */
    @NameInMap("body")
    public ListAgentTeamsRequestBody body;

    public static ListAgentTeamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentTeamsRequest self = new ListAgentTeamsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentTeamsRequest setBody(ListAgentTeamsRequestBody body) {
        this.body = body;
        return this;
    }
    public ListAgentTeamsRequestBody getBody() {
        return this.body;
    }

    public static class ListAgentTeamsRequestBody extends TeaModel {
        /**
         * <p>The list of agent IDs for which to query team information.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("agentIds")
        public java.util.List<String> agentIds;

        public static ListAgentTeamsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ListAgentTeamsRequestBody self = new ListAgentTeamsRequestBody();
            return TeaModel.build(map, self);
        }

        public ListAgentTeamsRequestBody setAgentIds(java.util.List<String> agentIds) {
            this.agentIds = agentIds;
            return this;
        }
        public java.util.List<String> getAgentIds() {
            return this.agentIds;
        }

    }

}
