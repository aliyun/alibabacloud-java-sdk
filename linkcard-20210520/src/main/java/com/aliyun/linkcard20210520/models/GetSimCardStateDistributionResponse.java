// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetSimCardStateDistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSimCardStateDistributionResponseBody body;

    public static GetSimCardStateDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSimCardStateDistributionResponse self = new GetSimCardStateDistributionResponse();
        return TeaModel.build(map, self);
    }

    public GetSimCardStateDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSimCardStateDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSimCardStateDistributionResponse setBody(GetSimCardStateDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSimCardStateDistributionResponseBody getBody() {
        return this.body;
    }

}
