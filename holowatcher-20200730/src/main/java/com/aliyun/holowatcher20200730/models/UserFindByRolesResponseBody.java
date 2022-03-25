// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserFindByRolesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<UserFindByRolesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static UserFindByRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserFindByRolesResponseBody self = new UserFindByRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public UserFindByRolesResponseBody setData(java.util.List<UserFindByRolesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UserFindByRolesResponseBodyData> getData() {
        return this.data;
    }

    public UserFindByRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UserFindByRolesResponseBodyData extends TeaModel {
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

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Status")
        public String status;

        public static UserFindByRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UserFindByRolesResponseBodyData self = new UserFindByRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UserFindByRolesResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UserFindByRolesResponseBodyData setExt1(String ext1) {
            this.ext1 = ext1;
            return this;
        }
        public String getExt1() {
            return this.ext1;
        }

        public UserFindByRolesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UserFindByRolesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UserFindByRolesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UserFindByRolesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UserFindByRolesResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public UserFindByRolesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
