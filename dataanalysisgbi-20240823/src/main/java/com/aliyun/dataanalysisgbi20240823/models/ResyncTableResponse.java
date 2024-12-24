// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ResyncTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResyncTableResponseBody body;

    public static ResyncTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ResyncTableResponse self = new ResyncTableResponse();
        return TeaModel.build(map, self);
    }

    public ResyncTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResyncTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResyncTableResponse setBody(ResyncTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ResyncTableResponseBody getBody() {
        return this.body;
    }

}
