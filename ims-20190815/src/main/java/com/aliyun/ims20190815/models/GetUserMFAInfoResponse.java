// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserMFAInfoResponseBody body;

    public static GetUserMFAInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAInfoResponse self = new GetUserMFAInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserMFAInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserMFAInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserMFAInfoResponse setBody(GetUserMFAInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserMFAInfoResponseBody getBody() {
        return this.body;
    }

}
