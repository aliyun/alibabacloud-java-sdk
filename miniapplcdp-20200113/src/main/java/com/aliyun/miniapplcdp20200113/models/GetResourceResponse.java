// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceResponseBody body;

    public static GetResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceResponse self = new GetResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceResponse setBody(GetResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceResponseBody getBody() {
        return this.body;
    }

}
