// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetFabricOrganizationUserPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public ResetFabricOrganizationUserPasswordResponseBodyResult result;

    public static ResetFabricOrganizationUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetFabricOrganizationUserPasswordResponseBody self = new ResetFabricOrganizationUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetFabricOrganizationUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetFabricOrganizationUserPasswordResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ResetFabricOrganizationUserPasswordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ResetFabricOrganizationUserPasswordResponseBody setResult(ResetFabricOrganizationUserPasswordResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ResetFabricOrganizationUserPasswordResponseBodyResult getResult() {
        return this.result;
    }

    public static class ResetFabricOrganizationUserPasswordResponseBodyResult extends TeaModel {
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

        public static ResetFabricOrganizationUserPasswordResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ResetFabricOrganizationUserPasswordResponseBodyResult self = new ResetFabricOrganizationUserPasswordResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setFullname(String fullname) {
            this.fullname = fullname;
            return this;
        }
        public String getFullname() {
            return this.fullname;
        }

    }

}
