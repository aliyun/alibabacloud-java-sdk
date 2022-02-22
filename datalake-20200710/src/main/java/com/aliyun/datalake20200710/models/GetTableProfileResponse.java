// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTableProfileResponseBody body;

    public static GetTableProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableProfileResponse self = new GetTableProfileResponse();
        return TeaModel.build(map, self);
    }

    public GetTableProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableProfileResponse setBody(GetTableProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableProfileResponseBody getBody() {
        return this.body;
    }

}
