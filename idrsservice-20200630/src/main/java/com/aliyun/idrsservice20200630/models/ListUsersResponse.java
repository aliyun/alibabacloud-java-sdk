// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListUsersResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListUsersResponseData data;

    public static ListUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponse self = new ListUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsersResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponse setData(ListUsersResponseData data) {
        this.data = data;
        return this;
    }
    public ListUsersResponseData getData() {
        return this.data;
    }

    public static class ListUsersResponseDataItemsDepartments extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("UpdatedAt")
        @Validation(required = true)
        public String updatedAt;

        public static ListUsersResponseDataItemsDepartments build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseDataItemsDepartments self = new ListUsersResponseDataItemsDepartments();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseDataItemsDepartments setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListUsersResponseDataItemsDepartments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUsersResponseDataItemsDepartments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUsersResponseDataItemsDepartments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUsersResponseDataItemsDepartments setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListUsersResponseDataItems extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("PhoneNumber")
        @Validation(required = true)
        public String phoneNumber;

        @NameInMap("RamUsername")
        @Validation(required = true)
        public String ramUsername;

        @NameInMap("Role")
        @Validation(required = true)
        public String role;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("UpdatedAt")
        @Validation(required = true)
        public String updatedAt;

        @NameInMap("Username")
        @Validation(required = true)
        public String username;

        @NameInMap("Departments")
        @Validation(required = true)
        public java.util.List<ListUsersResponseDataItemsDepartments> departments;

        public static ListUsersResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseDataItems self = new ListUsersResponseDataItems();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListUsersResponseDataItems setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUsersResponseDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUsersResponseDataItems setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListUsersResponseDataItems setRamUsername(String ramUsername) {
            this.ramUsername = ramUsername;
            return this;
        }
        public String getRamUsername() {
            return this.ramUsername;
        }

        public ListUsersResponseDataItems setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListUsersResponseDataItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListUsersResponseDataItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUsersResponseDataItems setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListUsersResponseDataItems setDepartments(java.util.List<ListUsersResponseDataItemsDepartments> departments) {
            this.departments = departments;
            return this;
        }
        public java.util.List<ListUsersResponseDataItemsDepartments> getDepartments() {
            return this.departments;
        }

    }

    public static class ListUsersResponseData extends TeaModel {
        @NameInMap("TotalElements")
        @Validation(required = true)
        public Long totalElements;

        @NameInMap("TotalPages")
        @Validation(required = true)
        public Integer totalPages;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<ListUsersResponseDataItems> items;

        public static ListUsersResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseData self = new ListUsersResponseData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListUsersResponseData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListUsersResponseData setItems(java.util.List<ListUsersResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListUsersResponseDataItems> getItems() {
            return this.items;
        }

    }

}
