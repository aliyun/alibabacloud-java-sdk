// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailListOfBuyerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeDetailListOfBuyerResponseBody body;

    public static ChangeDetailListOfBuyerResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDetailListOfBuyerResponse self = new ChangeDetailListOfBuyerResponse();
        return TeaModel.build(map, self);
    }

    public ChangeDetailListOfBuyerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeDetailListOfBuyerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeDetailListOfBuyerResponse setBody(ChangeDetailListOfBuyerResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeDetailListOfBuyerResponseBody getBody() {
        return this.body;
    }

}
