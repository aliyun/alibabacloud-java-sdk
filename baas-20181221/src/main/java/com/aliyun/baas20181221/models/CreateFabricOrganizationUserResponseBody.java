// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricOrganizationUserResponseBody extends TeaModel {
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
    public CreateFabricOrganizationUserResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
