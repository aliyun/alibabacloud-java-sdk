// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListApplyLinkMicUsersResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public ListApplyLinkMicUsersResponseBodyResult result;

    public static ListApplyLinkMicUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplyLinkMicUsersResponseBody self = new ListApplyLinkMicUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplyLinkMicUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplyLinkMicUsersResponseBody setResult(ListApplyLinkMicUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListApplyLinkMicUsersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListApplyLinkMicUsersResponseBodyResult extends TeaModel {
        // 会议申请连麦用户列表。
        @NameInMap("ApplyLinkMicUserList")
        public java.util.List<String> applyLinkMicUserList;

        // 是否还有下一页成员列表。
        @NameInMap("HasMore")
        public Boolean hasMore;

        // 改会议的申请连麦成员总页数。
        @NameInMap("PageTotal")
        public Integer pageTotal;

        // 该会议的申请连麦成员总数。
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListApplyLinkMicUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListApplyLinkMicUsersResponseBodyResult self = new ListApplyLinkMicUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListApplyLinkMicUsersResponseBodyResult setApplyLinkMicUserList(java.util.List<String> applyLinkMicUserList) {
            this.applyLinkMicUserList = applyLinkMicUserList;
            return this;
        }
        public java.util.List<String> getApplyLinkMicUserList() {
            return this.applyLinkMicUserList;
        }

        public ListApplyLinkMicUsersResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListApplyLinkMicUsersResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public ListApplyLinkMicUsersResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
