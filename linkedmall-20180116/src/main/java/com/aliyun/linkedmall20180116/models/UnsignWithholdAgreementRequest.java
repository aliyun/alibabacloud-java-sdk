// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class UnsignWithholdAgreementRequest extends TeaModel {
    @NameInMap("AgreementNo")
    public String agreementNo;

    @NameInMap("ExternalAgreementNo")
    public String externalAgreementNo;

    @NameInMap("MerchantId")
    public String merchantId;

    @NameInMap("OutRequestNo")
    public String outRequestNo;

    public static UnsignWithholdAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        UnsignWithholdAgreementRequest self = new UnsignWithholdAgreementRequest();
        return TeaModel.build(map, self);
    }

    public UnsignWithholdAgreementRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public UnsignWithholdAgreementRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public UnsignWithholdAgreementRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UnsignWithholdAgreementRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

}
