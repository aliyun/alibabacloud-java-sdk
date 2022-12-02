// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetMonitorItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMonitorItemResponseBody body;

    public static GetMonitorItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorItemResponse self = new GetMonitorItemResponse();
        return TeaModel.build(map, self);
    }

    public GetMonitorItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMonitorItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMonitorItemResponse setBody(GetMonitorItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMonitorItemResponseBody getBody() {
        return this.body;
    }

}
