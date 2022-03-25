// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserGetOneResponseBody extends TeaModel {
    @NameInMap("AliyunAccount")
    public String aliyunAccount;

    @NameInMap("AliyunUid")
    public String aliyunUid;

    @NameInMap("AliyunUidType")
    public String aliyunUidType;

    @NameInMap("CompanyId")
    public Long companyId;

    @NameInMap("CompanyName")
    public String companyName;

    @NameInMap("Email")
    public String email;

    @NameInMap("Ext1")
    public String ext1;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentUid")
    public String parentUid;

    @NameInMap("Phone")
    public String phone;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Roles")
    public java.util.List<UserGetOneResponseBodyRoles> roles;

    @NameInMap("Status")
    public String status;

    public static UserGetOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserGetOneResponseBody self = new UserGetOneResponseBody();
        return TeaModel.build(map, self);
    }

    public UserGetOneResponseBody setAliyunAccount(String aliyunAccount) {
        this.aliyunAccount = aliyunAccount;
        return this;
    }
    public String getAliyunAccount() {
        return this.aliyunAccount;
    }

    public UserGetOneResponseBody setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public UserGetOneResponseBody setAliyunUidType(String aliyunUidType) {
        this.aliyunUidType = aliyunUidType;
        return this;
    }
    public String getAliyunUidType() {
        return this.aliyunUidType;
    }

    public UserGetOneResponseBody setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public UserGetOneResponseBody setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public UserGetOneResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UserGetOneResponseBody setExt1(String ext1) {
        this.ext1 = ext1;
        return this;
    }
    public String getExt1() {
        return this.ext1;
    }

    public UserGetOneResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UserGetOneResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UserGetOneResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UserGetOneResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UserGetOneResponseBody setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public UserGetOneResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UserGetOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UserGetOneResponseBody setRoles(java.util.List<UserGetOneResponseBodyRoles> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<UserGetOneResponseBodyRoles> getRoles() {
        return this.roles;
    }

    public UserGetOneResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class UserGetOneResponseBodyRoles extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CompanyId")
        public Long companyId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static UserGetOneResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            UserGetOneResponseBodyRoles self = new UserGetOneResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public UserGetOneResponseBodyRoles setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UserGetOneResponseBodyRoles setCompanyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }
        public Long getCompanyId() {
            return this.companyId;
        }

        public UserGetOneResponseBodyRoles setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UserGetOneResponseBodyRoles setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UserGetOneResponseBodyRoles setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UserGetOneResponseBodyRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UserGetOneResponseBodyRoles setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public UserGetOneResponseBodyRoles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UserGetOneResponseBodyRoles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
