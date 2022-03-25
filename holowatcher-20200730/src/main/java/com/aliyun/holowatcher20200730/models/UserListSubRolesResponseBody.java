// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListSubRolesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<UserListSubRolesResponseBodyData> data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UserListSubRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserListSubRolesResponseBody self = new UserListSubRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public UserListSubRolesResponseBody setData(java.util.List<UserListSubRolesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UserListSubRolesResponseBodyData> getData() {
        return this.data;
    }

    public UserListSubRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UserListSubRolesResponseBodyData extends TeaModel {
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

        public static UserListSubRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UserListSubRolesResponseBodyData self = new UserListSubRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UserListSubRolesResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UserListSubRolesResponseBodyData setCompanyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }
        public Long getCompanyId() {
            return this.companyId;
        }

        public UserListSubRolesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UserListSubRolesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UserListSubRolesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UserListSubRolesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UserListSubRolesResponseBodyData setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public UserListSubRolesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UserListSubRolesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
