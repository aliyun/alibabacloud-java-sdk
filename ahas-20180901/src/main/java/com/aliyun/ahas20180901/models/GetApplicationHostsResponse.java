// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetApplicationHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetApplicationHostsResponseBody body;

    public static GetApplicationHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationHostsResponse self = new GetApplicationHostsResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationHostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationHostsResponse setBody(GetApplicationHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationHostsResponseBody getBody() {
        return this.body;
    }

}
