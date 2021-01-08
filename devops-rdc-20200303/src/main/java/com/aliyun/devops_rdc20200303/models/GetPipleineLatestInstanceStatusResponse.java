// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipleineLatestInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPipleineLatestInstanceStatusResponseBody body;

    public static GetPipleineLatestInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipleineLatestInstanceStatusResponse self = new GetPipleineLatestInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPipleineLatestInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipleineLatestInstanceStatusResponse setBody(GetPipleineLatestInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipleineLatestInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
