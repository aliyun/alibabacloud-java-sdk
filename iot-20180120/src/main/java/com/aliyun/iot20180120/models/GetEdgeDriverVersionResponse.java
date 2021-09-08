// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeDriverVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetEdgeDriverVersionResponse setBody(GetEdgeDriverVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

}
