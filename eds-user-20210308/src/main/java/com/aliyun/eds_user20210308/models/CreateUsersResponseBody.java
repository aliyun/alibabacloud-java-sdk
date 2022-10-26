// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateUsersResponseBody extends TeaModel {
    @NameInMap("CreateResult")
    public CreateUsersResponseBodyCreateResult createResult;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUsersResponseBody self = new CreateUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUsersResponseBody setCreateResult(CreateUsersResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public CreateUsersResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public CreateUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateUsersResponseBodyCreateResultCreatedUsers extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Remark")
        public String remark;

        public static CreateUsersResponseBodyCreateResultCreatedUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateUsersResponseBodyCreateResultCreatedUsers self = new CreateUsersResponseBodyCreateResultCreatedUsers();
            return TeaModel.build(map, self);
        }

        public CreateUsersResponseBodyCreateResultCreatedUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateUsersResponseBodyCreateResultCreatedUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public CreateUsersResponseBodyCreateResultCreatedUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CreateUsersResponseBodyCreateResultCreatedUsers setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class CreateUsersResponseBodyCreateResultFailedUsers extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Phone")
        public String phone;

        public static CreateUsersResponseBodyCreateResultFailedUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateUsersResponseBodyCreateResultFailedUsers self = new CreateUsersResponseBodyCreateResultFailedUsers();
            return TeaModel.build(map, self);
        }

        public CreateUsersResponseBodyCreateResultFailedUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateUsersResponseBodyCreateResultFailedUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public CreateUsersResponseBodyCreateResultFailedUsers setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateUsersResponseBodyCreateResultFailedUsers setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateUsersResponseBodyCreateResultFailedUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class CreateUsersResponseBodyCreateResult extends TeaModel {
        @NameInMap("CreatedUsers")
        public java.util.List<CreateUsersResponseBodyCreateResultCreatedUsers> createdUsers;

        @NameInMap("FailedUsers")
        public java.util.List<CreateUsersResponseBodyCreateResultFailedUsers> failedUsers;

        public static CreateUsersResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            CreateUsersResponseBodyCreateResult self = new CreateUsersResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public CreateUsersResponseBodyCreateResult setCreatedUsers(java.util.List<CreateUsersResponseBodyCreateResultCreatedUsers> createdUsers) {
            this.createdUsers = createdUsers;
            return this;
        }
        public java.util.List<CreateUsersResponseBodyCreateResultCreatedUsers> getCreatedUsers() {
            return this.createdUsers;
        }

        public CreateUsersResponseBodyCreateResult setFailedUsers(java.util.List<CreateUsersResponseBodyCreateResultFailedUsers> failedUsers) {
            this.failedUsers = failedUsers;
            return this;
        }
        public java.util.List<CreateUsersResponseBodyCreateResultFailedUsers> getFailedUsers() {
            return this.failedUsers;
        }

    }

}
