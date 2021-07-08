// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListRoomMessagesResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 请求是否成功。
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码，请求异常时返回。
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息，请求异常时返回。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求的返回结果。
    @NameInMap("Result")
    public ListRoomMessagesResponseBodyResult result;

    public static ListRoomMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoomMessagesResponseBody self = new ListRoomMessagesResponseBody();
        return TeaModel.build(map, self);
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

    public ListRoomMessagesResponseBody setResult(ListRoomMessagesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListRoomMessagesResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListRoomMessagesResponseBodyResultRoomMessageList extends TeaModel {
        // 房间ID。
        @NameInMap("RoomId")
        public String roomId;

        // 消息的唯一ID标识。由数字、大小写字母组成，长度不超过20。
        @NameInMap("MessageId")
        public String messageId;

        // 消息的类型。
        @NameInMap("SubType")
        public Integer subType;

        // 消息的发送者ID。
        @NameInMap("SenderId")
        public String senderId;

        // 消息的发送时间,毫秒unix时间戳。
        @NameInMap("SendTimeMillis")
        public Long sendTimeMillis;

        // 消息体。
        @NameInMap("Body")
        public String body;

        public static ListRoomMessagesResponseBodyResultRoomMessageList build(java.util.Map<String, ?> map) throws Exception {
            ListRoomMessagesResponseBodyResultRoomMessageList self = new ListRoomMessagesResponseBodyResultRoomMessageList();
            return TeaModel.build(map, self);
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setSubType(Integer subType) {
            this.subType = subType;
            return this;
        }
        public Integer getSubType() {
            return this.subType;
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setSendTimeMillis(Long sendTimeMillis) {
            this.sendTimeMillis = sendTimeMillis;
            return this;
        }
        public Long getSendTimeMillis() {
            return this.sendTimeMillis;
        }

        public ListRoomMessagesResponseBodyResultRoomMessageList setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

    }

    public static class ListRoomMessagesResponseBodyResult extends TeaModel {
        // 互动消息的总数。
        @NameInMap("TotalCount")
        public Integer totalCount;

        // 房间的互动消息列表，按照发送时间戳由大到小排序。
        @NameInMap("RoomMessageList")
        public java.util.List<ListRoomMessagesResponseBodyResultRoomMessageList> roomMessageList;

        // 是否还有下一页查询的数据。
        @NameInMap("HasMore")
        public Boolean hasMore;

        public static ListRoomMessagesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRoomMessagesResponseBodyResult self = new ListRoomMessagesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRoomMessagesResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListRoomMessagesResponseBodyResult setRoomMessageList(java.util.List<ListRoomMessagesResponseBodyResultRoomMessageList> roomMessageList) {
            this.roomMessageList = roomMessageList;
            return this;
        }
        public java.util.List<ListRoomMessagesResponseBodyResultRoomMessageList> getRoomMessageList() {
            return this.roomMessageList;
        }

        public ListRoomMessagesResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

    }

}
