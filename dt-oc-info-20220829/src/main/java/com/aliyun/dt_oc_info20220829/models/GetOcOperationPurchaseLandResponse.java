// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcOperationPurchaseLandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcOperationPurchaseLandResponseBody body;

    public static GetOcOperationPurchaseLandResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcOperationPurchaseLandResponse self = new GetOcOperationPurchaseLandResponse();
        return TeaModel.build(map, self);
    }

    public GetOcOperationPurchaseLandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcOperationPurchaseLandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcOperationPurchaseLandResponse setBody(GetOcOperationPurchaseLandResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcOperationPurchaseLandResponseBody getBody() {
        return this.body;
    }

}
