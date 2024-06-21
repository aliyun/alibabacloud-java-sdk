// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactsResponseBody extends TeaModel {
    /**
     * <p>The objects that were returned.</p>
     */
    @NameInMap("PageBean")
    public DescribeContactsResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>21E85B16-75A6-429A-9F65-8AAC9A54****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactsResponseBody self = new DescribeContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContactsResponseBody setPageBean(DescribeContactsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public DescribeContactsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public DescribeContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContactsResponseBodyPageBeanAlertContacts extends TeaModel {
        /**
         * <p>The ID of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>100147</p>
         */
        @NameInMap("ArmsContactId")
        public Long armsContactId;

        /**
         * <p>The ID of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ContactId")
        public Float contactId;

        /**
         * <p>The name of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The email address of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the email address was verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsEmailVerify")
        public Boolean isEmailVerify;

        /**
         * <p>Indicates whether the mobile number was verified. Valid values:</p>
         * <ul>
         * <li><code>false</code>: no</li>
         * <li><code>true</code>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsVerify")
        public Boolean isVerify;

        /**
         * <p>The mobile number of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The operation that you want to perform if phone calls fail to be answered. Valid values:</p>
         * <ul>
         * <li>0: No operation is performed.</li>
         * <li>1: A phone call is made again.</li>
         * <li>2: A text message is sent.</li>
         * <li>3 (default value): The global default value is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReissueSendNotice")
        public Long reissueSendNotice;

        public static DescribeContactsResponseBodyPageBeanAlertContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactsResponseBodyPageBeanAlertContacts self = new DescribeContactsResponseBodyPageBeanAlertContacts();
            return TeaModel.build(map, self);
        }

        public DescribeContactsResponseBodyPageBeanAlertContacts setArmsContactId(Long armsContactId) {
            this.armsContactId = armsContactId;
            return this;
        }
        public Long getArmsContactId() {
            return this.armsContactId;
        }

        public DescribeContactsResponseBodyPageBeanAlertContacts setContactId(Float contactId) {
            this.contactId = contactId;
            return this;
        }
        public Float getContactId() {
            return this.contactId;
        }

        public DescribeContactsResponseBodyPageBeanAlertContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public DescribeContactsResponseBodyPageBeanAlertContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeContactsResponseBodyPageBeanAlertContacts setIsEmailVerify(Boolean isEmailVerify) {
            this.isEmailVerify = isEmailVerify;
            return this;
        }
        public Boolean getIsEmailVerify() {
            return this.isEmailVerify;
        }

        public DescribeContactsResponseBodyPageBeanAlertContacts setIsVerify(Boolean isVerify) {
            this.isVerify = isVerify;
            return this;
        }
        public Boolean getIsVerify() {
            return this.isVerify;
        }

        public DescribeContactsResponseBodyPageBeanAlertContacts setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeContactsResponseBodyPageBeanAlertContacts setReissueSendNotice(Long reissueSendNotice) {
            this.reissueSendNotice = reissueSendNotice;
            return this;
        }
        public Long getReissueSendNotice() {
            return this.reissueSendNotice;
        }

    }

    public static class DescribeContactsResponseBodyPageBean extends TeaModel {
        /**
         * <p>The alert contacts.</p>
         */
        @NameInMap("AlertContacts")
        public java.util.List<DescribeContactsResponseBodyPageBeanAlertContacts> alertContacts;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The number of alert contacts returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The total number of alert contacts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeContactsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactsResponseBodyPageBean self = new DescribeContactsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public DescribeContactsResponseBodyPageBean setAlertContacts(java.util.List<DescribeContactsResponseBodyPageBeanAlertContacts> alertContacts) {
            this.alertContacts = alertContacts;
            return this;
        }
        public java.util.List<DescribeContactsResponseBodyPageBeanAlertContacts> getAlertContacts() {
            return this.alertContacts;
        }

        public DescribeContactsResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public DescribeContactsResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeContactsResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
