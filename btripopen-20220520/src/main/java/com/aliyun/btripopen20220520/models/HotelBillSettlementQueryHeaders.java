// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelBillSettlementQueryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-so-corp-token")
    public String xAcsBtripSoCorpToken;

    public static HotelBillSettlementQueryHeaders build(java.util.Map<String, ?> map) throws Exception {
        HotelBillSettlementQueryHeaders self = new HotelBillSettlementQueryHeaders();
        return TeaModel.build(map, self);
    }

    public HotelBillSettlementQueryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public HotelBillSettlementQueryHeaders setXAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
        this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
        return this;
    }
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

}
