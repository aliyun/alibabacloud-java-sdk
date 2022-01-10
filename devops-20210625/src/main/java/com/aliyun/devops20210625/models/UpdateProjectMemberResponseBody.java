// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectMemberResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 成员信息
    @NameInMap("member")
    public UpdateProjectMemberResponseBodyMember member;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true或者false
    @NameInMap("success")
    public Boolean success;

    public static UpdateProjectMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectMemberResponseBody self = new UpdateProjectMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateProjectMemberResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateProjectMemberResponseBody setMember(UpdateProjectMemberResponseBodyMember member) {
        this.member = member;
        return this;
    }
    public UpdateProjectMemberResponseBodyMember getMember() {
        return this.member;
    }

    public UpdateProjectMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProjectMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateProjectMemberResponseBodyMember extends TeaModel {
        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 修改时间
        @NameInMap("gmtModified")
        public Long gmtModified;

        // id
        @NameInMap("id")
        public String id;

        // 角色id
        @NameInMap("roleIdentifier")
        public String roleIdentifier;

        // 资源id，也就是项目id
        @NameInMap("targetIdentifier")
        public String targetIdentifier;

        // 资源类型
        @NameInMap("targetType")
        public String targetType;

        // 用户id
        @NameInMap("userIdentifier")
        public String userIdentifier;

        // 用户类型
        @NameInMap("userType")
        public String userType;

        public static UpdateProjectMemberResponseBodyMember build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectMemberResponseBodyMember self = new UpdateProjectMemberResponseBodyMember();
            return TeaModel.build(map, self);
        }

        public UpdateProjectMemberResponseBodyMember setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateProjectMemberResponseBodyMember setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public UpdateProjectMemberResponseBodyMember setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateProjectMemberResponseBodyMember setRoleIdentifier(String roleIdentifier) {
            this.roleIdentifier = roleIdentifier;
            return this;
        }
        public String getRoleIdentifier() {
            return this.roleIdentifier;
        }

        public UpdateProjectMemberResponseBodyMember setTargetIdentifier(String targetIdentifier) {
            this.targetIdentifier = targetIdentifier;
            return this;
        }
        public String getTargetIdentifier() {
            return this.targetIdentifier;
        }

        public UpdateProjectMemberResponseBodyMember setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public UpdateProjectMemberResponseBodyMember setUserIdentifier(String userIdentifier) {
            this.userIdentifier = userIdentifier;
            return this;
        }
        public String getUserIdentifier() {
            return this.userIdentifier;
        }

        public UpdateProjectMemberResponseBodyMember setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
