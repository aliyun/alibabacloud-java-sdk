// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetAppshowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppshowResponseBody body;

    public static GetAppshowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppshowResponse self = new GetAppshowResponse();
        return TeaModel.build(map, self);
    }

    public GetAppshowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppshowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppshowResponse setBody(GetAppshowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppshowResponseBody getBody() {
        return this.body;
    }

}
