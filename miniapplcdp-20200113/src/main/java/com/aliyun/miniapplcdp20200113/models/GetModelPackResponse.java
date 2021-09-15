// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetModelPackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelPackResponseBody body;

    public static GetModelPackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelPackResponse self = new GetModelPackResponse();
        return TeaModel.build(map, self);
    }

    public GetModelPackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelPackResponse setBody(GetModelPackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelPackResponseBody getBody() {
        return this.body;
    }

}
