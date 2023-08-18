// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetHistoryAdvicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHistoryAdvicesResponseBody body;

    public static GetHistoryAdvicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryAdvicesResponse self = new GetHistoryAdvicesResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoryAdvicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoryAdvicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoryAdvicesResponse setBody(GetHistoryAdvicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoryAdvicesResponseBody getBody() {
        return this.body;
    }

}
