// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetDataChannelCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataChannelCredentialsResponseBody body;

    public static GetDataChannelCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataChannelCredentialsResponse self = new GetDataChannelCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public GetDataChannelCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataChannelCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataChannelCredentialsResponse setBody(GetDataChannelCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataChannelCredentialsResponseBody getBody() {
        return this.body;
    }

}
