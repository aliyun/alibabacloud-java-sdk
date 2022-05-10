// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceErrorRankResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceErrorRankResponseBody body;

    public static GetInstanceErrorRankResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceErrorRankResponse self = new GetInstanceErrorRankResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceErrorRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceErrorRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceErrorRankResponse setBody(GetInstanceErrorRankResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceErrorRankResponseBody getBody() {
        return this.body;
    }

}
