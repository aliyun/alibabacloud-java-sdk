// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelResourceTopNMacsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelResourceTopNMacsResponseBody body;

    public static SentinelResourceTopNMacsResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelResourceTopNMacsResponse self = new SentinelResourceTopNMacsResponse();
        return TeaModel.build(map, self);
    }

    public SentinelResourceTopNMacsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelResourceTopNMacsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelResourceTopNMacsResponse setBody(SentinelResourceTopNMacsResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelResourceTopNMacsResponseBody getBody() {
        return this.body;
    }

}
