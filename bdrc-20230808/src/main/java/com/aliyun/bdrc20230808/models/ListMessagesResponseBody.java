// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListMessagesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListMessagesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5748C531-80B1-5C31-8421-63A1830B9E48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessagesResponseBody self = new ListMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessagesResponseBody setData(ListMessagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMessagesResponseBodyData getData() {
        return this.data;
    }

    public ListMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMessagesResponseBodyDataContent extends TeaModel {
        /**
         * <p>Message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>zgrjap8j-us04-owef-fpmo-kdpr80pbss0k</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>Message level.</p>
         * 
         * <strong>example:</strong>
         * <p>WARNING</p>
         */
        @NameInMap("MessageLevel")
        public String messageLevel;

        /**
         * <p>Message name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyMessage</p>
         */
        @NameInMap("MessageName")
        public String messageName;

        /**
         * <p>Message source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-123***7890</p>
         */
        @NameInMap("MessageSourceId")
        public String messageSourceId;

        /**
         * <p>Message source region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("MessageSourceRegionId")
        public String messageSourceRegionId;

        /**
         * <p>Message source type.</p>
         * 
         * <strong>example:</strong>
         * <p>PROTECTION_POLICY</p>
         */
        @NameInMap("MessageSourceType")
        public String messageSourceType;

        /**
         * <p>Message time.</p>
         * 
         * <strong>example:</strong>
         * <p>1740019609</p>
         */
        @NameInMap("MessageTime")
        public Long messageTime;

        /**
         * <p>Message type.</p>
         * 
         * <strong>example:</strong>
         * <p>SUB_PROTECTION_POLICY_MODIFIED</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        public static ListMessagesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataContent self = new ListMessagesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataContent setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListMessagesResponseBodyDataContent setMessageLevel(String messageLevel) {
            this.messageLevel = messageLevel;
            return this;
        }
        public String getMessageLevel() {
            return this.messageLevel;
        }

        public ListMessagesResponseBodyDataContent setMessageName(String messageName) {
            this.messageName = messageName;
            return this;
        }
        public String getMessageName() {
            return this.messageName;
        }

        public ListMessagesResponseBodyDataContent setMessageSourceId(String messageSourceId) {
            this.messageSourceId = messageSourceId;
            return this;
        }
        public String getMessageSourceId() {
            return this.messageSourceId;
        }

        public ListMessagesResponseBodyDataContent setMessageSourceRegionId(String messageSourceRegionId) {
            this.messageSourceRegionId = messageSourceRegionId;
            return this;
        }
        public String getMessageSourceRegionId() {
            return this.messageSourceRegionId;
        }

        public ListMessagesResponseBodyDataContent setMessageSourceType(String messageSourceType) {
            this.messageSourceType = messageSourceType;
            return this;
        }
        public String getMessageSourceType() {
            return this.messageSourceType;
        }

        public ListMessagesResponseBodyDataContent setMessageTime(Long messageTime) {
            this.messageTime = messageTime;
            return this;
        }
        public Long getMessageTime() {
            return this.messageTime;
        }

        public ListMessagesResponseBodyDataContent setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class ListMessagesResponseBodyData extends TeaModel {
        /**
         * <p>Response parameters.</p>
         */
        @NameInMap("Content")
        public java.util.List<ListMessagesResponseBodyDataContent> content;

        /**
         * <p>The maximum number of results requested.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>eKDyCM0zFQ5op7jVMWmNNA==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyData self = new ListMessagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyData setContent(java.util.List<ListMessagesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListMessagesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListMessagesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListMessagesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListMessagesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
