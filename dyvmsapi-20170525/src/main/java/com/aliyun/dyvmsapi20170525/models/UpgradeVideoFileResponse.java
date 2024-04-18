// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UpgradeVideoFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeVideoFileResponseBody body;

    public static UpgradeVideoFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeVideoFileResponse self = new UpgradeVideoFileResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeVideoFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeVideoFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeVideoFileResponse setBody(UpgradeVideoFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeVideoFileResponseBody getBody() {
        return this.body;
    }

}
