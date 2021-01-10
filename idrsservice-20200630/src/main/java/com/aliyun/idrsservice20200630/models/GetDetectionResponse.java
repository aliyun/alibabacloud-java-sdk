// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDetectionResponseBody body;

    public static GetDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionResponse self = new GetDetectionResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectionResponse setBody(GetDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectionResponseBody getBody() {
        return this.body;
    }

}
