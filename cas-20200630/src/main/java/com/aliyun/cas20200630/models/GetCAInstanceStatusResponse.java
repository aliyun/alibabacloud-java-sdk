// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class GetCAInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCAInstanceStatusResponseBody body;

    public static GetCAInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCAInstanceStatusResponse self = new GetCAInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetCAInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCAInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCAInstanceStatusResponse setBody(GetCAInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCAInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
