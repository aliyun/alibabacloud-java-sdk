// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupMessagesResponseBody extends TeaModel {
    /**
     * <p>The group ID of the group to query.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Indicates whether there is a next page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Hasmore")
    public Boolean hasmore;

    /**
     * <p>The message list.</p>
     */
    @NameInMap("MessageList")
    public java.util.List<ListLiveMessageGroupMessagesResponseBodyMessageList> messageList;

    /**
     * <p>The start position of the next page. The value is 0 if there is no next page.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1668FDC3-63D7-102F-B5D4-3D2F91D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLiveMessageGroupMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupMessagesResponseBody self = new ListLiveMessageGroupMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupMessagesResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListLiveMessageGroupMessagesResponseBody setHasmore(Boolean hasmore) {
        this.hasmore = hasmore;
        return this;
    }
    public Boolean getHasmore() {
        return this.hasmore;
    }

    public ListLiveMessageGroupMessagesResponseBody setMessageList(java.util.List<ListLiveMessageGroupMessagesResponseBodyMessageList> messageList) {
        this.messageList = messageList;
        return this;
    }
    public java.util.List<ListLiveMessageGroupMessagesResponseBodyMessageList> getMessageList() {
        return this.messageList;
    }

    public ListLiveMessageGroupMessagesResponseBody setNextPageToken(Long nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    public ListLiveMessageGroupMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLiveMessageGroupMessagesResponseBodyMessageListSender extends TeaModel {
        /**
         * <p>The ID of the user who sent the message.</p>
         * 
         * <strong>example:</strong>
         * <p>uid2</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The extended information of the user who sent the message.</p>
         * 
         * <strong>example:</strong>
         * <p>testusermeta2</p>
         */
        @NameInMap("UserInfo")
        public String userInfo;

        public static ListLiveMessageGroupMessagesResponseBodyMessageListSender build(java.util.Map<String, ?> map) throws Exception {
            ListLiveMessageGroupMessagesResponseBodyMessageListSender self = new ListLiveMessageGroupMessagesResponseBodyMessageListSender();
            return TeaModel.build(map, self);
        }

        public ListLiveMessageGroupMessagesResponseBodyMessageListSender setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListLiveMessageGroupMessagesResponseBodyMessageListSender setUserInfo(String userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public String getUserInfo() {
            return this.userInfo;
        }

    }

    public static class ListLiveMessageGroupMessagesResponseBodyMessageList extends TeaModel {
        /**
         * <p>The message body.</p>
         * 
         * <strong>example:</strong>
         * <p>step2 helo, cc group</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The message identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>c-1-1-0</p>
         */
        @NameInMap("MsgTid")
        public String msgTid;

        /**
         * <p>The message type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MsgType")
        public Long msgType;

        /**
         * <p>The message sender details.</p>
         */
        @NameInMap("Sender")
        public ListLiveMessageGroupMessagesResponseBodyMessageListSender sender;

        /**
         * <p>The message sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNumber")
        public Long seqNumber;

        /**
         * <p>The time when the message was created, expressed as a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1697081134</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The total number of messages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalMessages")
        public Long totalMessages;

        public static ListLiveMessageGroupMessagesResponseBodyMessageList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveMessageGroupMessagesResponseBodyMessageList self = new ListLiveMessageGroupMessagesResponseBodyMessageList();
            return TeaModel.build(map, self);
        }

        public ListLiveMessageGroupMessagesResponseBodyMessageList setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public ListLiveMessageGroupMessagesResponseBodyMessageList setMsgTid(String msgTid) {
            this.msgTid = msgTid;
            return this;
        }
        public String getMsgTid() {
            return this.msgTid;
        }

        public ListLiveMessageGroupMessagesResponseBodyMessageList setMsgType(Long msgType) {
            this.msgType = msgType;
            return this;
        }
        public Long getMsgType() {
            return this.msgType;
        }

        public ListLiveMessageGroupMessagesResponseBodyMessageList setSender(ListLiveMessageGroupMessagesResponseBodyMessageListSender sender) {
            this.sender = sender;
            return this;
        }
        public ListLiveMessageGroupMessagesResponseBodyMessageListSender getSender() {
            return this.sender;
        }

        public ListLiveMessageGroupMessagesResponseBodyMessageList setSeqNumber(Long seqNumber) {
            this.seqNumber = seqNumber;
            return this;
        }
        public Long getSeqNumber() {
            return this.seqNumber;
        }

        public ListLiveMessageGroupMessagesResponseBodyMessageList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListLiveMessageGroupMessagesResponseBodyMessageList setTotalMessages(Long totalMessages) {
            this.totalMessages = totalMessages;
            return this;
        }
        public Long getTotalMessages() {
            return this.totalMessages;
        }

    }

}
