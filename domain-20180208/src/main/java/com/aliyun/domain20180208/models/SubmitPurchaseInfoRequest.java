// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class SubmitPurchaseInfoRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PurchaseCurrency")
    public String purchaseCurrency;

    @NameInMap("PurchasePrice")
    public Double purchasePrice;

    @NameInMap("PurchaseProofs")
    public java.util.List<String> purchaseProofs;

    public static SubmitPurchaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPurchaseInfoRequest self = new SubmitPurchaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPurchaseInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SubmitPurchaseInfoRequest setPurchaseCurrency(String purchaseCurrency) {
        this.purchaseCurrency = purchaseCurrency;
        return this;
    }
    public String getPurchaseCurrency() {
        return this.purchaseCurrency;
    }

    public SubmitPurchaseInfoRequest setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }
    public Double getPurchasePrice() {
        return this.purchasePrice;
    }

    public SubmitPurchaseInfoRequest setPurchaseProofs(java.util.List<String> purchaseProofs) {
        this.purchaseProofs = purchaseProofs;
        return this;
    }
    public java.util.List<String> getPurchaseProofs() {
        return this.purchaseProofs;
    }

}
