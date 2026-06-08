// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetApplicationContentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationContentsResponseBody body;

    public static GetApplicationContentsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationContentsResponse self = new GetApplicationContentsResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationContentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationContentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationContentsResponse setBody(GetApplicationContentsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationContentsResponseBody getBody() {
        return this.body;
    }

}
