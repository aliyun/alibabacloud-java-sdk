// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListRoomMessagesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    @NameInMap("Result")
    public ListRoomMessagesResponseBodyResult result;

    public static ListRoomMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoomMessagesResponseBody self = new ListRoomMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoomMessagesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRoomMessagesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRoomMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoomMessagesResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public ListRoomMessagesResponseBody setResult(ListRoomMessagesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListRoomMessagesResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListRoomMessagesResponseBodyResultRoomMessageList extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("SendTimeMillis")
        public Long sendTimeMillis;

        @NameInMap("SenderId")
        public String senderId;

        @NameInMap("SubType")
        public Integer subType;

        public static ListRoomMessagesResponseBodyResultRoomMessageList build(java.util.Map<String, ?> map) throws Exception {
            ListRoomMessagesResponseBodyResultRoomMessageList self = new ListRoomMessagesResponseBodyResultRoomMessageList();
            return TeaModel.build(map, self);
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setSendTimeMillis(Long sendTimeMillis) {
            this.sendTimeMillis = sendTimeMillis;
            return this;
        }
        public Long getSendTimeMillis() {
            return this.sendTimeMillis;
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setSubType(Integer subType) {
            this.subType = subType;
            return this;
        }
        public Integer getSubType() {
            return this.subType;
        }

    }

    public static class ListRoomMessagesResponseBodyResult extends TeaModel {
        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("RoomMessageList")
        public java.util.List<ListRoomMessagesResponseBodyResultRoomMessageList> roomMessageList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRoomMessagesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRoomMessagesResponseBodyResult self = new ListRoomMessagesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRoomMessagesResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListRoomMessagesResponseBodyResult setRoomMessageList(java.util.List<ListRoomMessagesResponseBodyResultRoomMessageList> roomMessageList) {
            this.roomMessageList = roomMessageList;
            return this;
        }
        public java.util.List<ListRoomMessagesResponseBodyResultRoomMessageList> getRoomMessageList() {
            return this.roomMessageList;
        }

        public ListRoomMessagesResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
