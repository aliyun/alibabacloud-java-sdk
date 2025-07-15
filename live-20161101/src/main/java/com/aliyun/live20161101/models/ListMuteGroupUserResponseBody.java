// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMuteGroupUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public ListMuteGroupUserResponseBodyResult result;

    public static ListMuteGroupUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMuteGroupUserResponseBody self = new ListMuteGroupUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMuteGroupUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMuteGroupUserResponseBody setResult(ListMuteGroupUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListMuteGroupUserResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListMuteGroupUserResponseBodyResultUserList extends TeaModel {
        /**
         * <p>The ID of the muted user.</p>
         * 
         * <strong>example:</strong>
         * <p>1sd***,yu***</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListMuteGroupUserResponseBodyResultUserList build(java.util.Map<String, ?> map) throws Exception {
            ListMuteGroupUserResponseBodyResultUserList self = new ListMuteGroupUserResponseBodyResultUserList();
            return TeaModel.build(map, self);
        }

        public ListMuteGroupUserResponseBodyResultUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListMuteGroupUserResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the current page is followed by another page. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The total number of muted members.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The list of muted users.</p>
         */
        @NameInMap("UserList")
        public java.util.List<ListMuteGroupUserResponseBodyResultUserList> userList;

        public static ListMuteGroupUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMuteGroupUserResponseBodyResult self = new ListMuteGroupUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMuteGroupUserResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMuteGroupUserResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListMuteGroupUserResponseBodyResult setUserList(java.util.List<ListMuteGroupUserResponseBodyResultUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<ListMuteGroupUserResponseBodyResultUserList> getUserList() {
            return this.userList;
        }

    }

}
