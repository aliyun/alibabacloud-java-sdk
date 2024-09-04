// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetFacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFacesResponseBody body;

    public static GetFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFacesResponse self = new GetFacesResponse();
        return TeaModel.build(map, self);
    }

    public GetFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFacesResponse setBody(GetFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFacesResponseBody getBody() {
        return this.body;
    }

}
