// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubAccountRequest extends TeaModel {
    /**
     * <p>List of invited account information,  less than 5 accounts at a time.</br>
     * <code>Sub-levels &lt;= 5</code></p>
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
         * <p>The name of Sub Account:</br></p>
         * <ol>
         * <li>Use the official name of Company, if Sub Account is an enterprise.</br></li>
         * <li>Use the official name of Partner, if Sub Account is a T2 reseller.</br></li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX Technology LTD.</p>
         */
        @NameInMap("AccountNickname")
        public String accountNickname;

        /**
         * <p>The total budget Credit of Sub Account that distributed by Partner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CreditLine")
        public String creditLine;

        @NameInMap("CustomerBd")
        public String customerBd;

        /**
         * <p>Customer ID, Returning ID from CreateCustomer API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <p>The email address of End User,  which will receive the invitation email.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:12345@163.com">12345@163.com</a></p>
         */
        @NameInMap("EmailAddress")
        public String emailAddress;

        /**
         * <p>Initial Order Status</br></p>
         * <ol>
         * <li>ban：Ban the new purchase action--After End User finish registration and authorization, they can\&quot;t issue Cloud Resource order immediately. Partner should manually update the &quot;Order Control&quot; settings as &quot;Normal&quot; to enable new order.</br></li>
         * <li>normal：Normal--After End User finished registration and authorization, they can issue Cloud Resource order immediately.</br></li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ban</p>
         */
        @NameInMap("NewBuyStatus")
        public String newBuyStatus;

        /**
         * <p>Description of Sub Account.</p>
         * 
         * <strong>example:</strong>
         * <p>The invitation to develop XX as a Sub Account</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The type of Sub Account</br></p>
         * <p>1 Agency\&quot;s End User</br>
         * 2 Reseller\&quot;s End user</br>
         * 5 Reseller\&quot;s T2 Partner</br></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubAccountType")
        public String subAccountType;

        /**
         * <p>Partner\&quot;s Shutdown Policy Management for Sub Account.</br>
         * 1: delayStop. The account have Shutdown-delay Privilege,  After Shutdown-delay Credit is ran out, Alibaba Cloud will take over resources and keep the instance for 15 days. In addition, the instance will be released if Sub Account failed to pay the bill within these 15 days.</br>
         * 2: noStop. Partner will manually manage Shutdown Status for Sub Account. Meanwhile, System would not manage the resource\&quot;s life-circle of Sub Account.</br>
         * 3: immediatelyStop. Once valid quota of Sub Account falls below 0 and be identified as defaulting account, it will trigger the instance shutdown immediately.</br></p>
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
