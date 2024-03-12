// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationApiInvokeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApplicationApiInvokeResponseBody body;

    public static EnableApplicationApiInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationApiInvokeResponse self = new EnableApplicationApiInvokeResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationApiInvokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationApiInvokeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationApiInvokeResponse setBody(EnableApplicationApiInvokeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationApiInvokeResponseBody getBody() {
        return this.body;
    }

}
