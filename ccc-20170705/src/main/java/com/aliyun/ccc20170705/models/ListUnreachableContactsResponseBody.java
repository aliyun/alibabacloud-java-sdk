// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListUnreachableContactsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("UnreachableContacts")
    public ListUnreachableContactsResponseBodyUnreachableContacts unreachableContacts;

    public static ListUnreachableContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnreachableContactsResponseBody self = new ListUnreachableContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnreachableContactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUnreachableContactsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUnreachableContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUnreachableContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUnreachableContactsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUnreachableContactsResponseBody setUnreachableContacts(ListUnreachableContactsResponseBodyUnreachableContacts unreachableContacts) {
        this.unreachableContacts = unreachableContacts;
        return this;
    }
    public ListUnreachableContactsResponseBodyUnreachableContacts getUnreachableContacts() {
        return this.unreachableContacts;
    }

    public static class ListUnreachableContactsResponseBodyUnreachableContactsListContacts extends TeaModel {
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("Role")
        public String role;

        @NameInMap("State")
        public String state;

        public static ListUnreachableContactsResponseBodyUnreachableContactsListContacts build(java.util.Map<String, ?> map) throws Exception {
            ListUnreachableContactsResponseBodyUnreachableContactsListContacts self = new ListUnreachableContactsResponseBodyUnreachableContactsListContacts();
            return TeaModel.build(map, self);
        }

        public ListUnreachableContactsResponseBodyUnreachableContactsListContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListUnreachableContactsResponseBodyUnreachableContactsListContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListUnreachableContactsResponseBodyUnreachableContactsListContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListUnreachableContactsResponseBodyUnreachableContactsListContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public ListUnreachableContactsResponseBodyUnreachableContactsListContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListUnreachableContactsResponseBodyUnreachableContactsListContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListUnreachableContactsResponseBodyUnreachableContactsList extends TeaModel {
        @NameInMap("Contacts")
        public java.util.List<ListUnreachableContactsResponseBodyUnreachableContactsListContacts> contacts;

        @NameInMap("TotalAttempts")
        public Integer totalAttempts;

        public static ListUnreachableContactsResponseBodyUnreachableContactsList build(java.util.Map<String, ?> map) throws Exception {
            ListUnreachableContactsResponseBodyUnreachableContactsList self = new ListUnreachableContactsResponseBodyUnreachableContactsList();
            return TeaModel.build(map, self);
        }

        public ListUnreachableContactsResponseBodyUnreachableContactsList setContacts(java.util.List<ListUnreachableContactsResponseBodyUnreachableContactsListContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<ListUnreachableContactsResponseBodyUnreachableContactsListContacts> getContacts() {
            return this.contacts;
        }

        public ListUnreachableContactsResponseBodyUnreachableContactsList setTotalAttempts(Integer totalAttempts) {
            this.totalAttempts = totalAttempts;
            return this;
        }
        public Integer getTotalAttempts() {
            return this.totalAttempts;
        }

    }

    public static class ListUnreachableContactsResponseBodyUnreachableContacts extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListUnreachableContactsResponseBodyUnreachableContactsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUnreachableContactsResponseBodyUnreachableContacts build(java.util.Map<String, ?> map) throws Exception {
            ListUnreachableContactsResponseBodyUnreachableContacts self = new ListUnreachableContactsResponseBodyUnreachableContacts();
            return TeaModel.build(map, self);
        }

        public ListUnreachableContactsResponseBodyUnreachableContacts setList(java.util.List<ListUnreachableContactsResponseBodyUnreachableContactsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListUnreachableContactsResponseBodyUnreachableContactsList> getList() {
            return this.list;
        }

        public ListUnreachableContactsResponseBodyUnreachableContacts setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUnreachableContactsResponseBodyUnreachableContacts setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUnreachableContactsResponseBodyUnreachableContacts setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
