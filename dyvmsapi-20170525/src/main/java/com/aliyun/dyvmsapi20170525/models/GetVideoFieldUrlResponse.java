// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetVideoFieldUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoFieldUrlResponseBody body;

    public static GetVideoFieldUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoFieldUrlResponse self = new GetVideoFieldUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoFieldUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoFieldUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoFieldUrlResponse setBody(GetVideoFieldUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoFieldUrlResponseBody getBody() {
        return this.body;
    }

}
