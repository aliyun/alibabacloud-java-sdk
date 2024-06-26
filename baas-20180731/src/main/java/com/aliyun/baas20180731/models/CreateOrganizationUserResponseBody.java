// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateOrganizationUserResponseBody extends TeaModel {
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
    public CreateOrganizationUserResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOrganizationUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationUserResponseBody self = new CreateOrganizationUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrganizationUserResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateOrganizationUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrganizationUserResponseBody setResult(CreateOrganizationUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateOrganizationUserResponseBodyResult getResult() {
        return this.result;
    }

    public CreateOrganizationUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOrganizationUserResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1544086901984</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>fullname</p>
         */
        @NameInMap("Fullname")
        public String fullname;

        /**
         * <strong>example:</strong>
         * <p>peers-yidio-1tuigx42b****</p>
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

        public static CreateOrganizationUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateOrganizationUserResponseBodyResult self = new CreateOrganizationUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateOrganizationUserResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateOrganizationUserResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateOrganizationUserResponseBodyResult setFullname(String fullname) {
            this.fullname = fullname;
            return this;
        }
        public String getFullname() {
            return this.fullname;
        }

        public CreateOrganizationUserResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public CreateOrganizationUserResponseBodyResult setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateOrganizationUserResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
