// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateUsersResponseBody extends TeaModel {
    @NameInMap("AllSucceed")
    public Boolean allSucceed;

    /**
     * <p>The result of user creation.</p>
     */
    @NameInMap("CreateResult")
    public CreateUsersResponseBodyCreateResult createResult;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUsersResponseBody self = new CreateUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUsersResponseBody setAllSucceed(Boolean allSucceed) {
        this.allSucceed = allSucceed;
        return this;
    }
    public Boolean getAllSucceed() {
        return this.allSucceed;
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
        /**
         * <p>The email address of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The name of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The mobile number of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The display name of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>Bean</p>
         */
        @NameInMap("RealNickName")
        public String realNickName;

        /**
         * <p>The remarks of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>remark1</p>
         */
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

        public CreateUsersResponseBodyCreateResultCreatedUsers setRealNickName(String realNickName) {
            this.realNickName = realNickName;
            return this;
        }
        public String getRealNickName() {
            return this.realNickName;
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
        /**
         * <p>The email address of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username2@example.com">username2@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The name of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>ExistedEndUserId</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The username test is used by another user.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The mobile number of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
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
        /**
         * <p>Details of the created convenience users.</p>
         */
        @NameInMap("CreatedUsers")
        public java.util.List<CreateUsersResponseBodyCreateResultCreatedUsers> createdUsers;

        /**
         * <p>Details of the convenience users that failed to be created.</p>
         */
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
