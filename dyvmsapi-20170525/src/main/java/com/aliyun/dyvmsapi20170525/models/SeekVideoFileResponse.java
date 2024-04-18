// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SeekVideoFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SeekVideoFileResponseBody body;

    public static SeekVideoFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SeekVideoFileResponse self = new SeekVideoFileResponse();
        return TeaModel.build(map, self);
    }

    public SeekVideoFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SeekVideoFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SeekVideoFileResponse setBody(SeekVideoFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SeekVideoFileResponseBody getBody() {
        return this.body;
    }

}
