// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetCmsServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCmsServiceResponseBody body;

    public static GetCmsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCmsServiceResponse self = new GetCmsServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetCmsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCmsServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCmsServiceResponse setBody(GetCmsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCmsServiceResponseBody getBody() {
        return this.body;
    }

}
