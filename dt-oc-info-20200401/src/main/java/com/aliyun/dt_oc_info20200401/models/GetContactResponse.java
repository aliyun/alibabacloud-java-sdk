// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetContactResponseBody body;

    public static GetContactResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContactResponse self = new GetContactResponse();
        return TeaModel.build(map, self);
    }

    public GetContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContactResponse setBody(GetContactResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContactResponseBody getBody() {
        return this.body;
    }

}
