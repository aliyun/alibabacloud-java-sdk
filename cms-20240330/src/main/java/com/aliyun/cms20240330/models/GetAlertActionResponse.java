// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAlertActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertActionResponseBody body;

    public static GetAlertActionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertActionResponse self = new GetAlertActionResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertActionResponse setBody(GetAlertActionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertActionResponseBody getBody() {
        return this.body;
    }

}
