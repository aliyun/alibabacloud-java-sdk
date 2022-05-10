// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimDrawingStatusResponseBody body;

    public static GetBimDrawingStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingStatusResponse self = new GetBimDrawingStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimDrawingStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimDrawingStatusResponse setBody(GetBimDrawingStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimDrawingStatusResponseBody getBody() {
        return this.body;
    }

}
