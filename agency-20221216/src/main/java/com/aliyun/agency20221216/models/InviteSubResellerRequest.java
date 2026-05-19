// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubResellerRequest extends TeaModel {
    /**
     * <p>List of invited account information, up to 5 at a time.</p>
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
         * <p>Name of the distribution customer:</p>
         * <ul>
         * <li>If the distribution customer is a company, this is the company name.</li>
         * <li>If the distribution customer is a T2 reseller partner, this is the partner name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>XXX技术有限公司</p>
         */
        @NameInMap("AccountNickname")
        public String accountNickname;

        /**
         * <p>Total budget quota allocated by the partner to the distribution customer (quota).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CreditLine")
        public String creditLine;

        /**
         * <p>Reason for applying for cross-regional association.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("CrossScopeRemark")
        public String crossScopeRemark;

        /**
         * <p>Customer Business Manager (limited to 50 characters).</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("CustomerBd")
        public String customerBd;

        /**
         * <p>The email address to which the invitation email will be sent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:nejatox206@getasail.com">nejatox206@getasail.com</a></p>
         */
        @NameInMap("EmailAddress")
        public String emailAddress;

        /**
         * <p>Initial order status:</p>
         * <ul>
         * <li>ban: Purchase Ban - The customer cannot place orders immediately after successful registration and association. The \&quot;Order Control\&quot; must be set to \&quot;Normal\&quot; before placing orders.</li>
         * <li>normal: Normal - The customer can place orders immediately after successful registration and association.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("NewBuyStatus")
        public String newBuyStatus;

        /**
         * <p>Country or region of the invited T2 Reseller. The parameter should comply with the ISO 3166-1 two-letter code (Alpha-2). You can use the ListCountries API to get the current UID contract coverage area list.</p>
         * <p>The system will automatically determine if the invitation is cross-regional based on whether the <code>registerNation</code> parameter is within the T1 contract coverage area:</p>
         * <ul>
         * <li>If it\&quot;s a cross-regional invitation, a cross-regional approval process will be initiated. After approval by Alibaba Cloud, an invitation registration email will be sent to the invited email address.</li>
         * <li>If it\&quot;s not a cross-regional invitation, an invitation registration email will be sent directly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SG</p>
         */
        @NameInMap("RegisterNation")
        public String registerNation;

        /**
         * <p>Description of the distribution customer.</p>
         * 
         * <strong>example:</strong>
         * <p>发展xx为客户的邀请</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Do not fill in, deprecated parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SubAccountType")
        public String subAccountType;

        /**
         * <p>Management of the shutdown policy for the distribution customer by the partner.</p>
         * <ul>
         * <li>1: delayStop - Enjoy delayed shutdown with a grace period: Alibaba Cloud takes over the resources, and when the grace period quota is exhausted, the instance will be shut down. If payment is not made within 15 days, the storage resources will be released.</li>
         * <li>2: noStop - Manual management of overdue without stopping: The system does not manage the lifecycle of the sub-account\&quot;s resources. The partner needs to manually manage the shutdown status of the customer\&quot;s instances.</li>
         * <li>3: immediatelyStop - Immediate shutdown upon overdue: When the available quota of the customer\&quot;s account is less than 0, the account enters an overdue state, triggering the shutdown of the instance.</li>
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
