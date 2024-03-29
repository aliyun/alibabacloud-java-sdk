// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListRoomUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

    public ListRoomUsersResponseBody setResult(ListRoomUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListRoomUsersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListRoomUsersResponseBodyResultRoomUserList extends TeaModel {
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("UserId")
        public String userId;

        public static ListRoomUsersResponseBodyResultRoomUserList build(java.util.Map<String, ?> map) throws Exception {
            ListRoomUsersResponseBodyResultRoomUserList self = new ListRoomUsersResponseBodyResultRoomUserList();
            return TeaModel.build(map, self);
        }

        public ListRoomUsersResponseBodyResultRoomUserList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public ListRoomUsersResponseBodyResultRoomUserList setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListRoomUsersResponseBodyResultRoomUserList setUserId(String userId) {
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

        @NameInMap("PageTotal")
        public Integer pageTotal;

        @NameInMap("RoomUserList")
        public java.util.List<ListRoomUsersResponseBodyResultRoomUserList> roomUserList;

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

        public ListRoomUsersResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public ListRoomUsersResponseBodyResult setRoomUserList(java.util.List<ListRoomUsersResponseBodyResultRoomUserList> roomUserList) {
            this.roomUserList = roomUserList;
            return this;
        }
        public java.util.List<ListRoomUsersResponseBodyResultRoomUserList> getRoomUserList() {
            return this.roomUserList;
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
