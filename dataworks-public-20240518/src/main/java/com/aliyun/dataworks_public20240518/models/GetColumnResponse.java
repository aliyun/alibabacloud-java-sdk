// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetColumnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetColumnResponseBody body;

    public static GetColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        GetColumnResponse self = new GetColumnResponse();
        return TeaModel.build(map, self);
    }

    public GetColumnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetColumnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetColumnResponse setBody(GetColumnResponseBody body) {
        this.body = body;
        return this;
    }
    public GetColumnResponseBody getBody() {
        return this.body;
    }

}
