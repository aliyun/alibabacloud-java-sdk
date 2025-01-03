// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetWorkloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkloadResponseBody body;

    public static GetWorkloadResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadResponse self = new GetWorkloadResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkloadResponse setBody(GetWorkloadResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkloadResponseBody getBody() {
        return this.body;
    }

}
