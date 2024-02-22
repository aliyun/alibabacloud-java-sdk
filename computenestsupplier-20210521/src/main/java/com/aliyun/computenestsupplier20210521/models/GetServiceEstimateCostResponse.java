// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceEstimateCostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceEstimateCostResponseBody body;

    public static GetServiceEstimateCostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEstimateCostResponse self = new GetServiceEstimateCostResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceEstimateCostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceEstimateCostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceEstimateCostResponse setBody(GetServiceEstimateCostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceEstimateCostResponseBody getBody() {
        return this.body;
    }

}
