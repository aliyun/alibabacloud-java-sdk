// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetFabricOrganizationUserPasswordResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ResetFabricOrganizationUserPasswordResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ResetFabricOrganizationUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetFabricOrganizationUserPasswordResponseBody self = new ResetFabricOrganizationUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetFabricOrganizationUserPasswordResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ResetFabricOrganizationUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetFabricOrganizationUserPasswordResponseBody setResult(ResetFabricOrganizationUserPasswordResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ResetFabricOrganizationUserPasswordResponseBodyResult getResult() {
        return this.result;
    }

    public ResetFabricOrganizationUserPasswordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResetFabricOrganizationUserPasswordResponseBodyResult extends TeaModel {
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

        public static ResetFabricOrganizationUserPasswordResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ResetFabricOrganizationUserPasswordResponseBodyResult self = new ResetFabricOrganizationUserPasswordResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setFullname(String fullname) {
            this.fullname = fullname;
            return this;
        }
        public String getFullname() {
            return this.fullname;
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ResetFabricOrganizationUserPasswordResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
