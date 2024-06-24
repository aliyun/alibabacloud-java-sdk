// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CorpTokenHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>vf9_bvla0qs</p>
     */
    @NameInMap("x-acs-btrip-access-token")
    public String xAcsBtripAccessToken;

    public static CorpTokenHeaders build(java.util.Map<String, ?> map) throws Exception {
        CorpTokenHeaders self = new CorpTokenHeaders();
        return TeaModel.build(map, self);
    }

    public CorpTokenHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CorpTokenHeaders setXAcsBtripAccessToken(String xAcsBtripAccessToken) {
        this.xAcsBtripAccessToken = xAcsBtripAccessToken;
        return this;
    }
    public String getXAcsBtripAccessToken() {
        return this.xAcsBtripAccessToken;
    }

}
