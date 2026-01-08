// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFbMessengerPagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFbMessengerPagesResponseBody body;

    public static GetFbMessengerPagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFbMessengerPagesResponse self = new GetFbMessengerPagesResponse();
        return TeaModel.build(map, self);
    }

    public GetFbMessengerPagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFbMessengerPagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFbMessengerPagesResponse setBody(GetFbMessengerPagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFbMessengerPagesResponseBody getBody() {
        return this.body;
    }

}
