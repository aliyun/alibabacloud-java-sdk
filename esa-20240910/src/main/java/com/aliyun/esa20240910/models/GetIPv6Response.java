// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetIPv6Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIPv6ResponseBody body;

    public static GetIPv6Response build(java.util.Map<String, ?> map) throws Exception {
        GetIPv6Response self = new GetIPv6Response();
        return TeaModel.build(map, self);
    }

    public GetIPv6Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIPv6Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIPv6Response setBody(GetIPv6ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIPv6ResponseBody getBody() {
        return this.body;
    }

}
