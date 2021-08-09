// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetDomainAndUriResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainAndUriResourcesResponseBody body;

    public static GetDomainAndUriResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainAndUriResourcesResponse self = new GetDomainAndUriResourcesResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainAndUriResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainAndUriResourcesResponse setBody(GetDomainAndUriResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainAndUriResourcesResponseBody getBody() {
        return this.body;
    }

}
