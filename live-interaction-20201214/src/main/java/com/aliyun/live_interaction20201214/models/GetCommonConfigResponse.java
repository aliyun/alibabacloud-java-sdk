// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetCommonConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCommonConfigResponseBody body;

    public static GetCommonConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommonConfigResponse self = new GetCommonConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetCommonConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommonConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCommonConfigResponse setBody(GetCommonConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommonConfigResponseBody getBody() {
        return this.body;
    }

}
