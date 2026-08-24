// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user details.</p>
     */
    @NameInMap("User")
    public GetUserResponseBodyUser user;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setUser(GetUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserResponseBodyUser extends TeaModel {
        /**
         * <p>The time when the user was first added.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-22T17:46:47</p>
         */
        @NameInMap("AddTime")
        public String addTime;

        /**
         * <p>The user group. Valid values:</p>
         * <ul>
         * <li><p>users: ordinary permission group. This group is suitable for regular users who only need to commit and debug jobs.</p>
         * </li>
         * <li><p>wheel: sudo permission group. This group is suitable for administrators who need cluster management. In addition to committing and debugging jobs, members of this group can execute sudo commands to install software, restart nodes, and perform other operations.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>users</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUser self = new GetUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUser setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public GetUserResponseBodyUser setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetUserResponseBodyUser setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
