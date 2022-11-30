// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EstimatedPriceQueryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-btrip-so-corp-token")
    public String xAcsBtripSoCorpToken;

    public static EstimatedPriceQueryHeaders build(java.util.Map<String, ?> map) throws Exception {
        EstimatedPriceQueryHeaders self = new EstimatedPriceQueryHeaders();
        return TeaModel.build(map, self);
    }

    public EstimatedPriceQueryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public EstimatedPriceQueryHeaders setXAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
        this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
        return this;
    }
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

}
