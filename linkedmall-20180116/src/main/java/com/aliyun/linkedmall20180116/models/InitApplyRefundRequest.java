// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class InitApplyRefundRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("BizUid")
    @Validation(required = true)
    public String bizUid;

    @NameInMap("SubLmOrderId")
    @Validation(required = true)
    public String subLmOrderId;

    @NameInMap("BizClaimType")
    @Validation(required = true)
    public Integer bizClaimType;

    @NameInMap("GoodsStatus")
    @Validation(required = true)
    public Integer goodsStatus;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("AccountType")
    public String accountType;

    public static InitApplyRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        InitApplyRefundRequest self = new InitApplyRefundRequest();
        return TeaModel.build(map, self);
    }

    public InitApplyRefundRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitApplyRefundRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public InitApplyRefundRequest setSubLmOrderId(String subLmOrderId) {
        this.subLmOrderId = subLmOrderId;
        return this;
    }
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public InitApplyRefundRequest setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public InitApplyRefundRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public InitApplyRefundRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public InitApplyRefundRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public InitApplyRefundRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

}
