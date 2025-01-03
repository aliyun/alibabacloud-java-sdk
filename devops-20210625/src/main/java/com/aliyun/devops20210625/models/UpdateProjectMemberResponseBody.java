// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("member")
    public UpdateProjectMemberResponseBodyMember member;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1623916393000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1623916393000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1124382</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>project.admin</p>
         */
        @NameInMap("roleIdentifier")
        public String roleIdentifier;

        /**
         * <strong>example:</strong>
         * <p>5e70xxxxxxcd000xxxxe96</p>
         */
        @NameInMap("targetIdentifier")
        public String targetIdentifier;

        /**
         * <strong>example:</strong>
         * <p>Space</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("userIdentifier")
        public String userIdentifier;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
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
