// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetResourceLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceLinkResponseBody body;

    public static GetResourceLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceLinkResponse self = new GetResourceLinkResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceLinkResponse setBody(GetResourceLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceLinkResponseBody getBody() {
        return this.body;
    }

}
