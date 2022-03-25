// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListPermissionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<UserListPermissionsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static UserListPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserListPermissionsResponseBody self = new UserListPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public UserListPermissionsResponseBody setData(java.util.List<UserListPermissionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UserListPermissionsResponseBodyData> getData() {
        return this.data;
    }

    public UserListPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UserListPermissionsResponseBodyData extends TeaModel {
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

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static UserListPermissionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UserListPermissionsResponseBodyData self = new UserListPermissionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UserListPermissionsResponseBodyData setCompanyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }
        public Long getCompanyId() {
            return this.companyId;
        }

        public UserListPermissionsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UserListPermissionsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UserListPermissionsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UserListPermissionsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UserListPermissionsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UserListPermissionsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
