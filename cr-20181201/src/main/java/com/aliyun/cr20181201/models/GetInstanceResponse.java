// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceResponseBody body;

    public static GetInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponse self = new GetInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceResponse setBody(GetInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceResponseBody getBody() {
        return this.body;
    }

}
