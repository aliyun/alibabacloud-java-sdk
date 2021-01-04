// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    @NameInMap("User")
    public GetUserResponseBodyUser user;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setUser(GetUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseBodyUser getUser() {
        return this.user;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserResponseBodyUserRoleIdList extends TeaModel {
        @NameInMap("RoleIds")
        public java.util.List<Integer> roleIds;

        public static GetUserResponseBodyUserRoleIdList build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserRoleIdList self = new GetUserResponseBodyUserRoleIdList();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserRoleIdList setRoleIds(java.util.List<Integer> roleIds) {
            this.roleIds = roleIds;
            return this;
        }
        public java.util.List<Integer> getRoleIds() {
            return this.roleIds;
        }

    }

    public static class GetUserResponseBodyUserRoleNameList extends TeaModel {
        @NameInMap("RoleNames")
        public java.util.List<String> roleNames;

        public static GetUserResponseBodyUserRoleNameList build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserRoleNameList self = new GetUserResponseBodyUserRoleNameList();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserRoleNameList setRoleNames(java.util.List<String> roleNames) {
            this.roleNames = roleNames;
            return this;
        }
        public java.util.List<String> getRoleNames() {
            return this.roleNames;
        }

    }

    public static class GetUserResponseBodyUser extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("CurResultCount")
        public Long curResultCount;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        @NameInMap("MaxResultCount")
        public Long maxResultCount;

        @NameInMap("ParentUid")
        public Long parentUid;

        @NameInMap("RoleIdList")
        public GetUserResponseBodyUserRoleIdList roleIdList;

        @NameInMap("RoleNameList")
        public GetUserResponseBodyUserRoleNameList roleNameList;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("MaxExecuteCount")
        public Long maxExecuteCount;

        @NameInMap("CurExecuteCount")
        public Long curExecuteCount;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Uid")
        public String uid;

        public static GetUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUser self = new GetUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUser setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetUserResponseBodyUser setCurResultCount(Long curResultCount) {
            this.curResultCount = curResultCount;
            return this;
        }
        public Long getCurResultCount() {
            return this.curResultCount;
        }

        public GetUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyUser setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public GetUserResponseBodyUser setMaxResultCount(Long maxResultCount) {
            this.maxResultCount = maxResultCount;
            return this;
        }
        public Long getMaxResultCount() {
            return this.maxResultCount;
        }

        public GetUserResponseBodyUser setParentUid(Long parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public Long getParentUid() {
            return this.parentUid;
        }

        public GetUserResponseBodyUser setRoleIdList(GetUserResponseBodyUserRoleIdList roleIdList) {
            this.roleIdList = roleIdList;
            return this;
        }
        public GetUserResponseBodyUserRoleIdList getRoleIdList() {
            return this.roleIdList;
        }

        public GetUserResponseBodyUser setRoleNameList(GetUserResponseBodyUserRoleNameList roleNameList) {
            this.roleNameList = roleNameList;
            return this;
        }
        public GetUserResponseBodyUserRoleNameList getRoleNameList() {
            return this.roleNameList;
        }

        public GetUserResponseBodyUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetUserResponseBodyUser setMaxExecuteCount(Long maxExecuteCount) {
            this.maxExecuteCount = maxExecuteCount;
            return this;
        }
        public Long getMaxExecuteCount() {
            return this.maxExecuteCount;
        }

        public GetUserResponseBodyUser setCurExecuteCount(Long curExecuteCount) {
            this.curExecuteCount = curExecuteCount;
            return this;
        }
        public Long getCurExecuteCount() {
            return this.curExecuteCount;
        }

        public GetUserResponseBodyUser setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetUserResponseBodyUser setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
