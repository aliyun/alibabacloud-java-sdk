// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetResourcePredictResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourcePredictResultResponseBody body;

    public static GetResourcePredictResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePredictResultResponse self = new GetResourcePredictResultResponse();
        return TeaModel.build(map, self);
    }

    public GetResourcePredictResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourcePredictResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourcePredictResultResponse setBody(GetResourcePredictResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourcePredictResultResponseBody getBody() {
        return this.body;
    }

}
