// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetVideoExtractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoExtractResponseBody body;

    public static GetVideoExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoExtractResponse self = new GetVideoExtractResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoExtractResponse setBody(GetVideoExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoExtractResponseBody getBody() {
        return this.body;
    }

}
