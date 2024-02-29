// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBaselineResponseBody body;

    public static GetBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineResponse self = new GetBaselineResponse();
        return TeaModel.build(map, self);
    }

    public GetBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBaselineResponse setBody(GetBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBaselineResponseBody getBody() {
        return this.body;
    }

}
