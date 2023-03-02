// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class GetDataModelConfigInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataModelConfigInfoResponseBody body;

    public static GetDataModelConfigInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataModelConfigInfoResponse self = new GetDataModelConfigInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDataModelConfigInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataModelConfigInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataModelConfigInfoResponse setBody(GetDataModelConfigInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataModelConfigInfoResponseBody getBody() {
        return this.body;
    }

}
