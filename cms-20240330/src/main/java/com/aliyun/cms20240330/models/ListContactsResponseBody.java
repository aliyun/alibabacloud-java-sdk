// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContactsResponseBody extends TeaModel {
    @NameInMap("contacts")
    public java.util.List<ListContactsResponseBodyContacts> contacts;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>56</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContactsResponseBody self = new ListContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContactsResponseBody setContacts(java.util.List<ListContactsResponseBodyContacts> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<ListContactsResponseBodyContacts> getContacts() {
        return this.contacts;
    }

    public ListContactsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListContactsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContactsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListContactsResponseBodyContacts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("contactId")
        public String contactId;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("emailVerify")
        public Boolean emailVerify;

        @NameInMap("groupList")
        public java.util.List<String> groupList;

        @NameInMap("imUserIds")
        public java.util.Map<String, String> imUserIds;

        /**
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        @NameInMap("lang")
        public String lang;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>130123456789</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("phoneVerify")
        public Boolean phoneVerify;

        /**
         * <strong>example:</strong>
         * <p>2024-10-22 02:21:51</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        @NameInMap("workspace")
        public String workspace;

        public static ListContactsResponseBodyContacts build(java.util.Map<String, ?> map) throws Exception {
            ListContactsResponseBodyContacts self = new ListContactsResponseBodyContacts();
            return TeaModel.build(map, self);
        }

        public ListContactsResponseBodyContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListContactsResponseBodyContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListContactsResponseBodyContacts setEmailVerify(Boolean emailVerify) {
            this.emailVerify = emailVerify;
            return this;
        }
        public Boolean getEmailVerify() {
            return this.emailVerify;
        }

        public ListContactsResponseBodyContacts setGroupList(java.util.List<String> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<String> getGroupList() {
            return this.groupList;
        }

        public ListContactsResponseBodyContacts setImUserIds(java.util.Map<String, String> imUserIds) {
            this.imUserIds = imUserIds;
            return this;
        }
        public java.util.Map<String, String> getImUserIds() {
            return this.imUserIds;
        }

        public ListContactsResponseBodyContacts setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListContactsResponseBodyContacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContactsResponseBodyContacts setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListContactsResponseBodyContacts setPhoneVerify(Boolean phoneVerify) {
            this.phoneVerify = phoneVerify;
            return this;
        }
        public Boolean getPhoneVerify() {
            return this.phoneVerify;
        }

        public ListContactsResponseBodyContacts setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListContactsResponseBodyContacts setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
