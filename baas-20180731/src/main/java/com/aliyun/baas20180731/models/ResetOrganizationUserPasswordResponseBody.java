// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetOrganizationUserPasswordResponseBody extends TeaModel {
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
    public ResetOrganizationUserPasswordResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ResetOrganizationUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetOrganizationUserPasswordResponseBody self = new ResetOrganizationUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetOrganizationUserPasswordResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ResetOrganizationUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetOrganizationUserPasswordResponseBody setResult(ResetOrganizationUserPasswordResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ResetOrganizationUserPasswordResponseBodyResult getResult() {
        return this.result;
    }

    public ResetOrganizationUserPasswordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResetOrganizationUserPasswordResponseBodyResult extends TeaModel {
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

        public static ResetOrganizationUserPasswordResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ResetOrganizationUserPasswordResponseBodyResult self = new ResetOrganizationUserPasswordResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ResetOrganizationUserPasswordResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ResetOrganizationUserPasswordResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ResetOrganizationUserPasswordResponseBodyResult setFullname(String fullname) {
            this.fullname = fullname;
            return this;
        }
        public String getFullname() {
            return this.fullname;
        }

        public ResetOrganizationUserPasswordResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ResetOrganizationUserPasswordResponseBodyResult setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ResetOrganizationUserPasswordResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
