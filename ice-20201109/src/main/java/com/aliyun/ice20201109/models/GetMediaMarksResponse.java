// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaMarksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMediaMarksResponseBody body;

    public static GetMediaMarksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaMarksResponse self = new GetMediaMarksResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaMarksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaMarksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaMarksResponse setBody(GetMediaMarksResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaMarksResponseBody getBody() {
        return this.body;
    }

}
