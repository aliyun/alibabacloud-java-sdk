// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSecurityClassifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecurityClassifyResponseBody body;

    public static GetSecurityClassifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityClassifyResponse self = new GetSecurityClassifyResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityClassifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityClassifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityClassifyResponse setBody(GetSecurityClassifyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityClassifyResponseBody getBody() {
        return this.body;
    }

}
