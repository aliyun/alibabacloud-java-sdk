// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupUserByIdResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
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
        /**
         * <p>Indicates whether the user is muted. Valid values:</p>
         * <ul>
         * <li><p>true: Muted.</p>
         * </li>
         * <li><p>false: Not muted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMute")
        public Boolean isMute;

        /**
         * <p>Mute type. Valid values:</p>
         * <ul>
         * <li><p>group: All members in the message group are muted.</p>
         * </li>
         * <li><p>user: Individual user is muted.</p>
         * </li>
         * </ul>
         */
        @NameInMap("MuteBy")
        public java.util.List<String> muteBy;

        /**
         * <p>Profile picture URL.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="http://www.aliyundoc.com/xxyy.png">http://www.aliyundoc.com/xxyy.png</a>&quot;</p>
         */
        @NameInMap("UserAvatar")
        public String userAvatar;

        /**
         * <p>Custom user information content.</p>
         * 
         * <strong>example:</strong>
         * <p>12e</p>
         */
        @NameInMap("UserExtension")
        public String userExtension;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ad***</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>User nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>xxyy</p>
         */
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
        /**
         * <p>Indicates whether there is a next page. Valid values:</p>
         * <ul>
         * <li><p>true: There is a next page.</p>
         * </li>
         * <li><p>false: There is no next page.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>Total number of users queried.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>User list information.</p>
         */
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
