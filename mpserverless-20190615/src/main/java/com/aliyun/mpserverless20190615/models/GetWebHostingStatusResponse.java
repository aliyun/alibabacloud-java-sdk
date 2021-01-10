// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWebHostingStatusResponseBody body;

    public static GetWebHostingStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingStatusResponse self = new GetWebHostingStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetWebHostingStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebHostingStatusResponse setBody(GetWebHostingStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebHostingStatusResponseBody getBody() {
        return this.body;
    }

}
