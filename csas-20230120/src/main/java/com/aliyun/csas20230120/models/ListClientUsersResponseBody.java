// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListClientUsersResponseBody extends TeaModel {
    /**
     * <p>User information.</p>
     */
    @NameInMap("Data")
    public ListClientUsersResponseBodyData data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FEF1144C-95D1-5F7C-81EF-9DB70EA49FCE</p>
     */
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
        /**
         * <p>Department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>105</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Department name.</p>
         * 
         * <strong>example:</strong>
         * <p>示例部门</p>
         */
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
        /**
         * <p>Department to which the user belongs.</p>
         */
        @NameInMap("Department")
        public ListClientUsersResponseBodyDataDataListDepartment department;

        /**
         * <p>Department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10800</p>
         */
        @NameInMap("DepartmentId")
        public String departmentId;

        /**
         * <p>User description.</p>
         * 
         * <strong>example:</strong>
         * <p>示例用户</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:johndoe@example.com">johndoe@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1970</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Custom identity source configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1026</p>
         */
        @NameInMap("IdpConfigId")
        public String idpConfigId;

        /**
         * <p>Mobile phone number without country code.</p>
         * 
         * <strong>example:</strong>
         * <p>15800820468</p>
         */
        @NameInMap("MobileNumber")
        public String mobileNumber;

        /**
         * <p>User enable status. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Unique user identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>su_dead7216****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Username.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
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
        /**
         * <p>List of user information.</p>
         */
        @NameInMap("DataList")
        public java.util.List<ListClientUsersResponseBodyDataDataList> dataList;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
