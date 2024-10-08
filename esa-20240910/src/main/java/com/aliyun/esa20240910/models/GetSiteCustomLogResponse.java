// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteCustomLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSiteCustomLogResponseBody body;

    public static GetSiteCustomLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSiteCustomLogResponse self = new GetSiteCustomLogResponse();
        return TeaModel.build(map, self);
    }

    public GetSiteCustomLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSiteCustomLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSiteCustomLogResponse setBody(GetSiteCustomLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSiteCustomLogResponseBody getBody() {
        return this.body;
    }

}
