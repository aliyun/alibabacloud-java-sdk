// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelStaticInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-corp-token")
    public String xAcsBtripCorpToken;

    public static HotelStaticInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        HotelStaticInfoHeaders self = new HotelStaticInfoHeaders();
        return TeaModel.build(map, self);
    }

    public HotelStaticInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public HotelStaticInfoHeaders setXAcsBtripCorpToken(String xAcsBtripCorpToken) {
        this.xAcsBtripCorpToken = xAcsBtripCorpToken;
        return this;
    }
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

}
