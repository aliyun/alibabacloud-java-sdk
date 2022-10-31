// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListMessageGroupUserResponseBodyResult result;

    public static ListMessageGroupUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageGroupUserResponseBody self = new ListMessageGroupUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageGroupUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessageGroupUserResponseBody setResult(ListMessageGroupUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListMessageGroupUserResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListMessageGroupUserResponseBodyResultUserList extends TeaModel {
        @NameInMap("JoinTime")
        public Long joinTime;

        @NameInMap("UserId")
        public String userId;

        public static ListMessageGroupUserResponseBodyResultUserList build(java.util.Map<String, ?> map) throws Exception {
            ListMessageGroupUserResponseBodyResultUserList self = new ListMessageGroupUserResponseBodyResultUserList();
            return TeaModel.build(map, self);
        }

        public ListMessageGroupUserResponseBodyResultUserList setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public ListMessageGroupUserResponseBodyResultUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListMessageGroupUserResponseBodyResult extends TeaModel {
        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("UserList")
        public java.util.List<ListMessageGroupUserResponseBodyResultUserList> userList;

        public static ListMessageGroupUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMessageGroupUserResponseBodyResult self = new ListMessageGroupUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMessageGroupUserResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMessageGroupUserResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListMessageGroupUserResponseBodyResult setUserList(java.util.List<ListMessageGroupUserResponseBodyResultUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<ListMessageGroupUserResponseBodyResultUserList> getUserList() {
            return this.userList;
        }

    }

}
