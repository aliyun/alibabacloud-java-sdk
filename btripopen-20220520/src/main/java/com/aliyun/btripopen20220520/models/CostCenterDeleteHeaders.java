// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterDeleteHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-so-corp-token")
    public String xAcsBtripSoCorpToken;

    public static CostCenterDeleteHeaders build(java.util.Map<String, ?> map) throws Exception {
        CostCenterDeleteHeaders self = new CostCenterDeleteHeaders();
        return TeaModel.build(map, self);
    }

    public CostCenterDeleteHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CostCenterDeleteHeaders setXAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
        this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
        return this;
    }
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

}
