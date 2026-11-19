// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteEventsRequest extends TeaModel {
    /**
     * <p>The JSON request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public DeleteEventsRequestBody body;

    public static DeleteEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventsRequest self = new DeleteEventsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventsRequest setBody(DeleteEventsRequestBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventsRequestBody getBody() {
        return this.body;
    }

    public static class DeleteEventsRequestBodyScope extends TeaModel {
        /**
         * <p>The business agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The ID of the precisely located session.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The business team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        @NameInMap("teamId")
        public String teamId;

        /**
         * <p>The business user ID. This is not the platform tenant identity.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static DeleteEventsRequestBodyScope build(java.util.Map<String, ?> map) throws Exception {
            DeleteEventsRequestBodyScope self = new DeleteEventsRequestBodyScope();
            return TeaModel.build(map, self);
        }

        public DeleteEventsRequestBodyScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public DeleteEventsRequestBodyScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DeleteEventsRequestBodyScope setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public DeleteEventsRequestBodyScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DeleteEventsRequestBody extends TeaModel {
        /**
         * <p>A list of 1 to 100 unique event IDs. Only events owned by the current session are deleted.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("eventIds")
        public java.util.List<String> eventIds;

        /**
         * <p>The scope for precise session location.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("scope")
        public DeleteEventsRequestBodyScope scope;

        public static DeleteEventsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            DeleteEventsRequestBody self = new DeleteEventsRequestBody();
            return TeaModel.build(map, self);
        }

        public DeleteEventsRequestBody setEventIds(java.util.List<String> eventIds) {
            this.eventIds = eventIds;
            return this;
        }
        public java.util.List<String> getEventIds() {
            return this.eventIds;
        }

        public DeleteEventsRequestBody setScope(DeleteEventsRequestBodyScope scope) {
            this.scope = scope;
            return this;
        }
        public DeleteEventsRequestBodyScope getScope() {
            return this.scope;
        }

    }

}
