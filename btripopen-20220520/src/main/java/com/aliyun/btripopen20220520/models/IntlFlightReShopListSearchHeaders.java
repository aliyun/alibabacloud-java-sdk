// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopListSearchHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The enterprise access token.</p>
     * <ul>
     * <li>When calling this API over HTTP, this parameter is required and must be appended to the request URL. For more information about how to obtain the token, see <a href="https://openapi.alibtrip.com/doc/toDocDetail?spm=openapi-amp.newDocPublishment.0.0.5e2a281frQyDQ8&docId=3769985">Enterprise access token</a>.</li>
     * <li>When appending the token, use crop_token=value instead.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-corp-token")
    public String xAcsBtripCorpToken;

    public static IntlFlightReShopListSearchHeaders build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopListSearchHeaders self = new IntlFlightReShopListSearchHeaders();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopListSearchHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public IntlFlightReShopListSearchHeaders setXAcsBtripCorpToken(String xAcsBtripCorpToken) {
        this.xAcsBtripCorpToken = xAcsBtripCorpToken;
        return this;
    }
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

}
