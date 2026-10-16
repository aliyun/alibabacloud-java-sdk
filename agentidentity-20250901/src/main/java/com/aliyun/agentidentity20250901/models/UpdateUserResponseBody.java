// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5EEF5C1D-E951-5C0D-B0BC-5FF1B626CFC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user information.</p>
     */
    @NameInMap("User")
    public UpdateUserResponseBodyUser user;

    public static UpdateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserResponseBody self = new UpdateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserResponseBody setUser(UpdateUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public UpdateUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class UpdateUserResponseBodyUser extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-25T12:57:03Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Senior data analyst</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice Wang</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice.wang@example.com">alice.wang@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The status of the user. Valid values:</p>
         * <ul>
         * <li>Enabled: The user is enabled.</li>
         * <li>Disabled: The user is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the user. Valid values:</p>
         * <ul>
         * <li>Manual: The user is manually created by calling an API operation.</li>
         * <li>JIT: The user is created by using JIT.</li>
         * <li>SYNC_DINGTALK: The user is synchronized from DingTalk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-25T12:57:03Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static UpdateUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserResponseBodyUser self = new UpdateUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public UpdateUserResponseBodyUser setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateUserResponseBodyUser setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateUserResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateUserResponseBodyUser setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateUserResponseBodyUser setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateUserResponseBodyUser setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateUserResponseBodyUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
