// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetComponentVersionChildrenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetComponentVersionChildrenResponseBody body;

    public static GetComponentVersionChildrenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComponentVersionChildrenResponse self = new GetComponentVersionChildrenResponse();
        return TeaModel.build(map, self);
    }

    public GetComponentVersionChildrenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComponentVersionChildrenResponse setBody(GetComponentVersionChildrenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComponentVersionChildrenResponseBody getBody() {
        return this.body;
    }

}
