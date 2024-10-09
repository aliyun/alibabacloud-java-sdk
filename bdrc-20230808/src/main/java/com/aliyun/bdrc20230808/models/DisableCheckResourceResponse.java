// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DisableCheckResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCheckResourceResponseBody body;

    public static DisableCheckResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCheckResourceResponse self = new DisableCheckResourceResponse();
        return TeaModel.build(map, self);
    }

    public DisableCheckResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCheckResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCheckResourceResponse setBody(DisableCheckResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCheckResourceResponseBody getBody() {
        return this.body;
    }

}
