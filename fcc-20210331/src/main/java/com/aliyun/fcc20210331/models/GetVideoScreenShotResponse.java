// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetVideoScreenShotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoScreenShotResponseBody body;

    public static GetVideoScreenShotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoScreenShotResponse self = new GetVideoScreenShotResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoScreenShotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoScreenShotResponse setBody(GetVideoScreenShotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoScreenShotResponseBody getBody() {
        return this.body;
    }

}
