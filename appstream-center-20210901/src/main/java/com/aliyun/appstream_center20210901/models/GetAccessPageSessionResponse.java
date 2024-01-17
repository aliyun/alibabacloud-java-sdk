// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetAccessPageSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccessPageSessionResponseBody body;

    public static GetAccessPageSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessPageSessionResponse self = new GetAccessPageSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessPageSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessPageSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessPageSessionResponse setBody(GetAccessPageSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessPageSessionResponseBody getBody() {
        return this.body;
    }

}
