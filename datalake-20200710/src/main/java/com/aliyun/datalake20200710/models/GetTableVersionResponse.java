// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTableVersionResponseBody body;

    public static GetTableVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableVersionResponse self = new GetTableVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetTableVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableVersionResponse setBody(GetTableVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableVersionResponseBody getBody() {
        return this.body;
    }

}
