// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetCurrentUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

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

    @NameInMap("Menus")
    public java.util.List<GetCurrentUserResponseBodyMenus> menus;

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("Phone")
    public String phone;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Roles")
    public java.util.List<GetCurrentUserResponseBodyRoles> roles;

    @NameInMap("Status")
    public String status;

    public static GetCurrentUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentUserResponseBody self = new GetCurrentUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCurrentUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCurrentUserResponseBody setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public GetCurrentUserResponseBody setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public GetCurrentUserResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetCurrentUserResponseBody setExt1(String ext1) {
        this.ext1 = ext1;
        return this;
    }
    public String getExt1() {
        return this.ext1;
    }

    public GetCurrentUserResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetCurrentUserResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetCurrentUserResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetCurrentUserResponseBody setMenus(java.util.List<GetCurrentUserResponseBodyMenus> menus) {
        this.menus = menus;
        return this;
    }
    public java.util.List<GetCurrentUserResponseBodyMenus> getMenus() {
        return this.menus;
    }

    public GetCurrentUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCurrentUserResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetCurrentUserResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetCurrentUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCurrentUserResponseBody setRoles(java.util.List<GetCurrentUserResponseBodyRoles> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<GetCurrentUserResponseBodyRoles> getRoles() {
        return this.roles;
    }

    public GetCurrentUserResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetCurrentUserResponseBodyMenus extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Url")
        public String url;

        public static GetCurrentUserResponseBodyMenus build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentUserResponseBodyMenus self = new GetCurrentUserResponseBodyMenus();
            return TeaModel.build(map, self);
        }

        public GetCurrentUserResponseBodyMenus setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCurrentUserResponseBodyMenus setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCurrentUserResponseBodyMenus setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCurrentUserResponseBodyMenus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCurrentUserResponseBodyMenus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCurrentUserResponseBodyMenus setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetCurrentUserResponseBodyRoles extends TeaModel {
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

        public static GetCurrentUserResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentUserResponseBodyRoles self = new GetCurrentUserResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public GetCurrentUserResponseBodyRoles setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCurrentUserResponseBodyRoles setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCurrentUserResponseBodyRoles setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCurrentUserResponseBodyRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCurrentUserResponseBodyRoles setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetCurrentUserResponseBodyRoles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCurrentUserResponseBodyRoles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
