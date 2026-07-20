// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteInvoiceEntityHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>A header parameter obtained from the &quot;Enterprise access credential&quot; operation. Add this parameter to the request header. In HTTP mode, you can use corp_token=value in the URL as an alternative.</p>
     * 
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-corp-token")
    public String xAcsBtripCorpToken;

    public static DeleteInvoiceEntityHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvoiceEntityHeaders self = new DeleteInvoiceEntityHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteInvoiceEntityHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteInvoiceEntityHeaders setXAcsBtripCorpToken(String xAcsBtripCorpToken) {
        this.xAcsBtripCorpToken = xAcsBtripCorpToken;
        return this;
    }
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

}
