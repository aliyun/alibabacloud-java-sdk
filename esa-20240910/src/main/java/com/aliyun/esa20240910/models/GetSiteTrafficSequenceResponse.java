// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteTrafficSequenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSiteTrafficSequenceResponseBody body;

    public static GetSiteTrafficSequenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSiteTrafficSequenceResponse self = new GetSiteTrafficSequenceResponse();
        return TeaModel.build(map, self);
    }

    public GetSiteTrafficSequenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSiteTrafficSequenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSiteTrafficSequenceResponse setBody(GetSiteTrafficSequenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSiteTrafficSequenceResponseBody getBody() {
        return this.body;
    }

}
