// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AllBaseCityInfoQueryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-access-token")
    public String xAcsBtripAccessToken;

    public static AllBaseCityInfoQueryHeaders build(java.util.Map<String, ?> map) throws Exception {
        AllBaseCityInfoQueryHeaders self = new AllBaseCityInfoQueryHeaders();
        return TeaModel.build(map, self);
    }

    public AllBaseCityInfoQueryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AllBaseCityInfoQueryHeaders setXAcsBtripAccessToken(String xAcsBtripAccessToken) {
        this.xAcsBtripAccessToken = xAcsBtripAccessToken;
        return this;
    }
    public String getXAcsBtripAccessToken() {
        return this.xAcsBtripAccessToken;
    }

}
