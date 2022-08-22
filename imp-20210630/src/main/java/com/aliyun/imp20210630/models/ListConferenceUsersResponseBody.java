// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListConferenceUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        public static ListConferenceUsersResponseBodyResultConferenceUserList build(java.util.Map<String, ?> map) throws Exception {
            ListConferenceUsersResponseBodyResultConferenceUserList self = new ListConferenceUsersResponseBodyResultConferenceUserList();
            return TeaModel.build(map, self);
        }

        public ListConferenceUsersResponseBodyResultConferenceUserList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListConferenceUsersResponseBodyResultConferenceUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListConferenceUsersResponseBodyResult extends TeaModel {
        @NameInMap("ConferenceUserList")
        public java.util.List<ListConferenceUsersResponseBodyResultConferenceUserList> conferenceUserList;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("PageTotal")
        public Integer pageTotal;

        @NameInMap("TotalCount")
        public Integer totalCount;

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

        public ListConferenceUsersResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public ListConferenceUsersResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
