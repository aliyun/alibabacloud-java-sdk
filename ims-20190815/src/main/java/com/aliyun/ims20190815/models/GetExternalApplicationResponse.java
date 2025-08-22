// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetExternalApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExternalApplicationResponseBody body;

    public static GetExternalApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExternalApplicationResponse self = new GetExternalApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetExternalApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExternalApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExternalApplicationResponse setBody(GetExternalApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExternalApplicationResponseBody getBody() {
        return this.body;
    }

}
