// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpgradeServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeServerResponseBody body;

    public static UpgradeServerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeServerResponse self = new UpgradeServerResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeServerResponse setBody(UpgradeServerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeServerResponseBody getBody() {
        return this.body;
    }

}
