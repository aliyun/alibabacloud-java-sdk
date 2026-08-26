// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupUserResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results.</p>
     */
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
        /**
         * <p>UTC timestamp when the user joined the message group.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("JoinTime")
        public Long joinTime;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>de1<strong>a0,hu</strong>9</p>
         */
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
        /**
         * <p>Indicates whether there is a next page. Valid values:</p>
         * <ul>
         * <li>true: There is a next page.</li>
         * <li>false: There is no next page.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>Total number of message group users.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>User list.</p>
         */
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
