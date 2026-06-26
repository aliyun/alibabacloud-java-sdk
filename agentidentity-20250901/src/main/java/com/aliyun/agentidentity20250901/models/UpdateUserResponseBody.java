// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public String userId;

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
