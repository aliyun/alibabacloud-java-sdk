// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactResponseBody extends TeaModel {
    @NameInMap("PageBean")
    public SearchAlertContactResponseBodyPageBean pageBean;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactResponseBody self = new SearchAlertContactResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAlertContactResponseBody setPageBean(SearchAlertContactResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchAlertContactResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchAlertContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchAlertContactResponseBodyPageBeanContacts extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("DingRobot")
        public String dingRobot;

        @NameInMap("Webhook")
        public String webhook;

        @NameInMap("Email")
        public String email;

        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("SystemNoc")
        public Boolean systemNoc;

        @NameInMap("Phone")
        public String phone;

        public static SearchAlertContactResponseBodyPageBeanContacts build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertContactResponseBodyPageBeanContacts self = new SearchAlertContactResponseBodyPageBeanContacts();
            return TeaModel.build(map, self);
        }

        public SearchAlertContactResponseBodyPageBeanContacts setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setDingRobot(String dingRobot) {
            this.dingRobot = dingRobot;
            return this;
        }
        public String getDingRobot() {
            return this.dingRobot;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setSystemNoc(Boolean systemNoc) {
            this.systemNoc = systemNoc;
            return this;
        }
        public Boolean getSystemNoc() {
            return this.systemNoc;
        }

        public SearchAlertContactResponseBodyPageBeanContacts setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class SearchAlertContactResponseBodyPageBean extends TeaModel {
        @NameInMap("Contacts")
        public java.util.List<SearchAlertContactResponseBodyPageBeanContacts> contacts;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchAlertContactResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertContactResponseBodyPageBean self = new SearchAlertContactResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchAlertContactResponseBodyPageBean setContacts(java.util.List<SearchAlertContactResponseBodyPageBeanContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<SearchAlertContactResponseBodyPageBeanContacts> getContacts() {
            return this.contacts;
        }

        public SearchAlertContactResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchAlertContactResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchAlertContactResponseBodyPageBean setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
