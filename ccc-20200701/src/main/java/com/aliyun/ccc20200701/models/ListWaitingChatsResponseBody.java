// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListWaitingChatsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListWaitingChatsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>03C67DAD-EB26-41D8-949D-9B0C470FB716</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListWaitingChatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWaitingChatsResponseBody self = new ListWaitingChatsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWaitingChatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWaitingChatsResponseBody setData(java.util.List<ListWaitingChatsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWaitingChatsResponseBodyData> getData() {
        return this.data;
    }

    public ListWaitingChatsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListWaitingChatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWaitingChatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListWaitingChatsResponseBodyDataMessages extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>c361765f-******-4e07-b81c-4b5d9183fac6</p>
         */
        @NameInMap("SenderId")
        public String senderId;

        @NameInMap("SenderType")
        public String senderType;

        public static ListWaitingChatsResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            ListWaitingChatsResponseBodyDataMessages self = new ListWaitingChatsResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public ListWaitingChatsResponseBodyDataMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListWaitingChatsResponseBodyDataMessages setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public ListWaitingChatsResponseBodyDataMessages setSenderType(String senderType) {
            this.senderType = senderType;
            return this;
        }
        public String getSenderType() {
            return this.senderType;
        }

    }

    public static class ListWaitingChatsResponseBodyDataUserList extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p>c361765f-******-4e07-b81c-4b5d9183fac6</p>
         */
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        @NameInMap("UserType")
        public String userType;

        public static ListWaitingChatsResponseBodyDataUserList build(java.util.Map<String, ?> map) throws Exception {
            ListWaitingChatsResponseBodyDataUserList self = new ListWaitingChatsResponseBodyDataUserList();
            return TeaModel.build(map, self);
        }

        public ListWaitingChatsResponseBodyDataUserList setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListWaitingChatsResponseBodyDataUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListWaitingChatsResponseBodyDataUserList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListWaitingChatsResponseBodyDataUserList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

    public static class ListWaitingChatsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>843073c2-*****-49fb-a616-738ddddfebdc</p>
         */
        @NameInMap("AccessChannelId")
        public String accessChannelId;

        /**
         * <strong>example:</strong>
         * <p>Web</p>
         */
        @NameInMap("AccessChannelType")
        public String accessChannelType;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BeingAssigned")
        public Boolean beingAssigned;

        /**
         * <strong>example:</strong>
         * <p>$23086709$EAUNIT</p>
         */
        @NameInMap("ChatConversationId")
        public String chatConversationId;

        /**
         * <strong>example:</strong>
         * <p>1718868572094</p>
         */
        @NameInMap("EnqueueTime")
        public Long enqueueTime;

        /**
         * <strong>example:</strong>
         * <p>chat-434537064047960064</p>
         */
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Messages")
        public java.util.List<ListWaitingChatsResponseBodyDataMessages> messages;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("UserList")
        public java.util.List<ListWaitingChatsResponseBodyDataUserList> userList;

        public static ListWaitingChatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWaitingChatsResponseBodyData self = new ListWaitingChatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWaitingChatsResponseBodyData setAccessChannelId(String accessChannelId) {
            this.accessChannelId = accessChannelId;
            return this;
        }
        public String getAccessChannelId() {
            return this.accessChannelId;
        }

        public ListWaitingChatsResponseBodyData setAccessChannelType(String accessChannelType) {
            this.accessChannelType = accessChannelType;
            return this;
        }
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        public ListWaitingChatsResponseBodyData setBeingAssigned(Boolean beingAssigned) {
            this.beingAssigned = beingAssigned;
            return this;
        }
        public Boolean getBeingAssigned() {
            return this.beingAssigned;
        }

        public ListWaitingChatsResponseBodyData setChatConversationId(String chatConversationId) {
            this.chatConversationId = chatConversationId;
            return this;
        }
        public String getChatConversationId() {
            return this.chatConversationId;
        }

        public ListWaitingChatsResponseBodyData setEnqueueTime(Long enqueueTime) {
            this.enqueueTime = enqueueTime;
            return this;
        }
        public Long getEnqueueTime() {
            return this.enqueueTime;
        }

        public ListWaitingChatsResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListWaitingChatsResponseBodyData setMessages(java.util.List<ListWaitingChatsResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ListWaitingChatsResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

        public ListWaitingChatsResponseBodyData setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListWaitingChatsResponseBodyData setUserList(java.util.List<ListWaitingChatsResponseBodyDataUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<ListWaitingChatsResponseBodyDataUserList> getUserList() {
            return this.userList;
        }

    }

}
