// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class GetMetadataAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetadataAmountResponseBody body;

    public static GetMetadataAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetadataAmountResponse self = new GetMetadataAmountResponse();
        return TeaModel.build(map, self);
    }

    public GetMetadataAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetadataAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetadataAmountResponse setBody(GetMetadataAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetadataAmountResponseBody getBody() {
        return this.body;
    }

}
