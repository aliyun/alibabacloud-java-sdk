// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class BusinessResultServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BusinessResultServiceResponseBody body;

    public static BusinessResultServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        BusinessResultServiceResponse self = new BusinessResultServiceResponse();
        return TeaModel.build(map, self);
    }

    public BusinessResultServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BusinessResultServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BusinessResultServiceResponse setBody(BusinessResultServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public BusinessResultServiceResponseBody getBody() {
        return this.body;
    }

}
