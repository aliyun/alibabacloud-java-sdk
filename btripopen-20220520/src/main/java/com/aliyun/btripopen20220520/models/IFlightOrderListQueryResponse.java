// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IFlightOrderListQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IFlightOrderListQueryResponseBody body;

    public static IFlightOrderListQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        IFlightOrderListQueryResponse self = new IFlightOrderListQueryResponse();
        return TeaModel.build(map, self);
    }

    public IFlightOrderListQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IFlightOrderListQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IFlightOrderListQueryResponse setBody(IFlightOrderListQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public IFlightOrderListQueryResponseBody getBody() {
        return this.body;
    }

}
