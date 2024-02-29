// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeOnBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNodeOnBaselineResponseBody body;

    public static GetNodeOnBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeOnBaselineResponse self = new GetNodeOnBaselineResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeOnBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeOnBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeOnBaselineResponse setBody(GetNodeOnBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeOnBaselineResponseBody getBody() {
        return this.body;
    }

}
