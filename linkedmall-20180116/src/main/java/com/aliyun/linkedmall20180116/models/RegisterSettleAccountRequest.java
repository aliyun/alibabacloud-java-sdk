// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RegisterSettleAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>bank</p>
     */
    @NameInMap("AccountChannel")
    public String accountChannel;

    @NameInMap("AccountName")
    public String accountName;

    /**
     * <strong>example:</strong>
     * <p>15******65</p>
     */
    @NameInMap("AccountNo")
    public String accountNo;

    /**
     * <strong>example:</strong>
     * <p>transferIn</p>
     */
    @NameInMap("AccountPayType")
    public String accountPayType;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <strong>example:</strong>
     * <p>LMALL20******007</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CountryOrAreaCode")
    public String countryOrAreaCode;

    @NameInMap("Currency")
    public String currency;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("IdempotentId")
    public String idempotentId;

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

    public RegisterSettleAccountRequest setCountryOrAreaCode(String countryOrAreaCode) {
        this.countryOrAreaCode = countryOrAreaCode;
        return this;
    }
    public String getCountryOrAreaCode() {
        return this.countryOrAreaCode;
    }

    public RegisterSettleAccountRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public RegisterSettleAccountRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public RegisterSettleAccountRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

}
