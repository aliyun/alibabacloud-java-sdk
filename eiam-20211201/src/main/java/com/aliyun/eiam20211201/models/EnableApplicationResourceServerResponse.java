// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationResourceServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApplicationResourceServerResponseBody body;

    public static EnableApplicationResourceServerResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationResourceServerResponse self = new EnableApplicationResourceServerResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationResourceServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationResourceServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationResourceServerResponse setBody(EnableApplicationResourceServerResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationResourceServerResponseBody getBody() {
        return this.body;
    }

}
