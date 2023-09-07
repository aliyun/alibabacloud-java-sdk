// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubAccountRequest extends TeaModel {
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
        @NameInMap("AccountNickname")
        public String accountNickname;

        @NameInMap("CreditLine")
        public String creditLine;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("EmailAddress")
        public String emailAddress;

        @NameInMap("NewBuyStatus")
        public String newBuyStatus;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SubAccountType")
        public String subAccountType;

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
