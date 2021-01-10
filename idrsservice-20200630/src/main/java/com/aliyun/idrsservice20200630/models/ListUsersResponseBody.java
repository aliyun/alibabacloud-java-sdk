// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListUsersResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setData(ListUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUsersResponseBodyData getData() {
        return this.data;
    }

    public ListUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListUsersResponseBodyDataItemsDepartments extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListUsersResponseBodyDataItemsDepartments build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyDataItemsDepartments self = new ListUsersResponseBodyDataItemsDepartments();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyDataItemsDepartments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUsersResponseBodyDataItemsDepartments setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListUsersResponseBodyDataItemsDepartments setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUsersResponseBodyDataItemsDepartments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUsersResponseBodyDataItemsDepartments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListUsersResponseBodyDataItems extends TeaModel {
        @NameInMap("RamUsername")
        public String ramUsername;

        @NameInMap("Email")
        public String email;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("Departments")
        public java.util.List<ListUsersResponseBodyDataItemsDepartments> departments;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Source")
        public String source;

        @NameInMap("Role")
        public String role;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("Username")
        public String username;

        public static ListUsersResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyDataItems self = new ListUsersResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyDataItems setRamUsername(String ramUsername) {
            this.ramUsername = ramUsername;
            return this;
        }
        public String getRamUsername() {
            return this.ramUsername;
        }

        public ListUsersResponseBodyDataItems setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyDataItems setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListUsersResponseBodyDataItems setDepartments(java.util.List<ListUsersResponseBodyDataItemsDepartments> departments) {
            this.departments = departments;
            return this;
        }
        public java.util.List<ListUsersResponseBodyDataItemsDepartments> getDepartments() {
            return this.departments;
        }

        public ListUsersResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListUsersResponseBodyDataItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUsersResponseBodyDataItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListUsersResponseBodyDataItems setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListUsersResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUsersResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUsersResponseBodyDataItems setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListUsersResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListUsersResponseBodyDataItems> items;

        @NameInMap("TotalPages")
        public Integer totalPages;

        @NameInMap("TotalElements")
        public Long totalElements;

        public static ListUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyData self = new ListUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyData setItems(java.util.List<ListUsersResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListUsersResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListUsersResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListUsersResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

    }

}
