// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetUmodelDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUmodelDataResponseBody body;

    public static GetUmodelDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUmodelDataResponse self = new GetUmodelDataResponse();
        return TeaModel.build(map, self);
    }

    public GetUmodelDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUmodelDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUmodelDataResponse setBody(GetUmodelDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUmodelDataResponseBody getBody() {
        return this.body;
    }

}
