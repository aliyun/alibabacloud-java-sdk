// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteCurrentNSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSiteCurrentNSResponseBody body;

    public static GetSiteCurrentNSResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSiteCurrentNSResponse self = new GetSiteCurrentNSResponse();
        return TeaModel.build(map, self);
    }

    public GetSiteCurrentNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSiteCurrentNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSiteCurrentNSResponse setBody(GetSiteCurrentNSResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSiteCurrentNSResponseBody getBody() {
        return this.body;
    }

}
