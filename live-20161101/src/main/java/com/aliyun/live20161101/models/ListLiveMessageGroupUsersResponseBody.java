// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupUsersResponseBody extends TeaModel {
    /**
     * <p>The ID of the group queried.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Indicates whether the current page is followed by another page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Hasmore")
    public Boolean hasmore;

    /**
     * <p>The starting page number for the next query. A value of 0 indicates that no further pages can be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1D75BEA-1329-116F-B29C-76F3F200****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the users.</p>
     */
    @NameInMap("UserList")
    public java.util.List<ListLiveMessageGroupUsersResponseBodyUserList> userList;

    public static ListLiveMessageGroupUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupUsersResponseBody self = new ListLiveMessageGroupUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupUsersResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListLiveMessageGroupUsersResponseBody setHasmore(Boolean hasmore) {
        this.hasmore = hasmore;
        return this;
    }
    public Boolean getHasmore() {
        return this.hasmore;
    }

    public ListLiveMessageGroupUsersResponseBody setNextPageToken(Long nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    public ListLiveMessageGroupUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveMessageGroupUsersResponseBody setUserList(java.util.List<ListLiveMessageGroupUsersResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<ListLiveMessageGroupUsersResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class ListLiveMessageGroupUsersResponseBodyUserList extends TeaModel {
        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The additional information about the user.</p>
         * 
         * <strong>example:</strong>
         * <p>info1</p>
         */
        @NameInMap("UserInfo")
        public String userInfo;

        public static ListLiveMessageGroupUsersResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveMessageGroupUsersResponseBodyUserList self = new ListLiveMessageGroupUsersResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public ListLiveMessageGroupUsersResponseBodyUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListLiveMessageGroupUsersResponseBodyUserList setUserInfo(String userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public String getUserInfo() {
            return this.userInfo;
        }

    }

}
