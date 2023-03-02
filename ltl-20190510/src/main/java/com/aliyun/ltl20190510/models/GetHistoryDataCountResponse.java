// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class GetHistoryDataCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHistoryDataCountResponseBody body;

    public static GetHistoryDataCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryDataCountResponse self = new GetHistoryDataCountResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoryDataCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoryDataCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoryDataCountResponse setBody(GetHistoryDataCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoryDataCountResponseBody getBody() {
        return this.body;
    }

}
