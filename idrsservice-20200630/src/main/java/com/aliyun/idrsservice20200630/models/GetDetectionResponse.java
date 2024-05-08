// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDetectionResponseBody body;

    public static GetDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionResponse self = new GetDetectionResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetectionResponse setBody(GetDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectionResponseBody getBody() {
        return this.body;
    }

}
