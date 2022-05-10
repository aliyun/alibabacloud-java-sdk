// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimUploadStsTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimUploadStsTokenResponseBody body;

    public static GetBimUploadStsTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimUploadStsTokenResponse self = new GetBimUploadStsTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetBimUploadStsTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimUploadStsTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimUploadStsTokenResponse setBody(GetBimUploadStsTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimUploadStsTokenResponseBody getBody() {
        return this.body;
    }

}
