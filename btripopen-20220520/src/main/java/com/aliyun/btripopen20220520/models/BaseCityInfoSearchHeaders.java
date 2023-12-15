// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BaseCityInfoSearchHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-btrip-access-token")
    public String xAcsBtripAccessToken;

    public static BaseCityInfoSearchHeaders build(java.util.Map<String, ?> map) throws Exception {
        BaseCityInfoSearchHeaders self = new BaseCityInfoSearchHeaders();
        return TeaModel.build(map, self);
    }

    public BaseCityInfoSearchHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public BaseCityInfoSearchHeaders setXAcsBtripAccessToken(String xAcsBtripAccessToken) {
        this.xAcsBtripAccessToken = xAcsBtripAccessToken;
        return this;
    }
    public String getXAcsBtripAccessToken() {
        return this.xAcsBtripAccessToken;
    }

}
