// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListConferenceUsersResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public ListConferenceUsersResponseBodyResult result;

    public static ListConferenceUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConferenceUsersResponseBody self = new ListConferenceUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConferenceUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConferenceUsersResponseBody setResult(ListConferenceUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListConferenceUsersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListConferenceUsersResponseBodyResultConferenceUserList extends TeaModel {
        // 用户ID。
        @NameInMap("UserId")
        public String userId;

        // 用户状态。
        @NameInMap("Status")
        public String status;

        public static ListConferenceUsersResponseBodyResultConferenceUserList build(java.util.Map<String, ?> map) throws Exception {
            ListConferenceUsersResponseBodyResultConferenceUserList self = new ListConferenceUsersResponseBodyResultConferenceUserList();
            return TeaModel.build(map, self);
        }

        public ListConferenceUsersResponseBodyResultConferenceUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListConferenceUsersResponseBodyResultConferenceUserList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListConferenceUsersResponseBodyResult extends TeaModel {
        // 会议用户列表。
        @NameInMap("ConferenceUserList")
        public java.util.List<ListConferenceUsersResponseBodyResultConferenceUserList> conferenceUserList;

        // 是否还有数据
        @NameInMap("HasMore")
        public Boolean hasMore;

        // 总条目数
        @NameInMap("TotalCount")
        public Integer totalCount;

        // 总页数
        @NameInMap("PageTotal")
        public Integer pageTotal;

        public static ListConferenceUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListConferenceUsersResponseBodyResult self = new ListConferenceUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListConferenceUsersResponseBodyResult setConferenceUserList(java.util.List<ListConferenceUsersResponseBodyResultConferenceUserList> conferenceUserList) {
            this.conferenceUserList = conferenceUserList;
            return this;
        }
        public java.util.List<ListConferenceUsersResponseBodyResultConferenceUserList> getConferenceUserList() {
            return this.conferenceUserList;
        }

        public ListConferenceUsersResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListConferenceUsersResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListConferenceUsersResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

    }

}
