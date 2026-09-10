// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMaintainWindowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMaintainWindowResponseBody body;

    public static GetMaintainWindowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaintainWindowResponse self = new GetMaintainWindowResponse();
        return TeaModel.build(map, self);
    }

    public GetMaintainWindowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMaintainWindowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMaintainWindowResponse setBody(GetMaintainWindowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMaintainWindowResponseBody getBody() {
        return this.body;
    }

}
