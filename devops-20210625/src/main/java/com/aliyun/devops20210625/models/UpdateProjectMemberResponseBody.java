// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectMemberResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("member")
    public UpdateProjectMemberResponseBodyMember member;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public String id;

        @NameInMap("roleIdentifier")
        public String roleIdentifier;

        @NameInMap("targetIdentifier")
        public String targetIdentifier;

        @NameInMap("targetType")
        public String targetType;

        @NameInMap("userIdentifier")
        public String userIdentifier;

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
