// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceDeleteHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-btrip-so-corp-token")
    public String xAcsBtripSoCorpToken;

    public static InvoiceDeleteHeaders build(java.util.Map<String, ?> map) throws Exception {
        InvoiceDeleteHeaders self = new InvoiceDeleteHeaders();
        return TeaModel.build(map, self);
    }

    public InvoiceDeleteHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InvoiceDeleteHeaders setXAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
        this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
        return this;
    }
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

}
