// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlLastPayloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSdlLastPayloadResponseBody body;

    public static DescribeSdlLastPayloadResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlLastPayloadResponse self = new DescribeSdlLastPayloadResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSdlLastPayloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSdlLastPayloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSdlLastPayloadResponse setBody(DescribeSdlLastPayloadResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSdlLastPayloadResponseBody getBody() {
        return this.body;
    }

}
