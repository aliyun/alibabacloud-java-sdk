// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactGroupsResponseBody extends TeaModel {
    // Paging object.
    @NameInMap("PageBean")
    public DescribeContactGroupsResponseBodyPageBean pageBean;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContactGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactGroupsResponseBody self = new DescribeContactGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContactGroupsResponseBody setPageBean(DescribeContactGroupsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public DescribeContactGroupsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public DescribeContactGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts extends TeaModel {
        @NameInMap("ArmsContactId")
        public Long armsContactId;

        // The ID of the alert contact.
        @NameInMap("ContactId")
        public Float contactId;

        // The name of the contact.
        @NameInMap("ContactName")
        public String contactName;

        // The email address of the alert contact.
        @NameInMap("Email")
        public String email;

        // The mobile number of the alert contact.
        @NameInMap("Phone")
        public String phone;

        public static DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts self = new DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts();
            return TeaModel.build(map, self);
        }

        public DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts setArmsContactId(Long armsContactId) {
            this.armsContactId = armsContactId;
            return this;
        }
        public Long getArmsContactId() {
            return this.armsContactId;
        }

        public DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts setContactId(Float contactId) {
            this.contactId = contactId;
            return this;
        }
        public Float getContactId() {
            return this.contactId;
        }

        public DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class DescribeContactGroupsResponseBodyPageBeanAlertContactGroups extends TeaModel {
        @NameInMap("ArmsContactGroupId")
        public Long armsContactGroupId;

        // The ID of the alert contact group.
        @NameInMap("ContactGroupId")
        public Float contactGroupId;

        // The name of the alert contact group.
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        // The contact information. No **Contacts** is displayed when the **IsDetail** is set to `false`.
        @NameInMap("Contacts")
        public java.util.List<DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts> contacts;

        public static DescribeContactGroupsResponseBodyPageBeanAlertContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupsResponseBodyPageBeanAlertContactGroups self = new DescribeContactGroupsResponseBodyPageBeanAlertContactGroups();
            return TeaModel.build(map, self);
        }

        public DescribeContactGroupsResponseBodyPageBeanAlertContactGroups setArmsContactGroupId(Long armsContactGroupId) {
            this.armsContactGroupId = armsContactGroupId;
            return this;
        }
        public Long getArmsContactGroupId() {
            return this.armsContactGroupId;
        }

        public DescribeContactGroupsResponseBodyPageBeanAlertContactGroups setContactGroupId(Float contactGroupId) {
            this.contactGroupId = contactGroupId;
            return this;
        }
        public Float getContactGroupId() {
            return this.contactGroupId;
        }

        public DescribeContactGroupsResponseBodyPageBeanAlertContactGroups setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public DescribeContactGroupsResponseBodyPageBeanAlertContactGroups setContacts(java.util.List<DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<DescribeContactGroupsResponseBodyPageBeanAlertContactGroupsContacts> getContacts() {
            return this.contacts;
        }

    }

    public static class DescribeContactGroupsResponseBodyPageBean extends TeaModel {
        // The list of alert contact groups.
        @NameInMap("AlertContactGroups")
        public java.util.List<DescribeContactGroupsResponseBodyPageBeanAlertContactGroups> alertContactGroups;

        // The number of pages to query.
        @NameInMap("Page")
        public Long page;

        // The number of contact groups on each page.
        @NameInMap("Size")
        public Long size;

        // The total number of contact groups queried.
        @NameInMap("Total")
        public Long total;

        public static DescribeContactGroupsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupsResponseBodyPageBean self = new DescribeContactGroupsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public DescribeContactGroupsResponseBodyPageBean setAlertContactGroups(java.util.List<DescribeContactGroupsResponseBodyPageBeanAlertContactGroups> alertContactGroups) {
            this.alertContactGroups = alertContactGroups;
            return this;
        }
        public java.util.List<DescribeContactGroupsResponseBodyPageBeanAlertContactGroups> getAlertContactGroups() {
            return this.alertContactGroups;
        }

        public DescribeContactGroupsResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public DescribeContactGroupsResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeContactGroupsResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
