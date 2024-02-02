// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeInstanceResponseBody body;

    public static GetEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceResponse self = new GetEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeInstanceResponse setBody(GetEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
