// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOptionValueForProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOptionValueForProjectResponseBody body;

    public static GetOptionValueForProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOptionValueForProjectResponse self = new GetOptionValueForProjectResponse();
        return TeaModel.build(map, self);
    }

    public GetOptionValueForProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOptionValueForProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOptionValueForProjectResponse setBody(GetOptionValueForProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOptionValueForProjectResponseBody getBody() {
        return this.body;
    }

}
