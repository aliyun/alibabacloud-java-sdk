// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDagResponseBody body;

    public static GetDagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDagResponse self = new GetDagResponse();
        return TeaModel.build(map, self);
    }

    public GetDagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDagResponse setBody(GetDagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDagResponseBody getBody() {
        return this.body;
    }

}
