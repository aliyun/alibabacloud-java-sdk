// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppResponseBody body;

    public static GetAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponse self = new GetAppResponse();
        return TeaModel.build(map, self);
    }

    public GetAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppResponse setBody(GetAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppResponseBody getBody() {
        return this.body;
    }

}
