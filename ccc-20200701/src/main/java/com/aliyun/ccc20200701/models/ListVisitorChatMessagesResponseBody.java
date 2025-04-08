// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListVisitorChatMessagesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListVisitorChatMessagesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8707EB29-BAED-4302-B999-40BA61877437</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVisitorChatMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVisitorChatMessagesResponseBody self = new ListVisitorChatMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVisitorChatMessagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVisitorChatMessagesResponseBody setData(ListVisitorChatMessagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVisitorChatMessagesResponseBodyData getData() {
        return this.data;
    }

    public ListVisitorChatMessagesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVisitorChatMessagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVisitorChatMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVisitorChatMessagesResponseBodyDataMessages extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>chat-65382141036853491</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxxx.com/avatar.png">http://xxxxx.com/avatar.png</a></p>
         */
        @NameInMap("SenderAvatarUrl")
        public String senderAvatarUrl;

        /**
         * <strong>example:</strong>
         * <p>fcd020fe-****-1a272a174a7d</p>
         */
        @NameInMap("SenderId")
        public String senderId;

        @NameInMap("SenderName")
        public String senderName;

        /**
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        @NameInMap("SenderType")
        public String senderType;

        /**
         * <strong>example:</strong>
         * <p>1696126980371</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static ListVisitorChatMessagesResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            ListVisitorChatMessagesResponseBodyDataMessages self = new ListVisitorChatMessagesResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public ListVisitorChatMessagesResponseBodyDataMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListVisitorChatMessagesResponseBodyDataMessages setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListVisitorChatMessagesResponseBodyDataMessages setSenderAvatarUrl(String senderAvatarUrl) {
            this.senderAvatarUrl = senderAvatarUrl;
            return this;
        }
        public String getSenderAvatarUrl() {
            return this.senderAvatarUrl;
        }

        public ListVisitorChatMessagesResponseBodyDataMessages setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public ListVisitorChatMessagesResponseBodyDataMessages setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
        }
        public String getSenderName() {
            return this.senderName;
        }

        public ListVisitorChatMessagesResponseBodyDataMessages setSenderType(String senderType) {
            this.senderType = senderType;
            return this;
        }
        public String getSenderType() {
            return this.senderType;
        }

        public ListVisitorChatMessagesResponseBodyDataMessages setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListVisitorChatMessagesResponseBodyData extends TeaModel {
        @NameInMap("Messages")
        public java.util.List<ListVisitorChatMessagesResponseBodyDataMessages> messages;

        /**
         * <strong>example:</strong>
         * <p>1737193352340::7463707254.EAUNIT</p>
         */
        @NameInMap("NextPageToken")
        public String nextPageToken;

        public static ListVisitorChatMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVisitorChatMessagesResponseBodyData self = new ListVisitorChatMessagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVisitorChatMessagesResponseBodyData setMessages(java.util.List<ListVisitorChatMessagesResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ListVisitorChatMessagesResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

        public ListVisitorChatMessagesResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

    }

}
