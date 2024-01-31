// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetUpgradeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUpgradeStatusResponseBody body;

    public static GetUpgradeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUpgradeStatusResponse self = new GetUpgradeStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetUpgradeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUpgradeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUpgradeStatusResponse setBody(GetUpgradeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUpgradeStatusResponseBody getBody() {
        return this.body;
    }

}
