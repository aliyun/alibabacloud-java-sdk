// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetC2paSignResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetC2paSignResultResponseBody body;

    public static GetC2paSignResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetC2paSignResultResponse self = new GetC2paSignResultResponse();
        return TeaModel.build(map, self);
    }

    public GetC2paSignResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetC2paSignResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetC2paSignResultResponse setBody(GetC2paSignResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetC2paSignResultResponseBody getBody() {
        return this.body;
    }

}
