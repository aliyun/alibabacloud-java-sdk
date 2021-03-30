// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistHistoryDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Actions")
    public java.util.List<ListAssistHistoryDetailsResponseBodyActions> actions;

    public static ListAssistHistoryDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssistHistoryDetailsResponseBody self = new ListAssistHistoryDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssistHistoryDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAssistHistoryDetailsResponseBody setActions(java.util.List<ListAssistHistoryDetailsResponseBodyActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<ListAssistHistoryDetailsResponseBodyActions> getActions() {
        return this.actions;
    }

    public static class ListAssistHistoryDetailsResponseBodyActions extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("AssistId")
        public String assistId;

        @NameInMap("ID")
        public String ID;

        public static ListAssistHistoryDetailsResponseBodyActions build(java.util.Map<String, ?> map) throws Exception {
            ListAssistHistoryDetailsResponseBodyActions self = new ListAssistHistoryDetailsResponseBodyActions();
            return TeaModel.build(map, self);
        }

        public ListAssistHistoryDetailsResponseBodyActions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListAssistHistoryDetailsResponseBodyActions setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListAssistHistoryDetailsResponseBodyActions setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public ListAssistHistoryDetailsResponseBodyActions setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListAssistHistoryDetailsResponseBodyActions setAssistId(String assistId) {
            this.assistId = assistId;
            return this;
        }
        public String getAssistId() {
            return this.assistId;
        }

        public ListAssistHistoryDetailsResponseBodyActions setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

    }

}
