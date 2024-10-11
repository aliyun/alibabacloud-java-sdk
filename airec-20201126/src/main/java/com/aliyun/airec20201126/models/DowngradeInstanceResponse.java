// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DowngradeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DowngradeInstanceResponseBody body;

    public static DowngradeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DowngradeInstanceResponse self = new DowngradeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DowngradeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DowngradeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DowngradeInstanceResponse setBody(DowngradeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DowngradeInstanceResponseBody getBody() {
        return this.body;
    }

}
