// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetMediaResourceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaResourceIdResponseBody body;

    public static GetMediaResourceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResourceIdResponse self = new GetMediaResourceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaResourceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaResourceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaResourceIdResponse setBody(GetMediaResourceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaResourceIdResponseBody getBody() {
        return this.body;
    }

}
