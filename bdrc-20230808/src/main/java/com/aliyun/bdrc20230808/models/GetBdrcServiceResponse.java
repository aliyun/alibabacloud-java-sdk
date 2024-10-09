// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class GetBdrcServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBdrcServiceResponseBody body;

    public static GetBdrcServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBdrcServiceResponse self = new GetBdrcServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetBdrcServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBdrcServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBdrcServiceResponse setBody(GetBdrcServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBdrcServiceResponseBody getBody() {
        return this.body;
    }

}
