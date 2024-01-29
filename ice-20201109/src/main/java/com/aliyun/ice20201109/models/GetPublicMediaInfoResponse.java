// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPublicMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublicMediaInfoResponseBody body;

    public static GetPublicMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicMediaInfoResponse self = new GetPublicMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicMediaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublicMediaInfoResponse setBody(GetPublicMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicMediaInfoResponseBody getBody() {
        return this.body;
    }

}
