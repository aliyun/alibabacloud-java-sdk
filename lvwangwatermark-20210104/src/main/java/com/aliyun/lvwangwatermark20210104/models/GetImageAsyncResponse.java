// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetImageAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetImageAsyncResponseBody body;

    public static GetImageAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageAsyncResponse self = new GetImageAsyncResponse();
        return TeaModel.build(map, self);
    }

    public GetImageAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageAsyncResponse setBody(GetImageAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageAsyncResponseBody getBody() {
        return this.body;
    }

}
