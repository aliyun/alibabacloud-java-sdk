// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopOtaSearchHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The enterprise access token.</p>
     * <ul>
     * <li>When calling this operation over HTTP, this parameter is required and must be appended to the request URL. For more information about how to obtain the token, see <a href="https://openapi.alibtrip.com/doc/toDocDetail?spm=openapi-amp.newDocPublishment.0.0.5e2a281frQyDQ8&docId=3769985">Enterprise access token</a>.</li>
     * <li>When appending this parameter, use crop_token=value instead.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-corp-token")
    public String xAcsBtripCorpToken;

    public static IntlFlightReShopOtaSearchHeaders build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopOtaSearchHeaders self = new IntlFlightReShopOtaSearchHeaders();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopOtaSearchHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public IntlFlightReShopOtaSearchHeaders setXAcsBtripCorpToken(String xAcsBtripCorpToken) {
        this.xAcsBtripCorpToken = xAcsBtripCorpToken;
        return this;
    }
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

}
