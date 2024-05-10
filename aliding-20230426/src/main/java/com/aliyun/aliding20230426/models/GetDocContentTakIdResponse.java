// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDocContentTakIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocContentTakIdResponseBody body;

    public static GetDocContentTakIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocContentTakIdResponse self = new GetDocContentTakIdResponse();
        return TeaModel.build(map, self);
    }

    public GetDocContentTakIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocContentTakIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocContentTakIdResponse setBody(GetDocContentTakIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocContentTakIdResponseBody getBody() {
        return this.body;
    }

}
