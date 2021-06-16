// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsProjectMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Successful")
    public Boolean successful;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Object")
    public java.util.List<GetDevopsProjectMembersResponseBodyObject> object;

    public static GetDevopsProjectMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsProjectMembersResponseBody self = new GetDevopsProjectMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDevopsProjectMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDevopsProjectMembersResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public GetDevopsProjectMembersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDevopsProjectMembersResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetDevopsProjectMembersResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public GetDevopsProjectMembersResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetDevopsProjectMembersResponseBody setObject(java.util.List<GetDevopsProjectMembersResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<GetDevopsProjectMembersResponseBodyObject> getObject() {
        return this.object;
    }

    public static class GetDevopsProjectMembersResponseBodyObject extends TeaModel {
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

        public static GetDevopsProjectMembersResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetDevopsProjectMembersResponseBodyObject self = new GetDevopsProjectMembersResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetDevopsProjectMembersResponseBodyObject setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetDevopsProjectMembersResponseBodyObject setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetDevopsProjectMembersResponseBodyObject setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetDevopsProjectMembersResponseBodyObject setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public GetDevopsProjectMembersResponseBodyObject setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public GetDevopsProjectMembersResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDevopsProjectMembersResponseBodyObject setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
