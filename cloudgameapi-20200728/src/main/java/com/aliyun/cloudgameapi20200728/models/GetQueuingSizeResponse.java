// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetQueuingSizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueuingSizeResponseBody body;

    public static GetQueuingSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueuingSizeResponse self = new GetQueuingSizeResponse();
        return TeaModel.build(map, self);
    }

    public GetQueuingSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueuingSizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueuingSizeResponse setBody(GetQueuingSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueuingSizeResponseBody getBody() {
        return this.body;
    }

}
