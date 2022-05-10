// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardSampleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimStandardSampleResponseBody body;

    public static GetBimStandardSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardSampleResponse self = new GetBimStandardSampleResponse();
        return TeaModel.build(map, self);
    }

    public GetBimStandardSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimStandardSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimStandardSampleResponse setBody(GetBimStandardSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimStandardSampleResponseBody getBody() {
        return this.body;
    }

}
