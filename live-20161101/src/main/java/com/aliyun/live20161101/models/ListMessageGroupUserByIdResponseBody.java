// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupUserByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListMessageGroupUserByIdResponseBodyResult result;

    public static ListMessageGroupUserByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageGroupUserByIdResponseBody self = new ListMessageGroupUserByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageGroupUserByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessageGroupUserByIdResponseBody setResult(ListMessageGroupUserByIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListMessageGroupUserByIdResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListMessageGroupUserByIdResponseBodyResultUserList extends TeaModel {
        @NameInMap("IsMute")
        public Boolean isMute;

        @NameInMap("MuteBy")
        public java.util.List<String> muteBy;

        @NameInMap("UserAvatar")
        public String userAvatar;

        @NameInMap("UserExtension")
        public String userExtension;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserNick")
        public String userNick;

        public static ListMessageGroupUserByIdResponseBodyResultUserList build(java.util.Map<String, ?> map) throws Exception {
            ListMessageGroupUserByIdResponseBodyResultUserList self = new ListMessageGroupUserByIdResponseBodyResultUserList();
            return TeaModel.build(map, self);
        }

        public ListMessageGroupUserByIdResponseBodyResultUserList setIsMute(Boolean isMute) {
            this.isMute = isMute;
            return this;
        }
        public Boolean getIsMute() {
            return this.isMute;
        }

        public ListMessageGroupUserByIdResponseBodyResultUserList setMuteBy(java.util.List<String> muteBy) {
            this.muteBy = muteBy;
            return this;
        }
        public java.util.List<String> getMuteBy() {
            return this.muteBy;
        }

        public ListMessageGroupUserByIdResponseBodyResultUserList setUserAvatar(String userAvatar) {
            this.userAvatar = userAvatar;
            return this;
        }
        public String getUserAvatar() {
            return this.userAvatar;
        }

        public ListMessageGroupUserByIdResponseBodyResultUserList setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public ListMessageGroupUserByIdResponseBodyResultUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListMessageGroupUserByIdResponseBodyResultUserList setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

    public static class ListMessageGroupUserByIdResponseBodyResult extends TeaModel {
        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("UserList")
        public java.util.List<ListMessageGroupUserByIdResponseBodyResultUserList> userList;

        public static ListMessageGroupUserByIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMessageGroupUserByIdResponseBodyResult self = new ListMessageGroupUserByIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMessageGroupUserByIdResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMessageGroupUserByIdResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListMessageGroupUserByIdResponseBodyResult setUserList(java.util.List<ListMessageGroupUserByIdResponseBodyResultUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<ListMessageGroupUserByIdResponseBodyResultUserList> getUserList() {
            return this.userList;
        }

    }

}
