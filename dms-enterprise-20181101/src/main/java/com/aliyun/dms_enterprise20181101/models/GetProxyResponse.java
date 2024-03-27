// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProxyResponseBody body;

    public static GetProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProxyResponse self = new GetProxyResponse();
        return TeaModel.build(map, self);
    }

    public GetProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProxyResponse setBody(GetProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProxyResponseBody getBody() {
        return this.body;
    }

}
