// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetFabricOrganizationUserPasswordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ResetFabricOrganizationUserPasswordResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("Fullname")
        public String fullname;

        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa2-1eqnj5o5w****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>username</p>
         */
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
