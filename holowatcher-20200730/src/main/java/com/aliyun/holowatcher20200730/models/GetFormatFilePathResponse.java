// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetFormatFilePathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFormatFilePathResponseBody body;

    public static GetFormatFilePathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFormatFilePathResponse self = new GetFormatFilePathResponse();
        return TeaModel.build(map, self);
    }

    public GetFormatFilePathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFormatFilePathResponse setBody(GetFormatFilePathResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFormatFilePathResponseBody getBody() {
        return this.body;
    }

}
