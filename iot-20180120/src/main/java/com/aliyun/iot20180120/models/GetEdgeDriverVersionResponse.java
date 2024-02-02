// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeDriverVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeDriverVersionResponseBody body;

    public static GetEdgeDriverVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeDriverVersionResponse self = new GetEdgeDriverVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeDriverVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeDriverVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeDriverVersionResponse setBody(GetEdgeDriverVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

}
