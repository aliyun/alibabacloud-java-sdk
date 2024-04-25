// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListClientUsersResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListClientUsersResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClientUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientUsersResponseBody self = new ListClientUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientUsersResponseBody setData(ListClientUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListClientUsersResponseBodyData getData() {
        return this.data;
    }

    public ListClientUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClientUsersResponseBodyDataDataListDepartment extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListClientUsersResponseBodyDataDataListDepartment build(java.util.Map<String, ?> map) throws Exception {
            ListClientUsersResponseBodyDataDataListDepartment self = new ListClientUsersResponseBodyDataDataListDepartment();
            return TeaModel.build(map, self);
        }

        public ListClientUsersResponseBodyDataDataListDepartment setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClientUsersResponseBodyDataDataListDepartment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListClientUsersResponseBodyDataDataList extends TeaModel {
        @NameInMap("Department")
        public ListClientUsersResponseBodyDataDataListDepartment department;

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

        public static ListClientUsersResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            ListClientUsersResponseBodyDataDataList self = new ListClientUsersResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public ListClientUsersResponseBodyDataDataList setDepartment(ListClientUsersResponseBodyDataDataListDepartment department) {
            this.department = department;
            return this;
        }
        public ListClientUsersResponseBodyDataDataListDepartment getDepartment() {
            return this.department;
        }

        public ListClientUsersResponseBodyDataDataList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public ListClientUsersResponseBodyDataDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClientUsersResponseBodyDataDataList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListClientUsersResponseBodyDataDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClientUsersResponseBodyDataDataList setIdpConfigId(String idpConfigId) {
            this.idpConfigId = idpConfigId;
            return this;
        }
        public String getIdpConfigId() {
            return this.idpConfigId;
        }

        public ListClientUsersResponseBodyDataDataList setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }
        public String getMobileNumber() {
            return this.mobileNumber;
        }

        public ListClientUsersResponseBodyDataDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClientUsersResponseBodyDataDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListClientUsersResponseBodyDataDataList setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListClientUsersResponseBodyData extends TeaModel {
        @NameInMap("DataList")
        public java.util.List<ListClientUsersResponseBodyDataDataList> dataList;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static ListClientUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClientUsersResponseBodyData self = new ListClientUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClientUsersResponseBodyData setDataList(java.util.List<ListClientUsersResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ListClientUsersResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

        public ListClientUsersResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
