// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailListOfOrderNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeDetailListOfOrderNumResponseBody body;

    public static ChangeDetailListOfOrderNumResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDetailListOfOrderNumResponse self = new ChangeDetailListOfOrderNumResponse();
        return TeaModel.build(map, self);
    }

    public ChangeDetailListOfOrderNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeDetailListOfOrderNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeDetailListOfOrderNumResponse setBody(ChangeDetailListOfOrderNumResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeDetailListOfOrderNumResponseBody getBody() {
        return this.body;
    }

}
