// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricOrganizationUserResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateFabricOrganizationUserResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateFabricOrganizationUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricOrganizationUserResponseBody self = new CreateFabricOrganizationUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFabricOrganizationUserResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateFabricOrganizationUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFabricOrganizationUserResponseBody setResult(CreateFabricOrganizationUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFabricOrganizationUserResponseBodyResult getResult() {
        return this.result;
    }

    public CreateFabricOrganizationUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateFabricOrganizationUserResponseBodyResult extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Fullname")
        public String fullname;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("Password")
        public String password;

        @NameInMap("Username")
        public String username;

        public static CreateFabricOrganizationUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricOrganizationUserResponseBodyResult self = new CreateFabricOrganizationUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFabricOrganizationUserResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateFabricOrganizationUserResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateFabricOrganizationUserResponseBodyResult setFullname(String fullname) {
            this.fullname = fullname;
            return this;
        }
        public String getFullname() {
            return this.fullname;
        }

        public CreateFabricOrganizationUserResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public CreateFabricOrganizationUserResponseBodyResult setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateFabricOrganizationUserResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
