// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubAccountRequest extends TeaModel {
    /**
     * <p>The list of account information for the invitation. A maximum of five accounts can be invited at a time.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountInfoList")
    public java.util.List<InviteSubAccountRequestAccountInfoList> accountInfoList;

    public static InviteSubAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        InviteSubAccountRequest self = new InviteSubAccountRequest();
        return TeaModel.build(map, self);
    }

    public InviteSubAccountRequest setAccountInfoList(java.util.List<InviteSubAccountRequestAccountInfoList> accountInfoList) {
        this.accountInfoList = accountInfoList;
        return this;
    }
    public java.util.List<InviteSubAccountRequestAccountInfoList> getAccountInfoList() {
        return this.accountInfoList;
    }

    public static class InviteSubAccountRequestAccountInfoList extends TeaModel {
        /**
         * <p>The name of the distribution customer. Valid values:</p>
         * <ul>
         * <li>If the distribution customer is an enterprise, this is the company name.</li>
         * <li>If the distribution customer is a T2 reseller partner, this is the partner name.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX技术有限公司</p>
         */
        @NameInMap("AccountNickname")
        public String accountNickname;

        /**
         * <p>The total budget quota that the partner allocates to the distribution customer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CreditLine")
        public String creditLine;

        /**
         * <p>The account manager of the customer. Maximum length: 50 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("CustomerBd")
        public String customerBd;

        /**
         * <p>The customer ID returned by the CreateCustomer API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <p>The email address of the distribution customer account. The invitation email is sent to this address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:12345@163.com">12345@163.com</a></p>
         */
        @NameInMap("EmailAddress")
        public String emailAddress;

        /**
         * <p>The initial order placement status. Valid values:</p>
         * <ul>
         * <li>ban: Purchase is prohibited. After the customer is registered and associated, the customer cannot immediately place orders to purchase cloud resources. You must set the order control to normal before the customer can place orders.</li>
         * <li>normal: Normal. After the customer is registered and associated, the customer can immediately place orders to purchase cloud resources.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ban</p>
         */
        @NameInMap("NewBuyStatus")
        public String newBuyStatus;

        /**
         * <p>The description of the distribution customer.</p>
         * 
         * <strong>example:</strong>
         * <p>发展xx为客户的邀请</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The type of the sub-account. Valid values:</p>
         * <ul>
         * <li>1: end user of Agency.</li>
         * <li>2: end user of Reseller. </li>
         * <li>5: T2 partner of Reseller.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubAccountType")
        public String subAccountType;

        /**
         * <p>The shutdown policy that the partner manages for the distribution customer. Valid values:</p>
         * <ul>
         * <li>1: delayStop. Alibaba Cloud takes over the resources and the customer enjoys a delayed shutdown quota. When the delayed shutdown quota is exhausted, instance shutdown is triggered. If payment is not made within 15 days, storage resources are released.</li>
         * <li>2: noStop. Manual management with no shutdown on overdue payment. The system does not manage the resource lifecycle of the non-trusteeship linked account. The partner must manually manage the instance shutdown status of the customer.</li>
         * <li>3: immediatelyStop. Instances are immediately shut down on overdue payment. When the available quota of the customer account is less than 0, the account enters the overdue payment status and instance shutdown is triggered.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ZeroCreditShutdownPolicy")
        public String zeroCreditShutdownPolicy;

        public static InviteSubAccountRequestAccountInfoList build(java.util.Map<String, ?> map) throws Exception {
            InviteSubAccountRequestAccountInfoList self = new InviteSubAccountRequestAccountInfoList();
            return TeaModel.build(map, self);
        }

        public InviteSubAccountRequestAccountInfoList setAccountNickname(String accountNickname) {
            this.accountNickname = accountNickname;
            return this;
        }
        public String getAccountNickname() {
            return this.accountNickname;
        }

        public InviteSubAccountRequestAccountInfoList setCreditLine(String creditLine) {
            this.creditLine = creditLine;
            return this;
        }
        public String getCreditLine() {
            return this.creditLine;
        }

        public InviteSubAccountRequestAccountInfoList setCustomerBd(String customerBd) {
            this.customerBd = customerBd;
            return this;
        }
        public String getCustomerBd() {
            return this.customerBd;
        }

        public InviteSubAccountRequestAccountInfoList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public InviteSubAccountRequestAccountInfoList setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public String getEmailAddress() {
            return this.emailAddress;
        }

        public InviteSubAccountRequestAccountInfoList setNewBuyStatus(String newBuyStatus) {
            this.newBuyStatus = newBuyStatus;
            return this;
        }
        public String getNewBuyStatus() {
            return this.newBuyStatus;
        }

        public InviteSubAccountRequestAccountInfoList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public InviteSubAccountRequestAccountInfoList setSubAccountType(String subAccountType) {
            this.subAccountType = subAccountType;
            return this;
        }
        public String getSubAccountType() {
            return this.subAccountType;
        }

        public InviteSubAccountRequestAccountInfoList setZeroCreditShutdownPolicy(String zeroCreditShutdownPolicy) {
            this.zeroCreditShutdownPolicy = zeroCreditShutdownPolicy;
            return this;
        }
        public String getZeroCreditShutdownPolicy() {
            return this.zeroCreditShutdownPolicy;
        }

    }

}
