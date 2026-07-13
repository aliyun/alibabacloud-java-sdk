// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class VatInvoiceScanQueryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>A header parameter obtained from the &quot;Enterprise access credential&quot; API operation (added in the header). In HTTP mode, you can use corp_token=value in the URL as a substitute.</p>
     * 
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-so-corp-token")
    public String xAcsBtripSoCorpToken;

    public static VatInvoiceScanQueryHeaders build(java.util.Map<String, ?> map) throws Exception {
        VatInvoiceScanQueryHeaders self = new VatInvoiceScanQueryHeaders();
        return TeaModel.build(map, self);
    }

    public VatInvoiceScanQueryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public VatInvoiceScanQueryHeaders setXAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
        this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
        return this;
    }
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

}
