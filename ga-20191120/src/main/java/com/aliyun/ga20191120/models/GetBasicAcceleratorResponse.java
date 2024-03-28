// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBasicAcceleratorResponseBody body;

    public static GetBasicAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAcceleratorResponse self = new GetBasicAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public GetBasicAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBasicAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBasicAcceleratorResponse setBody(GetBasicAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBasicAcceleratorResponseBody getBody() {
        return this.body;
    }

}
