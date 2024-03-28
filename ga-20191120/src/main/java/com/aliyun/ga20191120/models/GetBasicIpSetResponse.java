// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicIpSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBasicIpSetResponseBody body;

    public static GetBasicIpSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBasicIpSetResponse self = new GetBasicIpSetResponse();
        return TeaModel.build(map, self);
    }

    public GetBasicIpSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBasicIpSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBasicIpSetResponse setBody(GetBasicIpSetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBasicIpSetResponseBody getBody() {
        return this.body;
    }

}
