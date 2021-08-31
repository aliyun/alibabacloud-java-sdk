// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListResourceMembersResponseBody extends TeaModel {
    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("success")
    public Boolean success;

    // 成员
    @NameInMap("resourceMembers")
    public java.util.List<ListResourceMembersResponseBodyResourceMembers> resourceMembers;

    public static ListResourceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceMembersResponseBody self = new ListResourceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceMembersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListResourceMembersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListResourceMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListResourceMembersResponseBody setResourceMembers(java.util.List<ListResourceMembersResponseBodyResourceMembers> resourceMembers) {
        this.resourceMembers = resourceMembers;
        return this;
    }
    public java.util.List<ListResourceMembersResponseBodyResourceMembers> getResourceMembers() {
        return this.resourceMembers;
    }

    public static class ListResourceMembersResponseBodyResourceMembers extends TeaModel {
        // 账号id
        @NameInMap("accountId")
        public String accountId;

        // 角色
        @NameInMap("roleName")
        public String roleName;

        // 用户名称
        @NameInMap("username")
        public String username;

        public static ListResourceMembersResponseBodyResourceMembers build(java.util.Map<String, ?> map) throws Exception {
            ListResourceMembersResponseBodyResourceMembers self = new ListResourceMembersResponseBodyResourceMembers();
            return TeaModel.build(map, self);
        }

        public ListResourceMembersResponseBodyResourceMembers setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListResourceMembersResponseBodyResourceMembers setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListResourceMembersResponseBodyResourceMembers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
