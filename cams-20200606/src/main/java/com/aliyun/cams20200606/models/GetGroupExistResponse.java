// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetGroupExistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGroupExistResponseBody body;

    public static GetGroupExistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupExistResponse self = new GetGroupExistResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupExistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupExistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupExistResponse setBody(GetGroupExistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupExistResponseBody getBody() {
        return this.body;
    }

}
