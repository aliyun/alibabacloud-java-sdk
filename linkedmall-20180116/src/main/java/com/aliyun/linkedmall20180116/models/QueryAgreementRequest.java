// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAgreementRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20******8006</p>
     */
    @NameInMap("AgreementNo")
    public String agreementNo;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ExternalAgreementNo")
    public String externalAgreementNo;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("MerchantId")
    public String merchantId;

    public static QueryAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgreementRequest self = new QueryAgreementRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgreementRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
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

}
