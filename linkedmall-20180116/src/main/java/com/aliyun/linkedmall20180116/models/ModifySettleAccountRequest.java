// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifySettleAccountRequest extends TeaModel {
    @NameInMap("AccountChannel")
    public String accountChannel;

    @NameInMap("AccountId")
    public String accountId;

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

    @NameInMap("CountryOrAreaCode")
    public String countryOrAreaCode;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("IdempotentId")
    public String idempotentId;

    public static ModifySettleAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySettleAccountRequest self = new ModifySettleAccountRequest();
        return TeaModel.build(map, self);
    }

    public ModifySettleAccountRequest setAccountChannel(String accountChannel) {
        this.accountChannel = accountChannel;
        return this;
    }
    public String getAccountChannel() {
        return this.accountChannel;
    }

    public ModifySettleAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ModifySettleAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifySettleAccountRequest setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public ModifySettleAccountRequest setAccountPayType(String accountPayType) {
        this.accountPayType = accountPayType;
        return this;
    }
    public String getAccountPayType() {
        return this.accountPayType;
    }

    public ModifySettleAccountRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public ModifySettleAccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifySettleAccountRequest setCountryOrAreaCode(String countryOrAreaCode) {
        this.countryOrAreaCode = countryOrAreaCode;
        return this;
    }
    public String getCountryOrAreaCode() {
        return this.countryOrAreaCode;
    }

    public ModifySettleAccountRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ModifySettleAccountRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public ModifySettleAccountRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

}
