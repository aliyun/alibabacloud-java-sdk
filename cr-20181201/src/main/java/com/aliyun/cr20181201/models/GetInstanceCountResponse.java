// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceCountResponseBody body;

    public static GetInstanceCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCountResponse self = new GetInstanceCountResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceCountResponse setBody(GetInstanceCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceCountResponseBody getBody() {
        return this.body;
    }

}
