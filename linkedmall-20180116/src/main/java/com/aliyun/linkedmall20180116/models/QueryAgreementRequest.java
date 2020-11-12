// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAgreementRequest extends TeaModel {
    @NameInMap("ExternalAgreementNo")
    public String externalAgreementNo;

    @NameInMap("MerchantId")
    public String merchantId;

    @NameInMap("AgreementNo")
    public String agreementNo;

    public static QueryAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgreementRequest self = new QueryAgreementRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgreementRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public QueryAgreementRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryAgreementRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

}
