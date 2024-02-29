// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNodeCodeResponseBody body;

    public static GetNodeCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeCodeResponse self = new GetNodeCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeCodeResponse setBody(GetNodeCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeCodeResponseBody getBody() {
        return this.body;
    }

}
