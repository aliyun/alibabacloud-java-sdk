// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpgradeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeInfoResponseBody body;

    public static UpgradeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInfoResponse self = new UpgradeInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeInfoResponse setBody(UpgradeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeInfoResponseBody getBody() {
        return this.body;
    }

}
