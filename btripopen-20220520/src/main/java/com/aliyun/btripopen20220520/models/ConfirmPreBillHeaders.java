// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ConfirmPreBillHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>A header parameter obtained from the enterprise access credential operation. Add this parameter to the header. In HTTP mode, you can use so_corp_token=value or dtb_corp_token=value in the URL as an alternative.</p>
     * 
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-so-corp-token")
    public String xAcsBtripSoCorpToken;

    public static ConfirmPreBillHeaders build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPreBillHeaders self = new ConfirmPreBillHeaders();
        return TeaModel.build(map, self);
    }

    public ConfirmPreBillHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ConfirmPreBillHeaders setXAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
        this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
        return this;
    }
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

}
