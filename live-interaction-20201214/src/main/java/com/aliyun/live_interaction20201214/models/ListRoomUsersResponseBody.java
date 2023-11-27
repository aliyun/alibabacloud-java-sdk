// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListRoomUsersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    @NameInMap("Result")
    public ListRoomUsersResponseBodyResult result;

    public static ListRoomUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoomUsersResponseBody self = new ListRoomUsersResponseBody();
        return TeaModel.build(map, self);
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

    public ListRoomUsersResponseBody setResult(ListRoomUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListRoomUsersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListRoomUsersResponseBodyResultRoomUserVOList extends TeaModel {
        @NameInMap("Nick")
        public String nick;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("UserId")
        public String userId;

        public static ListRoomUsersResponseBodyResultRoomUserVOList build(java.util.Map<String, ?> map) throws Exception {
            ListRoomUsersResponseBodyResultRoomUserVOList self = new ListRoomUsersResponseBodyResultRoomUserVOList();
            return TeaModel.build(map, self);
        }

        public ListRoomUsersResponseBodyResultRoomUserVOList setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
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

    }

    public static class ListRoomUsersResponseBodyResult extends TeaModel {
        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("RoomUserVOList")
        public java.util.List<ListRoomUsersResponseBodyResultRoomUserVOList> roomUserVOList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRoomUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRoomUsersResponseBodyResult self = new ListRoomUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRoomUsersResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListRoomUsersResponseBodyResult setRoomUserVOList(java.util.List<ListRoomUsersResponseBodyResultRoomUserVOList> roomUserVOList) {
            this.roomUserVOList = roomUserVOList;
            return this;
        }
        public java.util.List<ListRoomUsersResponseBodyResultRoomUserVOList> getRoomUserVOList() {
            return this.roomUserVOList;
        }

        public ListRoomUsersResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
