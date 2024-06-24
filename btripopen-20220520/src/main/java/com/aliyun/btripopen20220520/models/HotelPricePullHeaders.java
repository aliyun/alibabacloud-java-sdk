// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelPricePullHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-corp-token")
    public String xAcsBtripCorpToken;

    public static HotelPricePullHeaders build(java.util.Map<String, ?> map) throws Exception {
        HotelPricePullHeaders self = new HotelPricePullHeaders();
        return TeaModel.build(map, self);
    }

    public HotelPricePullHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public HotelPricePullHeaders setXAcsBtripCorpToken(String xAcsBtripCorpToken) {
        this.xAcsBtripCorpToken = xAcsBtripCorpToken;
        return this;
    }
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

}
