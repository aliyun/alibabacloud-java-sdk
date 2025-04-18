// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocExtractionResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocExtractionResultResponseBody body;

    public static GetDocExtractionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocExtractionResultResponse self = new GetDocExtractionResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDocExtractionResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocExtractionResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocExtractionResultResponse setBody(GetDocExtractionResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocExtractionResultResponseBody getBody() {
        return this.body;
    }

}
