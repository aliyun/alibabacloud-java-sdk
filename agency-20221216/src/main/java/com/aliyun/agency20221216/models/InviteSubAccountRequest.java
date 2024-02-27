// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubAccountRequest extends TeaModel {
    /**
     * <p>List of invited account information,  less than 5 accounts at a time.</br></p>
     * <p>`Sub-levels <= 5`</p>
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
         * <p>1. Use the official name of Company, if Sub Account is an enterprise.</br></p>
         * <p>2. Use the official name of Partner, if Sub Account is a T2 reseller.</br></p>
         */
        @NameInMap("AccountNickname")
        public String accountNickname;

        /**
         * <p>The total budget Credit of Sub Account that distributed by Partner.</p>
         */
        @NameInMap("CreditLine")
        public String creditLine;

        /**
         * <p>Customer ID, Returning ID from CreateCustomer API.</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <p>The email address of End User,  which will receive the invitation email.</p>
         */
        @NameInMap("EmailAddress")
        public String emailAddress;

        /**
         * <p>Initial Order Status</br></p>
         * <p>1. ban：Ban the new purchase action--After End User finish registration and authorization, they can\"t issue Cloud Resource order immediately. Partner should manually update the "Order Control" settings as "Normal" to enable new order.</br></p>
         * <p>2. normal：Normal--After End User finished registration and authorization, they can issue Cloud Resource order immediately.</br></p>
         */
        @NameInMap("NewBuyStatus")
        public String newBuyStatus;

        /**
         * <p>Description of Sub Account.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The type of Sub Account</br></p>
         * <br>
         * <p>1 Agency\"s End User</br></p>
         * <p>2 Reseller\"s End user</br></p>
         * <p>5 Reseller\"s T2 Partner</br></p>
         */
        @NameInMap("SubAccountType")
        public String subAccountType;

        /**
         * <p>Partner\"s Shutdown Policy Management for Sub Account.</br></p>
         * <p>1: delayStop. The account have Shutdown-delay Privilege,  After Shutdown-delay Credit is ran out, Alibaba Cloud will take over resources and keep the instance for 15 days. In addition, the instance will be released if Sub Account failed to pay the bill within these 15 days.</br></p>
         * <p>2: noStop. Partner will manually manage Shutdown Status for Sub Account. Meanwhile, System would not manage the resource\"s life-circle of Sub Account.</br></p>
         * <p>3: immediatelyStop. Once valid quota of Sub Account falls below 0 and be identified as defaulting account, it will trigger the instance shutdown immediately.</br></p>
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
