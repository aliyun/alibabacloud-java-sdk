// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListCopilotMessagesResponseBody extends TeaModel {
    /**
     * <p>The API version.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupProductions~~">DescribeGroupProductions</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v1.2</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The list of conversation messages.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListCopilotMessagesResponseBodyItems> items;

    /**
     * <p>The maximum amount of data read in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCopilotMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCopilotMessagesResponseBody self = new ListCopilotMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCopilotMessagesResponseBody setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ListCopilotMessagesResponseBody setItems(java.util.List<ListCopilotMessagesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListCopilotMessagesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListCopilotMessagesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCopilotMessagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCopilotMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCopilotMessagesResponseBodyItems extends TeaModel {
        /**
         * <p>The client message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>366932fb-9a83-4a2d-94dd-c925b35f****</p>
         */
        @NameInMap("ClientMessageId")
        public String clientMessageId;

        /**
         * <p>The sent content.</p>
         * 
         * <strong>example:</strong>
         * <p>The correlation analysis of alerts and network logs has been completed</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-11T02:01:36Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AB917534-C484-5BA0-9077-0D5D1D2F****</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The message sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MessageSequence")
        public Long messageSequence;

        /**
         * <p>The message role.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dc18b894-19a3-45ee-8768-a59478e0****</p>
         */
        @NameInMap("TurnId")
        public String turnId;

        public static ListCopilotMessagesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListCopilotMessagesResponseBodyItems self = new ListCopilotMessagesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListCopilotMessagesResponseBodyItems setClientMessageId(String clientMessageId) {
            this.clientMessageId = clientMessageId;
            return this;
        }
        public String getClientMessageId() {
            return this.clientMessageId;
        }

        public ListCopilotMessagesResponseBodyItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListCopilotMessagesResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListCopilotMessagesResponseBodyItems setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListCopilotMessagesResponseBodyItems setMessageSequence(Long messageSequence) {
            this.messageSequence = messageSequence;
            return this;
        }
        public Long getMessageSequence() {
            return this.messageSequence;
        }

        public ListCopilotMessagesResponseBodyItems setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListCopilotMessagesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCopilotMessagesResponseBodyItems setTurnId(String turnId) {
            this.turnId = turnId;
            return this;
        }
        public String getTurnId() {
            return this.turnId;
        }

    }

}
