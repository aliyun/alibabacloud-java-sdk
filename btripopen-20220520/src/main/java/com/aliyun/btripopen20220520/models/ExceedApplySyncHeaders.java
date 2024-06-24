// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExceedApplySyncHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-so-corp-token")
    public String xAcsBtripSoCorpToken;

    public static ExceedApplySyncHeaders build(java.util.Map<String, ?> map) throws Exception {
        ExceedApplySyncHeaders self = new ExceedApplySyncHeaders();
        return TeaModel.build(map, self);
    }

    public ExceedApplySyncHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ExceedApplySyncHeaders setXAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
        this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
        return this;
    }
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

}
