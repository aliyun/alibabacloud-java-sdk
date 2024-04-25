// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetClientUserResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetClientUserResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetClientUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientUserResponseBody self = new GetClientUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientUserResponseBody setData(GetClientUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetClientUserResponseBodyData getData() {
        return this.data;
    }

    public GetClientUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClientUserResponseBodyDataDepartment extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetClientUserResponseBodyDataDepartment build(java.util.Map<String, ?> map) throws Exception {
            GetClientUserResponseBodyDataDepartment self = new GetClientUserResponseBodyDataDepartment();
            return TeaModel.build(map, self);
        }

        public GetClientUserResponseBodyDataDepartment setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetClientUserResponseBodyDataDepartment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetClientUserResponseBodyData extends TeaModel {
        @NameInMap("Department")
        public GetClientUserResponseBodyDataDepartment department;

        @NameInMap("DepartmentId")
        public String departmentId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Email")
        public String email;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdpConfigId")
        public String idpConfigId;

        @NameInMap("MobileNumber")
        public String mobileNumber;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Username")
        public String username;

        public static GetClientUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClientUserResponseBodyData self = new GetClientUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClientUserResponseBodyData setDepartment(GetClientUserResponseBodyDataDepartment department) {
            this.department = department;
            return this;
        }
        public GetClientUserResponseBodyDataDepartment getDepartment() {
            return this.department;
        }

        public GetClientUserResponseBodyData setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public GetClientUserResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetClientUserResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetClientUserResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetClientUserResponseBodyData setIdpConfigId(String idpConfigId) {
            this.idpConfigId = idpConfigId;
            return this;
        }
        public String getIdpConfigId() {
            return this.idpConfigId;
        }

        public GetClientUserResponseBodyData setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }
        public String getMobileNumber() {
            return this.mobileNumber;
        }

        public GetClientUserResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetClientUserResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetClientUserResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
