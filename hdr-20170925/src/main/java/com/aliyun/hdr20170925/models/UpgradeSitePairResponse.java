// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpgradeSitePairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeSitePairResponseBody body;

    public static UpgradeSitePairResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSitePairResponse self = new UpgradeSitePairResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeSitePairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeSitePairResponse setBody(UpgradeSitePairResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeSitePairResponseBody getBody() {
        return this.body;
    }

}
