// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IFlightOrderDetailQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IFlightOrderDetailQueryResponseBody body;

    public static IFlightOrderDetailQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        IFlightOrderDetailQueryResponse self = new IFlightOrderDetailQueryResponse();
        return TeaModel.build(map, self);
    }

    public IFlightOrderDetailQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IFlightOrderDetailQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IFlightOrderDetailQueryResponse setBody(IFlightOrderDetailQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public IFlightOrderDetailQueryResponseBody getBody() {
        return this.body;
    }

}
