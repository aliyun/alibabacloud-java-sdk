// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupCorpTokenHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>feth00jqwls</p>
     */
    @NameInMap("x-acs-btrip-access-token")
    public String xAcsBtripAccessToken;

    public static GroupCorpTokenHeaders build(java.util.Map<String, ?> map) throws Exception {
        GroupCorpTokenHeaders self = new GroupCorpTokenHeaders();
        return TeaModel.build(map, self);
    }

    public GroupCorpTokenHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GroupCorpTokenHeaders setXAcsBtripAccessToken(String xAcsBtripAccessToken) {
        this.xAcsBtripAccessToken = xAcsBtripAccessToken;
        return this;
    }
    public String getXAcsBtripAccessToken() {
        return this.xAcsBtripAccessToken;
    }

}
