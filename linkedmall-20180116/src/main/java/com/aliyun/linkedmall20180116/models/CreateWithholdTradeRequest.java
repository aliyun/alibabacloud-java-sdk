// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateWithholdTradeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021******59220</p>
     */
    @NameInMap("AgreementNo")
    public String agreementNo;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <strong>example:</strong>
     * <p>12******209</p>
     */
    @NameInMap("BuyerId")
    public String buyerId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("GoodsDetail")
    public String goodsDetail;

    /**
     * <strong>example:</strong>
     * <p>64******721</p>
     */
    @NameInMap("MerchantId")
    public String merchantId;

    /**
     * <strong>example:</strong>
     * <p>94A30BED-4321-4A94-B948-EB896493B4BF</p>
     */
    @NameInMap("OutRequestNo")
    public String outRequestNo;

    /**
     * <strong>example:</strong>
     * <p>23******274</p>
     */
    @NameInMap("OutTradeNo")
    public String outTradeNo;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SettleMode")
    public String settleMode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <strong>example:</strong>
     * <p>6900</p>
     */
    @NameInMap("TotalAmount")
    public String totalAmount;

    public static CreateWithholdTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdTradeRequest self = new CreateWithholdTradeRequest();
        return TeaModel.build(map, self);
    }

    public CreateWithholdTradeRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public CreateWithholdTradeRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateWithholdTradeRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public CreateWithholdTradeRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateWithholdTradeRequest setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
        return this;
    }
    public String getGoodsDetail() {
        return this.goodsDetail;
    }

    public CreateWithholdTradeRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateWithholdTradeRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public CreateWithholdTradeRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public CreateWithholdTradeRequest setSettleMode(String settleMode) {
        this.settleMode = settleMode;
        return this;
    }
    public String getSettleMode() {
        return this.settleMode;
    }

    public CreateWithholdTradeRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateWithholdTradeRequest setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

}
