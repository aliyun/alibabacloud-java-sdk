// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListContactResponseBody extends TeaModel {
    @NameInMap("ContactList")
    public java.util.List<ListContactResponseBodyContactList> contactList;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Integer showSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContactResponseBody self = new ListContactResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContactResponseBody setContactList(java.util.List<ListContactResponseBodyContactList> contactList) {
        this.contactList = contactList;
        return this;
    }
    public java.util.List<ListContactResponseBodyContactList> getContactList() {
        return this.contactList;
    }

    public ListContactResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListContactResponseBody setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContactResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListContactResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListContactResponseBodyContactList extends TeaModel {
        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmailStatus")
        public Integer emailStatus;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("MobileStatus")
        public Integer mobileStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("Webhooks")
        public String webhooks;

        public static ListContactResponseBodyContactList build(java.util.Map<String, ?> map) throws Exception {
            ListContactResponseBodyContactList self = new ListContactResponseBodyContactList();
            return TeaModel.build(map, self);
        }

        public ListContactResponseBodyContactList setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ListContactResponseBodyContactList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListContactResponseBodyContactList setEmailStatus(Integer emailStatus) {
            this.emailStatus = emailStatus;
            return this;
        }
        public Integer getEmailStatus() {
            return this.emailStatus;
        }

        public ListContactResponseBodyContactList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListContactResponseBodyContactList setMobileStatus(Integer mobileStatus) {
            this.mobileStatus = mobileStatus;
            return this;
        }
        public Integer getMobileStatus() {
            return this.mobileStatus;
        }

        public ListContactResponseBodyContactList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContactResponseBodyContactList setWebhooks(String webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public String getWebhooks() {
            return this.webhooks;
        }

    }

}
