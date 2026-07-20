// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddressGetHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The enterprise access token.</p>
     * <ul>
     * <li>This is a <strong>required</strong> header parameter for HTTP calls. For information about how to obtain it, refer to <a href="https://openapi.alibtrip.com/doc/toDocDetail?docId=3769985">Enterprise access token</a>.</li>
     * <li>You can use <code>corp_token=value</code> in the URL as an alternative.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>feth****wls</p>
     */
    @NameInMap("x-acs-btrip-so-corp-token")
    public String xAcsBtripSoCorpToken;

    public static AddressGetHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddressGetHeaders self = new AddressGetHeaders();
        return TeaModel.build(map, self);
    }

    public AddressGetHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddressGetHeaders setXAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
        this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
        return this;
    }
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

}
