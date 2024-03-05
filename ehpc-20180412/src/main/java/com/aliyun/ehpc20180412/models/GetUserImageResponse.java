// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetUserImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserImageResponseBody body;

    public static GetUserImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserImageResponse self = new GetUserImageResponse();
        return TeaModel.build(map, self);
    }

    public GetUserImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserImageResponse setBody(GetUserImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserImageResponseBody getBody() {
        return this.body;
    }

}
