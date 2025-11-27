// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetPurchaseControlRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPurchaseControlRecordResponseBody body;

    public static GetPurchaseControlRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPurchaseControlRecordResponse self = new GetPurchaseControlRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetPurchaseControlRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPurchaseControlRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPurchaseControlRecordResponse setBody(GetPurchaseControlRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPurchaseControlRecordResponseBody getBody() {
        return this.body;
    }

}
