// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetContractContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetContractContentResponseBody body;

    public static GetContractContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContractContentResponse self = new GetContractContentResponse();
        return TeaModel.build(map, self);
    }

    public GetContractContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContractContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContractContentResponse setBody(GetContractContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContractContentResponseBody getBody() {
        return this.body;
    }

}
