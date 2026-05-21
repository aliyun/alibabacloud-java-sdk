// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetUpgradeableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUpgradeableResponseBody body;

    public static GetUpgradeableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUpgradeableResponse self = new GetUpgradeableResponse();
        return TeaModel.build(map, self);
    }

    public GetUpgradeableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUpgradeableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUpgradeableResponse setBody(GetUpgradeableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUpgradeableResponseBody getBody() {
        return this.body;
    }

}
