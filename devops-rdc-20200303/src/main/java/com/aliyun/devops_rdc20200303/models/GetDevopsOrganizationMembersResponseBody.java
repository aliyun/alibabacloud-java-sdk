// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsOrganizationMembersResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Successful")
    public Boolean successful;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public java.util.List<GetDevopsOrganizationMembersResponseBodyObject> object;

    public static GetDevopsOrganizationMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsOrganizationMembersResponseBody self = new GetDevopsOrganizationMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDevopsOrganizationMembersResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetDevopsOrganizationMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDevopsOrganizationMembersResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public GetDevopsOrganizationMembersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDevopsOrganizationMembersResponseBody setObject(java.util.List<GetDevopsOrganizationMembersResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<GetDevopsOrganizationMembersResponseBodyObject> getObject() {
        return this.object;
    }

    public static class GetDevopsOrganizationMembersResponseBodyObject extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("Role")
        public Integer role;

        @NameInMap("Name")
        public String name;

        @NameInMap("Phone")
        public String phone;

        public static GetDevopsOrganizationMembersResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetDevopsOrganizationMembersResponseBodyObject self = new GetDevopsOrganizationMembersResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetDevopsOrganizationMembersResponseBodyObject setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetDevopsOrganizationMembersResponseBodyObject setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetDevopsOrganizationMembersResponseBodyObject setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetDevopsOrganizationMembersResponseBodyObject setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public GetDevopsOrganizationMembersResponseBodyObject setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public GetDevopsOrganizationMembersResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDevopsOrganizationMembersResponseBodyObject setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
