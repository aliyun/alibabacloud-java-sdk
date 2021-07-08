// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListRoomUsersResponseBody extends TeaModel {
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
    public ListRoomUsersResponseBodyResult result;

    public static ListRoomUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoomUsersResponseBody self = new ListRoomUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoomUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoomUsersResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public ListRoomUsersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRoomUsersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRoomUsersResponseBody setResult(ListRoomUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListRoomUsersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListRoomUsersResponseBodyResultRoomUserVOList extends TeaModel {
        // 房间ID。
        @NameInMap("RoomId")
        public String roomId;

        // 用户ID。
        @NameInMap("UserId")
        public String userId;

        // 用户的昵称。
        @NameInMap("Nick")
        public String nick;

        public static ListRoomUsersResponseBodyResultRoomUserVOList build(java.util.Map<String, ?> map) throws Exception {
            ListRoomUsersResponseBodyResultRoomUserVOList self = new ListRoomUsersResponseBodyResultRoomUserVOList();
            return TeaModel.build(map, self);
        }

        public ListRoomUsersResponseBodyResultRoomUserVOList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListRoomUsersResponseBodyResultRoomUserVOList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListRoomUsersResponseBodyResultRoomUserVOList setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

    }

    public static class ListRoomUsersResponseBodyResult extends TeaModel {
        // 房间的历史观看成员总数。
        @NameInMap("TotalCount")
        public Integer totalCount;

        // 返回的观众列表。
        @NameInMap("RoomUserVOList")
        public java.util.List<ListRoomUsersResponseBodyResultRoomUserVOList> roomUserVOList;

        // 是否还有下一页查询的数据。
        @NameInMap("HasMore")
        public Boolean hasMore;

        public static ListRoomUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRoomUsersResponseBodyResult self = new ListRoomUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRoomUsersResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListRoomUsersResponseBodyResult setRoomUserVOList(java.util.List<ListRoomUsersResponseBodyResultRoomUserVOList> roomUserVOList) {
            this.roomUserVOList = roomUserVOList;
            return this;
        }
        public java.util.List<ListRoomUsersResponseBodyResultRoomUserVOList> getRoomUserVOList() {
            return this.roomUserVOList;
        }

        public ListRoomUsersResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

    }

}
