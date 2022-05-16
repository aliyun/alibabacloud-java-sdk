// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class RenewRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("BuyNum")
    public Integer buyNum;

    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("OfferCode")
    public String offerCode;

    @NameInMap("RechargeType")
    public String rechargeType;

    @NameInMap("SerialNo")
    public String serialNo;

    public static RenewRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewRequest self = new RenewRequest();
        return TeaModel.build(map, self);
    }

    public RenewRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public RenewRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public RenewRequest setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
        return this;
    }
    public Integer getBuyNum() {
        return this.buyNum;
    }

    public RenewRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public RenewRequest setOfferCode(String offerCode) {
        this.offerCode = offerCode;
        return this;
    }
    public String getOfferCode() {
        return this.offerCode;
    }

    public RenewRequest setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
        return this;
    }
    public String getRechargeType() {
        return this.rechargeType;
    }

    public RenewRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
