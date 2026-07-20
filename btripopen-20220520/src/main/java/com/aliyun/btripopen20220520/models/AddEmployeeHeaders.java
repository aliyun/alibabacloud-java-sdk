// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddEmployeeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The enterprise access token.</p>
     * <ul>
     * <li>When calling the operation over HTTP, include this as a <strong>required parameter</strong> in the request URL. For information about how to obtain the token, refer to <a href="https://openapi.alibtrip.com/doc/toDocDetail?docId=3769985">Enterprise access token</a>.</li>
     * <li>When appending the token to the URL, use any of the following formats: <code>so_corp_token=value</code>, <code>dtb_corp_token=value</code>, or <code>corp_token=value</code>. <strong>Recommended:</strong> <code>corp_token=value</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>feth****wls</p>
     */
    @NameInMap("x-acs-btrip-corp-token")
    public String xAcsBtripCorpToken;

    public static AddEmployeeHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddEmployeeHeaders self = new AddEmployeeHeaders();
        return TeaModel.build(map, self);
    }

    public AddEmployeeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddEmployeeHeaders setXAcsBtripCorpToken(String xAcsBtripCorpToken) {
        this.xAcsBtripCorpToken = xAcsBtripCorpToken;
        return this;
    }
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

}
