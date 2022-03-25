// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListRolesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<UserListRolesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static UserListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserListRolesResponseBody self = new UserListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public UserListRolesResponseBody setData(java.util.List<UserListRolesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UserListRolesResponseBodyData> getData() {
        return this.data;
    }

    public UserListRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UserListRolesResponseBodyData extends TeaModel {
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

        public static UserListRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UserListRolesResponseBodyData self = new UserListRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UserListRolesResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UserListRolesResponseBodyData setCompanyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }
        public Long getCompanyId() {
            return this.companyId;
        }

        public UserListRolesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UserListRolesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UserListRolesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UserListRolesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UserListRolesResponseBodyData setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public UserListRolesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UserListRolesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
