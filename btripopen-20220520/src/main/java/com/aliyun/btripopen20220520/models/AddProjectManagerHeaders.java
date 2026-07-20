// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddProjectManagerHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The enterprise access token.</p>
     * <ul>
     * <li>This is a required header parameter for HTTP calls. For information about how to obtain it, refer to <a href="https://openapi.alibtrip.com/doc/toDocDetail?docId=3769985">Enterprise access token</a>.</li>
     * <li>You can use <code>corp_token=value</code> in the request URL as an alternative.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-corp-token")
    public String xAcsBtripCorpToken;

    public static AddProjectManagerHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddProjectManagerHeaders self = new AddProjectManagerHeaders();
        return TeaModel.build(map, self);
    }

    public AddProjectManagerHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddProjectManagerHeaders setXAcsBtripCorpToken(String xAcsBtripCorpToken) {
        this.xAcsBtripCorpToken = xAcsBtripCorpToken;
        return this;
    }
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

}
