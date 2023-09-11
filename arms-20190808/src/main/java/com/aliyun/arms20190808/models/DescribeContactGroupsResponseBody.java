// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactGroupsResponseBody extends TeaModel {
    /**
     * <p>The objects that were returned.</p>
     */
    @NameInMap("PageBean")
    public DescribeContactGroupsResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the alert contact.</p>
         */
        @NameInMap("ArmsContactId")
        public Long armsContactId;

        /**
         * <p>The ID of the alert contact.</p>
         */
        @NameInMap("ContactId")
        public Float contactId;

        /**
         * <p>The name of the alert contact.</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The email address of the alert contact.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The mobile number of the alert contact.</p>
         */
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
        /**
         * <p>The ID of the alert contact group.</p>
         */
        @NameInMap("ArmsContactGroupId")
        public Long armsContactGroupId;

        /**
         * <p>The ID of the alert contact group.</p>
         */
        @NameInMap("ContactGroupId")
        public Float contactGroupId;

        /**
         * <p>The name of the alert contact group.</p>
         */
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        /**
         * <p>The contact information. If the **IsDetail** parameter is set to `false`, no **contact** information is displayed.</p>
         */
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
        /**
         * <p>The name of the alert contact group.</p>
         */
        @NameInMap("AlertContactGroups")
        public java.util.List<DescribeContactGroupsResponseBodyPageBeanAlertContactGroups> alertContactGroups;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The number of alert contact groups displayed on each page.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The total number of alert contact groups.</p>
         */
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
