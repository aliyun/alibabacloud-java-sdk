// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupUserByIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
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
         * <li>true: The user is muted.</li>
         * <li>false: The user is not muted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMute")
        public Boolean isMute;

        /**
         * <p>The type of the mute. Valid values:</p>
         * <ul>
         * <li>group: All members in the message group are muted.</li>
         * <li>user: Specific members in the message group are muted.</li>
         * </ul>
         */
        @NameInMap("MuteBy")
        public java.util.List<String> muteBy;

        /**
         * <p>The URL of the profile picture of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="http://www.aliyundoc.com/xxyy.png">http://www.aliyundoc.com/xxyy.png</a>&quot;</p>
         */
        @NameInMap("UserAvatar")
        public String userAvatar;

        /**
         * <p>The custom information about the user.</p>
         * 
         * <strong>example:</strong>
         * <p>12e</p>
         */
        @NameInMap("UserExtension")
        public String userExtension;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>ad***</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The nickname of the user.</p>
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
         * <p>The total number of users returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The list of users.</p>
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
