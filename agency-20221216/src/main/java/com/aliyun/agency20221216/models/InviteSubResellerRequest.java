// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubResellerRequest extends TeaModel {
    /**
     * <p>The list of account information for the invitation. A maximum of five accounts can be specified at a time.</p>
     */
    @NameInMap("AccountInfoList")
    public java.util.List<InviteSubResellerRequestAccountInfoList> accountInfoList;

    public static InviteSubResellerRequest build(java.util.Map<String, ?> map) throws Exception {
        InviteSubResellerRequest self = new InviteSubResellerRequest();
        return TeaModel.build(map, self);
    }

    public InviteSubResellerRequest setAccountInfoList(java.util.List<InviteSubResellerRequestAccountInfoList> accountInfoList) {
        this.accountInfoList = accountInfoList;
        return this;
    }
    public java.util.List<InviteSubResellerRequestAccountInfoList> getAccountInfoList() {
        return this.accountInfoList;
    }

    public static class InviteSubResellerRequestAccountInfoList extends TeaModel {
        /**
         * <p>The name of the distribution customer.</p>
         * <ul>
         * <li>If the distribution customer is an enterprise, this is the company name.</li>
         * <li>If the distribution customer is a T2 Reseller partner, this is the partner name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>XXX技术有限公司</p>
         */
        @NameInMap("AccountNickname")
        public String accountNickname;

        /**
         * <p>The total budget quota that the partner allocates to the distribution customer.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CreditLine")
        public String creditLine;

        /**
         * <p>The reason for applying for a cross-region association.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("CrossScopeRemark")
        public String crossScopeRemark;

        /**
         * <p>The customer account manager. The value can be up to 50 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("CustomerBd")
        public String customerBd;

        /**
         * <p>The email address to which the invitation email is sent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:nejatox206@getasail.com">nejatox206@getasail.com</a></p>
         */
        @NameInMap("EmailAddress")
        public String emailAddress;

        /**
         * <p>The initial order placement status. Valid values:</p>
         * <ul>
         * <li>ban: Purchase is prohibited. After the customer is registered and associated, the customer cannot place orders to purchase cloud resources immediately. You must set the order control to Normal before the customer can place orders.</li>
         * <li>normal: Normal. After the customer is registered and associated, the customer can place orders to purchase cloud resources immediately.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("NewBuyStatus")
        public String newBuyStatus;

        /**
         * <p>The country or region of the invited T2 Reseller. The value must comply with the ISO 3166-1 alpha-2 code. You can call the ListCountries operation to query the contract coverage area list of the current UID.</p>
         * <p>The system automatically determines whether the invitation is cross-region based on whether this parameter falls within the T1 contract coverage area.</p>
         * <ul>
         * <li>If the invitation is cross-region, a cross-region invitation approval process is initiated. After the approval is granted, an invitation registration email is sent to the specified email address.</li>
         * <li>If the invitation is not cross-region, an invitation registration email is sent directly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SG</p>
         */
        @NameInMap("RegisterNation")
        public String registerNation;

        /**
         * <p>The description of the distribution customer.</p>
         * 
         * <strong>example:</strong>
         * <p>发展xx为客户的邀请</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>This parameter is deprecated. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SubAccountType")
        public String subAccountType;

        /**
         * <p>The shutdown policy that the partner sets for the distribution customer.</p>
         * <ul>
         * <li>1: delayStop. The account uses the delayed shutdown quota for deferred instance shutdown. Alibaba Cloud takes over the resources. When the delayed shutdown quota is exhausted, instance shutdown is triggered. If the payment is not made within 15 days, storage resources are released.</li>
         * <li>2: noStop. Manual management with no shutdown on overdue payment. The system does not manage the resource lifecycle of the non-trusteeship linked account. The partner must manually manage the instance shutdown status of the customer.</li>
         * <li>3: immediatelyStop. Immediate shutdown on overdue payment. When the active quota of the customer account is less than 0, the account enters the overdue payment status and instance shutdown is triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ZeroCreditShutdownPolicy")
        public String zeroCreditShutdownPolicy;

        public static InviteSubResellerRequestAccountInfoList build(java.util.Map<String, ?> map) throws Exception {
            InviteSubResellerRequestAccountInfoList self = new InviteSubResellerRequestAccountInfoList();
            return TeaModel.build(map, self);
        }

        public InviteSubResellerRequestAccountInfoList setAccountNickname(String accountNickname) {
            this.accountNickname = accountNickname;
            return this;
        }
        public String getAccountNickname() {
            return this.accountNickname;
        }

        public InviteSubResellerRequestAccountInfoList setCreditLine(String creditLine) {
            this.creditLine = creditLine;
            return this;
        }
        public String getCreditLine() {
            return this.creditLine;
        }

        public InviteSubResellerRequestAccountInfoList setCrossScopeRemark(String crossScopeRemark) {
            this.crossScopeRemark = crossScopeRemark;
            return this;
        }
        public String getCrossScopeRemark() {
            return this.crossScopeRemark;
        }

        public InviteSubResellerRequestAccountInfoList setCustomerBd(String customerBd) {
            this.customerBd = customerBd;
            return this;
        }
        public String getCustomerBd() {
            return this.customerBd;
        }

        public InviteSubResellerRequestAccountInfoList setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public String getEmailAddress() {
            return this.emailAddress;
        }

        public InviteSubResellerRequestAccountInfoList setNewBuyStatus(String newBuyStatus) {
            this.newBuyStatus = newBuyStatus;
            return this;
        }
        public String getNewBuyStatus() {
            return this.newBuyStatus;
        }

        public InviteSubResellerRequestAccountInfoList setRegisterNation(String registerNation) {
            this.registerNation = registerNation;
            return this;
        }
        public String getRegisterNation() {
            return this.registerNation;
        }

        public InviteSubResellerRequestAccountInfoList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public InviteSubResellerRequestAccountInfoList setSubAccountType(String subAccountType) {
            this.subAccountType = subAccountType;
            return this;
        }
        public String getSubAccountType() {
            return this.subAccountType;
        }

        public InviteSubResellerRequestAccountInfoList setZeroCreditShutdownPolicy(String zeroCreditShutdownPolicy) {
            this.zeroCreditShutdownPolicy = zeroCreditShutdownPolicy;
            return this;
        }
        public String getZeroCreditShutdownPolicy() {
            return this.zeroCreditShutdownPolicy;
        }

    }

}
