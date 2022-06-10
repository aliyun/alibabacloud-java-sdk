// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetWithholdSignPageUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetWithholdSignPageUrlResponseBody body;

    public static GetWithholdSignPageUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWithholdSignPageUrlResponse self = new GetWithholdSignPageUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetWithholdSignPageUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWithholdSignPageUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWithholdSignPageUrlResponse setBody(GetWithholdSignPageUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWithholdSignPageUrlResponseBody getBody() {
        return this.body;
    }

}
