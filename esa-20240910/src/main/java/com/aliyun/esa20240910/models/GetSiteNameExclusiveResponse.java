// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteNameExclusiveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSiteNameExclusiveResponseBody body;

    public static GetSiteNameExclusiveResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSiteNameExclusiveResponse self = new GetSiteNameExclusiveResponse();
        return TeaModel.build(map, self);
    }

    public GetSiteNameExclusiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSiteNameExclusiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSiteNameExclusiveResponse setBody(GetSiteNameExclusiveResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSiteNameExclusiveResponseBody getBody() {
        return this.body;
    }

}
