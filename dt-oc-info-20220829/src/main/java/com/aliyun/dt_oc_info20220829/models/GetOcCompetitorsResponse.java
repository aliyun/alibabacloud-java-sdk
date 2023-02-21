// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcCompetitorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcCompetitorsResponseBody body;

    public static GetOcCompetitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcCompetitorsResponse self = new GetOcCompetitorsResponse();
        return TeaModel.build(map, self);
    }

    public GetOcCompetitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcCompetitorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcCompetitorsResponse setBody(GetOcCompetitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcCompetitorsResponseBody getBody() {
        return this.body;
    }

}
