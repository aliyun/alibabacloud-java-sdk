// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompetitorInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompetitorInfoResponseBody body;

    public static GetCompetitorInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompetitorInfoResponse self = new GetCompetitorInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCompetitorInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompetitorInfoResponse setBody(GetCompetitorInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompetitorInfoResponseBody getBody() {
        return this.body;
    }

}
