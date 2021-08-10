// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentOverviewInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPatentOverviewInfoResponseBody body;

    public static GetPatentOverviewInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatentOverviewInfoResponse self = new GetPatentOverviewInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPatentOverviewInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatentOverviewInfoResponse setBody(GetPatentOverviewInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatentOverviewInfoResponseBody getBody() {
        return this.body;
    }

}
