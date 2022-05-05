// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactsResponseBody extends TeaModel {
    // 分页对象
    @NameInMap("PageBean")
    public DescribeContactsResponseBodyPageBean pageBean;

    // Id of the request
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
        // 告警联系人ID
        @NameInMap("ContactId")
        public Float contactId;

        // 告警联系人名称
        @NameInMap("ContactName")
        public String contactName;

        // 告警联系人邮箱
        @NameInMap("Email")
        public String email;

        // 手机号码是否验证标识
        @NameInMap("IsVerify")
        public Boolean isVerify;

        // 告警联系人手机号码
        @NameInMap("Phone")
        public String phone;

        public static DescribeContactsResponseBodyPageBeanAlertContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactsResponseBodyPageBeanAlertContacts self = new DescribeContactsResponseBodyPageBeanAlertContacts();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeContactsResponseBodyPageBean extends TeaModel {
        // 告警联系人列表
        @NameInMap("AlertContacts")
        public java.util.List<DescribeContactsResponseBodyPageBeanAlertContacts> alertContacts;

        // 页数
        @NameInMap("Page")
        public Long page;

        // 每一页大小
        @NameInMap("Size")
        public Long size;

        // 总数
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
