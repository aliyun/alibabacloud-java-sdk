// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetVLExtractionResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVLExtractionResultResponseBody body;

    public static GetVLExtractionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVLExtractionResultResponse self = new GetVLExtractionResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVLExtractionResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVLExtractionResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVLExtractionResultResponse setBody(GetVLExtractionResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVLExtractionResultResponseBody getBody() {
        return this.body;
    }

}
