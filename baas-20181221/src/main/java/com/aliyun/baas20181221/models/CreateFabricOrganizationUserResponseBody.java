// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricOrganizationUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public CreateFabricOrganizationUserResponseBodyResult result;

    public static CreateFabricOrganizationUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricOrganizationUserResponseBody self = new CreateFabricOrganizationUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFabricOrganizationUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFabricOrganizationUserResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateFabricOrganizationUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateFabricOrganizationUserResponseBody setResult(CreateFabricOrganizationUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFabricOrganizationUserResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateFabricOrganizationUserResponseBodyResult extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("Username")
        public String username;

        @NameInMap("Fullname")
        public String fullname;

        public static CreateFabricOrganizationUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricOrganizationUserResponseBodyResult self = new CreateFabricOrganizationUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFabricOrganizationUserResponseBodyResult setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateFabricOrganizationUserResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateFabricOrganizationUserResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateFabricOrganizationUserResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public CreateFabricOrganizationUserResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateFabricOrganizationUserResponseBodyResult setFullname(String fullname) {
            this.fullname = fullname;
            return this;
        }
        public String getFullname() {
            return this.fullname;
        }

    }

}
