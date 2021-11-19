// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RegisterSettleAccountRequest extends TeaModel {
    @NameInMap("AccountChannel")
    public String accountChannel;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountNo")
    public String accountNo;

    @NameInMap("AccountPayType")
    public String accountPayType;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExtInfo")
    public String extInfo;

    public static RegisterSettleAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterSettleAccountRequest self = new RegisterSettleAccountRequest();
        return TeaModel.build(map, self);
    }

    public RegisterSettleAccountRequest setAccountChannel(String accountChannel) {
        this.accountChannel = accountChannel;
        return this;
    }
    public String getAccountChannel() {
        return this.accountChannel;
    }

    public RegisterSettleAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public RegisterSettleAccountRequest setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public RegisterSettleAccountRequest setAccountPayType(String accountPayType) {
        this.accountPayType = accountPayType;
        return this;
    }
    public String getAccountPayType() {
        return this.accountPayType;
    }

    public RegisterSettleAccountRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public RegisterSettleAccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RegisterSettleAccountRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
