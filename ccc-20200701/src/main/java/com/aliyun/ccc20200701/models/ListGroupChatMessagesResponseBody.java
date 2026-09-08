// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListGroupChatMessagesResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public ListGroupChatMessagesResponseBodyData data;

    /**
     * <p>HTTP status code returned in the response. A value of 200 indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2263B273-AC1B-44EB-BA98-87F2322C6780</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGroupChatMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupChatMessagesResponseBody self = new ListGroupChatMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupChatMessagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGroupChatMessagesResponseBody setData(ListGroupChatMessagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGroupChatMessagesResponseBodyData getData() {
        return this.data;
    }

    public ListGroupChatMessagesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGroupChatMessagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGroupChatMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGroupChatMessagesResponseBodyDataMessages extends TeaModel {
        /**
         * <p>Message content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;variables&quot;:{},&quot;text&quot;:&quot;<p>好的，不客气</p>&quot;,&quot;contentType&quot;:&quot;Text&quot;,&quot;subContentType&quot;:&quot;richtext&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>chat-65382141036853491</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Indicates whether the message was revoked.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Recalled")
        public Boolean recalled;

        /**
         * <p>Sender profile picture URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxxx.com">http://xxxxx.com</a></p>
         */
        @NameInMap("SenderAvatarUrl")
        public String senderAvatarUrl;

        /**
         * <p>User ID of the message sender.</p>
         * 
         * <strong>example:</strong>
         * <p>64bb4ececc34fc5ec1ca1153</p>
         */
        @NameInMap("SenderId")
        public String senderId;

        /**
         * <p>Sender name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-agent@test-instanceId</p>
         */
        @NameInMap("SenderName")
        public String senderName;

        /**
         * <p>Sender type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>ADMIN</strong>: system</p>
         * </li>
         * <li><p><strong>CUSTOMER</strong>: visitor</p>
         * </li>
         * <li><p><strong>AGENT</strong>: agent</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        @NameInMap("SenderType")
        public String senderType;

        /**
         * <p>Message timestamp, in Unix timestamp format, measured in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1696126980371</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static ListGroupChatMessagesResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            ListGroupChatMessagesResponseBodyDataMessages self = new ListGroupChatMessagesResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public ListGroupChatMessagesResponseBodyDataMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListGroupChatMessagesResponseBodyDataMessages setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListGroupChatMessagesResponseBodyDataMessages setRecalled(Boolean recalled) {
            this.recalled = recalled;
            return this;
        }
        public Boolean getRecalled() {
            return this.recalled;
        }

        public ListGroupChatMessagesResponseBodyDataMessages setSenderAvatarUrl(String senderAvatarUrl) {
            this.senderAvatarUrl = senderAvatarUrl;
            return this;
        }
        public String getSenderAvatarUrl() {
            return this.senderAvatarUrl;
        }

        public ListGroupChatMessagesResponseBodyDataMessages setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public ListGroupChatMessagesResponseBodyDataMessages setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
        }
        public String getSenderName() {
            return this.senderName;
        }

        public ListGroupChatMessagesResponseBodyDataMessages setSenderType(String senderType) {
            this.senderType = senderType;
            return this;
        }
        public String getSenderType() {
            return this.senderType;
        }

        public ListGroupChatMessagesResponseBodyDataMessages setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListGroupChatMessagesResponseBodyData extends TeaModel {
        /**
         * <p>Message list.</p>
         */
        @NameInMap("Messages")
        public java.util.List<ListGroupChatMessagesResponseBodyDataMessages> messages;

        /**
         * <p>Token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>54d1a616d95a4a01ba58967a9115b649</p>
         */
        @NameInMap("NextPageToken")
        public String nextPageToken;

        public static ListGroupChatMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGroupChatMessagesResponseBodyData self = new ListGroupChatMessagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGroupChatMessagesResponseBodyData setMessages(java.util.List<ListGroupChatMessagesResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ListGroupChatMessagesResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

        public ListGroupChatMessagesResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

    }

}
